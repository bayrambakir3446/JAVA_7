package gunler.gun15;

public class TernaryOperator {

    public static void main(String[] args) {

        int x,y;

        x = 20;
        
        // Condition false dondugu icin : statement isleme alindi ve 90 assign edildi
        y = (x == 1) ? 61 : 90;
        System.out.println("y = " + y); // 90

        // Condition true dondugu icin ? statement isleme alindi ve 61 assign edildi
        y = (x == 20) ? 61 : 90;
        System.out.println("y = " + y); // 61

        System.out.println("---------------");
        
        boolean b;
        String a = "5";

        b = (a == "5") ? true : false;

        System.out.println("Condition is  = " + b);
        
    }
}
