package com.sinochem.service.impl;

import com.sinochem.domain.BillBalanceMistake;
import com.sinochem.domain.BillBalanceMistakeExample;
import com.sinochem.mapper.BillBalanceMistakeMapper;
import com.sinochem.service.BillBalanceMistakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillBalanceMistakeServiceImpl implements BillBalanceMistakeService {
    @Autowired
    BillBalanceMistakeMapper billBalanceMistakeMapper;

    @Override
    public boolean addMistake(BillBalanceMistake record) {
        int num = billBalanceMistakeMapper.insert(record);
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public List<BillBalanceMistake> listMistake() {
        BillBalanceMistakeExample example = new BillBalanceMistakeExample();
        BillBalanceMistakeExample.Criteria criteria = example.createCriteria();
        List<BillBalanceMistake> list = billBalanceMistakeMapper.selectByExample(example);
        return list;
    }
}
