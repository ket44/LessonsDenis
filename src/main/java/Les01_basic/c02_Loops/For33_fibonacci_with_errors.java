package Les01_basic.c02_Loops;

import java.util.Scanner;

public class For33_fibonacci_with_errors {
    public static void main(String[] args) {
        int f2 = 3;
        int f1 = 5;

        int fn = 0;

        System.out.println("Введите номер числа Фибоначчи");
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        f1 = fn;
        f2 = f1;
        System.out.printf("%d-ое число Фибо = %s",  1, f2 );
        System.out.printf("%d-ое число Фибо = %d\n",  2, f1 );
        for (int i = 3; i <= N; i++) {
            fn = f1 + f2;
            System.out.printf("%d-ое число Фибо = %d\n",  i, fn );
        }

        System.out.println(fn);
    }
}
