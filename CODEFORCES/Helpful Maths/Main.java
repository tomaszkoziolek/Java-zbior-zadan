import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.nextLine();

    String[] parts = input.split("\\+");
    
    int[] numbers = new int[parts.length];

    for (int i = 0; i < parts.length; i++) {
      numbers[i] = Integer.parseInt(parts[i]);
    }

    Arrays.sort(numbers);

    StringBuilder result = new StringBuilder();

    for (int number : numbers) {
      result.append(number).append("+");
    }

    result.deleteCharAt(result.length() - 1);
    
    System.out.println(result);
    scanner.close();
  }
}