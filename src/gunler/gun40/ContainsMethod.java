package gunler.gun40;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsMethod {
    public static void main(String[] args) {
        ArrayList<String>list1=new ArrayList<>();
        list1.add("jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("May");
        System.out.println(list1.toString());
        System.out.println("list1.toString() = " + list1.toString());
        ArrayList<String>list2=list1;// mevcut objecti baska referansla atayabilirim
        System.out.println("list2.toString() = " + list2.toString());
        ArrayList<String>months=new ArrayList<>(list2);// bu da baska bir yol
        System.out.println("months.toString() = " + months.toString());
        System.out.println(months.contains("jan"));// eger bu methodda icerisinde varsa true donderir yani eslesirse
        System.out.println(months.contains("Dec"));//false doner
        System.out.println(months.get(2) == "Mar");//burada 2. indexin mar olup olmadigini kontrol edebiliriz
        System.out.println(months.get(2).equals("Mar"));// bu sekildede bakabiliriz esitlik varmi diye
        System.out.println(months.indexOf("Mar") == 2);// bu sekildede kontrol edebiliriz
        if(months.containsAll(list1)){
            System.out.println("List1 exists in Months");
        }else {
            System.out.println("list1 does not exist in Months");
        }
        ArrayList<String>newList=new ArrayList<>(Arrays.asList("a","b","c"));//bu sekildede yani tek satirda da ArrayList olusturma yontemi
        System.out.println(newList.toString());


    }
}
