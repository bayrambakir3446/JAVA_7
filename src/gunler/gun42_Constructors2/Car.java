package gunler.gun42_Constructors2;

public class Car {
    String marka;
    String plakasi;

    public Car(String marka, String plakasi) {
        this.marka = marka;
        this.plakasi = plakasi;
    }

    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                ", plakasi='" + plakasi + '\'' +
                '}';
    }
}
