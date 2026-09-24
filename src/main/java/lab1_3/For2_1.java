package lab1_3;

import java.util.Scanner;

/*
автор Ищук Денис, 2-1 ИС
 */
public class For2_1 {
    /*
    For7. Даны два целых числа A и B (A < B).
     Найти сумму всех
     целых чисел от A до B включительно.
     Этапы
     ввод исх
     обработка
     вывод
     тестирование
     */
    public static void main(String[] args) {
        System.out.println("Сумма чисел на промежутке");
        // ввод исходных
        Scanner console = new Scanner(System.in);
        System.out.println("Введите A");
        int A = console.nextInt();
        System.out.println("Введите B");
        int B = console.nextInt();

        // обработка
        int sum = 0;
        for (int i = A; i <= B; i++) {
           //  System.out.println(i);
            sum = sum + i;
        }

        System.out.printf("Сумма %d и %d = %d", A, B, sum);
    }
}
