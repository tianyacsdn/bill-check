package com.sinochem.parse;

public class PingAnBalanceBillFactory implements BalanceBillFactory {
    @Override
    public TxtBalanceBill build() {
        return new PingAnTxtBalanceBill();
    }
}
