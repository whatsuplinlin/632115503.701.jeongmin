class A {

}

class B {

}

class C extends B{

}

public class InstanceOfDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        Object c = new C();
        // Test the instance of object and class
        System.out.println(c instanceof B);
    }
}