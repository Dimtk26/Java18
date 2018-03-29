package strings;

import java.io.*;
import java.util.Arrays;

public class FinanceReport {
    private Payment[] payments;

    public FinanceReport(int size) throws WrongValueException {
        if(size <=0){
            throw new WrongValueException("Incorrect size of an array");
        }
        payments = new Payment[size];
        for(int i = 0; i < payments.length; i++){
            payments[i] = new Payment();
        }
    }

    public FinanceReport(FinanceReport old){
        this(old.payments);

    }

    public FinanceReport(Payment...old){
        payments = new Payment[old.length];
        for(int i = 0; i < old.length; i++){
            this.payments[i] = new Payment(old[i]);
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(payments);
    }

    public Payment[] getPayments() {
        return payments;
    }

    public void setPayment(Payment pay, int position){
        payments[position-1] = new Payment(pay);
    }
    public Payment getPayment(int position){
        return payments[position];
    }
    public void WriteInFile(String fileName) throws IOException {
        FileWriter file = new FileWriter(fileName);
        BufferedWriter in = new BufferedWriter(file);
        in.write("Количество платежей: ");
        in.write(Integer.toString(payments.length));
        in.newLine();
        for (Payment pay : payments) {
            in.write(pay.toString());
            in.newLine();
        }
        in.flush();
        in.close();
    }
    public static FinanceReport readFromFile(String fileName) throws IOException, WrongValueException {
        FileReader file = new FileReader(fileName);
        BufferedReader bufFile = new BufferedReader(file);
        int size = 0;
        String temporary = "";
        String[] tempPay = new String[3];
        String[] tempData = new String[3];
        temporary = bufFile.readLine();
        temporary = temporary.substring(21);
        size = Integer.parseInt(temporary);
        Payment[] payments = new Payment[size];
        for(int i = 0; i<payments.length; i++){
            temporary = bufFile.readLine();
            tempPay = temporary.split(",");
            tempData = tempPay[1].split("[.]");
            payments[i] = new Payment(tempPay[0], Integer.parseInt(tempData[0]),
                    Integer.parseInt(tempData[1]), Integer.parseInt(tempData[2]),
                    Integer.parseInt(tempPay[2]));
        }
        file.close();
        bufFile.close();
        return new FinanceReport(payments);
    }
    public void getPaymentsBySymbol(char symbol, String fileName) throws IOException {
        FileWriter file = new FileWriter(fileName);
        BufferedWriter bufFile = new BufferedWriter(file);
        for(int i = 0; i < payments.length; i++){
            if(payments[i].getFullName().charAt(0) == symbol){
                bufFile.write(payments[i].toString());
                bufFile.newLine();
            }
        }
        bufFile.flush();
        bufFile.close();
        file.close();
    }
    public void getPaymentsLessThanNumber(int number, String fileName) throws IOException {
        FileWriter file = new FileWriter (fileName);
        BufferedWriter bufFile = new BufferedWriter(file);
        for(int i = 0; i < payments.length; i++){
            if(payments[i].getPaymentSum() < number){
                bufFile.write(payments[i].toString());
                bufFile.newLine();
            }
        }
        bufFile.flush();
        bufFile.close();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FinanceReport)) return false;

        FinanceReport that = (FinanceReport) o;


        return Arrays.equals(getPayments(), that.getPayments());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getPayments());
    }
}
