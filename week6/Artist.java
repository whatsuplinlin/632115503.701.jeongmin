// Jeongmin Kim 632115503

package week6;

public class Artist extends Person {
    String genre;
    public Artist(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void playMusic() {
        System.out.println(name + " is playing " + genre + " music");
    }
}
