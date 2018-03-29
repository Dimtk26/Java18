public class cens {
    public static void main(String arg[]) {
    String s = "Мы идем в школу";
    String s2 = s.replaceAll("школу", "||запрещенное слово||");
System.out.println(s2);
}
}
