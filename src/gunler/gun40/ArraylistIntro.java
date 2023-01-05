package gunler.gun40;

import java.util.ArrayList;

public class ArraylistIntro {

    public static void main(String[] args) {

        // Creating Arraylist
        ArrayList<String> nameList = new ArrayList<>();

        nameList.add("Ayse");
        nameList.add("Ahmet");
        nameList.add("Hasan");
        nameList.add("Emine");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(99);
        numbers.add(25);
        numbers.add(50);
        // int value yu arka planda otomatik olarak Integer wrapper objecte cevirdigi icin hata almadan paramete olarak gonderebiliyoruz
        numbers.add(63);
        // arka planda otomatik olarak yapilan islem
        Integer num2 = 35;
        numbers.add(num2);

        // Eger sayi String olarak geliyorsa
        //numbers.add("45"); //error

        Integer num = new Integer("68");
        numbers.add(num);

        // pratik olarak String veriyi Integer object e cevirme yolu
        numbers.add(new Integer("45"));

        System.out.println(nameList.get(0));
        System.out.println(nameList.get(1));
        System.out.println(nameList.get(2));
        System.out.println(nameList.get(3));

        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
        System.out.println(numbers.get(2));
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(4));
        System.out.println(numbers.get(5));
        System.out.println(numbers.get(6));
        //System.out.println(numbers.get(7)); // Error / IndexOutOfBoundsException

        System.out.println("size of nameList : " + nameList.size());
        System.out.println("size of numbersList : "  + numbers.size());

        System.out.println(nameList.toString());
        System.out.println(numbers.toString());

        // toString methodu ile bir list i String object olrak store edebilmk ve tasimak mumkun
        String list1 = nameList.toString();
        String list2 = numbers.toString();

        System.out.println(nameList);
        System.out.println(numbers);

        // String list3 = nameList;
        // String list4 = numbers;

    }
}
