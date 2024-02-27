import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfIterations = scanner.nextInt();

        int numberOfSolutions = 0;
      
        for (int i = 0; i < numberOfIterations; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            if (a + b + c >= 2) {
                numberOfSolutions++;
            }
        }

        System.out.println(numberOfSolutions);
    }
}