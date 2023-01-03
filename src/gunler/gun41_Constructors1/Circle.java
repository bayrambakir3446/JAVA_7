package gunler.gun41_Constructors1;

public class Circle {
   double radius;

   //No-argument Constructor
   Circle(){
       System.out.println("Default no-argument constructor called/invoked");
       radius = 1;
   }

   //Parameter constructor
   Circle(double yariCap){
       System.out.println("Parameterize constructor called/invoked- value of = " + yariCap);
       radius = yariCap;
   }

  /* double getArea(){
      double area = radius * radius * Math.PI;
   return area;
   }*/
   double getArea(){
      return radius * radius * Math.PI;
   }

   double getPerimeter(){
      return 2 * radius * Math.PI;
   }

}
