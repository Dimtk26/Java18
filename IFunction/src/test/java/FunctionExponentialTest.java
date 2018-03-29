
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;

public class FunctionExponentialTest {
    @DataProvider(name="Variable")
    public static Object[][] ValueData() throws BadValueException {
        return new Object[][]{

                {new FunctionExponential(-5.0,5.0, 1.0,0.0), 1.0, Math.exp(1.0)},
                {new FunctionExponential(-5.0,5.0, 2.5,1.0), 0.0, 2.5*Math.exp(0.0)+1},
                {new FunctionExponential(-5.0,5.0, 2.5,1.0), 2.0, 2.5*Math.exp(2.0)+1},
                {new FunctionExponential(5.0,-5.0, 2.0,2.0), -1.0, 2.0*Math.exp(-1.0)+2},
        };
    }
    @DataProvider(name = "ValueExc")
    public static Object[][] ValueDataEx() throws BadValueException {
        return new Object[][]{
                {new FunctionExponential(5.0,-5.0,1.0,-1.0), 6.0},
                {new FunctionExponential(5.0,-5.0,1.0,-1.0), -6.0},
        };
    }
    @Test
    public void testValue() throws Exception {
    }

}