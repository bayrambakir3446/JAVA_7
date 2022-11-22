package gunler.gun22;

public class ReuseMethod {

    public static void main(String[] args) {

        // Proje icerisinde ayni methodu defalarca cagirabilmek mumkun
        System.out.println("Ahmet geldi");
        selam();
        System.out.println("Ayse geldi");
        selam();
        System.out.println("Mehmet geldi");
        selam();
        System.out.println("Elif geldi");
        selam();

    }

    public static void selam(){
        System.out.println("Selam");
    }
}
