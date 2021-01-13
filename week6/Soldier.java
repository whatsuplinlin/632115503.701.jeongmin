// Jeongmin Kim 632115503

package week6;

public class Soldier extends Person {
    String rank;
    public Soldier(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void rank() {
        System.out.println(name + " is " + rank);
    }
}
