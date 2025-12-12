package z_Kontr.rab2;

import java.util.Random;

public class var3_1_refact {
    /**
     * Главный метод - точка входа, запуска программы
     * @param args
     */
    public static void main(String[] args) {
         /*
    Найти сумму осадков в разные дни месяца,
    в зависимости от температуры

    Сделаем рефакторинг: перепишем решение с помощью методов
     */
        System.out.println("Задача вычисления количества осадков в межсезонье");
        int Days = 5; // для компактности зададим 5 дней контроля осадков
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

        // вызываем метод-процедуру заполнения случайными данными двух массивов
        fillMonthData(day_temp, days_precipitation);

        // вызываем метод-процедуру вывода данных двух массивов
        showMonthData(day_temp, days_precipitation);

        // вывод результата
        showResult(day_temp, days_precipitation);

    }

    /**
     * вывод в консоль Ответа на задачу
     * @param day_temp
     * @param days_precipitation
     */
    private static void showResult(int[] day_temp, int[] days_precipitation) {
        System.out.println();
        System.out.println("===Ответ===");
        System.out.printf("Количество осадков в виде снега: %d",
                getQuantityPrecipitation(day_temp, days_precipitation)[0]);
        System.out.println(); // перенос на новую строку
        System.out.printf("Количество осадков в виде дождя:  %d",
                getQuantityPrecipitation(day_temp, days_precipitation)[1]);
    }

    /**
     * Заполнение входных массивов данными об осадках и температуре
     *
     * @param day_temp           входной массив ежедневных температур
     * @param days_precipitation входной массив количества ежедневных осадков
     */
    private static void fillMonthData(int[] day_temp, int[] days_precipitation) {
        Random rnd = new Random(); // подключаем генератор случайных чисел
        // реализуем цикл для перебора массива дней
        for (int i = 0; i < day_temp.length; i++) {
            // сгенерируем случайно температуру Дня
            int Temper = rnd.nextInt(-20, 20);
            // поместим в массив значение температуры
            day_temp[i] = Temper;

            // заполним данными об осадках
            int Temp = rnd.nextInt(0, 200);
            days_precipitation[i] = Temp;
        }
    }

    /**
     * Вывод данных из массивов о температуре и осадках
     *
     * @param day_temp           входной массив
     * @param days_precipitation
     */
    private static void showMonthData(int[] day_temp, int[] days_precipitation) {
        System.out.println();
        System.out.println("Вывод инфо ");
        for (int i = 0; i < day_temp.length; i++) {
            System.out.printf("в %d день: Температура = %d, Осадки = %d %n",
                    i + 1, day_temp[i], days_precipitation[i]);
        }
    }

    /**
     * Возвращает Ответ к задаче: массив из двух значений (сумма снега и сумма дождя)
     *
     * @param day_temp           входной массив температур
     * @param days_precipitation входной массив осадков
     * @return 0 - сумма снега, 1 - сумма дождя
     */
    static int[] getQuantityPrecipitation(int[] day_temp, int[] days_precipitation) {
        // объявим переменные для накопления данных
        int sum_positive = 0; // сумма дождя
        int sum_negative = 0;  // сумма снега

        // перебор значений для анализа и суммирования
        for (int i = 0; i < day_temp.length; i++) {
            if (day_temp[i] > 0) {
                sum_positive += days_precipitation[i];
            } else {
                sum_negative += days_precipitation[i];
            }
        }
        return new int[]{sum_negative, sum_positive};
    }
}
