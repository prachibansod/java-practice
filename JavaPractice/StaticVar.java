package JavaPractice;

class Counter {
    static int count = 0;

    Counter() {
        count++; // Increment the static variable
    }

    static void displayCount() {
        System.out.println("Count: " + count);
    }
}

public class StaticVar {
    public static void main(String[] args) {
        // Create instances of Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        // Display the count
        Counter.displayCount();
    }
}


