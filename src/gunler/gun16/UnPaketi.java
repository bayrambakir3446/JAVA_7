package gunler.gun16;

public class UnPaketi {

    public static void main(String[] args) {

        // Elimizde belili sayida 5 kiloluk ve 1 kiloluk un paketleri var
        // Musteriye istedigi kiloda unu verip veremeyecegimizi tespit eden bir program yaziniz

        int beslikPaket = 3;
        int birlikPaket = 11;
        int talep = 27;
        boolean cevap = false;

        if(beslikPaket * 5 >= talep){
            if(birlikPaket >= talep % 5){
                cevap = true;
            }
        }else{
            if(birlikPaket >= talep - beslikPaket * 5){
                cevap = true;
            }
        }

        System.out.println("cevap = " + cevap);
    }
}
