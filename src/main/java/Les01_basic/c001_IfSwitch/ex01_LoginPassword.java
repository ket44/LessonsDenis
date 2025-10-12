package Les01_basic.c001_IfSwitch;

public class ex01_LoginPassword {
    public static void main(String[] args) {
        // Реализуем систему проверки строковых данных
        String correctUsername = "uSEr1";
        String correctPassword = "12345";

        String inputUsername = "User";
        String inputPassword = "12345";


        boolean CheckLogin = inputUsername.equalsIgnoreCase(correctUsername);
        boolean CheckPassword = inputPassword.equals(correctPassword);

        if (CheckLogin && CheckPassword){
            System.out.println("Вход выполнен успешно!");
        } else {
            System.out.println("Неверное имя пользователя или пароль!");
        }

        /*
        Метод equals() в Java используется для сравнения содержимого двух объектов типа String.
        Он возвращает true, если строки представляют одну и ту же последовательность символов,
        игнорируя их ссылки в памяти, и false в противном случае.
        Это отличается от оператора ==, который проверяет,
        ссылаются ли две переменные на один и тот же объект.

        Как работает equals() для строк:
        Сравнение по содержимому:
        В отличие от ==, equals() сравнивает не ссылки на объекты, а их значения,
        т.е. последовательность символов.

        Логическое равенство: Метод определяет, эквивалентны ли две строки по смыслу,
        что делает его основным инструментом для сравнения строк.
        Нечувствительность к регистру: Метод equals() чувствителен к регистру.
        Для сравнения без учета регистра используйте метод equalsIgnoreCase().
         */
    }
}

