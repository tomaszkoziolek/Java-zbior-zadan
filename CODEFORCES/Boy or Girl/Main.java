import java.util.Scanner;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.nextLine();
    scanner.close();

    HashSet<Character> charSet = new HashSet<Character>();

    for (int i = 0; i < name.length(); i++) {
      charSet.add(name.charAt(i));
    }

    if (charSet.size() % 2 == 0) {
      System.out.println("CHAT WITH HER!");
    } else {
      System.out.println("IGNORE HIM!");
    }
  }
}