

public class Vector3D
{
    double x, y, z;

    public Vector3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D()
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public Vector3D(Point_3D point1, Point_3D point2)
    {
        this.x = point2.x - point1.x;
        this.y = point2.y - point1.y;
        this.z = point2.z - point1.z;
    }

    public double Length(){
        return Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Vector3D vector3D = (Vector3D) o;

        if (Double.compare(vector3D.x, x) != 0) return false;
        if (Double.compare(vector3D.y, y) != 0) return false;
        return Double.compare(vector3D.z, z) == 0;
    }

    public String toString() {
        return this.x +", " + this.y + ", " + this.z;
    }

    public static void main(String args[])
    {
        Vector3D vec1 = new Vector3D(2, 2, 3);
        Vector3D vec2 = new Vector3D(2, 2, 3);
        Vector3D vec3 = new Vector3D();

        if(vec1 == vec3) {System.out.println("1)Вектора равны");}
        else {System.out.println("1)Вектора не равны");}

        if(vec3 == vec3) {System.out.println("2)Вектор равен себе");}
        else {System.out.println("2)Вектор не равен себе");}

        if(vec1.equals(vec2)) {System.out.println("3)Вектора равны");}
        else {System.out.println("3)Вектора не равны");}

        System.out.println("Длина вектора = " +vec1.Length());
    }

}