package Les01_basic.c001_IfSwitch;

import java.util.Scanner;

public class ex02_If5 {
    /*
    If5. Даны три целых числа. (ДАНО)
    Найти количество положительных и (Найти раз)
     количество отрицательных чисел  (Найти два)
     в исходном наборе

     (вывод: результат - два значения)
     */
    public static void main(String[] args) {

        // Этап ВВОД исходных Данных
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int A = in.nextInt();
        System.out.println("Введите второе число");
        int B = in.nextInt();
        System.out.println("Введите третье число");
        int C = in.nextInt();

        // Этап Обработки
        int CounterPositive = 0; // нам надо счетчик - переменная накапливающая количество
        int CountNegative = 0; // пока не считали -> = 0

        // у нас число может быть положительным или отрицательным
        // это два варианта событий.
        // используем ветвление: оператор условия
        if (A >= 0) {
            CounterPositive++;
        } else {
            CountNegative++;
        }

        // Повторяем для следующего
        if (B >= 0) {
            CounterPositive++;
        } else {
            CountNegative++;
        }

        // Повторяем для следующего
        if (C >= 0) {
            CounterPositive++;
        } else {
            CountNegative++;
        }

        //Этап вывода результатов
        System.out.println("Количество положительных: " + CounterPositive);
        System.out.println("Количество отрицательных: " + CountNegative);
    }
}
