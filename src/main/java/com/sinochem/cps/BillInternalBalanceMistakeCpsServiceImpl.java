package com.sinochem.cps;

import com.sinochem.domain.BillInternalBalanceMistake;
import com.sinochem.service.BillInternalBalanceMistakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BillInternalBalanceMistakeCpsServiceImpl implements BillInternalBalanceMistakeCpsService {
    @Autowired
    BillInternalBalanceMistakeService billInternalBalanceMistakeService;

    @Override
    public boolean addMistake(BillInternalBalanceMistake record) {
        Date now = new Date();
        record.setCreateTime(now);
        record.setCheckStatus(0);
        boolean flag = billInternalBalanceMistakeService.addMistake(record);
        return flag;
    }

    @Override
    public List<BillInternalBalanceMistake> listMistake() {
        List<BillInternalBalanceMistake> list = billInternalBalanceMistakeService.listMistake();
        return list;
    }

    @Override
    public List<BillInternalBalanceMistake> getMistakeByCheckStatus(int checkStatus) {
        List<BillInternalBalanceMistake> list = billInternalBalanceMistakeService.getMistakeByCheckStatus(checkStatus);
        return list;
    }

    @Override
    public boolean update(BillInternalBalanceMistake record) {
        Date now = new Date();
        record.setUpdateTime(now);
        boolean flag = billInternalBalanceMistakeService.update(record);
        return flag;
    }
}
