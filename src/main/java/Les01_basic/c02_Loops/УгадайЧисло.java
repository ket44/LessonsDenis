package Les01_basic.c02_Loops;


import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;
import java.util.Scanner;

public class УгадайЧисло {
    public static void main(String[] args) {
        System.out.println("Игра начата");
        System.out.println("Копм загадал число от 1 до 100");
        System.out.println("Угадайте, а я подскажу");

        Random rand = new Random();

        int min = 1;
        int max = 100;
        // случайное число в диапазоне
        int randomNumber = rand.nextInt(max - min + 1) + min;

        while (true) {
            System.out.println("Введите число от 1 до 100");
            Scanner in = new Scanner(System.in);
            int userNumber = in.nextInt(); // вариант человека

            if (userNumber == randomNumber) {
                System.out.println("Вы угадали!!!");
                break;
            } else if (randomNumber > userNumber) {
                System.out.println("Моё число больше");
            } else {
                System.out.println("Мой вариант меньше");
            }
        }
            System.out.println(randomNumber);
    }
}
