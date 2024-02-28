import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String word = scanner.nextLine();
    scanner.close();

    //sprawdzenie czy pierwsza litera w wyrazie jest mala, jesli tak to zamieniamy na duza
    //jezeli jest duza to pomija te czesc kodu i po prostu wyswietla input jako odpowiedz
    if (!Character.isUpperCase(word.charAt(0))) {
      word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }
    
    System.out.println(word);
  }
}