package gunler.gun12;

public class In1To10 {
    public static void main(String[] args) {
//
//        We'll say a number is special if it is a multiple of 11 or if it is one more
//        than a multiple of 11. Return true if the given non-negative number is special.
//                Use the % "mod" operator -- see Introduction to Mod
//
//
//        specialEleven(22) → true
//        specialEleven(23) → true
//        specialEleven(24) → false
        int n = 25;
        boolean sonuc = true;
        if (n % 11 == 0 || n % 11 == 1) {
//            System.out.println("special 11 ");
//            sonuc = true;
        } else {
            sonuc = false;
//            System.out.println("no 11");
        }
        System.out.println("sonuc = " + sonuc);

    }
}
