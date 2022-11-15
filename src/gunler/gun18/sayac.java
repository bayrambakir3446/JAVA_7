package gunler.gun18;

public class sayac {

    public static void main(String[] args) {
        int sayac = 0;
        int sayac2 = 0;
        for(int i=1; i<=10; i++){
            if(i%2==0){
                sayac++;
            }
            if(i%3==0){
                sayac2++;
            }
        }
        System.out.println("sayac = " + sayac);
        System.out.println("sayac2 = " + sayac2);
    }
}
