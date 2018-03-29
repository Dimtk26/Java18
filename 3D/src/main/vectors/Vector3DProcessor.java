package vectors;

public class Vector3DProcessor
{
    public static  Vector3D addition(Vector3D v1, Vector3D v2)
    {
        return  new Vector3D(v1.x + v2.x,v1.y + v2.y,v1.z + v2.z);
    }

    public static Vector3D difference(Vector3D v1, Vector3D v2)
    {
        return new Vector3D( v1.x - v2.x, v1.y - v2.y, v1.z - v2.z);
    }



    public static double scalarProduct(Vector3D v1, Vector3D v2){
    return (v1.x*v2.x + v1.y*v2.y + v1.z*v2.z);
}


    public static Vector3D vectorProduct(Vector3D v1, Vector3D v2)
    {
        return new Vector3D(
                v1.y * v2.z - v1.z * v2.x,
                v1.z * v2.x - v1.x * v2.z,
                v1.x * v2.y - v1.y * v2.x
        );
    }

    public static boolean collinear(Vector3D v1, Vector3D v2)
    {
        return vectorProduct(v1, v2).Length() == 0;
    }
}
