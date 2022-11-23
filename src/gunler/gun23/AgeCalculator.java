package gunler.gun23;

public class AgeCalculator {

    public static void main(String[] args) {

        // Parametre olarak isim, su anki tarih ve dogum tarihini parametre olarak alip
        // kisinin yasini hesaplayan bir method yaziniz

        ageCalculator("Ahmet",2022,1990);
        ageCalculator("Ayse",2022, 1997);

    }

    public static void ageCalculator(String name, int tarih, int dogumTarihi){
        int age;
        age = tarih - dogumTarihi;
        System.out.println(name + " isimli kisi " + age + " yasindadir.");
    }
}
