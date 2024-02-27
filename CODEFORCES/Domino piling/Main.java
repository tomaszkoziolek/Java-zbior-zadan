import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      
      if (x == 1 && y == 1) {
        System.out.println(0);
      } else if ((x * y) % 2 != 0) {
        System.out.println(((x * y) - 1) / 2);
      } else{
        System.out.println((x * y) / 2);
      }
    }
}