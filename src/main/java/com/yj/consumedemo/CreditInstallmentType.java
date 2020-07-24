package com.yj.consumedemo;

import java.math.BigDecimal;

public class CreditInstallmentType extends PayType{

    @Override
    public BigDecimal calculateIntegral(BigDecimal amount,CardType cardType) {
        BigDecimal bonus = BigDecimal.ZERO;
        BigDecimal integral = amount.divide(new BigDecimal(10),0,BigDecimal.ROUND_DOWN);
        if(amount.compareTo(new BigDecimal(5000)) >= 1){
            bonus = bonus.add(new BigDecimal(100));
        }
        if(cardType.equals(CardType.GOLD)) {
            integral = integral.add(integral.divide(new BigDecimal(2),0,BigDecimal.ROUND_DOWN));
        }
        return integral.add(bonus);
    }
}
