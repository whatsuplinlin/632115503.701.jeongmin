package week9;

public class Testoverride1 {
    public static void main(String[] args) {
        Person person1, person2, person3, person4, person5, person6;
        person1 = new Person("Mark", 2001);
        person2 = new Sheriff("Mateo", 1988, "California");
        person3 = new Teacher("Ball", 1977, "CMU");
        person4 = new PrimeMinister("Tu", 1954, "Thailand");
        person5 = new FootballPlayer("Messi", 1987, "Barcelona football club");
        person6 = new Singer("V", 1995, "pop");

        person1.introduce();
        person2.introduce();
        person3.introduce();
        person4.introduce();
        person5.introduce();
        person6.introduce();
    }
}