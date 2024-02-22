import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int liczba = scanner.nextInt();
    System.out.println(liczba % 2 == 0 && liczba > 2 ? "YES" :  "NO");
    scanner.close();
  }
}