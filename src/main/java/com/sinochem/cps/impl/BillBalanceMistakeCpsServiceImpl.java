package com.sinochem.cps.impl;

import com.sinochem.cps.BillBalanceMistakeCpsService;
import com.sinochem.domain.BillBalanceMistake;
import com.sinochem.service.BillBalanceMistakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillBalanceMistakeCpsServiceImpl implements BillBalanceMistakeCpsService {
    @Autowired
    BillBalanceMistakeService billBalanceMistakeService;

    @Override
    public boolean addMistake(BillBalanceMistake record) {
        boolean flag = billBalanceMistakeService.addMistake(record);
        return flag;
    }

    @Override
    public List<BillBalanceMistake> listMistake() {
        List<BillBalanceMistake> list = billBalanceMistakeService.listMistake();
        return list;
    }

    @Override
    public boolean insertBatch(List<BillBalanceMistake> mistakes) {
        int num = billBalanceMistakeService.insertBatch(mistakes);
        if (num == mistakes.size()) {
            return true;
        } else {
            return false;
        }
    }
}
