package gunler.gun19;

public class ContinueLoop {

    public static void main(String[] args) {

        for(int i=0; i<=100; i++){
            if(i>25 && i<35){
                continue;
            }
            System.out.println(i);
        }
    }
}
