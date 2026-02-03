package PraktOOP.Glava3.samrab3Apteka;

import java.util.ArrayList;

public class Apteka {
    // Описание Аптеки
    //название
 /*
    В Аптеке создаем
    массив ОБЪЕКТОВ - лекарства
     */

    public String Name; // название Аптеки
    public ArrayList<Lekarstvo> SpisokLekarstv; // массив Названий лекарств

    public Apteka(String nazvanie){
        this.Name = nazvanie;
        SpisokLekarstv = new ArrayList<>();
    }

    public Apteka(){
        SpisokLekarstv = new ArrayList<>();
    }
    // Новое лекарство добавляется в аптеку (в список)
    public void PostavkaLekarstva(Lekarstvo lekarstvo){
        SpisokLekarstv.add(lekarstvo);
    }

    public void Info(){
        System.out.println("Название аптеки: " + this.Name);
        System.out.println("В аптеке есть лекарства: ");
        for (Lekarstvo lek : SpisokLekarstv){
            lek.Info();
        }
    }

}
