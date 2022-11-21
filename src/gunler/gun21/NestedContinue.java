package gunler.gun21;

public class NestedContinue {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            System.out.println("outer block");
            if(i==2){
                continue;
            }
            for (int n = 0; n < 4; n++) {
                System.out.print(n);
            }
            System.out.println();
            System.out.println("outer block sonu");
            System.out.println();
        }
        System.out.println("nested disindayiz");
        // outer block
        // 0123
        // outer block sonu

        //outer block
        //0123
        //outer block sonu

        //outer block
        // nested disindayiz




    }
}
