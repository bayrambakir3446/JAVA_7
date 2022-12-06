package gunler.gun30;

import java.util.Scanner;

public class RakamToplami {

    public static void main(String[] args) {

        int sonuc  = rakamTopla();

        System.out.println("sonuc = " + sonuc);
    }

    public static int rakamTopla(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayi giriniz!");
        int sayi = sc.nextInt();

       if(sayi>0 && sayi<1000){
           int rakam;
           int toplamRakam = 0;

           while(sayi != 0){
               rakam = sayi % 10;
               toplamRakam += rakam;
               sayi /= 10;
           }

           return toplamRakam;
       }else{
           System.out.println("Sayiniz 1-999 arasinda degildir");
           return -1;
       }
    }
}
