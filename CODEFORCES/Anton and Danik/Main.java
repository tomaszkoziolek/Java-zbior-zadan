import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      //zmienna dodana tylko po to aby wczytac pierwszy input, nie bedzie uzywana poniewaz dalej uzywam petli for-each
      int numberOfGamesPlayed = scanner.nextInt();
      scanner.nextLine();
      String sequence = scanner.nextLine();
      scanner.close();
      
      int anton = 0;
      int danik = 0;

      //petlafor-each
      for (char c : sequence.toCharArray()) {
        if (c == 'A') {
          anton++;
        } else {
          danik++;
        }
      }

      System.out.println(anton == danik ? "Friendship" : anton > danik ? "Anton" : "Danik");
    }
}