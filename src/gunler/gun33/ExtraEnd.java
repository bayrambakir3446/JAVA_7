package gunler.gun33;

public class ExtraEnd {
    public static void main(String[] args) {
        //bir stringin son iki karakterini uc defa yazdirin
        String str = "Merhaba";
        //            0123456
        //                 56
        System.out.println(str.substring(5));
        str = "Liverpool";
        System.out.println("str.length() = " + str.length());
        String iki = str.substring(str.length() - 2);
        //  iki.concat(iki).concat(iki)
        System.out.println(iki + iki + iki);

    }
}
