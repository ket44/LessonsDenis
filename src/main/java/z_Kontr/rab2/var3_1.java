package z_Kontr.rab2;

import java.util.Random;

public class var3_1 {
    public static void main(String[] args) {
         /*
    Найти сумму осадков в разные дни месяца,
    в зависимости от температуры
     */

        System.out.println("Задача вычисления количества осадков в межсезонье");
        int Days = 5; // для компактности зададим 5 дней контроля осадков
        Random rnd = new Random(); // подключаем генератор случайных чисел

        // Объявим массив для хранения ежедневн температуры
        int[] day_temp = new int[Days];
        // объявим массив для хранения ежедневных осадков
        int[] days_precipitation = new int[Days];

         /* у нас получается соответствие между элементами
        2 массива:
        темпер   5   -2   7   4   -3
        осадки  10   20   0   30   40

        Индексы: 0    1   2   3    4

         */



        // реализуем цикл для перебора массива дней
        for (int i = 0; i < Days; i++) {
            // сгенерируем случайно температуру Дня
            int Temper = rnd.nextInt(-20, 20);
            // поместим в массив значение температуры
            day_temp[i] = Temper;
            // визуальный тест проверки заполнения массива температуры
            System.out.printf("Температура %d дня = %d%n",
                                i + 1, day_temp[i]);
        }

        // реализуем цикл по перебору массива дней
        // для заполнения данными об осадках
        for (int i = 0; i < Days; i++) {
            days_precipitation[i] = rnd.nextInt(0, 200);;
            System.out.printf("Осадки %d дня = %d, температура = %d%n",
                                i + 1, days_precipitation[i], day_temp[i]);
        }

        System.out.println();
        // объявим переменные для накопления данных
        int sum_positive = 0; // сумма дождя
        int sum_negative = 0;  // сумма снега

        // перебор значений для анализа и суммирования
        for (int i = 0; i < Days; i++) {
            if (day_temp[i] > 0) {
                sum_positive += days_precipitation[i];
            } else {
                sum_negative += days_precipitation[i];
            }
        }

        // вывод результата
        System.out.printf("Количество осадков в виде снега: %d", sum_negative);
        System.out.println(); // перенос на новую строку
        System.out.printf("Количество осадков в виде дождя:  %d", sum_positive);

    }

}
