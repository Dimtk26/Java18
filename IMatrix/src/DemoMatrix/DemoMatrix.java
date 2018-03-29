package DemoMatrix;

import java.io.*;
import Matrix.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

public class DemoMatrix  {
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
                System.out.println("Сумма всех эл-ов матрицы = "+DemoMatrix.summElem(m));


        try {
            WriteInFile("C:/Users/user1/Desktop/Matrix.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\n=============Чтение==========\n");
        try {
            readFromFile("C:/Users/user1/Desktop/Matrix.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static double summElem(Matrix m){
        double sum=0;
        for(int i=0;i<N;i++) {
            for (int j = 0; j < N; j++) {
                sum += m.getElem(i,j);
            }
        }
       return sum;
    }

    public static void WriteInFile(String fileName) throws IOException {
        FileWriter file = new FileWriter(fileName);
        BufferedWriter in = new BufferedWriter(file);
        in.write("Массив из: "+N+" элементов");
        in.newLine();
            in.write(m.toStr());
        in.flush();
        in.close();
    }

   /* public static void readFromFile(String fileName) throws IOException {
        FileReader file = new FileReader(fileName);
        BufferedReader bufFile = new BufferedReader(file);
        int size = 0;
        String temporary = " ";
        temporary = bufFile.readLine();
        temporary = temporary.substring(21);

        file.close();
        bufFile.close();
    }*/
   public static void readFromFile(String fileName) throws IOException {
       try (FileReader fr = new FileReader("C:/Users/user1/Desktop/MatrixRead.txt");
            BufferedReader br = new BufferedReader(fr))
       {
           String line = br.readLine();
           String[] numbersStrings = line.split(",");
           double[] numbers = new double[numbersStrings.length];
           for (int i = 0; i < numbersStrings.length; i++)
           {
               numbers[i] = Double.parseDouble(numbersStrings[i]);
           }
           System.out.println(Arrays.toString(numbers));
       }
       catch (IOException e)
       {
           e.printStackTrace();
       }
   }


}

