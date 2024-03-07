import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();
    scanner.close();

    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(a+b+c,
            a*b+c,
            a+b*c,
            a*b*c,
            a*(b+c),
            (a+b)*c));
    System.out.println(Collections.max(list));
  }
}