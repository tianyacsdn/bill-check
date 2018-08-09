package com.sinochem.service.impl;

import com.sinochem.service.FtpService;
import com.sinochem.util.FtpUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

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
    public List<String> dowloadBill() throws Exception {
        List<String> list = FtpUtil.downloadT1(hostname, port, username, password, ftpPath, localPath);
        return list;
    }

    @Override
    public List<String> downloadBillByDate(String date) throws Exception {
        List<String> list = FtpUtil.downloadBillByDate(date, hostname, port, username, password, ftpPath, localPath);
        return list;
    }

    @Override
    public List<String> downloadBillByBillType(String billType) throws Exception {
        List<String> list = FtpUtil.downloadBillByBillType(billType, hostname, port, username, password, ftpPath, localPath);
        return list;
    }

    @Override
    public List<String> downloadBillByDateAndBillType(String date, String billType) throws Exception {
        List<String> list = FtpUtil.downloadBillByDateAndBillType(date, billType, hostname, port, username, password, ftpPath, localPath);
        return list;
    }
}
