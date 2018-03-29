import java.util.Scanner;
import java.math.BigDecimal;

public class HelloWorld {
    public static void main(String arg[]){
        System.out.println("Hello World! It's my new txt");
        System.out.println("1.Задание 1.");
        System.out.println("2.Задание с квадратным уравнением.");
        System.out.println("3.Задание табуляции sin(x).");
        System.out.print("Ваш выбор:");
        Scanner menu = new Scanner(System.in);
        int choice = menu.nextInt();

        if(choice==1){
            System.out.println("Работать с 1.int или 2.float?:");
            System.out.print("Ваш выбор:");
            Scanner IntFloat = new Scanner(System.in);
            int Vnumber = menu.nextInt();

            if(Vnumber==1){
            System.out.print("Введите 3 числа:");
            Scanner sc= new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int mult=a*b*c;
            float sum=a+b+c;
            double SredAr=(sum/3);
            System.out.println("Произведение: "+mult);
            System.out.println("Среднее арифметическое: "+SredAr);
            /**/
                int maxnumber=0;
                int minnumber=0;
                int centralnumber=0;

                if((a<b)&&(b>c)){maxnumber=b;}
                if((b<a)&&(a>c)){maxnumber=a;}
                if((c>a)&&(b<c)){maxnumber=c;}

                if((a<b)&&(a<c)){minnumber=a;}
                if((b<a)&&(b<c)){minnumber=b;}
                if((c<a)&&(c<b)){minnumber=c;}

                if((a!=maxnumber)&&(a!=minnumber)){centralnumber=a;}
                if((b!=maxnumber)&&(b!=minnumber)){centralnumber=b;}
                if((c!=maxnumber)&&(c!=minnumber)){centralnumber=c;}

                System.out.println("Наибольшее число: "+maxnumber);
                System.out.println("Среднее число: "+centralnumber);
                System.out.println("Наименьшее число: "+minnumber);
                /**/
            }
            if(Vnumber==2){
                System.out.print("Введите 3 числа:");
                Scanner sc= new Scanner(System.in);
                float a=sc.nextFloat();
                float b=sc.nextFloat();
                float c=sc.nextFloat();
                float mult=a*b*c;
                System.out.println("Произведение: "+mult);
                System.out.println("Среднее арифметическое: "+(a+b+c)/3);
                /**/

                /**/
            }


        }


        if(choice==2){
            double aa, bb, cc;//для коэф квадр уравнения
            double D;

            System.out.println("Программа решает квадратное уравнение вида:");
            System.out.println(" ax^2 + bx + c = 0");
            System.out.println("Введите a, b и c:");

            Scanner in = new Scanner(System.in);
            aa = in.nextDouble();
            bb = in.nextDouble();
            cc = in.nextDouble();

            D = bb * bb - 4 * aa * cc;
            if (D > 0) {
                double x1, x2;
                x1 = (-bb - Math.sqrt(D)) / (2 * aa);
                x2 = (-bb + Math.sqrt(D)) / (2 * aa);
                System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
            }
            else if (D == 0) {
                double x;
                x = -bb / (2 * aa);
                System.out.println("Уравнение имеет единственный корень: x = " + x);
            }
            else {
                System.out.println("Уравнение не имеет действительных корней!");
            }
        }



               if(choice==3)
               {
                   double aaa,bbb,step,ssiinn;
                   System.out.println("Программа табулирует функцию sin(x) в заданных пределах и с заданным шагом:");
                   System.out.println("Задайте отрезок и шаг табуляции :");
                   Scanner TAB = new Scanner(System.in);
                   aaa = TAB.nextDouble();
                   bbb = TAB.nextDouble();
                   step = TAB.nextDouble();

                   for(double i=aaa;i<bbb;i+=step){
                       ssiinn=Math.sin(i);
                       System.out.println("шаг:"+i+". Результат="+ssiinn);
                   }

               }



    }
}
