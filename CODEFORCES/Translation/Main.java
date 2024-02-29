import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String original = scanner.nextLine();
      String translated = scanner.nextLine();
      scanner.close();

      StringBuilder sb = new StringBuilder();

      for (int i = original.length() - 1; i >= 0; i--) {
        sb.append(original.charAt(i));
      }

      String result = sb.toString();

      System.out.println(result.equals(translated) ? "YES" : "NO");
    }
}