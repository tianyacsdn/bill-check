package com.sinochem.service.impl;

import com.sinochem.domain.AcpsBalanceCheckTask;
import com.sinochem.domain.AcpsBalanceCheckTaskExample;
import com.sinochem.mapper.AcpsBalanceCheckTaskMapper;
import com.sinochem.service.AcpsBalanceCheckTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AcpsBalanceCheckTaskServiceImpl implements AcpsBalanceCheckTaskService {

    @Autowired
    AcpsBalanceCheckTaskMapper acpsBalanceCheckTaskMapper;

    @Override
    public List<AcpsBalanceCheckTask> listCheckTask() {
        AcpsBalanceCheckTaskExample example = new AcpsBalanceCheckTaskExample();
        AcpsBalanceCheckTaskExample.Criteria criteria = example.createCriteria();
//        criteria.andBanalceStatusEqualTo(0);
        List<AcpsBalanceCheckTask> list = acpsBalanceCheckTaskMapper.selectByExample(example);
        return list;
    }
}
