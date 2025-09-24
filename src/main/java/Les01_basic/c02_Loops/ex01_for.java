package Les01_basic.c02_Loops;

public class ex01_for {
    public static void main(String[] args) {

//        for (int i = 1; i < 9; i++){
//            System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
//        }

        int n = 10;
        for(int i=0, j = n - 1; i < j; i++, j--){

            System.out.printf(" %d  %d   %d \n", i, j, i*j);

        }


    }
}
