import com.klb.calculator.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by klb on 19.08.18.
 */
public class CalculatorTest {

    @Test
    public void testSum() {
        assertEquals(-3.0 , Calculator.sum(-5.5, 2.5), 0);
    }

    @Test
    public void testMult() {
        assertEquals(-12.0 , Calculator.mult(-3, 4), 0);
    }

}
