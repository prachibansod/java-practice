package JavaPractice;

class Parent {

    void regularMethod() {
        System.out.println("This is a regular method in Parent class.");
    }

    final void finalMethod() {
        System.out.println("This is a final method in Parent class.");
    }
}

// Subclass inheriting from Parent
class Child extends Parent {
    // Attempting to override the final method will cause a compilation error
    // @Override
    // void finalMethod() { }
}

public class FinalMethod {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.regularMethod();
        parent.finalMethod();

        Child child = new Child();
        child.regularMethod();
        child.finalMethod();
    }
}
