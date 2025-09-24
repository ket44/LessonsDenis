package Les01_basic;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * @author IshukDN
 *
 */
public class t001_InOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        double b = in.nextDouble();
        double x = 0.1;
        double y = 4.60125;
        double sum = x + y;

        System.out.println(sum);
        System.out.printf("Число, округленное до 0 знаков: %.4f \n", sum);
        System.out.println(sum);

    }
}
