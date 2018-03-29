package vectors;

import org.junit.Test;

import static org.junit.Assert.*;

public class Vector3DTest {
    @Test
    public void testConstructor() {
        Vector3D vector = new Vector3D();
        assertNotNull(vector);
    }
    @Test
    public void testConstructorParam() {
        Vector3D vector = new Vector3D(1,2,3);
        assertNotNull(vector);
        assertEquals(1, vector.getX(), 1e-13);
        assertEquals(2, vector.getY(), 1e-13);
        assertEquals(3, vector.getZ(), 1e-13);
    }
    @Test
    public void length() {
        Vector3D vector = new Vector3D(0,4,3);
        assertEquals(5.0, vector.Length(), 1e-13);
    }

//    @Test
//    public void equals() {
//    }
//
//    @Test
//    public void testToString() {
//    }

}