import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String number = scanner.nextLine();
    scanner.close();

    int luckyNumbersCounter = 0;

    for (char digit : number.toCharArray()) {
      if (digit == '4' || digit == '7') {
        luckyNumbersCounter++;
      }
    }

    System.out.println(luckyNumbersCounter == 4 || luckyNumbersCounter == 7 ? "YES" : "NO");
  }
}