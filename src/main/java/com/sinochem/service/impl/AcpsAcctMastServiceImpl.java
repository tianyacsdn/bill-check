package com.sinochem.service.impl;

import com.sinochem.domain.AcpsAcctMast;
import com.sinochem.domain.AcpsAcctMastExample;
import com.sinochem.mapper.AcpsAcctMastMapper;
import com.sinochem.service.AcpsAcctMastService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcpsAcctMastServiceImpl implements AcpsAcctMastService {
    @Autowired
    AcpsAcctMastMapper acpsAcctMastMapper;

    @Override
    public List<AcpsAcctMast> listAcpsAcctMast() {
        AcpsAcctMastExample example = new AcpsAcctMastExample();
        List<AcpsAcctMast> list = acpsAcctMastMapper.selectByExample(example);
        return list;
    }

    @Override
    public boolean updateByMastAcctNum(AcpsAcctMast record) {
        AcpsAcctMastExample example = new AcpsAcctMastExample();
        AcpsAcctMastExample.Criteria criteria = example.createCriteria();
        criteria.andMastAcctNumEqualTo(record.getMastAcctNum());
        int num = acpsAcctMastMapper.updateByExampleSelective(record, example);
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }
}
