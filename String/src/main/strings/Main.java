package strings;
        import java.util.Arrays;
        import java.util.Objects;




public class Main {

    public static void main(String[] args) throws WrongValueException {
        try {


            Payment pay1 = new Payment("Иванов Семен", 17, 07, 2017, 5500);
            Payment pay2 = new Payment("Петров Александр", 10, 02, 2018, 4000);
            Payment pay3 = new Payment("Студент Василий", 22, 10, 2017, 3000);
            String str = pay1.toString();

            FinanceReport report = new FinanceReport(pay1,pay2,pay3);
            FinanceReport report2 = new FinanceReport(report);
            System.out.println("*****" + report);
           // System.out.println("-----" + report2);
            report.setPayment(pay3,1);                       // position = pay
           // System.out.println("#####" + report2);
            report.WriteInFile("C:/Users/user1/Desktop/file.txt");
            FinanceReport pay4 = FinanceReport.readFromFile("C:/Users/user1/Desktop/file.txt");
            System.out.println("////"+pay4.toString());

            FinanceReport report3 = FinanceReport.readFromFile("C:/Users/user1/Desktop/file.txt");
              System.out.println("=========================");
            System.out.println(pay4.hashCode()+" hashCode");
            FinanceReport pay5 = new FinanceReport(pay4);
            System.out.println(pay5.hashCode()+" hashCode");


            report2.getPaymentsLessThanNumber(5000, "C:/Users/user1/Desktop/LessThanNumber.txt");
            report2.getPaymentsBySymbol('С', "C:/Users/user1/Desktop/BySimbol.txt");




        }
        catch (Exception WrongValueException){
            System.out.println(WrongValueException.getMessage());
        }

    }
}
