package com.sinochem.service;

public interface FtpService {

    /**
     * download T-1 YE,JY,CZ,TX bill files
     * @return
     */
    boolean dowloadBill() throws Exception;

    /**
     * download specified date YE,JY,CZ,TX bill files
     * @param date (format yyyyMMdd)
     * @return
     */
    boolean downloadBillByDate(String date) throws Exception;

    /**
     * download specified bill files(YE,JY,CZ,TX)
     * @param billType
     * @return
     * @throws Exception
     */
    boolean downloadBillByBillType(String billType) throws Exception;

    /**
     * download specified date and specifed billType bill file
     * @param date (format yyyyMMdd)
     * @param billType (domain: YE,JY,CZ,TX)
     * @return
     */
    boolean downloadBillByDateAndBillType(String date, String billType) throws Exception;
}
