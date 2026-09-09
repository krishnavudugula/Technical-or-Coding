package NPTEL_JAVA.Assignments;

class Animal {
    Animal() {
        System.out.println("Animal constructor");
    }
}

class Dog extends Animal {
    Dog() {
        System.out.println("Dog constructor");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Dog d = new Dog();   //Base class constructor will be called followed by the derived class constructor.
    }
}
