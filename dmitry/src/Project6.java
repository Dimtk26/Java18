import java.util.Scanner;

public class Project6
{
    public static  void main(String arg[])
    {
        float a1, b1, c1, a2, b2, c2, x, y ,aa1,aa2,bb1,bb2,cc1,cc2,d,d1,d2; // a1,b1,c1,a2,b2,c2 - коэфиценты линейных уравнений;
float nul=0;
        int res=1;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите a1:");
        a1 = in.nextFloat();
        System.out.println("Введите b1:");
        b1 = in.nextFloat();
        System.out.println("Введите c1:");
        c1 = in.nextFloat();
        System.out.println("Введите a2:");
        a2 = in.nextFloat();
        System.out.println("Введите b2:");
        b2 = in.nextFloat();
        System.out.println("Введите c2:");
        c2 = in.nextFloat();
        aa1=a1;
        aa2=a2;
        bb1=b1;
        bb2=b2;
        cc1=c1;
        cc2=c2;
        x=0;y=0;

        if (a1 < a2)
        {
            float t1 = a1;
            a1 = a2;
            a2 = t1;
            float t2 = b1;
            b1 = b2;
            b2 = t2;
            float t3 = c1;
            c1 = c2;
            c2 = t3;

            aa1=a1;
            aa2=a2;
            bb1=b1;
            bb2=b2;
            cc1=c1;
            cc2=c2;
        }
        if (a1==a2&b1==b2&c1==c2)
        {
            a2=0;b2=0;c2=0;
        }

        if((a1==0&b1==0&c1!=0)||(a2==0&b2==0&c2!=0))
        {
            res=-1;
        }

        else if((a2==0&b2==0&c2==0))
        {
            if(a1==0&b1!=0)
            {
                y=c1/b1;
                res=2;

            }

            else if(a1!=0&b1==0)
            {
                x=c1/a1;
                res=3;

            }
            else if((a1!=0&b1!=0)||(a1==0&b1==0))
            {
                res=0;
            }

        }

         /*------0 1 10 0 1 4------*/

        else if(a1==0&a2==0&b1==b2&(c1!=c2))
        {


            res=-1;

        }

            /*------------*/

             /*------1 1 2 2 2 3------*/

        else if(a1==b1&a2==b2&(c1!=c2))
        {
            float nuul=-999;
           nuul=c2%c1;
            if((a1 == b1) & (a2 == b2)&(nul==nuul) )
            {
                x= (a2-a1*a2)+(b1-b1*b2);
                res=3;

            }
            System.out.println("*** = " +nuul);
            res=-1;

        }

            /*------------*/

        else if(a2==0&b2!=0)
        {
            y = cc2 / bb2;
            x = (c1 - b1*y) / a1;

        }


        else  if(a2<0&a1>0)
        {
            aa1+=(a1/a2);
            bb1+= bb2 * (a1 / a2);
            cc1 += cc2 * (a1 / a2);
            if(aa1==0&bb1==0&cc1!=0)
            {
                res=-1;
            }
            else{
                y = cc1 / bb1;
                x = (c1 - b1*y) / a1;}
            if(aa1==0&bb1==0&cc1==0)
            {
                res=0;
            }

        }
        else
        {
            aa1-=(a1/a2);
            bb1 -= bb2 * (a1 / a2);
            cc1 -= cc2 * (a1 / a2);
            if(aa1==0&bb1==0&cc1!=0)
            {
                res=-1;
            }
            else{
                y = cc1 / bb1;
                x = (c1 - b1*y) / a1;
            }
            if(aa1==0&bb1==0&cc1==0)
            {
                res=0;
            }

        }


        if(res==0)
        {
            System.out.println("Система имеет множество решений!");
        }
        else if (res==1)
        {
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
        else if(res==-1)
        {
            System.out.println("Система не имеет решений!");
        }
        else if(res==2)
        {
            System.out.println("y= "+y);
            System.out.println("x - любое число");
        }
        else if(res==3)
        {
            System.out.println("x= "+x);
            System.out.println("y - любое число");
        }

    }

}
/*0 0 0   0 0 0

0 0 0   0 0 1
0 0 1   0 0 0
0 0 1  0 0 1
0 0 1  1 2 3
1 0 10 1 0 4
0 1 10 0 1 4
1 1 2  2 2 3

1 1 2  2 2 4
1 1 0  0 0 0
1 2 3  0 0 0
1 0 0  0 0 0
0 1 0  0 0 0

1 2 3 4 5 6*/
