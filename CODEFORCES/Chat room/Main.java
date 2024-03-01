import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      String input = scanner.nextLine();
      scanner.close();

      String keyWord = "hello";
      int j = 0;
      
      for (int i = 0; i < input.length(); i++) {
        if (input.charAt(i) == keyWord.charAt(j)) {
          j++;
          if (j == keyWord.length()) {
            break;
          }
        }
      }

      System.out.println(j == keyWord.length() ? "YES" : "NO");
    }
}