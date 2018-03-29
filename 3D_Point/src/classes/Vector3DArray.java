package classes;
import classes.Point3D;
import classes.Vector3D;
import classes.Vector3DProcessor;
import java.util.Arrays;

public class Vector3DArray
{
    int size = 0;
    Vector3D[] data;

    public Vector3DArray(int size)
    {
        if (size > 0)
        {
            this.size = size;
            this.data = new Vector3D[size];
            for (int i = 0; i < size; i++)
            {
                this.data[i] = new Vector3D();
            }
        }
    }

    public void Shift(int i, Vector3D vec)
    {
        if( i >= 0 && i < this.size)
        {
            this.data[i] = vec;
        }
    }

    public void Show()
    {
        for (int i = 0; i < this.size; i++)
        {
            System.out.println("Vector[" + i +"] = {" + data[i].toString() + "}");
        }
    }

    public double Length(){
        return this.size;
    }

    public double HighestLength()
    {
        double max = data[0].Length();
        for(int i = 1; i < this.size; i++)
        {
            if (max < data[i].Length()) {max = data[i].Length();}
        }
        return max;
    }

    public int FindElem(Vector3D vector)
    {
        for(int i = 0; i < this.size; i++)
        {
            if(vector.equals(this.data[i])) {return i;}
        }
        return -1;
    }

    public Vector3D SumVect()
    {
        Vector3D sum = new Vector3D();
        Vector3DProcessor ssum = new Vector3DProcessor();
        for(int i = 0; i < this.size; i++)
        {
            ssum.addition(sum, sum, data[i]);
        }
        return sum;
    }

    public Vector3D linearCombination(double Coeffs[])
    {
        Vector3D v = new Vector3D();
        if (Coeffs.length != this.size)
        {
            return v;
        }
        Vector3DProcessor V3Proc = new Vector3DProcessor();
        for (int i = 0; i < this.size; i++)
        {
            V3Proc.addition(v, v, new Vector3D(Coeffs[i] * this.data[i].x, Coeffs[i] * this.data[i].y, Coeffs[i] * this.data[i].z));
        }
        return v;
    }

    public Point3D[] pointShift(Point3D p)
    {
        Point3D[] shiftArr = new Point3D[this.size];
        for (int i = 0; i < this.size; i++)
        {
            shiftArr[i] = new Point3D(p.x + this.data[i].x, p.y + this.data[i].y, p.z + this.data[i].z);
        }
        return shiftArr;
    }

    public static void main(String args[])
    {
        Vector3DArray ArrayOfVec = new Vector3DArray(6);
        Vector3D Vec = new Vector3D(1, 1, 1);
        Vector3D Vec1 = new Vector3D(2, 2, 2);
        System.out.println("Длина вектора = " + ArrayOfVec.Length());
        ArrayOfVec.Shift(4, Vec);
        ArrayOfVec.Shift(5, Vec1);
        ArrayOfVec.Show();
        System.out.println("Наибольная длина вектора в массиве = " + ArrayOfVec.HighestLength());
        System.out.println("Номер элемента в массиве = " + ArrayOfVec.FindElem(Vec));
        System.out.println("Сумма векторов в массиве = " + ArrayOfVec.SumVect().toString());
        double Coeffs[] = {1, 2, 3, 4, 5, 6};
        Vector3D linearCombination = ArrayOfVec.linearCombination(Coeffs);
        System.out.println("Линейная комбинация: " + "x = " + linearCombination.x + " y = " + linearCombination.y + " z = " + linearCombination.z);
        Point3D point = new Point3D(1, 1, 1);
        Point3D shift[] = ArrayOfVec.pointShift(point);
        for(int i = 0; i < shift.length; i++) {
            System.out.println("Shift[" +i + "]: x = " + shift[i].getX() + ", y = " + shift[i].getY() + ", z = " + shift[i].getZ());
        }
    }
}
