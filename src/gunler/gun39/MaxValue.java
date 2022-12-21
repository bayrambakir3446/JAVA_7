package gunler.gun39;

public class MaxValue {

    public static void main(String[] args) {

        // Bir Array icerisindeki en buyuk degeri bulan bir method yaziniz
        int[] numbers = {131251,897923,87238,98,-981271};
        System.out.println(maxValue(numbers));

    }
    public static int maxValue(int[] arr){
        Integer max = Integer.MIN_VALUE;
        for(int each : arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }
}
