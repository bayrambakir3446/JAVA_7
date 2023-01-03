package gunler.gun41_Constructors1;

public class CircleTest {
    public static void main(String[] args) {
        Circle daire1 = new Circle();
       // daire1.radius = 3;
        System.out.println(daire1.getArea());
        double alan = daire1.getArea();
        System.out.println(daire1.radius + " yarıçaplı Dairenin alanı = " + alan);
        System.out.println(daire1.radius + " yarıçaplı Dairenin çevresi = " + daire1.getPerimeter());

        //Object daire2 created by parameterized constructor with the value of radius 3.5
        Circle daire2 = new Circle(3.5);

        System.out.println("Daire2 radius = " + daire2.radius);
        System.out.println(daire2.radius + " yarıçaplı Dairenin alanı = " + daire2.getArea());
        System.out.println(daire2.radius + " yarıçaplı Dairenin çevresi = " + daire2.getPerimeter());


    }
}
