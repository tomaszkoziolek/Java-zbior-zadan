import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int number = scanner.nextInt();
      int numberOfIterations = scanner.nextInt();
      scanner.close();

      for (int i = 0; i < numberOfIterations; i++) {
        if (number % 10 == 0) {
          number /= 10;
        } else {
          number--;
        }
      }

      System.out.println(number);
    }
}