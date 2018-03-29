import java.util.Scanner;
import java.math.BigDecimal;
public class Project4 {
    public static void main(String arg[]) {

        double aaa,bbb,step,ssiinn,buf;

        System.out.println("Программа табулирует функцию sin(x) в заданных пределах и с заданным шагом:");
        System.out.println("Задайте отрезок:");

        Scanner TAB = new Scanner(System.in);

        aaa = TAB.nextDouble();
        bbb = TAB.nextDouble();

     if(aaa>bbb) {

             System.out.println("Отрезок задан (а←в)! :");
           buf=aaa;
           aaa=bbb;
           bbb=buf;


     }else{ System.out.println("Отрезок задан (а→в)!");}


     System.out.println("Задайте шаг:");
        step = TAB.nextDouble();
       if(step<=0){
        do{
            System.out.println("Задайте Положительный шаг и не равный нулю:");
            step = TAB.nextDouble();

        }while(step<=0);}


            for (double i = aaa; i <= bbb; i += step) {
                ssiinn = Math.sin(i);
                System.out.printf("sin(%.3f). Результат=%.6f\n",i,ssiinn);
              //  System.out.println("sin("+i+"). Результат=" + ssiinn);
            }


    }
}
