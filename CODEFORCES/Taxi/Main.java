import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfGroups = scanner.nextInt();

    int numberOfCars = 0;

    HashMap<Integer, Integer> groupsCounter = new HashMap<Integer, Integer>();
    groupsCounter.put(1, 0);
    groupsCounter.put(2, 0);
    groupsCounter.put(3, 0);
    groupsCounter.put(4, 0);

    for (int i = 0; i < numberOfGroups; i++) {
      int groupSize = scanner.nextInt();
      
      groupsCounter.put(groupSize, groupsCounter.get(groupSize) + 1);
    }

    numberOfCars += groupsCounter.get(4);
    numberOfCars += groupsCounter.get(3);
    
    if (groupsCounter.get(1) <= groupsCounter.get(3)) {
      groupsCounter.put(1, 0);
    } else {
      groupsCounter.put(1, groupsCounter.get(1) - groupsCounter.get(3));
    }
    numberOfCars += groupsCounter.get(2) / 2;

    groupsCounter.put(2, groupsCounter.get(2) % 2);

    numberOfCars += groupsCounter.get(2) == 0 ? (int) Math.ceil((double) groupsCounter.get(1) / 4) : 
      1 + (int) Math.ceil(((double) groupsCounter.get(1) - 2) / 4);
    
    System.out.println(numberOfCars);
  }
}