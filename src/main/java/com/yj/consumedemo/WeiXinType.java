package com.yj.consumedemo;

import java.math.BigDecimal;

public class WeiXinType extends PayType {
    @Override
    public BigDecimal calculateIntegral(BigDecimal amount,CardType cardType) {
        BigDecimal integral = amount.divide(new BigDecimal(20),0,BigDecimal.ROUND_DOWN);
        if(cardType.equals(CardType.GOLD)) {
            integral = integral.add(integral.divide(new BigDecimal(2),0,BigDecimal.ROUND_DOWN));
        }
        return integral;
    }
}
