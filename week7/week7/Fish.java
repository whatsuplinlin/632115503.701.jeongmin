// 632115503 Jeongmin Kim

package week7;

public class Fish extends Pet {
    String size;
    Boolean saltWater;
    String swimSpeed;

    public Fish(String name, String species, String color, int age) {
        this.name = name;
        this.species = species;
        this.color = color;
        this.age = age;
        System.out.println("My fish");
    }

    public void swimToSea() {
        System.out.println("Can my " + size + " fish " + name + " swim to the sea? " + saltWater);
    }

    public void swimFast() {
        System.out.println("Swim " + swimSpeed + " .oO° .oO°");
    }
}
