import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String sequence = scanner.nextLine();
      scanner.close();

      int counter = 1;
      char currentChar = sequence.charAt(0);

      for (int i = 1; i < sequence.length(); i++) {
        if (sequence.charAt(i) == currentChar) {
          counter++;
        } else {
          currentChar = sequence.charAt(i);
          counter = 1;
        }

        if (counter == 7) {
          break;
        }
      }

      System.out.println(counter == 7 ? "YES" : "NO");
    }
}