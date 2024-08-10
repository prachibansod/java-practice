package JavaPractice;

class StaticBlockExample {
    static int staticVar;
    static String staticString;

    static {
        staticVar = 10;
        staticString = "Hello, World!";
        System.out.println("Static block executed");
    }

    static void displayValues() {
        System.out.println("staticVar: " + staticVar);
        System.out.println("staticString: " + staticString);
    }
}

public class StaticBlock {
    public static void main(String[] args) {
        StaticBlockExample.displayValues();
    }
}


