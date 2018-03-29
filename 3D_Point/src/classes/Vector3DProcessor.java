package classes;
import classes.Vector3D;

public class Vector3DProcessor
{
    public void addition(Vector3D v, Vector3D v1, Vector3D v2)
    {
        v.x = v1.x + v2.x;
        v.y = v1.y + v2.y;
        v.z = v1.z + v2.z;
    }

    public void difference(Vector3D v, Vector3D v1, Vector3D v2)
    {
        v.x = v1.x - v2.x;
        v.y = v1.y - v2.y;
        v.z = v1.z - v2.z;
    }

    public double scalarProduct(Vector3D v1, Vector3D v2){
        return (v1.x*v2.x + v1.y*v2.y + v1.z*v2.z);
    }

    public void vectorProduct(Vector3D v, Vector3D v1, Vector3D v2)
    {
        v.x = v1.y * v2.z - v1.z * v2.x;
        v.y = v1.z * v2.x - v1.x * v2.z;
        v.z = v1.x * v2.y - v1.y * v2.x;
    }

    public boolean collinear(Vector3D v1, Vector3D v2)
    {
        Vector3D mult = new Vector3D();
        vectorProduct(mult, v1, v2);
        if(mult.x == 0 && mult.y == 0 && mult.z == 0) {return true;}
        else {return false;}
    }
}
