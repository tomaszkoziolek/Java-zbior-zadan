import java.util.Scanner;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();
    scanner.close();

    String result;
    boolean checker = true;

    for (int i = input.length() - 1; i >= 0; i--) {
      if (Character.isLowerCase(input.charAt(i)) && i != 0) {
        checker = false;
        break;
      }
    }

    if (Character.isLowerCase(input.charAt(0))) {
      result = Character.toUpperCase(input.charAt(0)) + input.substring(1).toLowerCase();
    } else {
      result = Character.toLowerCase(input.charAt(0)) + input.substring(1).toLowerCase();
    }
    System.out.println(checker ? result : input);
  }
}