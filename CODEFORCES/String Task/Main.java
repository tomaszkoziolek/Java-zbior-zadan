import java.util.Scanner;
import java.util.HashSet;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      scanner.close();

      HashSet<Character> wolves = new HashSet<>(Arrays.asList('a', 'o', 'y', 'e', 'u', 'i'));

      StringBuilder sb = new StringBuilder();

      for (int i = 0; i < input.length(); i++) {
        char c = Character.toLowerCase(input.charAt(i));
        if (!wolves.contains(c)) {
          sb.append('.').append(c);
        }
      }

      System.out.println(sb.toString());
    }
}