// 632115503 Jeongmin Kim

package week7;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Lucky", "Pooddle", "brown", 2);

        dog.size = "Small";
        dog.shortHair = true;
        dog.petData();
        dog.Run();
        dog.Bark();
        dog.shortHair();

        System.out.println(" ");

        Fish fish = new Fish("Coco", "Goldfish", "orange", 1);

        fish.size = "small";
        fish.saltWater = false;
        fish.swimSpeed = "fast";
        fish.petData();
        fish.swimToSea();
        fish.swimFast();

        System.out.println(" ");
        
        Bird bird = new Bird("Jay", "Parrot", "green", 3);

        bird.canFly = true;
        bird.country = "Korea";
        bird.petData();
        bird.speak();
        bird.checkCountry();
        bird.canFly();
    }
}
