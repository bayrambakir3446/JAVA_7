package gunler.gun18;

public class BolmeLoop {

    public static void main(String[] args) {

        // 1 den 100 e kadar 5 e tam olarak bolunebilen sayilari yazdirin

        for(int i=1; i <=100; i++){
            if(i%5==0){
                System.out.print(i + ",");
            }
        }
        System.out.println();

        // 2. yontem
        for(int i=5; i<=100; i+=5){
            System.out.print(i + ",");
        }

        System.out.println();

        // dongu icerisinde uzunca bir cizgi cizdir

        for(int i=0; i<100; i++){
            System.out.print("-");
        }

    }
}
