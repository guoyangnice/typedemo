import com.yj.consumedemo.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class TypeTest {
    @Test
    public void should_return_integral_when_give_pos__amount_8(){
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        ConsumptionInfo consumptionInfo = new ConsumptionInfo("2020-07-01 12:20", Type.POS,new BigDecimal(8),CardType.NORMAl);
        consumptionInfos.add(consumptionInfo);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal integral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(BigDecimal.ZERO,integral);
    }

    @Test
    public void should_return_integral_when_give_pos_amount_108(){
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        ConsumptionInfo consumptionInfo = new ConsumptionInfo("2020-07-01 12:20", Type.POS,new BigDecimal(108),CardType.NORMAl);
        consumptionInfos.add(consumptionInfo);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal integral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(new BigDecimal(10),integral);
    }

    @Test
    public void should_return_integral_when_give_pos_amount_108_208_8(){
        ConsumptionInfo consumptionInfo1 = new ConsumptionInfo("2020-07-01 12:20",Type.POS,new BigDecimal(108),CardType.NORMAl);
        ConsumptionInfo consumptionInfo2 = new ConsumptionInfo("2020-07-01 12:20",Type.POS,new BigDecimal(208),CardType.NORMAl);
        ConsumptionInfo consumptionInfo3 = new ConsumptionInfo("2020-07-01 12:20",Type.POS,new BigDecimal(8),CardType.NORMAl);
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        consumptionInfos.add(consumptionInfo1);
        consumptionInfos.add(consumptionInfo2);
        consumptionInfos.add(consumptionInfo3);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal totalIntegral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(new BigDecimal(30),totalIntegral);
    }

    @Test
    public void should_return_integral_when_give_amount_and_weixin_108_208_8(){
        ConsumptionInfo consumptionInfo1 = new ConsumptionInfo("2020-07-01 12:20",Type.WEIXIN,new BigDecimal(108),CardType.NORMAl);
        ConsumptionInfo consumptionInfo2 = new ConsumptionInfo("2020-07-01 12:20",Type.POS,new BigDecimal(208),CardType.NORMAl);
        ConsumptionInfo consumptionInfo3 = new ConsumptionInfo("2020-07-01 12:20",Type.WEIXIN,new BigDecimal(8),CardType.NORMAl);
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        consumptionInfos.add(consumptionInfo1);
        consumptionInfos.add(consumptionInfo2);
        consumptionInfos.add(consumptionInfo3);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal totalIntegral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(new BigDecimal(25),totalIntegral);
    }

    @Test
    public void should_return_integral_when_give_amount_and_credit_2208(){
        ConsumptionInfo consumptionInfo = new ConsumptionInfo("2020-07-01 12:20",Type.CREDIT,new BigDecimal(2208),CardType.NORMAl);
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        consumptionInfos.add(consumptionInfo);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal totalIntegral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(new BigDecimal(320),totalIntegral);
    }

    @Test
    public void should_return_integral_when_give_amount_and_credit_308(){
        ConsumptionInfo consumptionInfo = new ConsumptionInfo("2020-07-01 12:20",Type.CREDIT,new BigDecimal(308),CardType.NORMAl);
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        consumptionInfos.add(consumptionInfo);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal totalIntegral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(new BigDecimal(45),totalIntegral);
    }

    @Test
    public void should_return_integral_when_give_amount_and_credit_installment_6400(){
        ConsumptionInfo consumptionInfo = new ConsumptionInfo("2020-07-01 12:20",Type.CREDITINSTALLMENTTYPE,new BigDecimal(6400),CardType.NORMAl);
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        consumptionInfos.add(consumptionInfo);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal totalIntegral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(new BigDecimal(740),totalIntegral);
    }

    @Test
    public void should_return_integral_when_give_all_type(){
        ConsumptionInfo consumptionInfo1 = new ConsumptionInfo("2020-07-01 12:20",Type.CREDIT,new BigDecimal(2208),CardType.NORMAl);
        ConsumptionInfo consumptionInfo2 = new ConsumptionInfo("2020-07-01 12:20",Type.POS,new BigDecimal(208),CardType.NORMAl);
        ConsumptionInfo consumptionInfo3 = new ConsumptionInfo("2020-07-01 12:20",Type.WEIXIN,new BigDecimal(22),CardType.NORMAl);
        ConsumptionInfo consumptionInfo4 = new ConsumptionInfo("2020-07-01 12:20",Type.CREDITINSTALLMENTTYPE,new BigDecimal(6400),CardType.NORMAl);
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        consumptionInfos.add(consumptionInfo1);
        consumptionInfos.add(consumptionInfo2);
        consumptionInfos.add(consumptionInfo3);
        consumptionInfos.add(consumptionInfo4);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal totalIntegral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(new BigDecimal(1081),totalIntegral);
    }

    @Test
    public void should_return_integral_when_give_all_type_card_gold(){
        ConsumptionInfo consumptionInfo1 = new ConsumptionInfo("2020-07-01 12:20",Type.CREDIT,new BigDecimal(2208),CardType.GOLD);
        ConsumptionInfo consumptionInfo2 = new ConsumptionInfo("2020-07-01 12:20",Type.POS,new BigDecimal(208),CardType.GOLD);
        ConsumptionInfo consumptionInfo3 = new ConsumptionInfo("2020-07-01 12:20",Type.WEIXIN,new BigDecimal(22),CardType.GOLD);
        ConsumptionInfo consumptionInfo4 = new ConsumptionInfo("2020-07-01 12:20",Type.CREDITINSTALLMENTTYPE,new BigDecimal(6400),CardType.GOLD);
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        consumptionInfos.add(consumptionInfo1);
        consumptionInfos.add(consumptionInfo2);
        consumptionInfos.add(consumptionInfo3);
        consumptionInfos.add(consumptionInfo4);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal totalIntegral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(new BigDecimal(1521),totalIntegral);
    }
}
