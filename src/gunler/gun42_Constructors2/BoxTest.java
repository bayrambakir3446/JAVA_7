package gunler.gun42_Constructors2;

public class BoxTest {
    public static void main(String[] args) {
        Box kutu = new Box(); //Creating object with default-no-argument constructor
        System.out.println("kutu.width = " + kutu.width);
        System.out.println("kutu.length = " + kutu.length);

        Box kutu1 = new Box(23,45);

        System.out.println("kutu1.width = " + kutu1.width);
        System.out.println("kutu1.length = " + kutu1.length);

        System.out.println("kutu1 Alan hesaplaması = " + kutu1.areaCalculate());
        System.out.println("kutu Alan hesaplaması= " + kutu.areaCalculate());

/*
       kutu1.showInfo();
       String bilgi = kutu1.strShowInfo();
       System.out.println(bilgi);*/

        System.out.println(kutu1);
        System.out.println(kutu);

        kutu.width = 23;
        kutu.length = 45;
        System.out.println(kutu==kutu1); //Reference type cannot be compared with == operator.
        boolean esitmi =  kutu1.esitMi(kutu); //Passing object to method.

        System.out.println("esitmi = " + esitmi);

        Box kutu2 = new Box(kutu1); //Passing object to constructor- Creating object with the passing object properties

        kutu2.showInfo();

        System.out.println("kutu2.esitMi(kutu1) = " + kutu2.esitMi(kutu1));
    }
}
