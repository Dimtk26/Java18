package strings;



public class Payment {
    private String fullName = "";
    private int day = 0, month = 0, year = 0;
    private int paymentSum = 0;
    private static int[]Days = {31,28,31,30,31,30,31,31,30,31,30, 31};
    private static int[]DaysLeak = {31,29,31,30,31,30,31,31,30,31,30, 31};
    private static void checkYear(int year) throws WrongValueException{
        if (year<=0){
            throw new WrongValueException("Год не может быть меньше 1!");
        }
    }
    private static void checkMonth(int month) throws WrongValueException{
        if (month <= 0 || month > 12){
            throw new WrongValueException("Всего 12 месяцев в году");
        };
    }
    private static void checkDay(int day, int month, int year) throws WrongValueException{
        if(day <1){
            throw new WrongValueException("День не может быть меньше 1");
        }
        if(year%400 == 0 || year % 4 == 0 && year%100 != 0){
            if(day > DaysLeak[month]){
                throw new WrongValueException ("День не может быть больше, чем наибольший день данного месяца");
            }
        }
        else{
            if(day > Days[month]){
                throw new  WrongValueException("\n" +
                        "День не может быть больше, чем наибольший день данного месяца");
            }
        }
    }
    private static void checkPaymentSum(int paymentSum) throws WrongValueException{
        if(paymentSum <= 0){
            throw new WrongValueException("\n" +
                    "Оплата не может быть меньше 1. Человек не может заплатить 0 рублей!");
        }
    }
    public Payment(){
        fullName = "";
        day = 0; month = 0; year = 0;
        paymentSum = 0;
    }

    public Payment(String fullName, int day, int month, int year, int paymentSum) throws WrongValueException {
        if(fullName.equals("")){
            throw new WrongValueException("Строка не может быть пустой");
        }
        this.fullName = fullName;
        checkYear(year);
        checkMonth(month);
        checkDay(day,month,year);
        checkPaymentSum(paymentSum);
        this.day = day;
        this.month = month;
        this.year = year;
        this.paymentSum = paymentSum;
    }
    public Payment(Payment old){
        this.day = old.day;
        this.month = old.month;
        this.year = old.year;
        this.fullName = old.fullName;
        this.paymentSum = old.paymentSum;
    }
    public void setFullName(String fullName) throws WrongValueException {
        if(fullName.equals("")){
            throw new WrongValueException("Строка не может быть пустой");
        }
        this.fullName = fullName;
    }

    public void setDay(int day) throws WrongValueException{
        checkDay(day, this.month, this.year);
        this.day = day;
    }

    public void setMonth(int month) throws WrongValueException {
        checkMonth(month);
        this.month = month;
    }

    public void setYear(int year) throws WrongValueException {
        checkYear(year);
        this.year = year;
    }

    public void setPaymentSum(int paymentSum) throws WrongValueException {
        checkPaymentSum(paymentSum);
        this.paymentSum = paymentSum;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getPaymentSum() {
        return paymentSum;
    }

    @Override
    public String toString() {
        return
                fullName + "," +
                        + day +
                        "." + month +
                        "." + year + ","
                        + paymentSum;
    }

//    @Override
//    public int hashCode() {
//        return super.hashCode();
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Payment)) return false;

        Payment payment = (Payment) o;

        if (getDay() != payment.getDay()) return false;
        if (getMonth() != payment.getMonth()) return false;
        if (getYear() != payment.getYear()) return false;
        if (getPaymentSum() != payment.getPaymentSum()) return false;
        return getFullName().equals(payment.getFullName());
    }

    @Override
    public int hashCode() {
        int result = getFullName().hashCode();
        result = 31 * result + getDay();
        result = 31 * result + getMonth();
        result = 31 * result + getYear();
        result = 31 * result + getPaymentSum();
        return result;
    }



    /**/

    public static void main(String args[]) throws WrongValueException {
        Payment pay1 = new Payment("Иван Петров", 17, 01, 2018, 600);
        System.out.println("Первый платеж: " + pay1.toString());
    }
    /**/

}
