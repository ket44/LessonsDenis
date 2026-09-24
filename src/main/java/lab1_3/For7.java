package lab1_3;

import java.util.Scanner;

public class For7 {
    /*
    автор Ищук Денис, гр 2-1
     */
    public static void main(String[] args) {
        /*
        For7. Даны два целых числа A и B (A < B).
         Найти сумму всех
         целых чисел от A до B включительно.

         этапы:
         ввод исходных
         обработка
         вывод результата
         тестирование

         */
        System.out.println("For7. Сумма чисел на промежутке");
        // ввод исходных
        Scanner console = new Scanner(System.in);
        System.out.println("Введиет целое число А");
        int A = console.nextInt();
        System.out.println("Введиет целое число B");
        int B = console.nextInt();

        //обработка
        int sum = 0; // переменная для накопления суммы
        for (int i = A; i <= B; i++) {
            // System.out.println(i);
            sum = sum + i;
        }

        //вывод результата
        System.out.printf("Сумма целых чисел на промежутке от %d до %d = %d", A, B, sum);
    }
}
