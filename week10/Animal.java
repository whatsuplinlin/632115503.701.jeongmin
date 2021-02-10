package week10;

public class Animal {
    public String roar() {
        return "";
    }
}

class Cat extends Animal {
    public String roar() {
        return "Meow Meow";
    }
}

class Dog extends Animal {
    public String roar() {
        return "Box Box";
    }
}

class Fish extends Animal {
    public String roar() {
        return "...";
    }
}