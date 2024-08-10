package JavaPractice;

import java.util.Scanner;

public class CafeBilling {

    // Define the rates for each item
    static final double TEA_RATE = 10;
    static final double COFFEE_RATE = 20;
    static final double PIZZA_RATE = 80;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the quantity of each item from the user
        System.out.print("Enter the number of teas: ");
        int teaQuantity = scanner.nextInt();

        System.out.print("Enter the number of coffees: ");
        int coffeeQuantity = scanner.nextInt();

        System.out.print("Enter the number of pizzas: ");
        int pizzaQuantity = scanner.nextInt();

        // Calculate the total cost for each item
        double totalTeaCost = teaQuantity * TEA_RATE;
        double totalCoffeeCost = coffeeQuantity * COFFEE_RATE;
        double totalPizzaCost = pizzaQuantity * PIZZA_RATE;

        // Calculate the overall total cost
        double totalCost = totalTeaCost + totalCoffeeCost + totalPizzaCost;

        // Display the results
        System.out.printf("Total cost for teas: %.2f%n", totalTeaCost);
        System.out.printf("Total cost for coffees: %.2f%n", totalCoffeeCost);
        System.out.printf("Total cost for pizzas: %.2f%n", totalPizzaCost);
        System.out.printf("Overall total cost: %.2f%n", totalCost);

        scanner.close();
    }
}

