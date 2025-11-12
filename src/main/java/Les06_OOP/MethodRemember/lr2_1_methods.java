package Les06_OOP.MethodRemember;

import java.time.LocalDate;

public class lr2_1_methods {
    /*
    Напишите методы, затем вызовите  их в основной программе

1. вывод разделительной строки: ************************************* (количество * - не критично)

2. Вывод приветствия "Привет, пользователь"

3. Вывод текущей даты желтым цветом.
Используйте встроенные методы для установки цвета текста в консоли,
(метод должен завершиться сбросом цвета текста консоли)
и метод определения текущей даты),
     */

    public static void Razdelitel() {
        System.out.println("****************************");
    }

    public static void getCurrentDate() {
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
    }

    /**
     * Выводит последовательность от
     * @param A старт
     * @param B финиш
     */
    public static void getRangeAtoB(int A, int B) {
        if (A <= B) {
            for (int i = A; i <= B; i++) System.out.println(i);
        } else {
            for (int i = A; i >= B; i--) System.out.println(i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Программа стартовала");
        Razdelitel();
        getCurrentDate();
        Razdelitel();
        getRangeAtoB(10, 5);
    }
}
