package Les06_OOP.ch2_Inheritance;

public class Company {
    protected String name; // название
    protected int persons; // количество сотрудников
    protected int money; // месячный фонд зарплаты

    public Company(String name, int persons, int money) {
        this.name = name;
        this.persons = persons;
        this.money = money;
    }
}

class InsCompany extends Company {
    int counts; // количество застрахованных лиц
    int summaplus; // сумма страховых взносов
    int summaminus; // сумма страховых выплат

    public InsCompany(String name,
                      int persons,
                      int money,
                      int counts,
                      int summaplus,
                      int summaminus) {
        super(name, persons, money);
        this.counts = counts;
        this.summaplus = summaplus;
        this.summaminus = summaminus;
    }
}