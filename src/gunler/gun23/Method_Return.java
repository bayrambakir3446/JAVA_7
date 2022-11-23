package gunler.gun23;

public class Method_Return {

    public static void main(String[] args) {

       int result = calculation(10,20);
       System.out.println("total = " + result);

       System.out.println(calculation(15,25));
        
    }
    public static int calculation(int num1, int num2){
        int total;
        total = num1 + num2;

        return total;
    }
}
