package Les01_basic.c02_Loops;

import java.util.Scanner;

public class For33 {
    public static void main(String[] args) {
        int f2 = 0;
        int f1 = 1;

        int fn = 0;

        System.out.println("Введите номер числа Фибоначчи");
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        System.out.printf("%d-ое число Фибо = %d\n",  1, f2 );
        System.out.printf("%d-ое число Фибо = %d\n",  2, f1 );
        for (int i = 3; i <= N; i++) {
            fn = f1 + f2;
            f2 = f1;
            f1 = fn;

            System.out.printf("%d-ое число Фибо = %d\n",  i, fn );
        }

        System.out.println(fn);
    }
}
