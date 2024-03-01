import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int year = scanner.nextInt();
      scanner.close();

      while (true) {
        year++;
        int newYear = year;
        HashSet<Integer> digits = new HashSet<>();

        while (newYear > 0) {
          int digit = newYear % 10;
          digits.add(digit);
          newYear /= 10;
        }

        if (digits.size() == String.valueOf(year).length()) {
          System.out.println(year);
          break;
        }
      }
    }
}