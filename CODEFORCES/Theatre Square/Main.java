import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int n = scanner.nextInt();
      int m = scanner.nextInt();
      int a = scanner.nextInt();
      scanner.close();

      int x = (int) Math.ceil((double)n/a);
      int y = (int) Math.ceil((double)m/a);

      long result = (long) x * y;
      System.out.println(result);
    }
}