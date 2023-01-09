package gunler.gun40;

import java.util.ArrayList;

public class Cities {
    public static void main(String[] args) {
        ArrayList<String>cities=new ArrayList<>();
        cities.add("london");
        cities.add("Berlin");
        cities.add("Moscow");
        cities.add("New York");
        cities.add("Istanbul");
        cities.add("Amsterdam");
        cities.add("Paris");
        for (int i=0;i<cities.size();i++){
            System.out.println("cities.get(i) = " + cities.get(i));

        }
        for (String city:cities){
            System.out.println(city);
        }
        System.out.println(cities.toString());
        System.out.println("simdi remove set ve get farkini gorelim");
        cities.remove("Moscow");
        System.out.println(cities.toString());
        cities.set(2,"California");
        System.out.println("yani set ikinci indeksdeki new yorku kaldirip yerine california yi koyar");
        System.out.println(cities.toString());
        cities.add(2,"New jersey");
        System.out.println(cities.toString());// ekleme yapar
        System.out.println("add ise ekleme yapar ve kaydirir indislri bir sira");
        int index=cities.indexOf("Istanbul");
        System.out.println("index = " + index); //bu sekilde hangi index de oldugu gorulur

        cities.clear();
        System.out.println(cities.size());
        System.out.println("cities.isEmpty() = " + cities.isEmpty());

    }
}
