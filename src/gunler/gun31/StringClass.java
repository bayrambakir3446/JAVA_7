package gunler.gun31;

public class StringClass {

    public static void main(String[] args) {
        
        // 1. yontem String Literal ile object create etme
        String s = "Hello";
        System.out.println("str = " + s);
        
        // 2. yontem new keyword ile object create etme
        String s2 = new String("Hello");
        System.out.println("str2 = " + s2);

        String str1 = new String("EuroStudy");
        String str2 = "EuroStudy";
        String str3 = "EuroStudy";
        String str4 = new String("EuroStudy");

        System.out.println(str1==str2); // false
        System.out.println(str1==str3); // false
        System.out.println(str1==str4); // false
        System.out.println(str2==str3); // true
        System.out.println(str2==str4); // false
        System.out.println(str3==str4); // false

    }
}
