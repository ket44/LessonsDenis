package PraktOOP.Glava3.gr21_1;

public class CompanyMain {
    // Демо сигнатуры
    public static double Minus(double a, double b) { return 0;}
    public int Minus(int a, double b) {return 0;}
    public void Minus(double a, int b) {};

    //Демо статического метода
    // статический метод - метод класса, вызов по имени (или с именем класса), не требует экземпляра
    static void Birthday(int x) {
        x = x + 1;
    }

    public static void main(String[] args) {
        System.out.println("программа стартует");
        int Age = 49; // В ПЕРЕМЕННОЙ - ЗНАЧЕНИЕ!
// ССЫЛОЧНЫЕ И ЗНАЧИМЫЕ ТИПЫ

        System.out.println(Age);

        Company company1 = new Company("COMPAN"); // В ПЕРЕМЕННОЙ - ССЫЛКА
        // Создаем экеземпляр!
        //company1.name = "Супер-пупер-мега-авто";
        // company1.persons = 50 + 1;

        //company1.setPersons(500);

        Company tt = new Company("TT");
        company1 = tt;

        System.out.println(Age + " ДО работы метода");
        Birthday(Age);
        System.out.println(Age + " после работы метода");
    }

}

