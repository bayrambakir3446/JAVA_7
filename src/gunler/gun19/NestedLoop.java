package gunler.gun19;

public class NestedLoop {

    public static void main(String[] args) {

        System.out.println("Dis dongu baslangic");

        for(int i=1; i<=5; i++){

            System.out.println("Dis dongu : " + i);

            for(int j=1; j<=5; j++){

                System.out.println("Ic dongu : " + j);
            }
        }
        System.out.println("Dis dongu cikis");

//        Dis dongu baslangic

//        Dis dongu : 1
//        Ic dongu : 1
//        Ic dongu : 2
//        Ic dongu : 3
//        Ic dongu : 4
//        Ic dongu : 5

//        Dis dongu : 2
//        Ic dongu : 1
//        Ic dongu : 2
//        Ic dongu : 3
//        Ic dongu : 4
//        Ic dongu : 5

//        Dis dongu : 3
//        Ic dongu : 1
//        Ic dongu : 2
//        Ic dongu : 3
//        Ic dongu : 4
//        Ic dongu : 5

//        Dis dongu : 4
//        Ic dongu : 1
//        Ic dongu : 2
//        Ic dongu : 3
//        Ic dongu : 4
//        Ic dongu : 5

//        Dis dongu : 5
//        Ic dongu : 1
//        Ic dongu : 2
//        Ic dongu : 3
//        Ic dongu : 4
//        Ic dongu : 5

//        Dis dongu cikis
    }
}
