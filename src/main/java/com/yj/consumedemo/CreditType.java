package com.yj.consumedemo;

import java.math.BigDecimal;

public class CreditType extends PayType{

    @Override
    public BigDecimal calculateIntegral(BigDecimal amount) {
        BigDecimal bonus = BigDecimal.ZERO;
        BigDecimal integral = amount.divide(new BigDecimal(10),0,BigDecimal.ROUND_DOWN);
        if(amount.compareTo(new BigDecimal(100)) > 0){
            bonus = amount.divide(new BigDecimal(100),0,BigDecimal.ROUND_DOWN).multiply(new BigDecimal(5));
        }
        if(bonus.compareTo(new BigDecimal(100))> 0){
            bonus = new BigDecimal(100);
        }
        return bonus.add(integral);
    }

}
