import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfHouses = scanner.nextInt();
    int numberOfTasks = scanner.nextInt();

    int currentHouse = 1;

    long timeCount = 0;

    for (int i = 0; i < numberOfTasks; i++) {
      int currentTask = scanner.nextInt();
      if (currentTask == currentHouse) {
        continue;
      } else if (currentTask > currentHouse) {
        timeCount += currentTask - currentHouse;
        currentHouse = currentTask;
      } else {
        timeCount += numberOfHouses - currentHouse + currentTask;
        currentHouse = currentTask;
      }
    }

    System.out.println(timeCount);
  }
}