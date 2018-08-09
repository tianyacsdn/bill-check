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
                                  String password) {
        if (!ftpClient.isConnected()) {
            try {
                ftpClient.connect(hostname, port);
            } catch (IOException e) {
                System.out.println("连接FTP服务器失败："+e.getMessage());
            }
        }
        try {
            ftpClient.login(username, password);
        } catch (IOException e) {
            System.out.println("登录FTP服务器失败："+e.getMessage());
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
    public static void disconnect(FTPClient ftpClient) {
        try {
            if (ftpClient != null) {
                if (ftpClient.isConnected()) {
                    ftpClient.logout();
                    ftpClient.disconnect();
                }
                ftpClient = null;
            }
        } catch (IOException e) {
            System.out.println("断开FTP服务器异常："+e.getMessage());
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
     * @return
     * @throws Exception
     */
    public static boolean downloadT1(String hostname,
                                     Integer port,
                                     String username,
                                     String password,
                                     String ftpPath,
                                     String localPath) throws Exception {
        FTPClient ftpClient = new FTPClient();
        LocalDate localDate = LocalDate.now().minusDays(1);
        String date = localDate.toString().replace("-","");
        //连接FTP服务器
        connect(ftpClient,hostname,port,username,password);
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
            if (fileName.substring(2,10).equals(date)) {
                File localFile = new File(localPath + File.separator + fileName);
                os = new FileOutputStream(localFile);
                ftpClient.retrieveFile(file.getName(), os);
            }
        }
        if (os != null) {
            os.close();
        }
        //断开FTP服务器
        disconnect(ftpClient);
        return true;
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
     * @return
     * @throws Exception
     */
    public static boolean downloadBillByDate(String date,
                                      String hostname,
                                      Integer port,
                                      String username,
                                      String password,
                                      String ftpPath,
                                      String localPath) throws Exception {
        FTPClient ftpClient = new FTPClient();
        //连接FTP服务器
        connect(ftpClient,hostname,port,username,password);
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
            if (fileName.substring(2,10).equals(date)) {
                File localFile = new File(localPath + File.separator + fileName);
                os = new FileOutputStream(localFile);
                ftpClient.retrieveFile(file.getName(), os);
            }
        }
        if (os != null) {
            os.close();
        }
        //断开FTP服务器
        disconnect(ftpClient);
        return true;
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
     * @return
     * @throws Exception
     */
    public static boolean downloadBillByBillType(String billType,
                                                 String hostname,
                                                 Integer port,
                                                 String username,
                                                 String password,
                                                 String ftpPath,
                                                 String localPath) throws Exception{
        FTPClient ftpClient = new FTPClient();
        LocalDate localDate = LocalDate.now().minusDays(1);
        String date = localDate.toString().replace("-","");
        //连接FTP服务器
        connect(ftpClient,hostname,port,username,password);
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
            if (fileName.substring(2,10).equals(date) && fileName.substring(0,2).equals(billType)) {
                File localFile = new File(localPath + File.separator + fileName);
                os = new FileOutputStream(localFile);
                ftpClient.retrieveFile(file.getName(), os);
            }
        }
        if (os != null) {
            os.close();
        }
        //断开FTP服务器
        disconnect(ftpClient);
        return true;
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
     * @return
     * @throws Exception
     */
    public static boolean downloadBillByDateAndBillType(String date,
                                             String billType,
                                             String hostname,
                                             Integer port,
                                             String username,
                                             String password,
                                             String ftpPath,
                                             String localPath) throws Exception {
        FTPClient ftpClient = new FTPClient();
        //连接FTP服务器
        connect(ftpClient,hostname,port,username,password);
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
            if (fileName.substring(2,10).equals(date) && fileName.substring(0,2).equals(billType)) {
                File localFile = new File(localPath + File.separator + fileName);
                os = new FileOutputStream(localFile);
                ftpClient.retrieveFile(file.getName(), os);
            }
        }
        if (os != null) {
            os.close();
        }
        //断开FTP服务器
        disconnect(ftpClient);
        return true;
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
