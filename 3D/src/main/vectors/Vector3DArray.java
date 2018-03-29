package vectors;
import static vectors.Vector3DProcessor.addition;

public class Vector3DArray
{
    Vector3D[] data;

    public Vector3DArray(int size) throws BadValueException {
        if (size<=0) {
            throw new BadValueException();
        }
        this.data = new Vector3D[size];
        for (int i = 0; i < size; i++)
        {
            this.data[i] = new Vector3D();
        }
    }

    public void Shift(int i, Vector3D vec) throws ArrayIndexOutOfBoundsException {
        this.data[i] = vec;
    }

    public void Show()
    {
        for (int i = 0; i < this.data.length; i++)
        {
            System.out.println("Vector[" + i +"] = {" + data[i].toString() + "}");
        }
    }

    public double Length(){
        return this.data.length;
    }

    public double HighestLength()
    {
        double max = data[0].Length();
        for(int i = 1; i < this.data.length; i++)
        {
            if (max < data[i].Length()) {max = data[i].Length();}
        }
        return max;
    }

    public int FindElem(Vector3D vector)
    {
        for(int i = 0; i < this.data.length; i++)
        {
            if(vector.equals(this.data[i])) {return i;}
        }
        return -1;
    }

    public Vector3D SumVect()
    {
        Vector3D sum = new Vector3D();
        for (Vector3D aData : this.data) {
            sum = addition(sum, aData);
        }
        return sum;
    }



    public Vector3D linearCombination(double Coeffs[])
    {
        Vector3D v = new Vector3D();
        if (Coeffs.length != this.data.length)
        {
            return v;
        }
        for (int i = 0; i < this.data.length; i++)
        {
            v = addition( v, new Vector3D(
                    Coeffs[i] * this.data[i].x,
                    Coeffs[i] * this.data[i].y,
                    Coeffs[i] * this.data[i].z)
            );
        }
        return v;
    }

    public Point_3D[] pointShift(Point_3D p)
    {
        Point_3D[] shiftArr = new Point_3D[this.data.length];
        for (int i = 0; i < this.data.length; i++)
        {
            shiftArr[i] = new Point_3D(
                    p.x + this.data[i].x,
                    p.y + this.data[i].y,
                    p.z + this.data[i].z
            );
        }
        return shiftArr;
    }

    public static void main(String args[]) throws BadValueException {
        Vector3DArray ArrayOfVec = new Vector3DArray(6);
        Vector3D Vec = new Vector3D(1, 2, 1);
        Vector3D Vec1 = new Vector3D(2, 0, 2);
        System.out.println("Длина вектора = " + ArrayOfVec.Length());
        /**/System.out.println("До:");
        ArrayOfVec.Show();
        ArrayOfVec.Shift(3, Vec);
        ArrayOfVec.Shift(5, Vec1);
        System.out.println("После замены i-того элемента на вектор");
        ArrayOfVec.Show();
        System.out.println("Наибольная длина вектора в массиве = " + ArrayOfVec.HighestLength());
        System.out.println("Номер элемента в массиве = " + ArrayOfVec.FindElem(Vec));
        System.out.println("Сумма векторов в массиве = " + ArrayOfVec.SumVect().toString());
        double Coeffs[] = {1, 2, 3, 4, 5, 6};
        Vector3D linearCombination = ArrayOfVec.linearCombination(Coeffs);
        System.out.println("Линейная комбинация: " + "x = " + linearCombination.x + " y = " + linearCombination.y + " z = " + linearCombination.z);
        Point_3D point = new Point_3D(1, 1, 1);
        Point_3D shift[] = ArrayOfVec.pointShift(point);
        for(int i = 0; i < shift.length; i++) {
            System.out.println("Shift[" +i + "]: x = " + shift[i].getX() + ", y = " + shift[i].getY() + ", z = " + shift[i].getZ());
        }
    }


}
