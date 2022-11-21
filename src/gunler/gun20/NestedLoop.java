package gunler.gun20;

public class NestedLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {

            System.out.println(3);

            for (int n = 0; n < 3; n++) {

                System.out.println("icteki loop");

            }

            System.out.println("distaki loop sonu");
            System.out.println();
        }
        // 3
        //icteki loop
        //icteki loop
        //icteki loop
        //distaki loop sonu
        //
        //3
        //icteki loop
        //icteki loop
        //icteki loop
        //distaki loop sonu

    }
}
