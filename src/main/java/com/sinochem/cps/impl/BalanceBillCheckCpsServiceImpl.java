package com.sinochem.cps.impl;

import com.sinochem.cps.BalanceBillCheckCpsService;
import com.sinochem.domain.BalanceBillCheck;
import com.sinochem.service.BalanceBillCheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class BalanceBillCheckCpsServiceImpl implements BalanceBillCheckCpsService {
    private final BalanceBillCheckService balanceBillCheckService;

    public BalanceBillCheckCpsServiceImpl(BalanceBillCheckService balanceBillCheckService) {
        this.balanceBillCheckService = balanceBillCheckService;
    }


    @Override
    public int insert(BalanceBillCheck record) {
        record.setCheckDate(new Date());
        record.setCreateTime(new Date());
        return balanceBillCheckService.insert(record);
    }

    @Override
    public int insertBatch(List<BalanceBillCheck> records) {
        records.forEach(record -> {
            record.setCheckDate(new Date());
            record.setCreateTime(new Date());
        });
        return balanceBillCheckService.insertBatch(records);
    }

    @Override
    public List<BalanceBillCheck> listDataByBillDate(String gatewayChannel, String billDate) {
        return balanceBillCheckService.listDataByBillDate(gatewayChannel, billDate);
    }

    @Override
    public List<BalanceBillCheck> listDataByCheckDate(String gatewayChannel, String checkDate) {
        return balanceBillCheckService.listDataByCheckDate(gatewayChannel, checkDate);
    }
}
