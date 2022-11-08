package gunler.gun12;

public class SortaSum {

    //    Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive,
//    are forbidden, so in that case just return 20.
//    sortaSum(3, 4) → 7
//    sortaSum(9, 4) → 20
//    sortaSum(10, 11) → 21
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int sum = a + b;
        if (sum > 9 && sum < 20) {
            sum = 20;
        }
        System.out.println("sum = " + sum);
    }

}
