import java.util.*;

public class PoprawioneRozwiazanie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfCafesIndiced = scanner.nextInt();
        Map<Integer, Integer> lastVisited = new HashMap<>();

        for (int i = 0; i < numberOfCafesIndiced; i++) {
            int cafe = scanner.nextInt();
            lastVisited.put(cafe, i);
        }

        int leastVisitedIndex = -1;
        int leastVisitedTime = Integer.MAX_VALUE;

        for (Map.Entry<Integer, Integer> entry : lastVisited.entrySet()) {
            if (entry.getValue() < leastVisitedTime) {
                leastVisitedTime = entry.getValue();
                leastVisitedIndex = entry.getKey();
            }
        }

        System.out.println(leastVisitedIndex);
    }
}