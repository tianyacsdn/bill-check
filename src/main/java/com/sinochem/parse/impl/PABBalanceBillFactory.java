package com.sinochem.parse.impl;


import com.sinochem.parse.BalanceBillFactory;
import com.sinochem.parse.TxtBalanceBill;

/**
 * 接口名称：PingAnBalanceBillFactory
 * 接口描述：平安银行余额对账单解析工厂类
 * @author shiqianghui
 * @date 2018-08-06
 */
public class PABBalanceBillFactory implements BalanceBillFactory {
    /**
     * 构建平安银行余额对账单实例对象
     * @return
     */
    @Override
    public TxtBalanceBill build() {
        return new PABTxtBalanceBill();
    }
}
