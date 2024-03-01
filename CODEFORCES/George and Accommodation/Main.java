import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numberOfRooms = scanner.nextInt();

      int counter = 0;

      for (int i = 0; i < numberOfRooms; i++) {
        int numberOfPplAlreadyInTheRoom = scanner.nextInt();
        int roomCapacity = scanner.nextInt();

        if (roomCapacity - numberOfPplAlreadyInTheRoom >= 2) {
          counter++;
        }
      }

      System.out.println(counter);
    }
}