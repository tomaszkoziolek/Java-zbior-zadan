import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numberOfFriends = scanner.nextInt();
      int heaightOfTheFence = scanner.nextInt();

      int minWidthOfTheRoad = 0;

      for (int i = 0; i < numberOfFriends; i++) {
        int friendHeight = scanner.nextInt();

        if (friendHeight > heaightOfTheFence) {
          minWidthOfTheRoad += 2;
        } else {
          minWidthOfTheRoad++;
        }
      }

      System.out.println(minWidthOfTheRoad);
      scanner.close();
    }
}