package com.yj.consumedemo;

import java.math.BigDecimal;

public class ConsumptionInfo {
    public final String consumptionTime;
    public final String consumptionType;
    public final BigDecimal consumptionAmount;

    public ConsumptionInfo(String consumptionTime, String consumptionType, BigDecimal consumptionAmount) {
        this.consumptionTime = consumptionTime;
        this.consumptionType = consumptionType;
        this.consumptionAmount = consumptionAmount;
    }



    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(consumptionTime)
                .append(" ")
                .append(consumptionType)
                .append("消费 ")
                .append(consumptionAmount)
                .append("元").toString();
    }
}
