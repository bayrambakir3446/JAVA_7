package gunler.gun30;

import java.util.Scanner;

public class DaireninAlani {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Dairenin yari capini giriniz.");
        
        double yariCap = sc.nextDouble();
        double daireninAlani = yariCap * yariCap * Math.PI;

        System.out.println("daireninAlani = " + daireninAlani);
    }
}
