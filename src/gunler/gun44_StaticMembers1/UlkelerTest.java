package gunler.gun44_StaticMembers1;

public class UlkelerTest {
    public static void main(String[] args) {
        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);

        Ulkeler ulke1 = new Ulkeler("Türkiye","TR",90);
        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);

        Ulkeler ulke2 = new Ulkeler("Almanya","D",49);
        Ulkeler ulke3 = new Ulkeler("Amerika B.Dev.","USA",1);

        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);
        System.out.println(ulke1);
        System.out.println(ulke2);
        System.out.println(ulke3);

        Ulkeler ulke4 = new Ulkeler("İngiltere","GB",48);
        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);

        System.out.println("ulke1.ulkelerSayac = " + ulke1.ulkelerSayac);

        System.out.println("ulke3.ulkelerSayac = " + ulke3.ulkelerSayac);

        System.out.println("ulke1.name = " + ulke1.name);
        System.out.println("ulke2.name = " + ulke2.name);

        ulke4.ulkelerSayac = 345;

        System.out.println("ulke1.ulkelerSayac = " + ulke1.ulkelerSayac);
        System.out.println("ulke3.ulkelerSayac = " + ulke3.ulkelerSayac);

        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);
        ulke4.dummyCounter = 23;
        System.out.println("ulke4.dummyCounter = " + ulke4.dummyCounter);
        System.out.println("ulke3.dummyCounter = " + ulke3.dummyCounter);

        Ulkeler ulke5 = new Ulkeler("Hindistan","H",56);
        System.out.println("ulke5.ulkelerSayac = " + ulke5.ulkelerSayac);//Tercih edilmeyen yöntem
        System.out.println("Ulkeler.ulkelerSayac = " + Ulkeler.ulkelerSayac);//Doğru erişim yöntemi
    }
}
