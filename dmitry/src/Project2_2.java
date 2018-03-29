import java.util.Scanner;

public class Project2_2
{
    public static void main(String arg[]){

        System.out.println("Работаем с float.");
        System.out.println("Введите числа:");

        Scanner sc= new Scanner(System.in);
        float  arr[]=new float[3];
        float multiplication=1;
        double sum=0;
        double sred_arif=0;
        for(int i=0;i<3;i++)
        {
            arr[i]=sc.nextFloat();
            multiplication*=arr[i];
            sum+=arr[i];
        }
        sred_arif=sum/3;
        for (int i = arr.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[j] > arr[j + 1]) {
                    float t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        System.out.println("Произведение: "+multiplication);
        System.out.println("Среднее арифметическое: "+(float)sred_arif);
        System.out.println("Числа в порядке возрастания: " + arr[0]+"→"+arr[1]+"→"+arr[2]);
    }
}