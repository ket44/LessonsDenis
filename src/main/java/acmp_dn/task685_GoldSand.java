package acmp_dn;

import java.io.PrintWriter;
import java.util.Scanner;
// Задача про воровство золотого песка.
// Цель: получить максимальную выгоду
public class task685_GoldSand {
/*
Ход решения:
Самый дорогой песок - в самую большую сумку, далее по аналогии.
 */
    public static int getMax(int a, int b, int c) {
        int max = 0;
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }
        return max;
    }

    public static int getMin(int a, int b, int c) {
        int min = 0;
        min = Math.min(Math.min(a, b), c);
        return min;
    }

    public static int getMid(int a, int b, int c) {
        int mid = a + b + c - getMax(a, b, c) - getMin(a, b, c);
        return mid;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int A1, A2, A3;
        int B1, B2, B3;
        A1 = in.nextInt();
        A2 = in.nextInt();
        A3 = in.nextInt();
        B1 = in.nextInt();
        B2 = in.nextInt();
        B3 = in.nextInt();

        int result =
                        getMax(A1, A2, A3) * getMax(B1, B2, B3) +
                        getMid(A1, A2, A3) * getMid(B1, B2, B3) +
                        getMin(A1, A2, A3) * getMin(B1, B2, B3);

        System.out.println(result);
        out.flush();
    }
}
