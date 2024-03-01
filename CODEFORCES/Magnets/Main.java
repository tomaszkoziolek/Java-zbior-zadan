import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numberOfMagnets = scanner.nextInt();

      int counter = 1;
      int currentMagnet = scanner.nextInt();
      
      for (int i = 1; i < numberOfMagnets; i++) {
        int checker = scanner.nextInt();
        if (checker != currentMagnet) {
          counter++;
          currentMagnet = checker;
        }
      }

      System.out.println(counter);
    }
}