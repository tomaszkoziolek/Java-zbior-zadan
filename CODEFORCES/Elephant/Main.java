import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a = scanner.nextInt();
      scanner.close();

        //chcemy aby rezultat byl intem, a metoda Math.ceil() dziala na typach zmiennoprzecinkowych
        //zatem int a 'rzutujemy' na double a (rzutowanie typow)
        //jako ze Math.ceil() zwroci double rzutujemy cala ta operacje na 'int' aby wynik pasowal do typu zmiennej
      int result = (int) Math.ceil((double) a / 5);
      
      System.out.println(result);
    }
}