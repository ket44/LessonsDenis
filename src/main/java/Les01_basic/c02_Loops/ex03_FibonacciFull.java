package Les01_basic.c02_Loops;

import java.util.Scanner;

public class ex03_FibonacciFull {
    public static void main(String[] args) {
        System.out.println("пОСТРОИМ РЯД ФИБОНАЧЧИ");
        Scanner in = new Scanner(System.in);
        int f2 = 0;
        int f1 = 1;
        System.out.println("Введите N - номер числа, которое вывести");
        int N = in.nextInt();

        int fn = 0;
        System.out.printf("%d-ое число = %d\n", 1, f2);
        System.out.printf("%d-ое число = %d\n", 2, f1);
        for (int i = 3; i <= N; i++) {
            fn = f1 + f2;
            System.out.printf("%d-ое число = %d\n", i, fn);
            f2 = f1;
            f1 = fn;

        }

        System.out.printf("Число Фибоначчи = %d", fn);
    }
}
