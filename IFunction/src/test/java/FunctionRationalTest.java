
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.*;

public class FunctionRationalTest {
    @DataProvider(name="Variable")
    public static Object[][] ValueData() throws BadValueException {
        return new Object[][]{

                {new FunctionRational(-5.0,5.0,1.0,0.0, 1.0,0.0), 1.0, 1.0},
                {new FunctionRational(-5.0,5.0,1.0,1.0, 1.0,1.0), 0.0, 1.0},
                {new FunctionRational(-5.0,5.0,1.0,1.0, 1.0,1.0), 1.0, 1.0},
                {new FunctionRational(-5.0,5.0,2.0,0.0, 1.0,0.5), 1.5, 1.5},
                {new FunctionRational(-5.0,5.0,1.0,1.0, 1.0,1.0), 0.0, 1.0},
                {new FunctionRational(-5.0,5.0,1.0,0.0, 1.0,1.0), 0.0, 0.0},
        };
    }
    @DataProvider(name = "ValueExc")
    public static Object[][] ValueDataEx() throws BadValueException {
        return new Object[][]{
                {new FunctionRational(-5.0,5.0,1.0,0.0, 1.0,0.0), 0.0},
                {new FunctionRational(-5.0,5.0,1.0,0.0, 1.0,-1.0), 1.0},
                {new FunctionRational(5.0,-5.0,1.0,-1.0,1.0,1.0), 6.0},
                {new FunctionRational(5.0,-5.0,1.0,-1.0,1.0,1.0), -6.0},
        };
    }

    @Test(dataProvider = "Variable")
    public void testValue(FunctionRational f, double x, double result) throws BadValueException {
        assertEquals(f.value(x), result);
    }

    @Test(dataProvider = "ValueExc", expectedExceptions = { BadValueException.class})
    public void testValueExc(FunctionRational f, double x) throws BadValueException {
        f.value(x);
        fail();
    }

}