package gunler.gun23;

public class LocalVariable {

    public static void main(String[] args) {

        calculation1(5,10);
        calculation2(5,10);

        // local var
        int num1 = 1;
        int num2 = 2;
        int result = 10;
    }
    public static void calculation1(int num1, int num2){
        // local var
        int result;
        result = num1 + num2;
        System.out.println(result);
    }
    public static void calculation2(int num1, int num2){
        // local var
        int result;
        result = num1 + num2;
        System.out.println(result);
    }
}
