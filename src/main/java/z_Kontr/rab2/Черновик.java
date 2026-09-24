package z_Kontr.rab2;

import java.security.cert.TrustAnchor;
import java.util.ArrayList;

class Tovar{
  String nazv;

    public Tovar(String nazv) {
    }

}
class Magaz{
    String NazvMagaz;
    ArrayList<Tovar> СписокТоваров;

    public Magaz(String nazvMagaz) {
        NazvMagaz = nazvMagaz;
        СписокТоваров = new ArrayList<Tovar>();
    }
}


public class Черновик {
    public static boolean ЯвлЧетным(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        int num = 5;

        if (ЯвлЧетным(num)) System.out.println(num + "Четное");
        else System.out.println(num + "нечетное");

        Magaz Магазин1 = new Magaz("МегаШарики");
        Tovar tovar1 = new Tovar("Шарик");
        Магазин1.СписокТоваров.add(tovar1);

    }
}
