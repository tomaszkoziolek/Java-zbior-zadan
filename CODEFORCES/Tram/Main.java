import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numberOfStops = scanner.nextInt();

      int maxCapacity = 0;
      int currentPassengers = 0;
      
      for (int i = 0; i < numberOfStops; i++) {
        int leaving = scanner.nextInt();
        int entering = scanner.nextInt();

        currentPassengers += entering - leaving;

        if (currentPassengers > maxCapacity) {
          maxCapacity = currentPassengers;
        }
      }

      System.out.println(maxCapacity);
    }
}