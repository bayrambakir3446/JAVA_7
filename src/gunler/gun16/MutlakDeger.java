package gunler.gun16;

public class MutlakDeger {

    public static void main(String[] args) {

        // Bir sayinin mutlak degerini ternary operator
        // kullanarak bulan bir program yaziniz

        int num = -5235;
        
        int mutlakDeger = num > 0 ? num : -num;

        System.out.println("mutlakDeger = " + mutlakDeger);

    }
}
