package imit.MaxRoot;

import imit.Polynom.Polynom;
import imit.Polynom.ValueDoesntMatchException;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MaxRootTest {
    @Test(expectedExceptions = ValueDoesntMatchException.class)
    public void testMaxRoot() throws Exception, ValueDoesntMatchException {
        MaxRoot first = new MaxRoot(new double[]{0, 0, 1.0});
        MaxRoot second = new MaxRoot(new double[]{0,3.0,2.0});
        MaxRoot third = new MaxRoot(new double[]{-1.0,0,4.0});
        MaxRoot fourth = new MaxRoot(new double[]{1.0,0,4.0});
        MaxRoot fifth = new MaxRoot(new double[] {4.0,5.0,1.0});

      if(first.maxRoot()!=0 && second.maxRoot()!=0 && third.maxRoot()!=2 && fifth.maxRoot()!=-0.25){  //                                  3)   5)-1
            Assert.fail();
        }
        fourth.maxRoot();

    }

}