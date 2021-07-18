package guru.qa;

public class Cat {

    String coatColor;
    String name;
    boolean sex; // false - girl, true -  man
    int age;

    Cat(String a, String b,  boolean t, int f) {
        coatColor  = a ;
        name = b ;
        sex = t;
        age = f;
    }

    Cat() {
    }

    Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo(){
        System.out.printf("Coat color " + coatColor, " cat name " + name, " sex cat " + sex, " age cat" + age);
    }

    void displayInfoForZhora() {
        System.out.printf( " cat name " + name, " age cat" + age);
    }
}
