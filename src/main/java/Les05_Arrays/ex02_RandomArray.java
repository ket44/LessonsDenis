package Les05_Arrays;

import java.util.Random;

public class ex02_RandomArray {
    public static void main(String[] args) {
        final int N = 6; // константа для длины массива
        int[] RandomNums = new int[N]; //Фиксированная длина

        // Порядок генерации псевдослуч чисел
        // Создать экземпляр класса Random
        Random rnd = new Random();
        //вызвать метод генерации (целого), указав диапазон
        int RandomInt = rnd.nextInt(0, 100);
        // System.out.println(RandomInt);
        for (int i = 0; i < N; i++){
            RandomNums[i] = rnd.nextInt(0, 100);
        }

        for (int element : RandomNums) {
            System.out.print(element + " ");
        }
    }
}
