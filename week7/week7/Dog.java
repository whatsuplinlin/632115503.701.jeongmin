// 632115503 Jeongmin Kim

package week7;

public class Dog extends Pet {
    String size;
    Boolean shortHair;

    public Dog(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        System.out.println("My dog");
    }

    public void Run() {
        System.out.println("My dog " + name + " runs to the jungle");
    }

    public void Bark() {
        System.out.println(size + " bark Box Box!!");
    }

    public void shortHair() {
        System.out.println("Does " + name + " have short hair? " + shortHair);
    }
}
