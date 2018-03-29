/**
 * Created by Student on 14.09.17.
 */

import java.util.Scanner;
public class arError {
    public static void main(String arg[]){
        int kol;
        int ab,ba;
        System.out.println( "Сколько чисел будет в массиве? ");
        Scanner TAB = new Scanner(System.in);
        kol = TAB.nextInt();

        int[]A = new int[kol];


        Vvod(A);
        Vivod(A);
        Sum(A);
        System.out.println( "Количество четных чисел ="+Even(A));

        System.out.println( "Задайте отрезок[a.b]");
        Scanner OTRez = new Scanner(System.in);
        ab = OTRez.nextInt();
        ba=OTRez.nextInt();

        System.out.printf( "Количество  чисел на отрезке[%d:%d] = ",ab,ba);
        System.out.println( ""+Otrezok(A,ab,ba));
        System.out.println( "все ли положительные? "+Pologitelnie(A));
        Invert(A);Vivod(A);

    }

    public static void Vvod(int[]A)
    {

        Scanner in=new Scanner(System.in);
        System.out.printf("Введите %d элемента(-ов):", A.length);
        for(int i=0;i<A.length;i++)
        {
            A[i]=in.nextInt();
        }
    }


    public static void Vivod(int[]A)
    {


        for(int i=0;i<A.length;i++)
        {
            System.out.print( "  "+A[i]);
        }
        System.out.println( "");
    }

    public static int Sum(int[]A)
    {
        int sum=0;

        for(int i=0;i<A.length;i++)
        {
            sum+=A[i];
        }
        return sum;
    }

    public static int Even(int[]A)
    {
        int count=0;

        for(int i=0;i<A.length;i++)
        {
            if((A[i]%2)==0){count++;}
        }
        return count;
    }

    public static int Otrezok(int[]A,int a,int b)
    {
        int count=0;

        for(int i=0;i<A.length;i++)
        {
            if((A[i]>=a)&&(A[i]<=b)){count++;}
        }
        return count;
    }

    public static boolean Pologitelnie(int[]A)
    {


        for(int i=0;i<A.length;i++)
        {
            if(A[i]<0){return false;}
        }
        return true;
    }

    public static void Invert(int[]A)
    {
        int temp;
        System.out.println( "Ваш инвертированный массив:");
        for(int i=0;i<A.length/2;i++)
        {
            temp = A[i];
            A[i]=A[A.length-1-i];
            A[A.length-1-i]=temp;
        }

    }
}
