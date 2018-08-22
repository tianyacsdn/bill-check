package com.sinochem.service;

import com.sinochem.domain.AcpsAcctMast;

import java.util.List;

public interface AcpsAcctMastService {
    /**
     * 查询acps_acct_mast表
     * @return
     */
    List<AcpsAcctMast> listAcpsAcctMast();

    /**
     * 根据虚拟账户修改账户信息
     * @param record
     * @return
     */
    boolean updateByMastAcctNum(AcpsAcctMast record);
}
