public class LinearDivision implements Function {
    private double A = 0;
    private double B = 0;
    private double C = 0;
    private double D = 0;

    public LinearDivision(double A, double B, double C, double D){ //f(x) = (Ax+B)/(Cx+D)
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public LinearDivision(){}

    public double value(double x){
        if(C*x+D == 0) throw new IllegalArgumentException("Деление на 0");
        else return ((A*x+B)/(C*x+D));
    }

    public double getA(){
        return (-4.9e-324);
    }

    public double getB(){
        return (1.7e+308);
    }
}