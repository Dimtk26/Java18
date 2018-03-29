public interface Function {
    double a = 0;
    double b = 0;

    default  double value(double x){
        return x;
    }

    default  double getA(){
        return this.a;
    }

    default  double getB(){
        return this.b;
    }
}