import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numberOfStatements = scanner.nextInt();
      scanner.nextLine();

      int x = 0;
      
      for (int i = 0; i < numberOfStatements; i++) {
        if (scanner.nextLine().contains("-")) {
          x--;
        } else {
          x++;
        }
      }

      System.out.println(x);
    }
}