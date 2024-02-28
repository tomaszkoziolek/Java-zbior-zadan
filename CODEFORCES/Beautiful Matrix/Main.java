import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int rzad = 0;
    int kolumna = 0;

    //iteracja przez input, jezeli input = 1 to rząd = i oraz kolumna = j
    //1 musi znalezc sie na srodku, to znaczy mamy (nie stworzoną) tablicę 5x5 (indexy od 0 do 4))
    //zatem 1 musi znalezc sie na pozycji 2,2
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        if (scanner.nextInt() == 1) {
          kolumna = j;
          rzad = i;
        }
      }
    }

    //majac juz przypisany rząd i kolumne ^, musimy obliczyc odleglosc srodka od punktu 1
    //to da nam ilosc ruchow jakie trzeba wykonać
    //np. 1 znajduje sie na pozycji rząd = 1, kolumna = 4
    //bierzemy wartosc absolutną z działania rzad - 2 i kolumna - 2
    //czyli |1 - 2| = 1 oraz |4 - 2| = 2
    //finalnie dodajemy oba wyniki i wyswietlamy rezultat "3"
    System.out.println(Math.abs(kolumna - 2) + Math.abs(rzad - 2));

    scanner.close();
  }
}