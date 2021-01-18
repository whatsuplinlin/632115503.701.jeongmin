// 632115503 Jeongmin Kim

package week7;

public class Bird extends Pet {
    Boolean canFly;
    String country;

    public Bird(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        System.out.println("My bird");
    }

    public void speak() {
        System.out.println("My bird " + name + " speaks all the time");
    }

    public void checkCountry() {
        System.out.println(name + " flies to " + country);
    }

    public void canFly() {
        System.out.println("Can " + name + " fly? " + canFly);
    }
}
