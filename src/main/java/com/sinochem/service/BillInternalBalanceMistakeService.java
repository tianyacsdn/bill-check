package com.sinochem.service;

import com.sinochem.domain.BillInternalBalanceMistake;

import java.util.List;

public interface BillInternalBalanceMistakeService {
    /**
     * 添加记录
     * @param record
     * @return
     */
    boolean addMistake(BillInternalBalanceMistake record);

    /**
     * 获取所有数据
     * @return
     */
    List<BillInternalBalanceMistake> listMistake();

    /**
     * 根据对账状态获取数据 0:未平账  1:已平账
     * @param checkStatus
     * @return
     */
    List<BillInternalBalanceMistake> getMistakeByCheckStatus(int checkStatus);

    /**
     * 更新数据
     * @param record
     * @return
     */
    boolean update(BillInternalBalanceMistake record);
}
