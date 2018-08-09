package com.sinochem.service.impl;

import com.sinochem.service.FtpService;
import com.sinochem.util.FtpUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FtpServiceImpl implements FtpService {

    @Value("${ftp.hostname}")
    private String hostname;
    @Value("${ftp.port}")
    private Integer port;
    @Value("${ftp.username}")
    private String username;
    @Value("${ftp.password}")
    private String password;
    @Value("${ftp.ftpPath}")
    private String ftpPath;
    @Value("${ftp.localPath}")
    private String localPath;

    @Override
    public boolean dowloadBill() throws Exception {
        boolean flag = FtpUtil.downloadT1(hostname, port, username, password, ftpPath, localPath);
        return flag;
    }

    @Override
    public boolean downloadBillByDate(String date) throws Exception {
        boolean flag = FtpUtil.downloadBillByDate(date, hostname, port, username, password, ftpPath, localPath);
        return flag;
    }

    @Override
    public boolean downloadBillByBillType(String billType) throws Exception {
        boolean flag = FtpUtil.downloadBillByBillType(billType, hostname, port, username, password, ftpPath, localPath);
        return flag;
    }

    @Override
    public boolean downloadBillByDateAndBillType(String date, String billType) throws Exception {
        boolean flag = FtpUtil.downloadBillByDateAndBillType(date, billType, hostname, port, username, password, ftpPath, localPath);
        return flag;
    }
}
