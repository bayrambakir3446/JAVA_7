package gunler.gun14;

public class Switch {
    public static void main(String[] args) {
        // haftanin gunleri pazartesi 1 sali 2 carsamba 3
        int gunSiraNo = 2;
        String gun = "Sali";
        if (gunSiraNo == 1) {
            gun = "Pazartesi";
        } else if (gunSiraNo == 2) {
            gun = "Sali";
        } else if (gunSiraNo == 3) {
            gun = "Carsamba";
        }
        gunSiraNo = 3;
        switch (gunSiraNo) {// 2
            case 5:
                System.out.println("gunlerden pazartesi");
                break;
            case 2:
                System.out.println("gunlerden sali");
                break;
            case 3:
                System.out.println("gunlerden carsamba");
                break;
            case 4:
                System.out.println("gunlerden persembe");
                break;
            case 15:
                System.out.println("gunlerden cuma");
                break;
            case 7:
                System.out.println("gunlerden pazar");
                break;
            case 6:
                System.out.println("gunlerden cumartesi");
                break;
            default:
                System.out.println("gun sira nonun degeri olmadi");
        }
        System.out.println("switch disindayiz");
        boolean haftaSonu = false;
        System.out.println("5>8 = " + (5 > 8));
        System.out.println(gunSiraNo == 1);
        gunSiraNo = 1;
        switch (gunSiraNo) {
            case 50:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("hafta ici");

                break;

            case 70:
            case 6:
                System.out.println("happy weekend");
                break;
            default:
                System.out.println("ne hafataici ne de haftasonu");
        }
        System.out.println("block disindayiz");


    }
}
