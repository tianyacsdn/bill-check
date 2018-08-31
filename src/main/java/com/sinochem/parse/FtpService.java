package com.sinochem.parse;

import java.util.List;

/**
 *
 * @author tom
 */
public interface FtpService {
    /**
     * 下载昨天所有类型对账单
     * @return 返回下载的对账单名称列表
     */
    List<String> downloadYesterday();

    /**
     * 下载指定日期(yyyyMMdd)的对账单
     * @param billDate
     * @return 返回下载的对账单名称列表
     */
    List<String> downloadByBillDate(String billDate);

    /**
     * 下载指定类型的对账单
     * @param billTypes
     * @return 返回下载的对账单名称列表
     */
    List<String> downloadByBillType(String[] billTypes);

    /**
     * 根据对账单日期和类型下载
     * @param billDate
     * @param billTypes
     * @return 返回下载的对账单名称列表
     */
    List<String> downloadByBillTypeAndBillDate(String billDate, String[] billTypes);
}
