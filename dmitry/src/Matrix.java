/**
 * Created by Student on 14.09.17.
 */

import java.util.Scanner;
public class Matrix {

    public static void main(String arg[]){
        int kol;
        int ab,ba,buf;
        Scanner TAB = new Scanner(System.in);
       do{
        System.out.println( "Сколько чисел будет в массиве? ");

        kol = TAB.nextInt();
        if(kol<0){System.out.println( "Количество чисел не может быть отрицательным! Повторите ввод! ");}
       }while(kol<0);

        int[]A = new int[kol];


        Vvod(A, TAB);
        Vivod(A);
        System.out.println( "Сумма элементов массива = "+Sum(A));
        System.out.println( "Количество четных чисел = "+Even(A));

        System.out.println( "Задайте отрезок[a.b]");
        ab = TAB.nextInt();
        ba=TAB.nextInt();
    /**/
         if(ab>ba){

          /* do{
                System.out.println("Задайте отрезок правильно!:");
                ab = TAB.nextInt();
                ba=TAB.nextInt();
            }while(ab>ba);*/

             System.out.println("Отрезок задан (а←в)! :");
             buf=ab;
             ab=ba;
             ba=buf;


        }else{ System.out.println("Отрезок задан (в→а)!");}
   /**/

        System.out.printf( "Количество  чисел на отрезке[%d:%d] = ",ab,ba);
        System.out.println( ""+Otrezok(A,ab,ba));
        System.out.println( "все ли положительные? "+Pologitelnie(A));
        System.out.print( "Ваш инвертированный массив:");
        Invert(A);
        Vivod(A);
        TAB.close();
    }

    public static void Vvod(int[]A, Scanner in)
    {
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
        for (int aA : A) {
            if ((aA % 2) == 0) {
                count++;
            }
        }
        return count;
    }

    public static int Otrezok(int[]A,int a,int b)
    {
        int count=0;

        for (int aA : A) {
            if ((aA >= a) && (aA <= b)) {
                count++;
            }
        }
        return count;
    }

    public static boolean Pologitelnie(int[]A)
    {
        for (int aA : A) {
            if (aA <= 0) {
                return false;
            }
        }
        return true;
    }

    public static void Invert(int[]A)
    {
        int temp;

        for(int i=0;i<A.length/2;i++)
        {
            temp = A[i];
            A[i]=A[A.length-1-i];
            A[A.length-1-i]=temp;
        }
    }
}
