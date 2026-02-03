package PraktOOP.Glava3.gr21_1;

public class Company {
    private String name; //название компании
    private int persons; //количество сотрудников
    public int money; // месячный фонд зарплаты

    public Company(String name) {
        this.name = name;
    }

    public Company(String name, int persons) {
        this.name = name;
        this.persons = persons;
    }

    public Company(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
