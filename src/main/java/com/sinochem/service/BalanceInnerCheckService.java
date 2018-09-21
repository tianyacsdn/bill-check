package com.sinochem.service;

import com.github.pagehelper.PageInfo;
import com.sinochem.BalanceInnerCheckDTO;
import com.sinochem.domain.BalanceInnerCheck;

import java.util.List;

public interface BalanceInnerCheckService {
    List<BalanceInnerCheck> listBalanceInnerCheck(BalanceInnerCheck param);

    PageInfo listBalanceInnerCheckByPage(BalanceInnerCheckDTO param);

    int insert(BalanceInnerCheck record);
}
