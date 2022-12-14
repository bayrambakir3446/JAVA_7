package gunler.gun35;

import java.io.StringReader;

public class TekrarEdedenKarakter {
    public static void main(String[] args) {
        String str = "abc abc def def ";
        String yeni = "";// abscd
        for (int i = 0; i < str.length(); i++) {
//            System.out.println("str.charAt(i) = " + str.charAt(i));
            if (!yeni.contains("" + str.charAt(i))) {
//            if (!yeni.contains(String.valueOf(str.charAt(i)))) {
                yeni = yeni + str.charAt(i);
            }
        }
        System.out.println("yeni = " + yeni);


    }
}
