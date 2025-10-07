package Les01_basic.c02_Loops;

import java.util.Scanner;

import static java.lang.System.*;

public class For27_demo {
    public static void main(String[] args) {
        // нахождение arcsin по формуле Тейлора о сумме ряда
        out.println("Вычисление суммы ряда");
        out.println("Цель: Написание тела цикла, в котором меняются данные");
        out.println("Реализуем по шагам!!! контролируем работоспособность программы");
        out.println("Каждый шаг - приближает к решению");
        out.println("Спросим N - количество слагаемых");
        out.println("Шаг 1. Цикл с выводом последовательности ");
        int N_slag;
        out.println("Введите количество слагаемых");
        Scanner in = new Scanner(System.in);
        try  {
            N_slag = in.nextInt();
        }  //используем IDE для вставки шаблонного кода ПКМ-на Scanner(System.in)
        catch (Exception e) {
            throw new RuntimeException(e);
        }

//        // Этап 1. Организация цикла
//        for (int currentAddentum = 1; // используем перенос для краткости строки кода - легче читать,
//             currentAddentum <= N_slag; //  легче контролировать изменения в коде
//             currentAddentum++) {
//            // тело цикла
//            out.printf("Номер слаг: %d %n", currentAddentum);  //
//        }

        // Этап 2. Вывод коэффициентов числителя (1*3*5*...(2N-1))
//        int koef_chisl = 1;
//        int koef_znam = 2;
//        for (int currentAddentum = 1; // используем перенос для краткости строки кода - легче читать,
//             currentAddentum <= N_slag; //  легче контролировать изменения в коде
//             currentAddentum++) {
//            // тело цикла
//
//            out.printf("Nслаг: %d кфц_числ: %d  кфц_знам: %d%n", currentAddentum, koef_chisl, koef_znam);  //
//            koef_chisl += 2;
//            koef_znam += 2;
//        }

//        // Этап 3. Добавляем степень аргумента и нечетный последний множитель в знаменателе
//        int koef_chisl = 1; // коэффициент в числителе
//        int koef_znam = 2; // коэффициент в знаменателе
//        int step_arg = 1; // степень аргумента
//        for (int currentAddentum = 1; // используем перенос для краткости строки кода - легче читать,
//             currentAddentum <= N_slag; //  легче контролировать изменения в коде
//             currentAddentum++) {
//            // тело цикла
//
//            out.printf("Nслаг: %d кфц_числ: %d  послед.кфц_знам: %d*%d степн: %d%n",
//                    currentAddentum,
//                    koef_chisl,
//                    koef_znam,
//                    koef_znam+1,
//                    step_arg);
//            koef_chisl += 2;
//            koef_znam += 2;
//            step_arg = 2 * currentAddentum + 1;
//        }

        // Этап 4. Спрашиваем x и реализуем формулу
        int koef_chisl = 1; // коэффициент в числителе
        int koef_znam = 2; // коэффициент в знаменателе

        out.println("Введите x");
        double x = in.nextDouble();
        double step_arg = x; // степень аргумента
        double result = x;


//        for (int currentAddentum = 1; // используем перенос для краткости строки кода - легче читать,
//             currentAddentum <= N_slag; //  легче контролировать изменения в коде
//             currentAddentum++) {
//            // тело цикла
//
//            out.printf("Nслаг: %-2d аргум: %.25f  кфц_числ: %d  послед.кфц_знам: %d*%d степн: %d%n",
//                    currentAddentum,
//                    result,
//                    koef_chisl,
//                    koef_znam,
//                    koef_znam+1,
//                    step_arg);
//            // считаем сумму = добавляем в нее величину расчета СЛАГАЕМОГО
//
//            koef_chisl += 2;
//            koef_znam += 2;
//            step_arg = 2 * currentAddentum + 1;
//            result = Math.pow(x,step_arg);
//
//        }

        for (int currentAddentum = 1; // используем перенос для краткости строки кода - легче читать,
             currentAddentum <= N_slag; //  легче контролировать изменения в коде
             ++currentAddentum) {
            // тело цикла
            koef_chisl *= 2*currentAddentum - 1;
            koef_znam *= 2*currentAddentum;
            step_arg *= x * x;
            result += koef_chisl * step_arg/(koef_znam * (2 * currentAddentum + 1));

        }
    }
}
