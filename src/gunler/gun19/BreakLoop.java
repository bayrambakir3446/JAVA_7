package gunler.gun19;

public class BreakLoop {

    public static void main(String[] args) {

        for(int i=10; i<=100; i++){
            if(i%17==4){
                System.out.println("Conditiona uyan ilk rakam : " + i );
                break;
            }
        }
    }
}
