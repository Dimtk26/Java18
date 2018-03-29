
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class IntegralTest {
    @DataProvider(name="Variable")
    public static <T extends IFunction>Object[][] ValueData() throws BadValueException {
        return new Object[][]{
                {new FunctionLinear(-5.0,5.0,1.0,0.0),new Integral<T>(0.0,2.0), 2.0},
                {new FunctionLinear(-5.0,5.0,2.0,0.0),new Integral<T>(0.0,2.0), 4.0},

                {new FunctionLinear(-5.0,4.0,4.0,2.0),new Integral<T>(1.0,3.0), 20.0},
                {new FunctionTrigonometric(-5.0,5.0,1.0,1.0),new Integral<T>(0.0,Math.PI), 2.0},
                {new FunctionTrigonometric(5.0,-5.0,-2.0,1.0),new Integral<T>(-Math.PI,Math.PI), 0.0},
                {new FunctionRational(-5.0,5.0,2.0,6.0, 1.0,0.0),new Integral<T>(1.0,Math.E), 2*Math.E + 4},
                {new FunctionExponential(-5.0,5.0, 1.0,0.0), new Integral<T>(0.0, 2.0), Math.exp(2.0)-Math.exp(0.0) },
        };
    }
    @DataProvider(name = "ValueExc")
    public static <T extends IFunction>Object[][] ValueDataEx() throws BadValueException {
        return new Object[][]{
                {new FunctionRational(-5.0,5.0,1.0,0.0, 1.0,0.0), new Integral<T>(-6.0,3.0), 20.0},
        };
    }
    @Test(dataProvider = "Variable")
    public <T extends IFunction> void testCalculate(T f,Integral<T> integral, double result) throws BadValueException {

//        if(Math.abs(integral.calculate(f)-result)>0.1){
//            fail();
//        }
        assertEquals(integral.calculate(f), result, 0.0001);
    }
    @Test(dataProvider = "ValueExc", expectedExceptions = { BadValueException.class})
    public <T extends IFunction>void testCalculateExc(T f,Integral<T> integral, double result) throws BadValueException {
        integral.calculate(f);
        fail();
    }

}