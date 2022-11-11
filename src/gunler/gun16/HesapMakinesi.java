package gunler.gun16;

public class HesapMakinesi {

    public static void main(String[] args) {

        // 2 sabit deger uzerinden switch ase kullanarak farkli aritmetic islemler yapan bir hesap makinesi olusturun

        int num1 = 10;
        int num2 = 5;
        int sonuc;
        String islemTuru;
        char islem = '+';

        switch(islem){
            case '+':
                islemTuru = "Toplama Islemi";
                sonuc = num1 + num2;
                break;
            case '-':
                islemTuru = "Cikarma Islemi";
                sonuc = num1 - num2;
                break;
            case '*':
                islemTuru = "Carpma Islemi";
                sonuc = num1 * num2;
                break;
            case '/':
                islemTuru = "Bolme Islmei";
                sonuc = num1 / num2;
                break;
            default:
                islemTuru = "Tanimlanamayan Islem";
                sonuc = 0;

        }

        System.out.println(islemTuru + " : " + sonuc);

    }
}
