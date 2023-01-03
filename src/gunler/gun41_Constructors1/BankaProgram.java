package gunler.gun41_Constructors1;

public class BankaProgram {
    public static void main(String[] args) {
        Musteri musteri1 = new Musteri();
        musteri1.showInfo();

        Musteri musteri2 = new Musteri("Ahmet",1234567);
        musteri2.showInfo();

        Musteri musteri3 = new Musteri("Mehmet John",12345,34567,903456789,5000);
       musteri3.showInfo();
    }
}
