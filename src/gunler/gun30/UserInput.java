package gunler.gun30;;

// Oncelikle Scanner class import edilmeli
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {

        // Ikinci olarak Scanner objecti create et
        Scanner input = new Scanner(System.in);

        // Ucuncu olarak girdi yapacagim data tipine uygun methodu cagir
        int girdi = input.nextInt();

        System.out.println("girdi = " + girdi);

    }
}
