// Jeongmin Kim 632115503

package week6;

public class InheritanceExample {
    public static void main(String[] args) {
        Actor act = new Actor("Daniel", 32, "male");

        act.genre = "fantasy";
        act.introduce();
        act.actGenre();

        Artist art = new Artist("Ball", 20, "male");

        art.genre = "hip hop";
        art.introduce();
        art.playMusic();

        Doctor doc = new Doctor("Strange", 45, "male");

        doc.department = "neurosurgery";
        doc.introduce();
        doc.workDepartment();

        Professor pro = new Professor("Minerva", 63, "female");

        pro.subject = "math";
        pro.introduce();
        pro.teach();

        Soldier sol = new Soldier("Jinny", 28, "female");

        sol.rank = "captain";
        sol.introduce();
        sol.rank();
    }
}
