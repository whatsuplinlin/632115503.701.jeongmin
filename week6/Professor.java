// Jeongmin Kim 632115503

package week6;

public class Professor extends Person {
    String subject;
    public Professor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void teach() {
        System.out.println(name + " is teaching " + subject);
    }
}
