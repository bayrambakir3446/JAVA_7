package gunler.gun16;

public class UniqueNumber {

    public static void main(String[] args) {

        // Write a program that finds the unique number among three numbers
        // 3 sayi icerisinde farkli sayi adedini bulan bir program yaziniz

        int a = 1;
        int b = 2;
        int c = 3;
        int sonuc = 0;
        
        if(a == b && a == c){
            sonuc = 1;
        }else if(a == b || a == c || b == c){
            sonuc = 2;
        }else{
            sonuc = 3;
        }

        System.out.println("sonuc = " + sonuc);

        sonuc = a == b && b == c ? 1 : a == b || a == c || b == c ? 2 : 3;

        System.out.println("sonuc = " + sonuc);
    }

}
