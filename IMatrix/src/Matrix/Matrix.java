package Matrix;

import IMatrix.*;
import java.util.Arrays;
import java.util.Objects;

public class Matrix implements IMatrix {
    private double [] matrix;
    private int N ;
    public Matrix(int size){
        N = size;
        matrix = new double[N*N];
        for (int i = 0; i<N*N ; i++) {
            matrix[i] = 0;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return N == matrix1.N &&
                Arrays.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {

        int result = Objects.hash(N);
        result = 31 * result + Arrays.hashCode(matrix);
        return result;
    }

    @Override
    public double getElem(int i, int j) {
        return matrix[N*i+j];
    }

    @Override
    public void setElem(double num,int i, int j) {
        matrix[N*i+j] = num;
    }

    @Override
    public double calculateDeterminant() {
        if(N==0){
            throw new IllegalArgumentException("Матрица не задана");
        } else if(N==1){
            return matrix[0];
        } else if(N>1){
            for(int k=0; k<N;k++) {
                if(getElem(k, k)==0){
                    for(int i=1+k;i<N;i++){
                        if(getElem(i,0+k)!=0){
                            for(int j=0+k;j<N;j++){
                                setElem(getElem(0+k,j)+getElem(i,j),0+k,j);
                            }
                            break;
                        }
                    }
                    if(getElem(k, k)==0){
                        return 0;
                    }
                }
                for(int i=1+k;i<N;i++){
                    double coeff = -getElem(i, 0+k)/getElem(0+k, 0+k);
                    for(int j=0+k; j<N;j++){
                        setElem(getElem(i,j) + getElem(0+k, j)*coeff, i, j);
                    }
                }
            }
            double d = 1;
            for (int i = 0; i < N; i++) {
                d *= getElem(i, i);
            }
            return d;
        }
        return 0;
    }

/* Определитель для рандомной матрицы N*N */
    public static void main(String[] args) {

        int N = 4;
        Matrix m = new Matrix(N);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                m.setElem((int)(Math.random()*10%9), i, j);
            }
        }

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(m.getElem(i,j) + " ");
            }
            System.out.println();
        }
        System.out.println("=============================");

        System.out.println("d = " + m.calculateDeterminant());

        System.out.println("=============================");
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                double temp=0;                         //delete
                temp = m.getElem(i,j);               //delete
                System.out.printf("%.2f   ",temp );//System.out.printf(m.getElem(i,j) + "  ");
            }
            System.out.println();
        }
    }


    public String toStr() {
        StringBuffer sBuff = new StringBuffer();
        int counter = 0;
        String newLine=(" \n");
        sBuff.append(" ");
        for(int i = 0; i < N*N; i++){
                sBuff.append(matrix[i]);
                sBuff.append(" ");
                counter++;
                if(counter == N) {
                    counter = 0;
                    sBuff.append('\r');
                    sBuff.append('\n');
                    sBuff.append(newLine);
                }
            }
        return sBuff.toString();
    }

}
