package acmp_dn;

//Вариант №1
import java.io.PrintWriter;
import java.util.Scanner;

class task001_AaddB {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int a = in.nextInt();
        int b = in.nextInt();
        out.println(a + b);

        out.flush();
    }
}