package DemoMatrix;

import java.io.*;
import Matrix.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class DemoMatrix {
  static int N = 4;
  static Matrix m = new Matrix(N);
    public static void main(String[] args){
     //   int N = 4;
      //  Matrix m = new Matrix(N);
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


        try {
            WriteInFile("C:/Users/user1/Desktop/Matrix.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void WriteInFile(String fileName) throws IOException {
        FileWriter file = new FileWriter(fileName);
        BufferedWriter in = new BufferedWriter(file);
        in.write("Массив:\n ");
        in.newLine();
            in.write(m.toStr());
        in.flush();
        in.close();
    }

   /* public static char toChar(double num){
        if(num >= 48 && num <= 57) return (' ' + num);
    }*/

   /* @Override
    public String toString() {
        return Matrix.toString(m);
    }*/

  /* v22
   public static void WriteInFile(String fileName) throws IOException {
        FileWriter file = new FileWriter (fileName);
        BufferedWriter bufFile = new BufferedWriter(file);
        for(int i = 0; i < 5; i++){
           // double temp =m.getElem(0,0);
                bufFile.write(m.toString());
                bufFile.newLine();

        }
        bufFile.flush();
        bufFile.close();
    }

    @Override
    public String toString() {
        return String.valueOf(Matrix.toString(m));
    }*/


}

