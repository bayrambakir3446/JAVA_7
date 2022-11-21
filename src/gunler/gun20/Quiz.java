package gunler.gun20;

public class Quiz {
    public static void main(String[] dizi) {
        int a = 10;
        int b = 20;
        int sum = b;// 10+20  a+b 30
        boolean access = a < sum && sum++ >= 21;
        //               10<20 &&  31 >=21
        System.out.println(access);
        // byte short char int  long float double
        long l = 12345678912345l;
        short s = (short) l;
        int i = s;
        float f = s;

        int w = (int) 888.8;
        byte x = (byte) 100L;
        long y = (byte) 100;
        int z = (char) 1000000000000000L;
        System.out.println(10 + 20 + "Eurotech");
        System.out.println("Eurotech" + 10 + 20);
        //                  Eurotech10 +20--->concat


        double d1, d2, d3 = 10.5;
//        System.out.println("d1 = " + d1);


        int a1 = 10;
        int a2 = 3;
        float d4 = 3.0f;
        System.out.println(a1 / a2);
        System.out.println(a1 / d4);
        System.out.println(10.0 / 3);
        System.out.println(10 / 3);
        int i5 = (int) 10.5;

    }


}
