import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int x = scanner.nextInt();
    scanner.close();

    int result = 1;
    
    while (x != 1) {
      if (x%2 != 0) {
        x--;
        result++;
      }
      x /= 2;
    }

    System.out.println(result);
  }
}