package com.yj.consumedemo;

import java.math.BigDecimal;

public class CreditType extends PayType{

    @Override
    public BigDecimal calculateIntegral(BigDecimal amount,CardType cardType) {
        BigDecimal bonus = BigDecimal.ZERO;
        BigDecimal integral = amount.divide(new BigDecimal(10),0,BigDecimal.ROUND_DOWN);
        if(amount.compareTo(new BigDecimal(100)) > 0){
            bonus = amount.divide(new BigDecimal(100),0,BigDecimal.ROUND_DOWN).multiply(new BigDecimal(5));
        }
        if(bonus.compareTo(new BigDecimal(100))> 0){
            bonus = new BigDecimal(100);
        }
        if(cardType.equals(CardType.GOLD)) {
            integral = integral.add(integral.divide(new BigDecimal(2),0,BigDecimal.ROUND_DOWN));
        }
        return bonus.add(integral);
    }

}
