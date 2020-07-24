package com.yj.consumedemo;

import javax.smartcardio.Card;
import java.math.BigDecimal;

public class ConsumptionInfo {
    public final String consumptionTime;
    public final Type consumptionType;
    public final BigDecimal consumptionAmount;
    public final CardType cardType;

    public ConsumptionInfo(String consumptionTime, Type consumptionType, BigDecimal consumptionAmount,CardType cardType) {
        this.consumptionTime = consumptionTime;
        this.consumptionType = consumptionType;
        this.consumptionAmount = consumptionAmount;
        this.cardType = cardType;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        return stringBuilder.append(consumptionTime)
                .append(" ")
                .append(consumptionType.name())
                .append("消费 ")
                .append(consumptionAmount)
                .append("元").toString();
    }
}
