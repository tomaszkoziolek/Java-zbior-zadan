import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int numberOfIterations = scanner.nextInt();

    for (int i = 0; i < numberOfIterations; i++) {
      String input = scanner.next();
      if (input.length() > 10) {
        System.out.println(input.substring(0, 1) + (input.length() - 2) + input.substring(input.length() - 1));
      } else {
        System.out.println(input);
      }
    }
  }
}