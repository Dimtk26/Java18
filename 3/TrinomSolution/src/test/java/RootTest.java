import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertEquals;

public class RootTest {
    private Trinomial trinomial;

   // @AfterAll
    public void remove(){
        trinomial = null;
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void missRoots(){
        trinomial = new Trinomial(100, 1, 5);
        TrinomSolution sol = new TrinomSolution();
        double res =  sol.Root(trinomial);
    }

    @Test
    public void oneRoot(){
        trinomial = new Trinomial(2, 4, 2);
        double root = new TrinomSolution().Root(trinomial);
        assertEquals(-1.0, root, 0.0001);
    }

    @Test
    public void twoRoot(){
        trinomial = new Trinomial(-1, 3, 4);
        double root = new TrinomSolution().Root(trinomial);
        assertEquals(4, root, 0.0001);
    }
}
