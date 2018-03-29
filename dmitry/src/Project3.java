import java.util.Scanner;
import java.math.BigDecimal;
public class Project3 {
    public static void main(String arg[]) {
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
        if (aa == 0 & bb != 0) {
            double x;
            x=(-cc)/(bb);
            System.out.println("Уравнение имеет корень х = " +x);
        }
        else if (aa == 0 & bb == 0 & cc == 0) {
            System.out.println("Уравнение  имеет бесконечное множество корней!");
        }

        else { if(aa == 0 & bb == 0 & cc != 0){
            System.out.println("Уравнение не имеет  корней!");}//
           else if (D > 0) {
                double x1, x2;
                x1 = (-bb - Math.sqrt(D)) / (2 * aa);
                x2 = (-bb + Math.sqrt(D)) / (2 * aa);
                System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
            } else if (D == 0) {
                double x;
                x = -bb / (2 * aa);
                System.out.println("Уравнение имеет единственный корень: x = " + x);
            }


            else {
                System.out.println("Уравнение не имеет действительных корней!");
            }
        }
    }
}
