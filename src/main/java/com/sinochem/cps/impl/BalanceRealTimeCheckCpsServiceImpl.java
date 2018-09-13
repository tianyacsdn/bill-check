package com.sinochem.cps.impl;

import com.sinochem.cps.BalanceRealTimeCheckCpsService;
import com.sinochem.domain.BalanceRealTimeCheck;
import com.sinochem.service.BalanceRealTimeCheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author tom
 */
@Service
@Slf4j
public class BalanceRealTimeCheckCpsServiceImpl implements BalanceRealTimeCheckCpsService {
    private final BalanceRealTimeCheckService balanceRealTimeCheckService;

    public BalanceRealTimeCheckCpsServiceImpl(BalanceRealTimeCheckService balanceRealTimeCheckService) {
        this.balanceRealTimeCheckService = balanceRealTimeCheckService;
    }

    @Override
    public int insert(BalanceRealTimeCheck record) {
        record.setCheckDate(new Date());
        record.setCreateTime(new Date());
        return balanceRealTimeCheckService.insert(record);
    }

    @Override
    public int insertBatch(List<BalanceRealTimeCheck> records) {
        records.forEach(record -> {
            record.setCheckDate(new Date());
            record.setCreateTime(new Date());
        });
        return balanceRealTimeCheckService.insertBatch(records);
    }

    @Override
    public List<BalanceRealTimeCheck> listBalanceRealTimeCheck(String gatewayChannel, String startDate, String endDate) {
        return balanceRealTimeCheckService.listBalanceRealTimeCheck(gatewayChannel, startDate, endDate);
    }
}
