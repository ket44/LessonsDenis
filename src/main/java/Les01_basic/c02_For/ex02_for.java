package Les01_basic.c02_For;

public class ex02_for {
    public static void main(String[] args) {

        String ex1 = "Пример 1. Использование счетчика в теле цикла";
        System.out.println(ex1);
        for (int i = 1; i < 5; i++) {
            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
        }

        System.out.println("===================================");
        String ex3 = "Пример 3. Изменение счетчика с отрицательным шагом";
        System.out.println(ex3);
        for (int i = 5; i >= 0; i--) {
            System.out.println("Счетчик уменьшается - " + i);

        }
        System.out.println("===================================");
        String ex4 = "Пример 4. Использование двух переменных для условия останова";
        System.out.println(ex4);
        int n = 10;
        for (int i = 0, j = n - 1; i < j; i++, j--) {

            System.out.printf(" %3d %3d %4d \n", i, j, i * j);
            // %md m-количество знакомест под вывод числа

        }


    }
}
