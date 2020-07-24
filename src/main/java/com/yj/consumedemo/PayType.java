package com.yj.consumedemo;

import java.math.BigDecimal;

public abstract class PayType {
    protected abstract BigDecimal calculateIntegral(BigDecimal amount);
}
