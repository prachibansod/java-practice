package JavaPractice;

final class FinalClass {
    private String message;

    public FinalClass(String message) {
        this.message = message;
    }


    public void displayMessage() {
        System.out.println("Message: " + message);
    }
}


public class FinalClassMain{
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass("Hello, world!");
        finalClass.displayMessage();

         }
}

