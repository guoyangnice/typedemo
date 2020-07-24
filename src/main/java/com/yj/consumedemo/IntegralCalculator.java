package com.yj.consumedemo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IntegralCalculator {
    private List<ConsumptionInfo> consumptionInfos;

    public IntegralCalculator(List<ConsumptionInfo> consumptionInfos) {
        this.consumptionInfos = consumptionInfos;
    }

    public BigDecimal getTotalIntegral() {
        BigDecimal integral = BigDecimal.ZERO;
        for(ConsumptionInfo consumptionInfo : consumptionInfos){
            if(consumptionInfo.consumptionType.equals(Type.POS)){
                integral = integral.add(new POSType().calculateIntegral(consumptionInfo.consumptionAmount));
            }
            if(consumptionInfo.consumptionType.equals(Type.WEIXIN)){
                integral = integral.add(new WeiXinType().calculateIntegral(consumptionInfo.consumptionAmount));
            }
            if(consumptionInfo.consumptionType.equals(Type.CREDIT)){
                integral = integral.add(new CreditType().calculateIntegral(consumptionInfo.consumptionAmount));
            }
            if(consumptionInfo.consumptionType.equals(Type.CREDITINSTALLMENTTYPE)){
                integral = integral.add(new CreditType().calculateIntegral(consumptionInfo.consumptionAmount));
            }
        }
        return integral;
    }
}
