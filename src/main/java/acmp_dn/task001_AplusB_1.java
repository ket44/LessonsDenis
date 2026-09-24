package acmp_dn;

import java.io.*;
import java.util.*;

public class task001_AplusB_1 {
    public static void main(String[] args) {
        // Сложить два числа
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a + b);

        out.flush();
    }
}

