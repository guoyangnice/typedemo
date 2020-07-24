package com.yj.consumedemo;

import java.math.BigDecimal;

public abstract class PayType {
    public abstract BigDecimal calculateIntegral(BigDecimal amount,CardType cardType);
}
