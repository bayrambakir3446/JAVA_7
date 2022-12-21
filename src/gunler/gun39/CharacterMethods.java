package gunler.gun39;

public class CharacterMethods {

    public static void main(String[] args) {

        System.out.println(Character.isAlphabetic('c'));
        System.out.println(Character.isAlphabetic('8'));
        System.out.println(Character.isAlphabetic(' '));

        System.out.println(Character.isLetter('G'));
        System.out.println(Character.isLetter('9'));
        System.out.println(Character.isLetter('%'));

        System.out.println(Character.isDigit('3'));
        System.out.println(Character.isDigit('J'));
        System.out.println(Character.isDigit(' '));

        String str = "Java2022";

        System.out.println(Character.isAlphabetic(str.charAt(0)));
        System.out.println(Character.isDigit(str.charAt(4)));
        System.out.println(Character.isLetter(str.charAt(3)));
        System.out.println(Character.isDigit(str.charAt(3)));

    }
}
