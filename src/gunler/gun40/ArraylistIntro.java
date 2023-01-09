package gunler.gun40;

import java.util.ArrayList;

public class ArraylistIntro {
    public static void main(String[] args) {
        //creating arraylist
        ArrayList<String> nameList = new ArrayList<>();
        ArrayList<String> namelist1 = new ArrayList<>();
        /*
        ArrayList() Creates an empty list.
        +add(o: E): void                       Appends a new element o at the end of this list.
        +add(index: int, o: E): void      Adds a new element o at the specified index in this list.
        +clear(): void Removes all the elements from this list.
        +contains(o: Object): Boolean  Returns true if this list contains the element o.
        +get(index: int): E                     Returns the element from this list at the specified index.
        +indexOf(o: Object): int           Returns the index of the first matching element in this list.
         +isEmpty(): Boolean                Returns true if this list contains no elements
         +lastIndexOf(o: Object): int     Returns the index of the last matching element in this list.
         +remove(o: Object): Boolean   Removes the first element o from this list. Returns true
          if an element is removed.
          +size(): int          Returns the number of elements in this list.
          +remove(index: int): Boolean      Removes the element at the specified index. Returns true  if
          an element is removed.
+set(index: int, o: E): E           Sets the element at the specified index.



         */
        nameList.add("Ahmet ");
        nameList.add("Ayse");
        nameList.add("hasasn");
        nameList.add("Emone");
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(99);
        numbers.add(25);
        numbers.add(50);
        numbers.add(63);
        //numbers.add("45"); burada hata veriyor ama method olarak yazabiliriz
        numbers.add(new Integer("45")); //seklinde yazabilirim yani pratikte string veriyi integer object e cevirme  yolu
        //objecti degisken olarakda atayabilirim
        Integer num=new Integer("68");  //yani objecti burada da yukaridada create edilebilir
        numbers.add(num);
        //int value yu rka planda otomotik olaarak Integer wrapper objecte cevirdigi
        // icin hata almadan parametre olarak gonderebiliyoruz
        numbers.add(63);
        //aslinda arka planda otomotik olarak yapilan islem
        Integer num2=35;
        numbers.add(num2);

        //datayi bir listeye eklemenin yollari bunlardir
        //yazalim
        System.out.println("nameList.get(2) = " + nameList.get(2));
        System.out.println("nameList.get(0) = " + nameList.get(0));
        System.out.println("nameList.get(1) = " + nameList.get(1));
        System.out.println("nameList.get(3) = " + nameList.get(3));
        System.out.println("numbers.get(0) = " + numbers.get(0));
        System.out.println("numbers.get(1) = " + numbers.get(1));
        System.out.println("numbers.get(2) = " + numbers.get(2));
        System.out.println("numbers.get(3) = " + numbers.get(3));
        System.out.println("numbers.get(4) = " + numbers.get(4));
        System.out.println("numbers.get(5) = " + numbers.get(5));
        System.out.println("numbers.get(6) = " + numbers.get(6));
        System.out.println("numbers.get(7) = " + numbers.get(7));
       // System.out.println("numbers.get(0) = " + numbers.get(8));
        //System.out.println("numbers.get(0) = " + numbers.get(8)); IndexOutBounds
        System.out.println("nameList.size() = " + nameList.size());//buradan da size ini kontrol edebiliriz
        System.out.println("nameList.toString() = " + nameList.toString());// liste halinde alabilmek icin isim yazip
        // . yapip toString yapinca Listeyi String olarak veriyor
        // hatta integer degerleri de veriyor
        System.out.println("numbers.toString() = " + numbers.toString()); // burada goruldugu gibi
        System.out.println("nameList = " + nameList);// aslinda buradada liste halinde veriyor yalniz arrayde vermiyor
        // ama burada donen String olarak donmuyormus
        System.out.println("numbers = " + numbers); // consolda bastirmakda bir problem yok ama Stringe cevirip manipilasyon yapmak icin
        String list1=nameList.toString(); //bu sekilde atamamiz lazim
        String list2=numbers.toString(); // bu sekilde cevirip manipule edebiliriz

    }
}
