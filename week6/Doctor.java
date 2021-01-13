// Jeongmin Kim 632115503 

package week6;

public class Doctor extends Person {
    String department;
    public Doctor(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public void workDepartment() {
        System.out.println(name + " is working in the department of " + department);
    }
}
