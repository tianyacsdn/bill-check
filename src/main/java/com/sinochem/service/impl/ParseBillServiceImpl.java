package com.sinochem.service.impl;

import com.sinochem.domain.BillBankBalance;
import com.sinochem.parse.BalanceBillFactory;
import com.sinochem.parse.PingAnBalanceBillFactory;
import com.sinochem.parse.TxtBalanceBill;
import com.sinochem.service.ParseBillService;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.List;

@Service
public class ParseBillServiceImpl implements ParseBillService {
    @Override
    public List parseBill() throws Exception {
        BalanceBillFactory factory = new PingAnBalanceBillFactory();
        TxtBalanceBill txtBalanceBill = factory.build();
        List<BillBankBalance> list = txtBalanceBill.parse("E:" + File.separator + "FTP");
        return list;
    }
}
