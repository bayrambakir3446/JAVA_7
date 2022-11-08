package gunler.gun13;

public class ElseIf {
    public static void main(String[] args) {
        int numara = -5;
        if (numara > 0) {
            System.out.println("numara 0 dan buyuktur");
        } else if (numara == 0) {
            System.out.println("numara 0 a esittir.");
        } else {
            System.out.println("numara 0 dan kucuktur.");
        }
        System.out.println("merhaba java");
        numara = 50;
        if (numara > 100) {
            System.out.println("numara 100 den buyuktur.");
        } else if (numara > 70) {
            System.out.println("numara 70 den buyuktur");
        } else if (numara > 40) {
            System.out.println("numara 40 dan buyuktur");
        } else if (numara > 20) {
            System.out.println("numara 20 den buyuktur.");
        } else if (numara % 2 == 0) {
            System.out.println("numara cift sayidir.");
        }
        System.out.println("if bitti.");
        numara = 50;
        if (numara > 20) {
            System.out.println("numara 20 den buyuktur.");
        }

        if (numara > 40) {
            System.out.println("numara 40 dan buyuktur");
        }

        if (numara % 2 == 0) {
            System.out.println("numara cift sayidir.");
        }

        if (numara > 70) {
            System.out.println("numara 70 den buyuktur");
        }


    }
}
