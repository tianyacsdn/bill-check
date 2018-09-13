package com.sinochem.service.impl;

import com.sinochem.domain.BalanceRealTimeCheck;
import com.sinochem.domain.BalanceRealTimeCheckExample;
import com.sinochem.mapper.BalanceRealTimeCheckMapper;
import com.sinochem.service.BalanceRealTimeCheckService;
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
public class BalanceRealTimeCheckServiceImpl implements BalanceRealTimeCheckService {

    private final BalanceRealTimeCheckMapper balanceRealTimeCheckMapper;

    public BalanceRealTimeCheckServiceImpl(BalanceRealTimeCheckMapper balanceRealTimeCheckMapper) {
        this.balanceRealTimeCheckMapper = balanceRealTimeCheckMapper;
    }

    @Override
    public int insert(BalanceRealTimeCheck record) {
        return balanceRealTimeCheckMapper.insert(record);
    }

    @Override
    public int insertBatch(List<BalanceRealTimeCheck> records) {
        return balanceRealTimeCheckMapper.insertBatch(records);
    }

    @Override
    public List<BalanceRealTimeCheck> listBalanceRealTimeCheck(String gatewayChannel, String startDate, String endDate) {
        BalanceRealTimeCheckExample example = new BalanceRealTimeCheckExample();
        BalanceRealTimeCheckExample.Criteria criteria = example.createCriteria();
        criteria.andGatewayChannelEqualTo(gatewayChannel);
        try {
            criteria.andCheckDateGreaterThanOrEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(startDate));
            criteria.andCheckDateGreaterThanOrEqualTo(new SimpleDateFormat("yyyy-MM-dd").parse(endDate));
        } catch (ParseException e) {
           LOGGER.error(e.getMessage(), e);
        }
        return balanceRealTimeCheckMapper.selectByExample(example);
    }
}
