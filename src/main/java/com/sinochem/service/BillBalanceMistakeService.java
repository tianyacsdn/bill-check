package com.sinochem.service;

import com.sinochem.domain.BillBalanceMistake;

import java.util.List;

public interface BillBalanceMistakeService {
    boolean addMistake(BillBalanceMistake record);

    List<BillBalanceMistake> listMistake();
}
