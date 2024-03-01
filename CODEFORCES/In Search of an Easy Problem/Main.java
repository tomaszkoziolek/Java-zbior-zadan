import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();

      int result = 0;
      
      for (int i = 0; i < n; i++) {
        if (scanner.nextInt() == 1) {
          result++;
          break;
        }
      }
      System.out.println(result == 0 ? "EASY" : "HARD");
    }
}