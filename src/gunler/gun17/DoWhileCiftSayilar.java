package gunler.gun17;

public class DoWhileCiftSayilar {
    public static void main(String[] args) {

        int i = 0;
        int son = 20;
        do {
            if (i % 2 == 0) {
                System.out.println(i + " cift bir sayidir ");                // 1%2==0   2%2==0 3%2==0 4%2==0
            } else {
                System.out.println(i + " tek bir sayidir ");
            }
            i++;// 1 2
        } while (i < son);// 1<20
        System.out.println("i = " + i);

        i = 0;
        while (i < son) {
            if (i % 2 == 0) {
                System.out.println(i + " bir cift sayidir. while");
            } else {
                System.out.println(i + " tek bir sayidir. while ");
            }
            ++i;
        }


    }
}
