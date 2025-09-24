package acmp_dn;

    import java.io.PrintWriter;
    import java.util.Scanner;
    /**
    @author IDN
     */

    class task008_checkMultiplay {
        // важно описать метод вне метода main
        // напишем метод проверки соответсвия данных чисел выражению A*B=C
        /**
         * Проверка на верное равенство
         * @param x множитель
         * @param y множитель
         * @param z вероятное произведение!
         * @return Истина или Ложь результат сравнения произведения и данного числа
         */
        static boolean isRealMultiplication(int x, int y, int z){
            return x * y == z;
        }


        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            PrintWriter out = new PrintWriter(System.out);
            int A, B, C;
            A = in.nextInt();
            B = in.nextInt();
            C = in.nextInt();

            if (isRealMultiplication(A, B, C)){
                System.out.print("YES");
            }
            else System.out.println("NO");

        }


    }
