import java.util.Scanner;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfStones = scanner.nextInt();
    //suniecie znaku nowej linii po int aby moc pobrac nastepna linie do 'sequence'
    scanner.nextLine();
    String sequence = scanner.nextLine();
    scanner.close();
    
    if (numberOfStones <= 1) {
      System.out.println(0);
    } else {
      ArrayList<Character> stones = new ArrayList<Character>();
      stones.add(sequence.charAt(0));
      for (int i = 1; i < numberOfStones; i++) {
        if (sequence.charAt(i) != sequence.charAt(i - 1)) {
          stones.add(sequence.charAt(i));
        } else {
          continue;
        }
      }
      System.out.println(numberOfStones - stones.size());
    }
  }
}