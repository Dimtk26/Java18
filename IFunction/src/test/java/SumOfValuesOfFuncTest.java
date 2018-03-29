
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class SumOfValuesOfFuncTest {
    @DataProvider(name="Variable")
    public static Object[][] ValueData() throws BadValueException {
        return new Object[][]{
                {new FunctionLinear(-5.0, 5.0, 1.0, 0.0), 0.0},
                {new FunctionLinear(-5.0, 5.0, 1.0, 1.0), 3.0},
                {new FunctionLinear(-5.0, 4.0, 4.0, 2.0), 0.0},
                {new FunctionLinear(3.0, 9.0, -2.0, 2.0), -30.0},
                {new FunctionTrigonometric(-5.0, 5.0, 1.0, 0.0), 0.0},
                {new FunctionTrigonometric(Math.PI / 2, -Math.PI / 2, 1.0, -1.0), 0.0},
                {new FunctionTrigonometric(-Math.PI / 4, Math.PI / 4, 2.0, 1.0), 0.0},
                {new FunctionTrigonometric(Math.PI / 2, 0, 1.0, 1.0), 1 + 0.5*Math.sqrt(2)},
                {new FunctionRational(-5.0, 5.0, 1.0, 1.0, 1.0, 1.0), 3.0},
                {new FunctionRational(1.0, 5.0, 2.0, 0.0, 1.0, 0.0), 6.0},
                {new FunctionExponential(0.0, 1.0, 1.0, 0.0), 1 + Math.exp(1.0) + Math.exp(0.5)},
        };
    }
    @Test(dataProvider = "Variable")
    public <T extends IFunction> void testCalculate(T f, double result) throws BadValueException {
        SumOfValuesOfFunc <T> func = new SumOfValuesOfFunc<T>();
        assertEquals(func.calculate(f),result);
    }

}