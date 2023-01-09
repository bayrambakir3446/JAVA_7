package gunler.gun40;

import java.util.ArrayList;

public class REmoveInteger {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums.isEmpty() = " + nums.isEmpty());
        System.out.println(nums.size() == 0);
        // System.out.println("nums.size()==0 = " + nums.size() == 0); bunun farki nedir neden konsola yazmiyor
        nums.add(1);
        nums.add(34);
        nums.add(56);
        nums.add(75);
        nums.add(54);
        nums.add(86);
        nums.add(95);

        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums.isEmpty() = " + nums.isEmpty());
        System.out.println(nums.size() == 0);
        System.out.println("!nums.isEmpty() = " + !nums.isEmpty());


        System.out.println("nums.toString() = " + nums.toString());
        nums.remove(5);  // bu sekilde sadece 5. indeksi cikarmis oluyoruz
        System.out.println(nums.toString());
        System.out.println("nums.remove(1) = " + nums.remove(1));// burada sadece elementi donduruyor
        System.out.println("nums.toString() = " + nums.toString());// burada cikarilan elemani gorurum


        //nums.remove(95); / error verir burada bizden object istiyor remove icin
        //Integer num=new Integer(95);// bu sekilde bir object tanimlarsam
// yukaridakini asagida da tanimladigim icin hata veriyor o yuzden // yaptim
        System.out.println("nums.toString() = " + nums.toString());
        // su sekilde de mumkun
        nums.remove(new Integer(95));
        System.out.println(nums.toString());
        ///
        Integer num = 56;
        System.out.println("nums.remove(num) = " + nums.remove(num)); //true

        System.out.println(nums.toString());
        System.out.println("nums.remove(num) = " + nums.remove(num));// false
        System.out.println(nums.toString());

        System.out.println("-------------------------------");
        ArrayList<String> carList = new ArrayList<>();
        carList.add("Ferrari");
        carList.add("BMW");
        carList.add("Mercedes");
        System.out.println("carList.toString() = " + carList.toString());
        carList.set(1, "Opel");
        System.out.println("carList.toString() = " + carList.toString());

    }
}