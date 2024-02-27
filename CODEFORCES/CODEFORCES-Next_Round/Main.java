import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfParticipants = scanner.nextInt();
    int placeToCompare = scanner.nextInt() - 1;

    ArrayList<Integer> scores = new ArrayList<Integer>();

    for (int i = 0; i < numberOfParticipants; i++) {
      scores.add(scanner.nextInt());
    }

    int score = scores.get(placeToCompare);

    int i = 0;

    while (i < scores.size()) {
      if (scores.get(i) <= 0 || scores.get(i) < score) {
        break;
      }
      i++;
    }

    System.out.println(i);
  }
}