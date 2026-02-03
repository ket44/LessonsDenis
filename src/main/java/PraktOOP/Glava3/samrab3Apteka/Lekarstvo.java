package PraktOOP.Glava3.samrab3Apteka;

public class Lekarstvo {
    /*  названние
        стоимость      */
    public String name; // название лексарства
    public  int price;

    // Коснтруктор - создаем через ГЕНЕРАЦИЮ в среде разработки

    public Lekarstvo(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // public int Method(int x, y)- публичный метод с возвращением целого числа
    // public void Method(int x, y) - метод БЕЗ ВОЗВРАТА значения
    public void Info(){
        System.out.printf("Название лекарства: %s и его цена %d",
                            this.name, this.price);
        System.out.println();
    }
}
