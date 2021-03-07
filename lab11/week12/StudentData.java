package week12; 

public class StudentData {
    public static void main(String[] args) {
        //Student object include name, age, gpa
        Student std01 = new Student("Mark", 18, 4.00);
        Student std02 = new Student("Jane", 18, 2.20);
        Student std03 = new Student("Peter", 19, 4.00);
        Student std04 = new Student("Mark", 22, 1.75);

        //Write the equal statement to test the objects below
        //name
        System.out.println("Test name of std01 and std02 " + std01.getName().equals(std02.getName()));
        System.out.println("Test name of std01 and std03 " + std01.getName().equals(std03.getName()));
        System.out.println("Test name of std02 and std04 " + std02.getName().equals(std04.getName()));
        System.out.println("Test name of std01 and std04 " + std01.getName().equals(std04.getName()));

        //age
        System.out.println("Test age of std01 and std02 " + std01.getAge().equals(std02.getAge()));
        System.out.println("Test age of std03 and std04 " + std03.getAge().equals(std04.getAge()));
        System.out.println("Test age of std01 and std03 " + std01.getAge().equals(std03.getAge()));

        //gpa
        System.out.println("Test gpa of std01 and std03 " + std01.getGpa().equals(std03.getGpa()));
        System.out.println("Test gpa of std02 and std04 " + std02.getGpa().equals(std04.getGpa()));
        System.out.println("Test gpa of std02 and std03 " + std02.getGpa().equals(std03.getGpa()));
    }
}