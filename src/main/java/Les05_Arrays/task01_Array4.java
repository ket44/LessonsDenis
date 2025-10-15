package Les05_Arrays;

import java.util.Scanner;

public class task01_Array4 {
    public static void main(String[] args) {
        /*
        Array4°. Дано целое число N (> 1),
        а также первый член A и знаменатель D геометрической прогрессии.
        Сформировать и вывести массив размера N,
        содержащий N первых членов данной прогрессии:
            A,    A·D^1,    A·D^2,    A·D^3,    … .
         */
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первый член прогрессии");
        int A = in.nextInt();
        System.out.println("Введите знаменатель прогрессии");
        int d = in.nextInt();
        System.out.println("Введите количество элементов прогрессии");
        int N = in.nextInt();

        int[] myArray = new int[N];
        myArray[0] = A; // внесем первый элемент прогрессии в массив
        // заполним массив прогрессией
        for (int i = 1; i < N; i++) {
         // i-ый элемент  (приведение double к int)
            myArray[i] = A * (int)Math.pow(d, i);
        }
        System.out.println("Итоговый массив");
        //вывод массива через упрощенный for - цель: выполнить тело цикла для каждого элемента перебираемого типа (массива)
        for (int element : myArray){
            /* как работает упрощенный for:
             объявляем переменную с типом элементов массива,
             в неё при переборе массива вносится КАЖДЫЙ элемент массива
             далее
            */
            System.out.print (element + " ");
            // Запомните: массив - это ПЕРЕБИРАЕМЫЙ тип данных, или ИТЕРИРУЕМЫЙ
        }
        /* проверку решения можно сделать на сайте
        https://allcalc.ru/node/1001   */
    }
}
