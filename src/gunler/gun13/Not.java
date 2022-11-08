package gunler.gun13;

public class Not {
    public static void main(String[] args) {

        // 100 - 85 ----> super
        // 0 - 30 cok calismak gerek
        // 30 - 50  biraz daha gayret
        //   50 70
        // 70  85
        int not = 40;
        if (not >= 85 && not < 100) {
            System.out.println("calismak gerek ");
        } else if (not >= 70 && not < 85) {
            System.out.println("birazdaha gayret");
        } else if (not >= 50 && not < 70) {
            System.out.println("iyi daha guzel olacak");
        } else if (not >= 30 && not < 50) {
            System.out.println("bravo");
        } else if (not >= 0 && not <= 29) {
            System.out.println("super!!!!!");
        }
        not = -145;
        char derece = 'A';
        if (not >= 0 && not < 101) {
            System.out.println("distaki if body ");//
            if (not >= 85) {
                derece = 'A';
                System.out.println("super!!!!!");//
            } else if (not >= 70) {
                derece = 'B';
                System.out.println("bravo");
            } else if (not >= 50) {
                derece = 'C';
                System.out.println("iyi daha guzel olacak");
            } else if (not >= 30) {
                derece = 'D';
                System.out.println("biraz gayret");
            } else if (not >= 0) {
                derece = 'E';
                System.out.println("calismak gerek");
            }
            System.out.println("distaki if block sonu");   //
        }else if(not>100){
            System.out.println("yalnis bir sayi girdiniz.");
        }else{
            System.out.println("pozitif ve 0-100 arasi bir sayi lutfen");
        }
        System.out.println("aldiginiz notun derecesi  = " + derece);
        System.out.println("if ler bitti");//
    }
}
