import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int kiritosPower = scanner.nextInt();
    int numberOfIterations = scanner.nextInt();

    ArrayList<Integer> dragonsPowerOriginal = new ArrayList<Integer>();
    ArrayList<Integer> bonusPowerList = new ArrayList<Integer>();
    

    for (int i = 0; i < numberOfIterations; i++) {
      int dragonPower = scanner.nextInt();
      int bonusPower = scanner.nextInt();

      if (dragonPower < kiritosPower) {
        kiritosPower += bonusPower;
        continue;
      } else {
        dragonsPowerOriginal.add(dragonPower);
        bonusPowerList.add(bonusPower);
      }
    }

    boolean canHePass = true;
    
    ArrayList<Integer> dragonsPowerSorted = new ArrayList<Integer>(dragonsPowerOriginal);
    Collections.sort(dragonsPowerSorted);

    for (int i = 0; i < dragonsPowerSorted.size(); i++) {
      
      int powerChecker = dragonsPowerSorted.get(i);
      
      if (powerChecker >= kiritosPower) {
        canHePass = false;
        break;
      } else {
        int index = dragonsPowerOriginal.indexOf(powerChecker);
        kiritosPower += bonusPowerList.get(index);
        dragonsPowerOriginal.set(index, -1);
      }
    }

    System.out.println(canHePass ? "YES" : "NO");
  }
}