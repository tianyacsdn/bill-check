package com.sinochem.service;

import com.sinochem.domain.BillBankBalance;

import java.util.List;

public interface ParseBillService {
    List parseBill() throws Exception;

    /**
     * 解析指定日期的对账单
     * @param billDate
     * @return
     * @throws Exception
     */
    List parseBillByDate(String billDate) throws Exception;

    boolean loadBill() throws Exception;

    /**
     * 加载指定日期的对账单数据
     * @param billDate
     * @return
     * @throws Exception
     */
    boolean loadBillByBillDate(String billDate) throws Exception;
}
