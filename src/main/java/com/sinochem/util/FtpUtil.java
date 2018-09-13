package com.sinochem.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *
 * @author shiqianghui
 */
@Slf4j
public class FtpUtil {
    /**
     * 连接 FTP 服务器
     * @param ftpClient FTPClient对象
     * @param hostname FTP服务器IP地址
     * @param port FTP服务器端口号
     * @param username FTP服务器用户名
     * @param password FTP服务器密码
     */
    private static void connect(FTPClient ftpClient, String hostname, int port, String username, String password){
        if (!ftpClient.isConnected()) {
            try {
                ftpClient.connect(hostname, port);
            } catch (IOException e) {
                LOGGER.error("连接FTP服务器失败：" + e.getMessage(), e);
            }
        }
        try {
            ftpClient.login(username, password);
        } catch (IOException e) {
            LOGGER.error("连接FTP服务器失败：" + e.getMessage(), e);
        }
        int reply = ftpClient.getReplyCode();
        if (!FTPReply.isPositiveCompletion(reply)) {
            disconnect(ftpClient);
            LOGGER.error("登录FTP服务器失败：用户名或密码错误");
        }
    }

    /**
     * 断开FTP服务器
     * @param ftpClient FTPClient对象
     */
    private static void disconnect(FTPClient ftpClient) {
        try {
            if (ftpClient != null && ftpClient.isConnected()) {
                ftpClient.logout();
                ftpClient.disconnect();
            }
        } catch (IOException e) {
            LOGGER.error("断开FTP服务器异常：" + e.getMessage(), e);
        }
    }


    /**
     * 下载指定路径下所有文件
     * @param hostname  FTP服务器IP地址
     * @param port      FTP服务器端口号
     * @param username  FTP服务器用户名
     * @param password  FTP服务器密码
     * @param ftpPath   FTP服务器目录
     * @param localPath 文件下载目录
     * @return           下载的文件名列表
     */
    public static List<String> downloadDir(String hostname, int port, String username, String password, String ftpPath, String localPath) {
        List<String> fileNameList = new ArrayList<>();
        FTPClient ftpClient = new FTPClient();

        //连接FTP服务器
        connect(ftpClient,hostname,port,username,password);

        //判断FTP路径是否存在，存在则切换到指定目录
        boolean ftpPathExist = checkFTPDir(ftpClient, ftpPath);
        if (ftpPathExist) {
            //获取FTPFile对象数组
            FTPFile[] ftpFiles = getFTPFiles(ftpClient);

            //判断本地目录是否存在，不存在则创建
            boolean localPathExists = checkLocalDir(localPath);
            if (localPathExists) {
                //下载文件，获取下载的文件名列表
                fileNameList = ftpDownload(ftpClient, ftpFiles, localPath);
            }
        }
        //断开FTP服务器
        disconnect(ftpClient);
        return fileNameList;
    }


    /**
     * 下载指定路径下指定文件名的文件
     * @param hostname FTP服务器IP地址
     * @param port  FTP服务器端口号
     * @param username FTP服务器用户名
     * @param password FTP服务器密码
     * @param ftpPath FTP服务器目录
     * @param localPath 文件下载目录
     * @param fileNameKeywords 文件名关键字
     * @return 下载的文件名列表
     */
    public static List<String> downloadByFileNameKeywords(String hostname, int port, String username, String password, String ftpPath, String localPath, String[] fileNameKeywords) {
        List<String> fileNameList = new ArrayList<>();
        FTPClient ftpClient = new FTPClient();

        //连接FTP服务器
        connect(ftpClient,hostname,port,username,password);

        //判断FTP路径是否存在，存在则切换到指定目录
        boolean ftpPathExist = checkFTPDir(ftpClient, ftpPath);
        if (ftpPathExist) {
            //获取FTPFile对象数组
            FTPFile[] ftpFiles = getFTPFiles(ftpClient);

            //判断本地目录是否存在，不存在则创建
            boolean localPathExists = checkLocalDir(localPath);
            if (localPathExists) {
                //过滤掉不包含fileNameKeywords的ftpFiles
                FTPFile[] filterFtpFiles = filter(ftpFiles, fileNameKeywords);

                //下载文件，获取下载的文件名列表
                fileNameList = ftpDownload(ftpClient, filterFtpFiles, localPath);
            }
        }
        //断开FTP服务器
        disconnect(ftpClient);
        return fileNameList;
    }

