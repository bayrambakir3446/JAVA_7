package gunler.gun21;

public class LastDigit {
    //    Given two non-negative int values, return true if they have the same last digit,
//    such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
//
//
//    lastDigit(7, 17) → true
//    lastDigit(6, 17) → false
//    lastDigit(3, 113) → true
    public static void main(String[] args) {
        int a = 5;
        int b = 15;
        int c = 25;
        boolean sonRakamAyni = false;

        if (a % 10 == b % 10 && a % 10 == c % 10) {
            sonRakamAyni = true;
        }
        System.out.println("sonRakamAyni = " + sonRakamAyni);

        sonRakamAyni = (a % 10 == b % 10 && b % 10 == c % 10) ? true : false;
        System.out.println("sonRakamAyni = " + sonRakamAyni);

    }
}
