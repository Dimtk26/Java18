
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import static org.testng.Assert.*;

public class FunctionTrigonometricTest {
    @DataProvider(name="Variable")
    public static Object[][] ValueData() throws BadValueException {
        return new Object[][]{
                {new FunctionTrigonometric(-5.0,5.0,1.0,0.0), 0.0, 0.0},
                {new FunctionTrigonometric(-5.0,5.0,1.0,0.0), 1.0, 0.0},
                {new FunctionTrigonometric(-5.0,30.0,4.0,1.0), 30.0, 4*Math.sin(30.0)},
                {new FunctionTrigonometric(3.0,9.0,-3.0,2.0), 3.0, -3.0*Math.sin(2.0*3.0)},
                {new FunctionTrigonometric(5.0,-5.0,1.0,-1.0), Math.PI/2, -1.0},
                {new FunctionTrigonometric(0.0,10.0,2.0,1.0), Math.PI/4, 1.414213562373095}
        };
    }
    @DataProvider(name = "ValueExc")
    public static Object[][] ValueDataEx() throws BadValueException {
        return new Object[][]{
                {new FunctionTrigonometric(5.0,-5.0,1.0,-1.0), -6.0},
                {new FunctionTrigonometric(5.0,-5.0,1.0,-1.0), 6.0},
        };
    }
    @Test(dataProvider = "Variable")
    public void testValue(FunctionTrigonometric f, double x, double result) throws BadValueException {
        assertEquals(f.value(x), result);
    }

    @Test(dataProvider = "ValueExc", expectedExceptions = { BadValueException.class})
    public void testValueExc(FunctionTrigonometric f, double x) throws BadValueException {
        f.value(x);
        fail();
    }

}