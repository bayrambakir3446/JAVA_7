package gunler.gun23;

public class MultipleArgument {

    public static void main(String[] args) {

        calculation(10,5);
        calculation(5,10);

        // argument sayisi birebir eslesmeli
        // calculation(10);
        // calculation(10,5,5);
    }

    public static void calculation(int num1, int num2){
        int total;
        total = num1 + num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("toplam deger : " + total);
    }
}
