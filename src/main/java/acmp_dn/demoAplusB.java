package acmp_dn;

import java.io.*;
import java.util.*;

public class demoAplusB {
    public static void main(String[] args) {
        /*
        Нацти сцмма А + В
         */

        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a + b);

        out.flush();
    }
}

