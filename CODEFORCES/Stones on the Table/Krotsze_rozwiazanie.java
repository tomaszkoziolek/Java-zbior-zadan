import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStones = scanner.nextInt();
        String sequence = scanner.next();
        scanner.close();

        int count = 0;
        for (int i = 1; i < numberOfStones; i++) {
            if (sequence.charAt(i) == sequence.charAt(i - 1)) {
                count++;
            }
        }

        System.out.println(count);
    }
}