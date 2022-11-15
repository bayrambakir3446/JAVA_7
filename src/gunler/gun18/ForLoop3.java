package gunler.gun18;

public class ForLoop3 {

    public static void main(String[] args) {

        int sonNokta = 30;
        int toplam = 0;

        for(int i=1; i < sonNokta; i+=2){
            toplam += i;
        }
        // 1 + 3 + 5 + 7 + 9 .... = 225
        System.out.println("toplam = " + toplam);
    }
}
