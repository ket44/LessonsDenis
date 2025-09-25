package Les02_Exeption;

import java.util.Scanner;

public class task02_returnVarValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("введите целое число");
        int foo;
        try {
            foo = in.nextInt();
        }
        catch (Exception message){
            System.out.println(message.getClass().getSimpleName());
            return; // возвращаем значение переменной в глобальное адресное пространство
        }
        System.out.println(foo);
    }



}
