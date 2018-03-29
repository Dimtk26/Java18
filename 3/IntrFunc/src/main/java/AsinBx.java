public class AsinBx implements Function {
    private double A = 0;
    private double B = 0;

    public AsinBx(double A, double B){
        this.A = A;
        this.B = B;
    }

    public AsinBx(){}

    public double value(double x){
        return A*Math.sin(B*x);
    }

    public double getA(){
        return (-4.9e-324);
    }

    public double getB(){
        return (1.7e+308);
    }
}