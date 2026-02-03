package Les06_OOP.Incapsulation;

public class LibraryApplication {
    public static void main(String[] args){
// Создание объекта класса Книга с использованием сеттеров, устанавливающих название и имя автора
        Book book = new Book();

        book.setTitle("Мастер и Маргарита");
        book.setAuthor("Михаил Булгаков");

// Использование геттеров, которые возвращают название книги и имя автора
        System.out.println("Название: " + book.getTitle());
        System.out.println("Автор: " + book.getAuthor());
    }
}

// Вывод: Название: Мастер и Маргарита
// Автор: Михаил Булгаков
