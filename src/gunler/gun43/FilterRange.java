package gunler.gun43;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterRange {

    public static void main(String[] args) {

        // Bir Liste icerisinde range olarak verilen araliktaji sayilari cikaran bir method yaziniz

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,5,7,2,8,9,12,15,11,9,4));

        System.out.println(filterRange(numbers, 5, 10).toString());

    }

    public static ArrayList filterRange(ArrayList<Integer> list, int min, int max){

        ArrayList<Integer> temp = new ArrayList<>();

        for(Integer num : list){
            if(num >= min && num <= max){
                temp.add(num);
            }
        }

        list.removeAll(temp);

        return list;
    }

}
