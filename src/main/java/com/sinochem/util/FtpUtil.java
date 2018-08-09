package com.sinochem.util;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class FtpUtil {

    /**
     * connect FTP server
     * @param ftpClient
     * @param hostname
     * @param port
     * @param username
     * @param password
     * @return
     */
    public static boolean connect(FTPClient ftpClient,
                                  String hostname,
                                  Integer port,
                                  String username,
                                  String password) throws Exception {
        if (!ftpClient.isConnected()) {
            try {
                ftpClient.connect(hostname, port);
            } catch (IOException e) {
                throw new Exception("连接FTP服务器失败：" + e.getMessage());
            }
        }
        try {
            ftpClient.login(username, password);
        } catch (IOException e) {
            throw new Exception("登录FTP服务器失败："+e.getMessage());
        }
        int reply = ftpClient.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            disconnect(ftpClient);
        }
        return false;
    }

    /**
     * 断开FTP服务器
     * @param ftpClient
     */
    public static void disconnect(FTPClient ftpClient) throws Exception {
        try {
            if (ftpClient != null) {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
                ftpClient = null;
            }
        } catch (IOException e) {
            throw new Exception("断开FTP服务器异常："+e.getMessage());
        }
    }

    /**
     * 下载T-1日所有4种类型账单账单
     * @param hostname
     * @param port
     * @param username
     * @param password
     * @param ftpPath
     * @param localPath
     * @return list 下载成功的对账单名称
     * @throws Exception
     */
    public static List<String> downloadT1(String hostname,
                                          Integer port,
                                          String username,
                                          String password,
                                          String ftpPath,
                                          String localPath) throws Exception {
        List<String> list = downloadBill("", "", hostname, port, username, password, ftpPath,localPath );
        return list;
    }

    /**
     * 下载指定日期的全部4种类型对账单
     * @param date
     * @param hostname
     * @param port
     * @param username
     * @param password
     * @param ftpPath
     * @param localPath
     * @return list 下载成功的对账单名称
     * @throws Exception
     */
    public static List<String> downloadBillByDate(String date,
                                      String hostname,
                                      Integer port,
                                      String username,
                                      String password,
                                      String ftpPath,
                                      String localPath) throws Exception {
        List<String> list = downloadBill(date, "", hostname, port, username, password, ftpPath,localPath );
        return list;
    }

    /**
     * 下载T-1指定类型对账单(YE,JY,CZ,TX)
     * @param billType
     * @param hostname
     * @param port
     * @param username
     * @param password
     * @param ftpPath
     * @param localPath
     * @return list 下载成功的对账单名称
     * @throws Exception
     */
    public static List<String> downloadBillByBillType(String billType,
                                                 String hostname,
                                                 Integer port,
                                                 String username,
                                                 String password,
                                                 String ftpPath,
                                                 String localPath) throws Exception{
        List<String> list = downloadBill("", billType, hostname, port, username, password, ftpPath,localPath );
        return list;
    }
    /**
     *
     * @param date
     * @param billType
     * @param hostname
     * @param port
     * @param username
     * @param password
     * @param ftpPath
     * @param localPath
     * @return list 下载成功的对账单名称
     * @throws Exception
     */
    public static List<String> downloadBillByDateAndBillType(String date,
                                             String billType,
                                             String hostname,
                                             Integer port,
                                             String username,
                                             String password,
                                             String ftpPath,
                                             String localPath) throws Exception {
        List<String> list = downloadBill(date, billType, hostname, port, username, password, ftpPath,localPath );
        return list;
    }

    public static List<String> downloadBill(String date,
                                     String billType,
                                     String hostname,
                                     Integer port,
                                     String username,
                                     String password,
                                     String ftpPath,
                                     String localPath) throws Exception {
        if ("".equals(date) || date == null) {
            LocalDate localDate = LocalDate.now().minusDays(1);
            date = localDate.toString().replace("-","");
        }
        FTPClient ftpClient = new FTPClient();
        //连接FTP服务器
        connect(ftpClient,hostname,port,username,password);
        List<String> list = new ArrayList<>();
        OutputStream os = null;
        if (!ftpClient.changeWorkingDirectory(ftpPath)) {
            disconnect(ftpClient);
            throw new Exception("对账单下载失败，目录不存在");
        }
        ftpClient.enterLocalPassiveMode();//设置被动模式，开通一个端口来接收数据
        String[] files = ftpClient.listNames();
        if (files == null || files.length == 0) {
            disconnect(ftpClient);
            throw new Exception("对账单下载失败，目录为空！");
        }
        FTPFile[] ftpFiles = ftpClient.listFiles();

        for (FTPFile file: ftpFiles) {
            String fileName = file.getName();
            boolean conditionFlag = false;
            //billType不为空，下载指定类型的对账单;为空，下载所有类型的对账单
            if (!"".equals(billType) && billType != null) {
                conditionFlag = fileName.substring(0,2).equals(billType);
            } else {
                conditionFlag = true;
            }
            if (fileName.substring(2,10).equals(date) && conditionFlag) {
                File localFile = new File(localPath + File.separator + fileName);
                os = new FileOutputStream(localFile);
                ftpClient.retrieveFile(file.getName(), os);
                list.add(fileName);
            }
        }
        if (os != null) {
            os.close();
        }
        //断开FTP服务器
        disconnect(ftpClient);
        return list;
    }
    public static void main(String[] args) throws Exception{
//        FtpUtil.downloadT1("10.144.137.47",21,"payhadmin",
//                "DgWai2=FoCB7","/home/wasadmin","ftp-file");

//        FtpUtil.downloadBillByDate("20180711","10.144.137.47",21,"payhadmin",
//                "DgWai2=FoCB7","/home/wasadmin","ftp-file");

        FtpUtil.downloadBillByDateAndBillType("20180807","YE","10.144.137.47",21,"payhadmin",
                "DgWai2=FoCB7","/home/wasadmin","ftp-file");
    }
}
