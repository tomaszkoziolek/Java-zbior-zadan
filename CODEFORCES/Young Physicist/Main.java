import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numberOfIterations = scanner.nextInt();

      int sumX = 0;
      int sumY = 0;
      int sumZ = 0;
      
      for (int i = 0; i < numberOfIterations; i++) {
        sumX += scanner.nextInt();
        sumY += scanner.nextInt();
        sumZ += scanner.nextInt();
      }
      
      System.out.println(sumX != 0 || sumY != 0 || sumZ != 0 ? "NO" : "YES");
      scanner.close();
    }
}