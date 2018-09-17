package com.sinochem.service.impl;

import com.sinochem.domain.BalanceBillCheck;
import com.sinochem.domain.BalanceBillCheckExample;
import com.sinochem.mapper.BalanceBillCheckMapper;
import com.sinochem.service.BalanceBillCheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author tom
 */
@Service
@Slf4j
public class BalanceBillCheckServiceImpl implements BalanceBillCheckService {
    private final BalanceBillCheckMapper balanceBillCheckMapper;

    public BalanceBillCheckServiceImpl(BalanceBillCheckMapper balanceBillCheckMapper) {
        this.balanceBillCheckMapper = balanceBillCheckMapper;
    }

    @Override
    public int insert(BalanceBillCheck record) {
        return balanceBillCheckMapper.insert(record);
    }

    @Override
    public int insertBatch(List<BalanceBillCheck> records) {
        return balanceBillCheckMapper.insertBatch(records);
    }

    @Override
    public List<BalanceBillCheck> listDataByBillDate(String gatewayChannel, String billDate) {
        return listDataByDate(gatewayChannel, billDate);
    }

    @Override
    public List<BalanceBillCheck> listDataByCheckDate(String gatewayChannel, String checkDate) {
        return listDataByDate(gatewayChannel, checkDate);
    }

    private List<BalanceBillCheck> listDataByDate(String gatewayChannel, String date) {
        BalanceBillCheckExample example = new BalanceBillCheckExample();
        example.setOrderByClause("ORDER BY acps_total_balance desc");
        BalanceBillCheckExample.Criteria criteria = example.createCriteria();
        criteria.andGatewayChannelEqualTo(gatewayChannel);
        try {
            criteria.andBillDateEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(date));
        } catch (ParseException e) {
            LOGGER.error(e.getMessage(), e);
        }
        return balanceBillCheckMapper.selectByExample(example);
    }
}
