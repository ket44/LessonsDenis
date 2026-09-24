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


        //System.out.println(RandomInt);
        for (int i = 0; i < N; i++) {
            RandomNums[i] = rnd.nextInt(0, 100);
        }

        for (int element : RandomNums) {
            System.out.print(element + " ");
        }

        for (int i = 0; i < RandomNums.length - 1; i++) {
            for (int j = 0; j < RandomNums.length - i -1; j++) {
                if (RandomNums[j] > RandomNums[j + 1]) {
                    int temp = RandomNums[j];
                    RandomNums[j] = RandomNums[j + 1];
                    RandomNums[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int element : RandomNums) {
            System.out.print(element + " ");
        }

    }
}
