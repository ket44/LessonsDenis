package Les01_basic.c02_For;

public class DemoArray_with_EVEN {
    public static void main(String[] args) {
        System.out.println("Вывод четных из массива");
        int[] arr =  {4, 3,7,1,8,3,16};
        System.out.println(arr.length);
        System.out.println(arr[6]);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println("Элемент четный:" + arr[i]);
            }
        }
    }
}
