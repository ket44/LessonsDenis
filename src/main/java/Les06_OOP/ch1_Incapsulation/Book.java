package Les06_OOP.Incapsulation;

public class Book {
    // Инкапсуляция свойств названия книги и ее автора
    // — эти свойства будут доступны только через методы
    private String title;
    private String author;

    // Геттер, который возвращает название книги, он будет доступен за пределами объектов класса
    public String getTitle(){
        return title;
    }

    // Сеттер, который устанавливает название книги
    public void setTitle(String title){
        this.title = title;
    }

    // Геттер, который возвращает имя автора книги
    public String getAuthor() {
        return author;
    }

    // Сеттер, который устанавливает имя автора
    public void setAuthor(String author) {
        this.author = author;
    }
}