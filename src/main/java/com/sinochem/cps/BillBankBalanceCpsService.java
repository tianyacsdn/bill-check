package com.sinochem.cps;

import com.sinochem.domain.BillBankBalance;

import java.util.List;

public interface BillBankBalanceCpsService {
    List<BillBankBalance> listBillBankBalance() throws Exception;

    /**
     * 根据对账单日期查询
     * @param billDate
     * @return
     * @throws Exception
     */
    List<BillBankBalance> listBillBankBalance(String billDate) throws Exception;
}
