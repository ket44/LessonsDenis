package Les01_basic.c02_For;

import java.util.Scanner;

import static java.lang.System.out;

public class For27_demo_rigth {
    public static void main(String[] args) {
        // нахождение arcsin по формуле Тейлора о сумме ряда
        out.println("Вычисление суммы ряда");
        out.println("Цель: Написание тела цикла, в котором меняются данные");
        int N_slag;
        out.println("Введите количество слагаемых");
        Scanner in = new Scanner(System.in);
        N_slag = in.nextInt();
        out.println("Введите x. разделитель \",\" для русской Win и \".\" для Eng");
        double x = in.nextDouble();
        double sum = x;       // Первое слагаемое (при n = 0 равно x)
        double term = x;      // Текущее слагаемое

        // Цикл идет со 2-го по 11-е слагаемое (индексы n от 1 до 10)
        for (int n = 1; n < 11; n++) {
            // Рекуррентный пересчет текущего члена ряда
            double numerator = (2 * n - 1) * (2 * n - 1) * x * x;
            double denominator = (2 * n) * (2 * n + 1);

            term *= numerator / denominator;
            sum += term;
        }
        double mathResult = Math.asin(x);
        out.println("Вычислено     нами: " + sum);
        out.println("Вычислено  модулем: " + mathResult);


    }
}
