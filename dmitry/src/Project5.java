import java.util.Scanner;

public class Project5
{
    public static void main(String arg[])
    {
        Scanner in = new Scanner(System.in);
        int n;
        double polinom ;
        double sum;
        double eps;
        System.out.println("Задание с exp.");

        do{
        System.out.println("Задайте точность:");
         eps = in.nextDouble();}while( eps<0);

        System.out.println("Задайте x:");
        double x  = in.nextDouble();

        polinom=1;
        sum=1;
        n=1;

        do
        {
            polinom*=x/n;
            sum+=polinom;
            n++;
         //  System.out.println("#:"+n);
        }while ((Math.abs(polinom)>eps));

        System.out.println("Cумма:"+sum);
    }

  /*  public static double factorial(int n) //факториал
    {
       /* int res=1;
        for(int i=1;i<=n;i++)
        {res*=i;}
        return res;
    }  *//*
       if(n==0){return 1;}
       return n*factorial(n-1) ;
}*/

}

