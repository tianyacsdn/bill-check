package com.sinochem.service;

import com.sinochem.domain.BillBankBalance;

import java.util.List;

public interface BillBankBalanceService {
    List<BillBankBalance> listBillBankBalance() throws Exception;

    /**
     * 根据对账单日期查询
     * @param billDate
     * @return
     * @throws Exception
     */
    List<BillBankBalance> listBillBankBalance(String billDate) throws Exception;
}
