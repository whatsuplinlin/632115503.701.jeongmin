// Jeongmin Kim 632115503

package week6;

public class Actor extends Person {
    String genre;
    public Actor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void actGenre() {
        System.out.println(name + " is acting in a " + genre + " movie");
    }
}
