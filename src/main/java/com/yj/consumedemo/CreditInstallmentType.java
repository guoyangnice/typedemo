package com.yj.consumedemo;

import java.math.BigDecimal;

public class CreditInstallmentType extends PayType{

    @Override
    public BigDecimal calculateIntegral(BigDecimal amount) {
        BigDecimal bonus = BigDecimal.ZERO;
        BigDecimal integral = amount.divide(new BigDecimal(10),0,BigDecimal.ROUND_DOWN);
        if(amount.compareTo(new BigDecimal(5000)) > 0){
            bonus.add(new BigDecimal(100));
        }
        return integral.add(bonus);
    }
}
