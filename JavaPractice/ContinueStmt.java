package JavaPractice;

public class ContinueStmt {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {

            if (i == 2 || i == 4) {

                continue;
            }
            System.out.print(i + " ");
        }
    }
}
