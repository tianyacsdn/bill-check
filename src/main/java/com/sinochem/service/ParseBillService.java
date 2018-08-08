package com.sinochem.service;

import com.sinochem.domain.BillBankBalance;

import java.util.List;

public interface ParseBillService {
    List parseBill() throws Exception;

    boolean loadBill() throws Exception;
}
