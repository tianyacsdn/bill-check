package com.sinochem.parse.impl;

import com.sinochem.parse.FtpService;
import com.sinochem.util.FtpUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author tom
 */
@Service(value = "PABFtpService")
public class PABFtpServiceImpl implements FtpService {
    @Value("${ftp.PAB.hostname}")
    private String hostname;
    @Value("${ftp.PAB.port}")
    private Integer port;
    @Value("${ftp.PAB.username}")
    private String username;
    @Value("${ftp.PAB.password}")
    private String password;
    @Value("${ftp.PAB.ftpBasePath}")
    private String ftpBasePath;
    @Value("${ftp.PAB.localBasePath}")
    private String localBasePath;
    /**
     * 下载昨天所有类型对账单
     * @return 返回下载的对账单名称列表
     */
    @Override
    public List<String> downloadYesterday() {
        //日期格式转换成yyyyMMdd
        String yesterday = LocalDate.now().minusDays(1).toString().replace("-", "");
        String ftpPath = ftpBasePath + File.separator + yesterday;
        String localPath = localBasePath + File.separator + yesterday;
        List<String> fileNameList = FtpUtil.downloadDir(hostname, port, username, password, ftpPath, localPath);
        return fileNameList;
    }

    /**
     * 下载指定日期(yyyyMMdd)的对账单
     * @param billDate
     * @return 返回下载的对账单名称列表
     */
    @Override
    public List<String> downloadByBillDate(String billDate) {
        String ftpPath = ftpBasePath + File.separator + billDate;
        String localPath = localBasePath + File.separator + billDate;
        List<String> fileNameList = FtpUtil.downloadDir(hostname, port, username, password, ftpPath, localPath);
        return fileNameList;
    }

    /**
     * 下载指定类型的对账单
     * @param billTypes
     * @return 返回下载的对账单名称列表
     */
    @Override
    public List<String> downloadByBillType(String[] billTypes) {
        //日期格式转换成yyyyMMdd
        String yesterday = LocalDate.now().minusDays(1).toString().replace("-", "");
        String ftpPath = ftpBasePath + File.separator + yesterday;
        String localPath = localBasePath + File.separator + yesterday;
        List<String> fileNameList = FtpUtil.downloadByFileNameKeywords(hostname, port, username, password, ftpPath, localPath, billTypes);
        return fileNameList;
    }

    /**
     * 根据对账单日期和类型下载
     * @param billDate
     * @param billTypes
     * @return 返回下载的对账单名称列表
     */
    @Override
    public List<String> downloadByBillTypeAndBillDate(String billDate, String[] billTypes) {
        String ftpPath = ftpBasePath + File.separator + billDate;
        String localPath = localBasePath + File.separator + billDate;
        List<String> fileNameList = FtpUtil.downloadByFileNameKeywords(hostname, port, username, password, ftpPath, localPath, billTypes);
        return fileNameList;
    }
}
