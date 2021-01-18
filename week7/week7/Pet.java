// 632115503 Jeongmin Kim

package week7;

public class Pet {
    String name;
    String species;
    String color;
    int age;

    public Pet() {

    }

    public Pet(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
    }

    public void petData() {
        System.out.println("Name: " + name + "  Species: " + species + "  Color: " + color + "  Age: " + age);
    }
}
