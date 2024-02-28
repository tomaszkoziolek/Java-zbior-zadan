import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String first = scanner.nextLine().toLowerCase();
    String second = scanner.nextLine().toLowerCase();

    int answer = 0;

    for (int i = 0; i < first.length(); i++) {
      char firstChar = first.charAt(i);
      char secondChar = second.charAt(i);

      if (firstChar == secondChar) {
        continue;
      } else if (firstChar < secondChar) {
        answer = -1;
        break;
      } else {
        answer = 1;
        break;
      }
    }

    System.out.println(answer);
    
    scanner.close();
  }
}