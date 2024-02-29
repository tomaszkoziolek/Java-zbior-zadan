import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String word = scanner.nextLine();
      scanner.close();

      int upper = 0;
      int lower = 0;

      for (char c : word.toCharArray()) {
        if (Character.isUpperCase(c)) {
          upper++;
        } else {
          lower++;
        }
      }

      System.out.println(lower >= upper ? word.toLowerCase() : word.toUpperCase());
    }
}