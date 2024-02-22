// Liczba jest podzielna na dwie parzyste czesci jeżeli sama jest parzysta, poza liczba 2.

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int liczba = scanner.nextInt();
    System.out.println(liczba % 2 == 0 && liczba > 2 ? "YES" :  "NO");
    scanner.close();
  }
}
