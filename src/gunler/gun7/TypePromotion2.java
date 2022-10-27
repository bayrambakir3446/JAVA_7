package gunler.gun7;

public class TypePromotion2 {

    public static void main(String[] args) {
        
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.4f;
        double d = 0.25353;

        double result = (f * b) + (i / c) + (d * s);
        System.out.println("result = " + result);
        int result2 = (int) result;
        System.out.println("result2 = " + result2);

        /////////////

        int i1 = 5;
        float f1 = 15.5f;
        double d1 = 20.5;
        long l1 = 20898798798798797l;

        float result3 = f1 + i1;
        long result4 = l1 + i1;
        double result5 = d1 + f1;

        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
        System.out.println("result5 = " + result5);



        char sembol1 = 'A';
        char sembol2 = 'a';
        char yeniSembol = (char) (sembol1+1);
        System.out.println("sembol = " +  sembol1);
        System.out.println("sembol2 = " +  sembol2);
        System.out.println("yeniSembol = " + yeniSembol);
        char sembol = 127;
        int testInt = 127;
        double testDouble = 127;
        String testString = "127";
        System.out.println("sembol = " + sembol);
        System.out.println("testInt = " + testInt);
        System.out.println("testDouble = " + testDouble);
        System.out.println("testString = " + testString);
        char sembol3 =  223;
        System.out.println("sembol3 = " + sembol3);
        char sembol4 = 'ß';
        System.out.println("\"sembol4\" = " + sembol4);
        // UNICODE yazimi   -- U+0027
        char sembol5 = 0x0027;
        System.out.println("sembol5 = " + sembol5);
        // DECIMAL Deger ile yazimi
        char sembol6 = 39;
        System.out.println("sembol6 = " + sembol6);
        double a, bc;
        int te1s2243_$42t1=12;
        System.out.println(te1s2243_$42t1);

        String name="Talha", surname;
        surname ="jhbjb";
        int num3=7, num4;
        num4=9;
    }
}
