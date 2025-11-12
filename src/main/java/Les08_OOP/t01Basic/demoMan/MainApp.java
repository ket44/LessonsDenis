package Les08_OOP.t01Basic.demoMan;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        String user_command = ""; // переменная, которая будет хранить команду пользователя
        boolean isWorkedProg = true; // бесконечный цикл для работы меню программы
        Man SomeMan = null; // пустой (равный null) экземпляр класса Man
        Scanner scanner = new Scanner(System.in);

        while (isWorkedProg) { // пока Infinity равно true
            // Очистка консоли с помощью ANSI-кодов
            // "\033[H" перемещает курсор в верхний левый угол
            // "\033[2J" очищает весь экран
            System.out.print("\033[H\033[2J");
            System.out.flush(); // Убедимся, что вывод немедленно отображен

            // приглашение ввести команду
            System.out.println("Пожалуйста, введите команду\n");
            // получение строки (команды) от пользователя
            user_command = scanner.nextLine();
            // обработка команды с помощью оператора ветвления
            switch (user_command) {
                // если user_command содержит строку exit
                case "exit":
                    isWorkedProg = false; // теперь цикл завершится, и программа завершит свое выполнение
                    break;

                // если user_command содержит строку help
                case "help":
                    System.out.println("\nСписок команд:");
                    System.out.println("---");

                    System.out.println("create_man : команда создает человека, (экземпляр класса Man)");
                    System.out.println("kill_man : команда убивает человека");
                    System.out.println("talk : команда заставляет человека говорить (если создан экземпляр класса)");
                    System.out.println("go : команда заставляет человека идти (если создан экземпляр класса)");

                    System.out.println("---");
                    System.out.println("---\n");
                    break;

                case "create_man":
                    // проверяем, создан ли уже какой-либо человек
                    if (SomeMan != null) {
                        // человек уже существует.
                        // убиваем его
                        // (это не обязательная операция синтаксиса языка
                        // а всего лишь каприз автора кода :), вы можете пропустить эту строку)

                        SomeMan.Kill();
                        // создаем нового
                    }

                    // просим ввести имя человека
                    System.out.println("Пожалуйста, введите имя создаваемого человека \n");

                    // получаем строку введенную пользователем
                    user_command = scanner.nextLine();

                    // создаем новый объект в памяти, в качестве параметра
                    // передаем имя человека
                    SomeMan = new Man(user_command);

                    // сообщаем о создании
                    System.out.println("Человек успешно создан \n");
                    break;

                case "kill_man":
                    // проверяем, что объект существует в памяти
                    if (SomeMan != null) {
                        // вызываем функцию смерти
                        SomeMan.Kill();
                    } else { // иначе
                        System.out.println("Человек не создан. Вы не можете его убить");
                    }
                    break;

                case "talk":
                    // проверяем, что объект существует в памяти
                    if (SomeMan != null) {
                        // вызываем функцию разговора
                        SomeMan.Talk();
                    } else { // иначе
                        System.out.println("Человек не создан. Команда не может быть выполнена");
                    }
                    break;

                case "go":
                    // проверяем, что объект существует в памяти
                    if (SomeMan != null) {
                        // вызываем функцию передвижения
                        SomeMan.Go();
                    } else {
                        System.out.println("Человек не создан. Команда не может быть выполнена");
                    }
                    break;

                // если команду определить не удалось
                default:
                    System.out.println("Ваша команда не определена, пожалуйста повторите снова\n");
                    System.out.println("Для вывода списка команд введите команду help");
                    System.out.println("Для завершения программы введите команду exit\n\n");
                    break;
            }
        }
        scanner.close();
    }
}

