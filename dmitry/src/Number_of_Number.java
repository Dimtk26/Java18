

    import java.util.Scanner;

    public class Number_of_Number {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int x = 0;
            //Ввод
            System.out.print("Введите целое число: ");
            if (sc.hasNextInt()) {
                x = sc.nextInt();
            } else {
                System.out.println("Это не целое число!");
                return;
            }

            int[] digits = numberToArray(x);

            for (int line = 0; line < 7; line++) {
                for (int j = 0; j < digits.length; j++) {
                    System.out.print(view[line][digits[j]]);
                }
                System.out.println();
            }
        }

        private static int[] numberToArray(int x) {
            //Решение
            char[] array1 = Integer.toString(x).toCharArray();
            int[] array2 = new int[array1.length];
            for (int i = 0; i < array1.length; i++) {
                array2[i] = Character.getNumericValue(array1[i]);
            }
            return array2;
        }

        private static final String[][] view = {

                {"  ***  ", "   *   ", "  ***  ", "  ***  ", "    *  ", " ***** ", "  ***  ", " ***** ", "  ***  ", "  ***  "},
                {" *   * ", "  **   ", " *   * ", " *   * ", "   **  ", " *     ", " *   * ", "     * ", " *   * ", " *   * "},
                {"*     *", " * *   ", " *   * ", "     * ", "  * *  ", " *     ", " *     ", "    *  ", " *   * ", " *   * "},
                {"*     *", "   *   ", "    *  ", "  ***  ", " *  *  ", " ****  ", " ****  ", "   *   ", "  ***  ", "  ***  "},
                {"*     *", "   *   ", "   *   ", "     * ", " ***** ", "     * ", " *   * ", "  *    ", " *   * ", "     * "},
                {" *   * ", "   *   ", "  *    ", " *   * ", "    *  ", " *   * ", " *   * ", "  *    ", " *   * ", "     * "},
                {"  ***  ", " ***** ", " ***** ", "  ***  ", "    *  ", "  ***  ", "  ***  ", "  *    ", "  ***  ", "  ***  "}};
    }




