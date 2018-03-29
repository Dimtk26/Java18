import java.lang.Math;

public class Trinomial {

    private double a = 0;// a*x*x+b*x+c=0;
    private double b = 0;
    private double c = 0;

    public Trinomial(double[] coeffs){
        if(coeffs.length != 3) {throw new IllegalArgumentException("Несоответствие в кол-ве коэффициентов");}
        else {
            a = coeffs[0];
            b = coeffs[1];
            c = coeffs[2];
        }
    }

    public Trinomial(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Trinomial(){}

    public double[] solution() {
        double[] result = new double[2];

        if (a != 0 && b != 0 && c != 0) {
            if ((b * b - 4 * a * c) < 0) {
                throw new IllegalArgumentException("Комплексные корни(Дискриминант < 0)");
            }

            result[0] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
            result[1] = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        }

        if (a != 0 && b != 0 && c == 0) {
            result[0] = 0;
            result[1] = -(b / a);
        }

        if (a != 0 && b == 0 && c != 0) {
            if (c > 0) {
                throw new IllegalArgumentException("Комплексные корни");
            }
            if (c < 0) {
                result[0] = Math.sqrt(-c/a);
                result[1] = -Math.sqrt(-c/a);
            }
        }

        if (a == 0 && b == 0 && c != 0) {
            throw new IllegalArgumentException("C должен быть равен 0");
        }
        return result;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public static void main(String[] args){
        /*Trinomial eq = new Trinomial();
        double[] res = new double[2];
        res = eq.solution();*/
        /*Scanner in = new Scanner(System.in);
        System.out.println("Введите а");
        double a = in.nextDouble();
        System.out.println("Введите b");
        double b = in.nextDouble();
        System.out.println("Введите c");
        double c = in.nextDouble();*/

    }
}
