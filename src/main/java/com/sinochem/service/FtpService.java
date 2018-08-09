package com.sinochem.service;

import java.util.List;

public interface FtpService {

    /**
     * download T-1 YE,JY,CZ,TX bill files
     * @return
     */
    List<String> dowloadBill() throws Exception;

    /**
     * download specified date YE,JY,CZ,TX bill files
     * @param date (format yyyyMMdd)
     * @return
     */
    List<String> downloadBillByDate(String date) throws Exception;

    /**
     * download specified bill files(YE,JY,CZ,TX)
     * @param billType
     * @return
     * @throws Exception
     */
    List<String> downloadBillByBillType(String billType) throws Exception;

    /**
     * download specified date and specifed billType bill file
     * @param date (format yyyyMMdd)
     * @param billType (domain: YE,JY,CZ,TX)
     * @return
     */
    List<String> downloadBillByDateAndBillType(String date, String billType) throws Exception;
}
