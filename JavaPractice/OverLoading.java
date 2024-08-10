package JavaPractice;

class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class OverLoading {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        System.out.println("Sum of 5 and 10: " + math.add(5, 10));
        System.out.println("Sum of 5, 10, and 15: " + math.add(5, 10, 15));
        System.out.println("Sum of 2.5 and 3.5: " + math.add(2.5, 3.5));
    }
}
