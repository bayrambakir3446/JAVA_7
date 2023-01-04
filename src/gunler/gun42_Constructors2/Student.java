package gunler.gun42_Constructors2;

public class Student {
    int schoolNumber;
    String name;
    String country;
    String city;

    public Student() {
    }

    public Student(int schoolNumber){
        this.schoolNumber = schoolNumber;
    }

    public Student(int schoolNumber, String name) {
        this.schoolNumber = schoolNumber;
        this.name = name;
    }

    public Student(int schoolNumber, String name, String country) {
        this.schoolNumber = schoolNumber;
        this.name = name;
        this.country = country;
    }

    public Student(int schoolNumber, String name, String country, String city) {
        this.schoolNumber = schoolNumber;
        this.name = name;
        this.country = country;
        this.city = city;
    }
}
