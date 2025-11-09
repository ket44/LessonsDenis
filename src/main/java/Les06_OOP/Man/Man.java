package Les06_OOP.Man;

import java.util.Random;

public class Man {
    Random rnd = new Random();

    /**
     * Конструктор
     * @param _name - имя экземпляра
     */
    public Man(String _name) {
        Name = _name;
        isLife = true;

        Age = rnd.nextInt(15, 51);
        Health = rnd.nextInt(10, 101);
    }
    private String Name; // Имя
    private boolean isLife; // статус: Жив/Мертв
    private int Age; // возраст
    private int Health; // уровень здоровья

    /**
     * метод "Человек Говорит"
     */
    public void Talk(){

    }

    /**
     * Человек идет
     */
    public void Go(){

    }

    public boolean isLife(){
        return isLife;
    }

    public void Rename(String _newname){
        this.Name = _newname;
    }

    public void getInfo(){
        String str = "Человек с именем " + this.Name +
                " возрастом " + this.Age + " лет" +
                " состоянием здоровья на " + this.Health;
        System.out.println(str);
    }
}
