//import org.junit.jupiter.api.AfterEach;
import org.junit.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.fail;

import org.testng.AssertJUnit.*;
import org.testng.annotations.Test;

public class TrinomialTest {
    private Trinomial trinomial;

   // @AfterEach
    public void down(){
        this.trinomial = null;
    }

    @Test
    public void constructorArrayOfCoeffThree(){
        double[] arrayOfCoeffs = {1, 2, 3};
        trinomial = new Trinomial(arrayOfCoeffs);
        double a = trinomial.getA();
        double b = trinomial.getB();
        double c = trinomial.getC();
        assertEquals(a, 1.0);
        assertEquals(b, 2.0);
        assertEquals(c, 3.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void constructorArrayOfCoeffNonThree(){
        trinomial = new Trinomial(new double[] {1, 2});
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void solutionDiscriminantSmallerThanZero(){
        trinomial = new Trinomial(3.0, 2.0, 5.0);
        trinomial.solution();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void solutionComplexRoots(){
        trinomial = new Trinomial(3.0, 0, 5.0);
        trinomial.solution();
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void solutionCnonEqualsZero(){
        trinomial = new Trinomial(0, 0, 5.0);
        trinomial.solution();
    }

    @Test
    public void solutionWithAllCoefficients(){
        trinomial = new Trinomial(1.0, -2.0, -3.0);
        double[] res = trinomial.solution();
        assertTrue(res[0] == 3.0);
        assertTrue(res[1] == -1.0);
    }

    @Test
    public void solutionWithAandB(){
        trinomial = new Trinomial(2.0, -8.0, 0);
        double[] res = trinomial.solution();
        assertTrue(res[0] == 0);
        assertTrue(res[1] == 4.0);
    }

    @Test
    public void solutionWithAandCSmallerThanZero(){
        trinomial = new Trinomial(2.0, 0, -8.0);
        double[] res = trinomial.solution();
        assertTrue(res[0] == 2.0);
        assertTrue(res[1] == -2.0);
    }
}