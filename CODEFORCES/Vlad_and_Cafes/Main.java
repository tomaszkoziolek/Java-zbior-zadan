import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfCafesIndiced = scanner.nextInt();
    ArrayList<Integer> cafesList = new ArrayList<Integer>();
    HashSet<Integer> cafesSet = new HashSet<Integer>();

    int leastVisisted = 0;
    
    for (int i = 0;  i < numberOfCafesIndiced; i++) {
      int cafe = scanner.nextInt();
      if (cafesList.isEmpty() || !cafesSet.contains(cafe)) {
        cafesList.add(cafe);
        cafesSet.add(cafe);
      } else if (cafesSet.contains(cafe)) {
        cafesList.remove(cafesList.indexOf(cafe));
        cafesList.add(cafe);
      }
    }

    System.out.println(cafesList.get(0));
  }
}