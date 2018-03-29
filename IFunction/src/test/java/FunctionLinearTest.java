
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class FunctionLinearTest {
    @DataProvider(name="Variable")
    public static Object[][] ValueData() throws BadValueException {
        return new Object[][]{
                {new FunctionLinear(-5.0,5.0,1.0,0.0), 0.0, 0.0},
                {new FunctionLinear(-5.0,5.0,1.0,0.0), 1.0, 1.0},
                {new FunctionLinear(-5.0,4.0,4.0,2.0), 1.5, 8.0},
                {new FunctionLinear(3.0,9.0,-3.0,2.0), 3.0, -7.0},
                {new FunctionLinear(5.0,-5.0,3.0,-1.0), 5.0, 14.0},
        };
    }
    @DataProvider(name = "ValueExc")
    public static Object[][] ValueDataEx() throws BadValueException {
        return new Object[][]{
                {new FunctionLinear(5.0,-5.0,1.0,-1.0), -6.0},
                {new FunctionLinear(5.0,-5.0,1.0,-1.0), 6.0},
        };
    }

    @Test(dataProvider = "Variable")
    public void testValue(FunctionLinear f, double x, double result) throws BadValueException {
        assertEquals(f.value(x), result);
    }

    @Test(dataProvider = "ValueExc", expectedExceptions = { BadValueException.class})
    public void testValueExc(FunctionLinear f, double x) throws BadValueException {
        f.value(x);
        fail();
    }



}