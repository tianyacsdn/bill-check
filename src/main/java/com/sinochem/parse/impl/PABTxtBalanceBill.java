package com.sinochem.parse.impl;

import com.sinochem.domain.BillBankBalance;
import com.sinochem.parse.TxtBalanceBill;
import org.aspectj.util.FileUtil;

import java.io.File;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * 类名称：PingAnTxtBalanceBill
 * 类描述：平安银行txt格式的余额对账单解析类
 * @author shiqianghui
 * @date 2018-08-06
 */
public class PABTxtBalanceBill implements TxtBalanceBill {

    @Override
    public List parse(String filePath) throws Exception {
        String billDate = null;
        List list = parseBill(filePath, billDate);
        return list;
    }

    @Override
    public List parse(String filePath, String billDate) throws Exception {
        List list = parseBill(filePath, billDate);
        return list;
    }

    private List parseBill(String filePath, String billDate) throws Exception {
        List<BillBankBalance> list = new ArrayList<>();
        File dir = new File(filePath);
        File[] files = dir.listFiles();
        for (File file : files) {
            String fileName = file.getName();
            if (fileName.contains("YE")) {
                String fileBillDate = fileName.substring(2,10);
                if (billDate == null) {
                    billDate = fileBillDate;
                }
                if (fileBillDate.equals(billDate)) {
                    String thirdNum = fileName.substring(10, 14);
                    byte[] datas = FileUtil.readAsByteArray(file);
                    String[] fileDatas = new String(datas).split("\n");
                    for (int i = 0; i < fileDatas.length; i++) {
                        BillBankBalance billBankBalance = new BillBankBalance();
                        billBankBalance.setBillDate(new SimpleDateFormat("yyyyMMdd").parse(billDate));
                        billBankBalance.setGatewayChannel("PAB");
                        billBankBalance.setGatewayChannelCode(thirdNum);
                        String rowData = fileDatas[i];
                        String[] colData = rowData.split("&");
                        billBankBalance.setTransSq(colData[0]);
                        billBankBalance.setThirdCustid(colData[1]);
                        billBankBalance.setAcctId(colData[2]);
                        String tranAmount = colData[3].replace("\r", "");
                        billBankBalance.setTranAmount(new BigDecimal(tranAmount));
                        list.add(billBankBalance);
                    }
                }
            }
        }
        return list;
    }
}
