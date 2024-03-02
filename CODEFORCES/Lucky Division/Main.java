import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int input = scanner.nextInt();
    scanner.close();

    //1-1000
    int[] givenRangeLuckyNumbers = {4, 7, 44, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
    boolean checker = false;
    for (int i = 0; i < givenRangeLuckyNumbers.length; i++) {
      if (input % givenRangeLuckyNumbers[i] == 0) {
        checker = true;
        break;
      }
    }

    System.out.println(checker ? "YES" : "NO");
  }
}