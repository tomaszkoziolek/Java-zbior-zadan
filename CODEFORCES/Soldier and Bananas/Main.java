import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstBananaCost = scanner.nextInt();
        int moneyHeHas = scanner.nextInt();
        int amountOfBananasHeWans = scanner.nextInt();
        scanner.close();

        //1k + 2k + 3k... = k*(1+2+3...) -> firstBananaCost * sum
        //sum - suma liczb naturalnych od 1 do n -> n*(n+1)/2

        int sum = (amountOfBananasHeWans * (amountOfBananasHeWans + 1)) / 2;

        int totalCost = firstBananaCost * sum;

        System.out.println(Math.max(0, totalCost - moneyHeHas));
    }
}