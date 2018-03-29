public class ExpX implements Function {
    private double A = 0;
    private double B = 0;

    public ExpX(double A, double B){ //f(x) = A*exp(x) + B
        this.A = A;
        this.B = B;
    }

    public ExpX(){}

    public double value(double x){
        return (A*Math.exp(x) + B);
    }

    public double getA(){
        return 0;
    }

    public double getB(){
        return (1.7e+308);
    }
}