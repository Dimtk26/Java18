package classes;

public class Point3D
{
    public double x, y, z;

    public Point3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D()
    {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) { this.z = z; }

    public void Out()
    {
        System.out.println("Координаты точки: x = " +getX());
        System.out.println("Координаты точки: y = " +getY());
        System.out.println("Координаты точки: z = " +getZ());
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point3D point3D = (Point3D) o;

        if (Double.compare(point3D.x, x) != 0) return false;
        if (Double.compare(point3D.y, y) != 0) return false;
        return Double.compare(point3D.z, z) == 0;
    }

    public static void main(String args[])
    {
        Point3D point_first = new Point3D(1, 2, 3);
        Point3D point_second = new Point3D();
        if(point_first == point_second) {System.out.println("Точки равны");}
        else {System.out.println("Точки не равны");}

        if(point_first == point_first) {System.out.println("Точка равна себе");}
        else {System.out.println("Точка не равна себе");}

        Point3D point_third = new Point3D(1, 2, 3);
        if(point_first.equals(point_third)) {System.out.println("Точки равны");}
        else {System.out.println("Точки не равны");}

        point_second.Out();
    }
}
