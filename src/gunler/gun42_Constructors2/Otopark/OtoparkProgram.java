package gunler.gun42_Constructors2.Otopark;

public class OtoparkProgram {
    public static void main(String[] args) {
        OtoPark otoPark = new OtoPark("Halk otoparkı","Checkpoint/Berlin");
        System.out.println("otoPark = " + otoPark);

        Car araba1 = new Car("BMW","HM-123-56");
        System.out.println("araba1 = " + araba1);

        Car araba2 = new Car("Mercedes","F-1234-65");
        System.out.println("araba2 = " + araba2);

        otoPark.arabaEkle(araba1);
        otoPark.arabaEkle(araba2);

        otoPark.arabaListesi();
    }
}
