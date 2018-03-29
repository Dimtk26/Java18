import imit.Polynom.Polynom;
import imit.Polynom.ValueDoesntMatchException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.fail;

public class PolynomTest {

    @DataProvider(name="coeff")
    public static Object[][] coefficient() {
        return new Object[][]{
                {new double[]{0,0,1.0},  new double[]{0.0}},
                {new double[]{0,3.0,1.0}, new double[]{ 0.0,-3.0 }},
                {new double[]{0,-5.0,2.0}, new double[]{0.0,2.5}},
                {new double[]{-1.0,0,4.0}, new double[]{0.5,-0.5}},
                {new double[]{4.0,4.0,1.0}, new double[]{-2.0, -2.0}},
                {new double[]{3.0,2.0,1.0}, new double[]{}}

                //  {1.0,0,4.0},
//        {1.0,2.0,1.0, 1, -1.0},
//        {4.0,5.0,1.0, 2,-1.0,-4.0}
//        {1.0,1.0,1.0}
        };
    }

    @Test
    public void testGetCoef() throws ValueDoesntMatchException {

        Polynom polynom = new Polynom(new double[]{3, 2, 1});
        assertEquals(polynom.getCoef(0), 3.0);
        assertEquals(polynom.getCoef(1), 2.0);
        assertEquals(polynom.getCoef(2), 1.0);
        if((polynom.getCoef(0)!=3)&&(polynom.getCoef(1)!=2)&&(polynom.getCoef(2)!=1)){
            fail();
        }
    }
    ///////////////////////////

    @Test(dataProvider = "coeff")
    public void testSolve(double[] coefficients, double[] exp_roots) throws ValueDoesntMatchException {
        assertEquals(new Polynom(coefficients).solve(), exp_roots);
    }
    /////////////////////////
    @Test
    public void testEquals() throws ValueDoesntMatchException {
        Polynom first = new Polynom(new double[] {3, 2, 1});
        Polynom second = new Polynom(new double[] {3, 2, 1});
        Polynom third = new Polynom(new double[] {2, 2, 1});
        Polynom fourth = new Polynom();
        assertEquals(first, first);
        assertEquals(first,second);
        assertNotEquals(first,third);
        assertNotEquals(first,fourth);
    }



//    @Test
//    public void testToString() throws Exception {
//
//    }

}