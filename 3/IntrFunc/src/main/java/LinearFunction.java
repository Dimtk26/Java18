public class LinearFunction implements Function {
    private double A = 0;
    private double B = 0;

    public LinearFunction(double A, double B){ //f(x) = Ax+B
        this.A = A;
        this.B = B;
    }

    public LinearFunction(){}

    public double value(double x){
        return A*x+B;
    }

    public double getA(){
        return (-4.9e-324);
    }

    public double getB(){
        return (1.7e+308);
    }
}