package PraktOOP.Glava3.samrab3Apteka;

public class AptekaMain {
    public static void main(String[] args) {

        Apteka apt1 = new Apteka("Живика");
        Lekarstvo lekar1 = new Lekarstvo("Аспирин", 200);
        Lekarstvo lekar2 = new Lekarstvo("Парацетамол", 350);
        apt1.PostavkaLekarstva(lekar1);
        apt1.PostavkaLekarstva(lekar2);

        apt1.Info();
    }
}
