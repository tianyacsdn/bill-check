package com.sinochem.cps;

import com.sinochem.domain.BalanceRealTimeCheck;

import java.util.List;

public interface BalanceRealTimeCheckCpsService {
    /**
     * 添加实时对账数据
     * @param record
     * @return
     */
    int insert(BalanceRealTimeCheck record);

    /**
     * 批量添加实时对账数据
     * @param records
     * @return
     */
    int insertBatch(List<BalanceRealTimeCheck> records);

    /**
     * 根据渠道、对账起始日期查询实时余额对账数据
     * @param gatewayChannel
     * @param startDate
     * @param endDate
     * @return
     */
    List<BalanceRealTimeCheck> listBalanceRealTimeCheck(String gatewayChannel, String startDate, String endDate);
}
