package Les02_Exeption;

import java.util.Scanner;

public class task01_demoException {
    public static void main(String[] args) {
        System.out.println("Сделаем ввод целого числа, \n но есть риск, что введут текст или дробь");
        Scanner in = new Scanner(System.in);

        // Объявление переменной - в глобальной области видимости
        int IntegerNum = 0;
       // IntegerNum = in.nextInt();

        // Ввод ниже выдаст Исключение (ошибку исполнения), программа остановится
     //IntegerNum = in.nextInt(); // Важно, что синтаксис кода - верный! ошибка - логическая.
        //закомментируем и посмотрим как обработать исключение....


        try {
            System.out.println("Введите текст, например 'пять'");
            IntegerNum = in.nextInt();

        } catch (Exception e) {
            System.out.println("=== ПРОИЗОШЛА ОШИБКА ВВОДА ===");
            System.out.println("Тип ошибки: " + e.getClass().getSimpleName());
            System.out.println("Сообщение: " + e.getMessage());
            System.out.println("Причина: Метод nextInt() ожидает целое число,");
            System.out.println("         но был введен текст или дробное число");
            System.out.println("Рекомендация: Введите целое число (например: 5, -10, 100)");
            System.out.println("==============================");
        }
        System.out.println("Программа не 'крашнулась',\n НО число НЕ введено!!: " + IntegerNum);
        System.out.println();
        System.out.println("------------------------------------------------------");
        // Сделаем ввод данных в цикле, чтобы предложить ввести повторно без ошибки:
        while (true) {
            try {
                System.out.println("Введите ЦЕЛОЕ число:");
                IntegerNum = in.nextInt();
                break; // если дошли сюда, ввод корректен
            } catch (Exception e) {
                System.out.println("Это не целое число! Попробуйте еще раз.");
                in.next(); // очистить некорректный ввод
            }
        }
        System.out.println("Ввод числа успешен: " + IntegerNum);
        System.out.println("Программа завершена");




    }
}
