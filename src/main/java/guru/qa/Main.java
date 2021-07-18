package guru.qa;

public class Main {

    public static void main(String[] args) {
        Cat liza = new Cat ("Green", "Liza", false, 6);
        liza.displayInfo();

        Cat tom = new Cat();
        tom.coatColor = "Blue";
        tom.name = "Tom";
        tom.sex = true;
        tom.age = 1;
        tom.displayInfo();

        Cat zhora = new Cat("Zhora", 2);
        zhora.displayInfoForZhora();
    }
}