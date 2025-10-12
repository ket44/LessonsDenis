package Les01_basic.c04_While;

import java.util.Scanner;

public class while3 {
    public static void main(String[] args) {
        /*
        Даны целые положительные числа N и K.
        Используя только операции сложения и вычитания,
        найти частное от деления нацело N на K,
        а также остаток от этого деления.
         */

        Scanner in = new Scanner(System.in);
        System.out.println("Введите N и K, так что N > K: ");
        int N = in.nextInt(); // делимое
        int K = in.nextInt(); // делитель
        int quotient = 0; // частное
        int remainder = 0; // остаток
        int Temp = N; // сохраним
        while (N >= K){
            N = N - K;  // N -
            quotient++;
        }
        remainder = N;
        System.out.printf("Частное = %-3d, Остаток = %-3d%n", quotient, N);
        System.out.println("Программа завершена, нажмите Enter");
        in.nextLine();

    }
}
