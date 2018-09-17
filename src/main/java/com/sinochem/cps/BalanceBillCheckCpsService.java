package com.sinochem.cps;

import com.sinochem.domain.BalanceBillCheck;

import java.util.List;

public interface BalanceBillCheckCpsService {
    /**
     * 添加余额对账单对账数据
     * @param record
     * @return
     */
    int insert(BalanceBillCheck record);

    /**
     * 批量添加余额对账单数据
     * @param records
     * @return
     */
    int insertBatch(List<BalanceBillCheck> records);

    /**
     * 根据渠道、对账单日期查询对账单数据
     * @param gatewayChannel
     * @param billDate
     * @return
     */
    List<BalanceBillCheck> listDataByBillDate(String gatewayChannel, String billDate);

    /**
     * 根据渠道、对账日期查询对账单数据
     * @param gatewayChannel
     * @param checkDate
     * @return
     */
    List<BalanceBillCheck> listDataByCheckDate(String gatewayChannel, String checkDate);
}
