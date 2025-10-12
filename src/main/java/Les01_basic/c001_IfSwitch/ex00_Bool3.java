package Les01_basic.c001_IfSwitch;

import java.util.Scanner;

public class ex00_Bool3 {
    /*
    Boolean3°. Дано целое число A.
    Проверить истинность высказывания: «Число A является четным».
     */
    public static void main(String[] args) {

        //Этап Ввод исходных данных
        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число");
        int A = in.nextInt();

        // Этап обработки исходных данных
        // "Четное" - это число, которое делится на 2 "без остатка"
        // "без остатка" - это остаток=0

        //                      выч. остат
        boolean   result    =     A % 2    == 0;   // оператор % - вычисляет ОСТАТОК от деления.
        //тип     перем   присв           сравнен

        // Этап вывод результата
        System.out.println(result);


    }

}
