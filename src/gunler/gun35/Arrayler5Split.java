package gunler.gun35;

import java.util.Arrays;

public class Arrayler5Split {
    public static void main(String[] args) {
        String text = "Merhaba Java bugun arrayler calisiyoruz";
        String[] bolunmusText = text.split(" ");
        System.out.println("bolunmusText.length = " + bolunmusText.length);
        System.out.println("Arrays.toString(bolunmusText) = " + Arrays.toString(bolunmusText));
        String macSonucu = "Fas=1, Fransa=1 , hirvatistan = 0, Arjantin=3";
        String[] fasFransa = macSonucu.split(",");
        System.out.println("fasFransa.length = " + fasFransa.length);
        System.out.println("fasFransa[0] = " + fasFransa[0]);
        System.out.println("fasFransa[1] = " + fasFransa[1]);


    }
}
