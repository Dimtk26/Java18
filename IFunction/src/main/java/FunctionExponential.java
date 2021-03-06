public class FunctionExponential implements IFunction {
    private double a,b,coefA, coefB;
    public FunctionExponential(){
        a = 0.0;
        b = 1.0;
        coefA = 1.0;
        coefB = 0.0;
    }
    public FunctionExponential(double a, double b, double coefA, double coefB) throws BadValueException {
        if(coefA == 0.0)
        {
            throw new BadValueException("Коэффициент по х не может равняться 0");
        }
        if(a>b) {
//            this.a = b;
//            this.b = a;
            double temp =  a;
            a = b;
            b = temp;
        }
        this.a = a;
        this.b = b;
        this.coefA = coefA;
        this.coefB = coefB;

    }
    public double getLeftBorder() {
        return a;
    }

    public double getRightBorder() {
        return b;
    }
    public double value(double x) throws BadValueException {
        if(x<a || x>b){
            throw new BadValueException("Аргумент не принадлежит определенному отрезку [a, b]");
        }
        return coefA*Math.exp(x) + coefB;
    }
    public void setLeftBorder(double a) {
        this.a = a;
    }

    public void setRightBorder(double b) {
        this.b = b;
    }

    public double getCoefA() {
        return coefA;
    }

    public void setCoefA(double coefA) {
        this.coefA = coefA;
    }

    public double getCoefB() {
        return coefB;
    }

    public void setCoefB(double coefB) {
        this.coefB = coefB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FunctionExponential)) return false;

        FunctionExponential that = (FunctionExponential) o;

        if (Double.compare(that.a, a) != 0) return false;
        if (Double.compare(that.b, b) != 0) return false;
        if (Double.compare(that.getCoefA(), getCoefA()) != 0) return false;
        return Double.compare(that.getCoefB(), getCoefB()) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(a);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(b);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCoefA());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCoefB());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "[" + a + ", " +
                b + "]\n" +
                "f(x) = " + coefA + "*exp(x) + " +
                coefB;
    }
}
