package gunler.gun17;

public class While2 {
    public static void main(String[] args) {
        // degisken olustur ve baslangic degeri ata
        // condition belirle(true false)
        // degiskenin degerini artir veya azalt


        int a = 0;
        while (a < 5) {
            System.out.println("*");
            a++;
        }
        a = 0;
        while (a < 5) {//2 4
            a++;// 1 3 5
            System.out.println(a);//1 3 5
            a++;//2 4 6
        }
        System.out.println("a = " + a);
        a = 5;// 5 4 3 2 1 ----->0
        while (a > 0) {
            System.out.println(a);// 5 4 3 2 1
            a--;// 4 3 2 1 0
        }
        System.out.println("block disinda a'nin degeri " + a);

    }
}
