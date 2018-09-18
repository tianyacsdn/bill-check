package com.sinochem.cps;

import com.github.pagehelper.PageInfo;
import com.sinochem.domain.BillBankBalance;

import java.util.List;

public interface BillBankBalanceCpsService {
    List<BillBankBalance> listBillBankBalance() throws Exception;

    /**
     * 根据对账单日期查询,不分页
     * @param billDate
     * @return
     * @throws Exception
     */
    List<BillBankBalance> listBillBankBalance(String billDate) throws Exception;

    /**
     * 根据对账单日期查询,分页
     * @param billDate
     * @param pageSize
     * @param pageNum
     * @return
     * @throws Exception
     */
    PageInfo listBillBankBalance(String billDate, Integer pageSize, Integer pageNum) throws Exception;
}
