import com.yj.consumedemo.*;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class POSTest {
    @Test
    public void should_return_integral_when_give_pos__amount_8(){
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        ConsumptionInfo consumptionInfo = new ConsumptionInfo("2020-07-01 12:20", Type.POS,new BigDecimal(8));
        consumptionInfos.add(consumptionInfo);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal integral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(BigDecimal.ZERO,integral);
    }

    @Test
    public void should_return_integral_when_give_pos_amount_108(){
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        ConsumptionInfo consumptionInfo = new ConsumptionInfo("2020-07-01 12:20", Type.POS,new BigDecimal(108));
        consumptionInfos.add(consumptionInfo);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal integral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(new BigDecimal(10),integral);
    }

    @Test
    public void should_return_integral_when_give_pos_amount_108_208_8(){
        ConsumptionInfo consumptionInfo1 = new ConsumptionInfo("2020-07-01 12:20",Type.POS,new BigDecimal(108));
        ConsumptionInfo consumptionInfo2 = new ConsumptionInfo("2020-07-01 12:20",Type.POS,new BigDecimal(208));
        ConsumptionInfo consumptionInfo3 = new ConsumptionInfo("2020-07-01 12:20",Type.POS,new BigDecimal(8));
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
        ConsumptionInfo consumptionInfo1 = new ConsumptionInfo("2020-07-01 12:20",Type.WEIXIN,new BigDecimal(108));
        ConsumptionInfo consumptionInfo2 = new ConsumptionInfo("2020-07-01 12:20",Type.POS,new BigDecimal(208));
        ConsumptionInfo consumptionInfo3 = new ConsumptionInfo("2020-07-01 12:20",Type.WEIXIN,new BigDecimal(8));
        List<ConsumptionInfo> consumptionInfos = new ArrayList<>();
        consumptionInfos.add(consumptionInfo1);
        consumptionInfos.add(consumptionInfo2);
        consumptionInfos.add(consumptionInfo3);
        IntegralCalculator integralCalculator = new IntegralCalculator(consumptionInfos);
        BigDecimal totalIntegral = integralCalculator.getTotalIntegral();
        Assert.assertEquals(new BigDecimal(25),totalIntegral);
    }
}
