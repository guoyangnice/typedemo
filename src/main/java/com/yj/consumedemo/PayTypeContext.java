package com.yj.consumedemo;

import java.math.BigDecimal;

public class PayTypeContext {
    private PayType payType;

    public PayTypeContext(PayType payType){
        this.payType = payType;
    }

    public BigDecimal getIntegral(BigDecimal amount){
        return payType.calculateIntegral(amount);
    }
}
