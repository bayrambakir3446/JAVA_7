package gunler.gun15;

public class NestedTernary {

    public static void main(String[] args) {

        int x = 4;
        char ch;

        if(x > 2){
            if(x < 5){
                ch = 'A';
            }else{
                ch = 'B';
            }
        }else{
            ch = 'C';
        }
        System.out.println("ch = " + ch);

        // Nested Ternary
        //  (1.Cond)  ?          (true)             : (false)
        //  (1.Cond) ? ((2.Cond ? (true) : (false)) : (false)
        ch = (x > 2) ? ((x < 5) ?  ('A')  :  ('B'))  : ('C');
        System.out.println("ch = " + ch);

        // Buyuk rakami bul
        // Ikili karsilastirma

        int y = 5;
        int z = 10;
        int larger = (y > z) ? y : z;
        System.out.println("larger = " + larger);
        
        int num1 = 15;
        int num2 = 10;
        int num3 = 25;

        //            (1. Condition) ?       (2. Condition)         :       (3. Condition)
        int largest = (num1 > num2) ? ((num1 > num3) ? num1 : num3) : ((num2 > num3) ? num2 : num3);

        System.out.println("largest = " + largest);

    }
}
