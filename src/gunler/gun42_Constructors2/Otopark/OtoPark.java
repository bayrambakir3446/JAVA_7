package gunler.gun42_Constructors2.Otopark;

import java.util.ArrayList;

public class OtoPark {
    String name;
    String adress;
    ArrayList<Car> arabalar = new ArrayList<>();

    public OtoPark(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public void arabaEkle(Car araba){
        System.out.println(araba.marka + " marka " + araba.plakasi + " plakalı araç otoparka giriş yaptı.");
        this.arabalar.add(araba);

    }
    public void arabaListesi(){
        System.out.println(this.name + " park etmiş arabalar listesi");
        System.out.println("------------------------------------------");
        System.out.println("Otoparkta şuanda " + arabalar.size() +" adet araba var.");
        for (Car araba:this.arabalar){
            System.out.println(araba);
        }
    }
    @Override
    public String toString() {
        return "OtoPark{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }
}
