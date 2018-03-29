package imit.Polynom;

import java.util.Arrays;


public class Polynom {
    private double[] coefficients;
    public Polynom(){
        coefficients = new double[3];
        coefficients[0] = 0;
        coefficients[1] = 0;
        coefficients[2] = 1;
    }

    public Polynom(double[] temp) throws ValueDoesntMatchException {
        if(temp.length != 3){
            throw new ValueDoesntMatchException("Неверный размер массива");
        }
        if(temp[temp.length-1] == 0){
            throw new ValueDoesntMatchException("\n" + "Коэффициент в наибольшей степени не может быть равен 0");
        }
        coefficients = new double[temp.length];
        for(int i = 0; i < temp.length; i++){
            coefficients[i] = temp[i];
        }
    }

    public double getCoef(int index) {
        return coefficients[index];
    }
    public double[] solve() {
        double x1 = 0, x2 = 0;
        double[] result;
        if(coefficients[1] == 0 && coefficients[0] != 0){
            if(-coefficients[0] / coefficients[2] <=0){
                //Нет корня sqrt отрицательного значения
                result = new double[0];
                return result;
            }
            result = new double[2];
            result[0] = Math.sqrt(-coefficients[0]/coefficients[2]);
            result[1] = -result[0];
            return result;
        }

        if(coefficients[1] == 0 && coefficients[0] == 0){
            result = new double[1];
            result[0] = 0;
            return result;
        }
        if(coefficients[1]!=0 && coefficients[0] == 0){
            result = new double[2];
            result[0] = 0;
            result[1] = -coefficients[1]/coefficients[2];
            return result;
        }

        double d = coefficients[1] * coefficients[1]-4.0 * coefficients[2] * coefficients[0];
        if(d<0){

            result = new double[0];
            return result;
        }
        if(d==0){
            result = new double[1];
            result[0] = -coefficients[1]/2*coefficients[2];
        }

        result = new double[2];
        result[0] = (-coefficients[1]+Math.sqrt(d))/(2*coefficients[2]);
        result[1] = (-coefficients[1]-Math.sqrt(d))/(2*coefficients[2]);
        return result;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Polynom)) return false;

        Polynom polynom = (Polynom) o;

        return Arrays.equals(coefficients, polynom.coefficients);
    }



    @Override
    public String toString() {
        return  Arrays.toString(coefficients) + "\n";
    }
}
