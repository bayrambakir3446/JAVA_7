package gunler.gun21;

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 7; i++) {
            System.out.println("continue oncesi");
            if (i == 3 || i == 5) {
                continue;
            }
            System.out.println(i);
        }

        //continue oncesi
        //0
        //continue oncesi
        //1
        //continue oncesi
        //2
        //continue oncesi
        //continue oncesi
        //4
        //continue oncesi
        //continue oncesi
        //6



    }
}
