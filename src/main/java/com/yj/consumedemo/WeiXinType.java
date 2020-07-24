package com.yj.consumedemo;

import java.math.BigDecimal;

public class WeiXinType extends PayType {
    @Override
    public BigDecimal calculateIntegral(BigDecimal amount) {
        return amount.divide(new BigDecimal(20),0,BigDecimal.ROUND_DOWN);
    }
}
