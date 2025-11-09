package Les06_OOP.Man;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("Демо ООП парадигмы");
//        //тип имя инициализация
//        int   x = 10;
//
//        Man Vasya = new Man("Вася");
//        Vasya.Rename("Петя"); // демо модификатора доступа

        Man Vasya = new Man("Вася");
        Vasya.getInfo();

    }
}
