package Les01_basic.c01_Methods;

import java.util.Scanner;

public class ex001_CircleArea {
    // Создаем метод
    static double getCircleArea(double r){
        // реализуем расчет площади круга
        double result = Math.PI * r * r;
        // возвращаем результат
        return result;
    }
    // Основной метода программы
    public static void main(String[] args) {
        System.out.println("Программа расчета площади детали");
        System.out.print("Введите радиус внешнего круга (вещ. число): ");

        Scanner in = new Scanner(System.in);
        double rBig = in.nextDouble();

        System.out.print("Введите радиус 1 внутреннего круга: ");
        double r1 = in.nextFloat();
        System.out.print("Введите радиус 2 внутреннего круга: ");
        double r2 = in.nextFloat();
        System.out.print("Введите радиус 3 внутреннего круга: ");
        double r3 = in.nextFloat();

        double result = getCircleArea(rBig)
                            - getCircleArea(r1)
                            - getCircleArea(r2)
                            - getCircleArea(r3);
        System.out.printf("Площадь детали = %.3f", result);
    }
}
