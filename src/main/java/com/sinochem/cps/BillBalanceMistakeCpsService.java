package com.sinochem.cps;

import com.sinochem.domain.BillBalanceMistake;

import java.util.List;

public interface BillBalanceMistakeCpsService {
    /**
     * 添加错误记录
     * @param record
     * @return
     */
    boolean addMistake(BillBalanceMistake record);

    /**
     * 查询错误信息
     * @return
     */
    List<BillBalanceMistake> listMistake();

    /**
     * 批量导入记录
     * @param mistakes
     * @return
     */
    boolean insertBatch(List<BillBalanceMistake> mistakes);
}
