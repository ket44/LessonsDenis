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
         // i-ый элемент      (приведение к int)
            myArray[i] = A * (int)Math.pow(d, i);
        }

        //вывод массива через упрощенный for
        for (int element : myArray){
            System.out.println(element);
        }
        /* проверку можно сделать на сайте
        https://allcalc.ru/node/1001   */
    }
}
