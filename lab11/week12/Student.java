package week12; 

public class Student {
    String name;
    Object age;
    Object gpa;

    public Student(String name, Object age, Object gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public Object getAge() {
        return age;
    }

    public Object getGpa() {
        return gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj == this) {
            return true;
        }
        
        return this == ((Student) obj);
    }
}