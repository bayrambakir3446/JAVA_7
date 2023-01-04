package gunler.gun42_Constructors2;

public class Box {
    int width;
    int length;

    Box(){
        System.out.println("Default constructor called.");
    }

    Box(int w, int l){
        System.out.println("Two parameters constructor.");
        this.width = w; //this keyword represent the current object being created
        this.length = l;
    }

    public int areaCalculate(){
        return this.width * this.length;
      //  System.out.println("Alan = " + (this.width * this.length));
    }

    public void showInfo(){
        System.out.println("Kutunun en değeri   = " + this.width);
        System.out.println("Kutunun boy değeri  = " + this.length);
        System.out.println("Kutunun alanı       = " + this.areaCalculate());
    }

    public String strShowInfo(){
        String str = "";
        str += "Kutunun en değeri   = " + this.width + "\n";
        str += "Kutunun boy değeri  = " + this.length + "\n";
        str += "Kutunun alanı       = " + this.areaCalculate();
        return  str;
    }

    public String toString(){
        String str = "";
        str += "Kutunun en değeri   = " + this.width + "\n";
        str += "Kutunun boy değeri  = " + this.length + "\n";
        str += "Kutunun alanı       = " + this.areaCalculate();
        return  str;
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
