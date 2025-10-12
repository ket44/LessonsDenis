package Les01_basic.c04_While;

import java.util.Scanner;

public class While3_WithMethods {
    /**
     * Выдает целое частное от деления
     *
     * @param N делимое
     * @param K делитель
     * @return целое частное
     */
    private static int getQuotient(int N, int K) {
        int quotient = 0; // частное
        while (N > K) {
            N = N - K;
            quotient++;
        }
        return quotient;
    }

    // для вставки автодока - ВЫШЕ названия метода вставляем: /**
    /**
     * Выдает ОСТАТОК от деления нацело
     * @param N делимое
     * @param K делитель
     * @return Остаток
     */
    public static int getRemainder(int N, int K) {
        while (N > K) {
            N = N - K;   // уменьшается до неделимого
        }
        return N;
    }

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

        System.out.printf("Частное = %-3d, Остаток = %-3d%n", getQuotient(N, K), getRemainder(N, K));
        System.out.println("Программа завершена, нажмите Enter");
        in.nextLine();
    }
}


