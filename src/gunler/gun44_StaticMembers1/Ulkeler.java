package gunler.gun44_StaticMembers1;

public class Ulkeler {
    //Static variable-Class variable
    static int ulkelerSayac;

    //Instance variables
    int dummyCounter;
    String name;
    String ulkeKod;
    int intTelCode;

    public Ulkeler(String name, String ulkeKod, int intTelCode) {
        ulkelerSayac++;//Class member and only one copy is created

        //Instance members and each is created for every single instance-every instance has own copy
        dummyCounter++;
        this.name = name;
        this.ulkeKod = ulkeKod;
        this.intTelCode = intTelCode;
    }

    @Override
    public String toString() {
        return "Ulkeler{" +
                "dummyCounter=" + dummyCounter +
                ", name='" + name + '\'' +
                ", ulkeKod='" + ulkeKod + '\'' +
                ", intTelCode=" + intTelCode +
                '}';
    }
}
