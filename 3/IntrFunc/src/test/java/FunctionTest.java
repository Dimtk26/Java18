
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class FunctionTest {
    @Test
    public void LinearFunctionValueTest(){
        Function linear = new LinearFunction(2, 1);
        assertEquals(linear.value(2), 5.0, 0.001);
    }

    @Test
    public void LinearFunctionGettersTest(){
        Function linear = new LinearFunction(2, 1);
        assertEquals(linear.getA(), -4.9e-324);
        assertEquals(linear.getB(), 1.7e+308);
    }

    @Test
    public void AsinBxValueTest(){
        Function sin = new AsinBx(2, 1);
        assertEquals(sin.value(2), 1.818, 0.01);
    }

    @Test
    public void AsinBxGettersTest(){
        Function sin = new AsinBx(2, 1);
        assertEquals(sin.getA(), -4.9e-324);
        assertEquals(sin.getB(), 1.7e+308);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void LinearDivisionValueExceptionTest(){
        Function division = new LinearDivision(1,2,0,0);
        division.value(17);
    }

    @Test
    public void LinearDivisionValueTest(){
        Function division = new LinearDivision(3,2,6,4);
        assertEquals(division.value(3), 0.5, 0.0001);
    }

    @Test
    public void LinearDivisionGettersTest(){
        Function linear = new LinearDivision(2, 1, 3, 7);
        assertEquals(linear.getA(), -4.9e-324);
        assertEquals(linear.getB(), 1.7e+308);
    }

    @Test
    public void ExpXvalueTest(){
        Function expX = new ExpX(14, 24);
        assertEquals(expX.value(3), 305.197, 0.001);
    }
}