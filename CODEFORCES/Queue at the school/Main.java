import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int numberOfChildren = scanner.nextInt();
      int numberOfIterations = scanner.nextInt();
      scanner.nextLine();
      String sequence = scanner.nextLine();
      scanner.close();

      char[] sequenceArray = sequence.toCharArray();

      for (int i = 0; i < numberOfIterations; i++) {
        for (int j = 0; j < numberOfChildren - 1; j++) {
          if (sequenceArray[j] == 'B' && sequenceArray[j + 1] == 'G') {
            sequenceArray[j] = 'G';
            sequenceArray[j + 1] = 'B';
            j++;
          }
        }
      }

      System.out.println(String.valueOf(sequenceArray));
    }
}