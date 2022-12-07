package gunler.gun31;

public class String_CharAt {

    public static void main(String[] args) {

        String word = "Computer";
        System.out.println(word.length());
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4));
        System.out.println(word.charAt(5));
        System.out.println(word.charAt(6));
        System.out.println(word.charAt(7));
        // System.out.println(word.charAt(8)); Error // son index = length - 1

        String word2 = "Apple";
        System.out.println(word2.charAt(0));
        if(word2.charAt(0) == 'A'){
            System.out.println("Ilk karakteriniz A dir");
        }else{
            System.out.println("Ilk karakteriniz A degildir");
        }

        String word3 = "civic";
        if(word3.charAt(1)==word3.charAt(3)){
            System.out.println("word3.charAt(1) = " + word3.charAt(1));
            System.out.println("word3.charAt(3) = " + word3.charAt(3));
            System.out.println("Karakterler esittir");
        }else {
            System.out.println("Karakterler esit degildir");
        }
    }
}
