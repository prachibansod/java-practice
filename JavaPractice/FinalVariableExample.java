package JavaPractice;

public class FinalVariableExample {
    public static void main(String[] args) {
        final int MAX_VALUE = 100;

        System.out.println("Maximum value: " + MAX_VALUE);

        // Using final variables in a loop
        final int LIMIT = 5;
        for (int i = 1; i <= LIMIT; i++) {
            System.out.println("Count: " + i);
        }
    }
}
