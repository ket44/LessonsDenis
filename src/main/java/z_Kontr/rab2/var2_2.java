package z_Kontr.rab2;

public class var2_2 {
    public static void main(String[] args) {
        /*
        ВАРИАНТ 2!!! Разбор задачи

        задача - "искусственная", для отработки и проверки
        понимания структуры массива
        и обращению к элементам массива


        №2. Дан массив. Скопировать все его элементы
        в другой массив такого же размера:
                а) в том же порядке расположения элементов;
                б) в обратном порядке расположения элементов.
         */

        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        int[] newArrDirect = new int[arr.length]; // длина как у исходного - Direct: Прямой порядок
        int[] newArrReverse = new int[arr.length]; // длина как у исходного - Reverse: Обратный порядок

        // для прямого всё просто:
        // 1 способ (через ИНДЕКСЫ: обход массива и копия каждого значения в новый):
//        for (int i = 0; i < arr.length; i++) {
//            newArrDirect[i] = arr[i];
//        }

        // 2 способ (через "Методы")
        newArrDirect = arr.clone();

        // Вывод
        for (int elem: arr)
            System.out.print(elem + " ");
        System.out.println("Прямой массив");
        for (int elem: newArrDirect)
            System.out.print(elem + " ");

        // для обратного порядка:
        // 1 способ
        // задача Брать с конца и класть в начало:
        for (int i = 0; i < arr.length; i++) {
            newArrReverse[i] = arr[arr.length - 1 - i]; // arr.length - 1: доступ к правому Индексу.
                                                       // arr.length - 1 - i - сдвиг на меняющийся i
        }


    }
}
