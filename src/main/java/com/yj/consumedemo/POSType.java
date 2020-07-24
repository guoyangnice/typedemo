package com.yj.consumedemo;

import java.math.BigDecimal;

public class POSType extends PayType {
    @Override
    public BigDecimal calculateIntegral(BigDecimal amount) {
        return amount.divide(new BigDecimal(10),0,BigDecimal.ROUND_DOWN);
    }
}
