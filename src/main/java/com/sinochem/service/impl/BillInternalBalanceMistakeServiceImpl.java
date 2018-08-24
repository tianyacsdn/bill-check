package com.sinochem.service.impl;

import com.sinochem.domain.BillInternalBalanceMistake;
import com.sinochem.domain.BillInternalBalanceMistakeExample;
import com.sinochem.mapper.BillInternalBalanceMistakeMapper;
import com.sinochem.service.BillInternalBalanceMistakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BillInternalBalanceMistakeServiceImpl implements BillInternalBalanceMistakeService {
    @Autowired
    BillInternalBalanceMistakeMapper billInternalBalanceMistakeMapper;

    @Override
    public boolean addMistake(BillInternalBalanceMistake record) {
        int num = billInternalBalanceMistakeMapper.insert(record);
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<BillInternalBalanceMistake> listMistake() {
        BillInternalBalanceMistakeExample example = new BillInternalBalanceMistakeExample();
        List<BillInternalBalanceMistake> list = billInternalBalanceMistakeMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<BillInternalBalanceMistake> getMistakeByCheckStatus(int checkStatus) {
        BillInternalBalanceMistakeExample example = new BillInternalBalanceMistakeExample();
        BillInternalBalanceMistakeExample.Criteria criteria = example.createCriteria();
        criteria.andCheckStatusEqualTo(checkStatus);
        List<BillInternalBalanceMistake> list = billInternalBalanceMistakeMapper.selectByExample(example);
        return list;
    }

    @Override
    public boolean update(BillInternalBalanceMistake record) {
        BillInternalBalanceMistakeExample example = new BillInternalBalanceMistakeExample();
        BillInternalBalanceMistakeExample.Criteria criteria = example.createCriteria();
        criteria.andIdEqualTo(record.getId());
        int num = billInternalBalanceMistakeMapper.updateByExampleSelective(record, example);
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }
}
