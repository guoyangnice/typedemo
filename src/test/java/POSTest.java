import com.yj.consumedemo.ConsumptionInfo;
import com.yj.consumedemo.POSType;
import com.yj.consumedemo.PayTypeContext;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class POSTest {
    @Test
    public void should_return_integral_when_give_amount(){
        PayTypeContext context = new PayTypeContext(new POSType());
        ConsumptionInfo consumptionInfo = new ConsumptionInfo("2020-07-01 12:20","pos机",new BigDecimal(8));
        BigDecimal integral = context.getIntegral(consumptionInfo.consumptionAmount);
        Assert.assertEquals(BigDecimal.ZERO,integral);
    }
}
