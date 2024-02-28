import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      scanner.close();

      int result = (int) Math.ceil((double) a / 5);
      
      System.out.println(result);
    }
}