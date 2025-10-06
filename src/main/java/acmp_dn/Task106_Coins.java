package acmp_dn;

import java.util.Scanner;

public class Task106_Coins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int coinUp = 0; // счетчик аверсов монетки
        int coinDown = 0;  // счетчик реверсов монетки
        for (int i = 0; i < N; i++) {
            int statusCoin = in.nextInt();
            if (statusCoin == 0){
                coinUp++;
            }
            else coinDown++;
        }
        System.out.println(Math.min(coinUp, coinDown));

    }

}
