package gunler.gun21;

public class In3050 {
    //iki degisken
    //her ikidegisken de 30 -40 arasinda veya her iki degiskende 40 50 arasinda ise
//    in3050(30, 31) → true
//    in3050(30, 41) → false
//    in3050(40, 50) → true
    public static void main(String[] args) {
        int a = 40;
        int b = 45;
        boolean sonuc = true;

        if (((a < 41 && a > 29) && (b > 29 && b < 41)) || ((a > 39 && a < 51) && (b > 39 && b < 51))) {

        } else {
            sonuc = false;
        }
        System.out.println("sonuc = " + sonuc);

    }
}
