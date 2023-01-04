package gunler.gun42_Constructors2;

public class Box {
    int width;
    int length;

    Box(){
        System.out.println("Default constructor called.");
    }

    Box(int w, int l){
        System.out.println("Two parameters constructor.");
        this.width = w;
        this.length = l;
    }
   /* public static void main(String[] args) {
        Box box; //declaration
        box = new Box(); //Object created.

        String str;//Declaration
        str = "Java"; //Assignment

        int sayiA; //Declaration
        sayiA = 12;  //Assignment

        Box box1 = new Box(); //Declaration and creation in same row.

        box.length = 10;
        box.width = 25;

        box1.length = 23;
        box1.width = 56;

    }*/

}
