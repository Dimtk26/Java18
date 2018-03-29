package vectors;

public class Point_3D
{
    public double x, y, z;

    public Point_3D(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point_3D{" + "x=" + x + ", y=" + y + ", z=" + z + "}";
    }

    public Point_3D()
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

   /* public void out()
    {
        System.out.println("Координаты точки: x = " +getX());
        System.out.println("Координаты точки: y = " +getY());
        System.out.println("Координаты точки: z = " +getZ());
    }*/

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point_3D point3D = (Point_3D) o;

        if (Double.compare(point3D.x, x) != 0) return false;
        if (Double.compare(point3D.y, y) != 0) return false;
        return Double.compare(point3D.z, z) == 0;
    }

    public static void main(String args[])
    {
        Point_3D point_first = new Point_3D(1, 2, 3);
        Point_3D point_second = new Point_3D();
        if(point_first == point_second) {System.out.println("1)Точки равны");}
        else {System.out.println("1)Точки не равны");}

        if(point_first == point_first) {System.out.println("2)Точка равна себе");}
        else {System.out.println("2)Точка не равна себе");}

        Point_3D point_third = new Point_3D(1, 2, 3);
        if(point_first.equals(point_third)) {System.out.println("3)Точки равны");}
        else {System.out.println("3)Точки не равны");}

        // point_second.out();
        System.out.println(point_second.toString());
    }
}