    /**
     * 判断本地文件夹路径是否存在，如果不存在则创建
     * @param localPath 文件下载目录
     */
    private static boolean checkLocalDir(String localPath) {
        File localDir = new File(localPath);
        boolean exists = localDir.exists();
        if (!exists) {
            exists = localDir.mkdirs();
        }
        return exists;
    }

    /**
     * 判断FTP路径是否存在，存在则切换到指定目录
     * @param ftpClient FTPClient对象
     * @param ftpPath FTP服务器目录
     * @return 返回FTP文件夹目录是否存在并切换成功
     */
    private static boolean checkFTPDir(FTPClient ftpClient, String ftpPath) {
        //解决开发环境是Windows，File.seperator是\,当FTP是Linux时，无法切换目录的问题
        ftpPath = ftpPath.replace("\\", "/");
        boolean dirExist = true;
        try {
            dirExist = ftpClient.changeWorkingDirectory(ftpPath);
        } catch (Exception e) {
            dirExist = false;
            LOGGER.error("切换FTP服务器目录异常：" + e.getMessage(), e);
        } finally {
            if (!dirExist) {
                LOGGER.info("切换FTP服务器失败");
                disconnect(ftpClient);
            }
        }
        return dirExist;
    }

    /**
     * 获取FTP文件
     * @param ftpClient FTPClient对象
     * @return 返回FTPFile对象数组
     */
    private static FTPFile[] getFTPFiles(FTPClient ftpClient) {
        FTPFile[] ftpFiles = null;
        //设置被动模式，开通一个端口来接收数据
        ftpClient.enterLocalPassiveMode();
        ftpClient.setControlEncoding("GBK");
        try {
            //设置二进制传输方式
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
            ftpFiles = ftpClient.listFiles();
        } catch (Exception e) {
            LOGGER.error("FTP下载文件异常：" + e.getMessage(), e);
        }
        return ftpFiles;
    }

    /**
     * FTP下载指定路径下，指定文件
     * @param ftpClient FTPClient对象
     * @param ftpFiles FTPFile对象数组
     * @param localPath 文件下载目录
     * @return 下载的文件名列表
     */
    private static List<String> ftpDownload(FTPClient ftpClient, FTPFile[] ftpFiles, String localPath) {
        List<String> downloadFiles = new ArrayList<>();
        for (FTPFile file: ftpFiles) {
            String fileName = file.getName();
            File localFile = new File(localPath + File.separator + fileName);
            try (OutputStream os = new FileOutputStream(localFile)) {
                ftpClient.retrieveFile(file.getName(), os);
            } catch (IOException e) {
                LOGGER.error("FTP下载文件异常：" + e.getMessage(), e);
            }
//            downloadFiles.add(fileName);
            downloadFiles.add(localFile.getPath());
        }
        return downloadFiles;
    }

    /**
     * 过滤掉不在fileNames中的ftpFiles
     * @param ftpFiles ftpFiles对象数组
     * @param fileNameKeywords 文件名关键字
     * @return 返回FTPFile对象数组
     */
    private static FTPFile[] filter(FTPFile[] ftpFiles, String[] fileNameKeywords) {
        List<FTPFile> filterFtpFileList = new ArrayList<>();
        List<FTPFile> ftpFilesList = Arrays.asList(ftpFiles);
        List<String> fileNameKeywordsList = Arrays.asList(fileNameKeywords);
        //取出文件名包含fileNameKeyword的文件
        fileNameKeywordsList.forEach(fileNameKeyword ->
                ftpFilesList.forEach(ftpFile -> {
                    String ftpFileName = ftpFile.getName();
                    if (ftpFileName.trim().contains(fileNameKeyword.trim())) {
                        filterFtpFileList.add(ftpFile);
                    }
                })
        );
        FTPFile[] ftpFilesArray = new FTPFile[filterFtpFileList.size()];
        return filterFtpFileList.toArray(ftpFilesArray);
    }

    public static void main(String[] args) {
        String yesterday = LocalDate.now().minusDays(1).toString().replace("-", "");

        String ftpPath = File.separator + "FTP" + File.separator + yesterday;
        String localPath = "E:" + File.separator + "FTP" +File.separator + "PAB" + File.separator + yesterday;
        List<String> list = FtpUtil.downloadDir("127.0.0.1", 21, "admin",
                "123456", ftpPath, localPath);

//        List<String> list = FtpUtil.downloadByFileNameKeywords("127.0.0.1", 21, "admin",
//                "123456", ftpPath, localPath, new String[]{"YE","CZ"});
        list.forEach(fileName -> {
            LOGGER.info(fileName);
        });
    }
}
