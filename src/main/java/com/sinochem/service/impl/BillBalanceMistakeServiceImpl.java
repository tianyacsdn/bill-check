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

    /**
     * 添加错误记录
     * @param record
     * @return
     */
    @Override
    public boolean addMistake(BillBalanceMistake record) {
        int num = billBalanceMistakeMapper.insert(record);
        if (num == 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 查询错误信息
     * @return
     */
    @Override
    public List<BillBalanceMistake> listMistake() {
        BillBalanceMistakeExample example = new BillBalanceMistakeExample();
        BillBalanceMistakeExample.Criteria criteria = example.createCriteria();
        List<BillBalanceMistake> list = billBalanceMistakeMapper.selectByExample(example);
        return list;
    }

    /**
     * 批量导入记录
     * @param mistakes
     * @return
     */
    @Override
    public int insertBatch(List<BillBalanceMistake> mistakes) {
        int num = billBalanceMistakeMapper.insertBatch(mistakes);
        return num;
    }
}
