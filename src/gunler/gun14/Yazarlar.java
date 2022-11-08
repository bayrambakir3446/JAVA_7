package gunler.gun14;

public class Yazarlar {
    public static void main(String[] args) {
        String kitapAdi = "Goriot Baba";
        String kitabiYazari = "";
        switch (kitapAdi) {
            case "Suc ve Ceza":
                kitabiYazari = "Dostoyevski";
                System.out.println("yazari dostoyevski");
                break;
            case "Sinekli Bakkal":
                System.out.println("yazari halide edip");
                kitabiYazari="Halide Edip";
                break;
            case "Goriot Baba":
            case "Vadideki Zambak":
                kitabiYazari = "Balzac";
                System.out.println("kitabin yazari Balzac");
                break;
            case "Pembe incilli Kaftan":
                kitabiYazari = "Omer Seyfettin";
                System.out.println("kitabin yazari Omer Seyfettin");
                break;
            case "Iki sehrin hikayesi":
                kitabiYazari = "Charles Dickens";
                System.out.println("Kitabin yazari charles dickens");
                break;
            default:
                System.out.println("aradiginiz kitap bulunamadi");
        }
        System.out.println("kitabiYazari = " + kitabiYazari);
    }
}
