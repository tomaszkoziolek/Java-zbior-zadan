import java.util.*;

public class PoprawioneRozwiazanie {
    public static void main(String[] args) {
        //dodanie scannera i pobranie inputu - iloscodwiedzonych kawiarni
        Scanner scanner = new Scanner(System.in);
        int numberOfCafesIndiced = scanner.nextInt();
        //inicjalizacja mapy
        Map<Integer, Integer> lastVisited = new HashMap<>();
        //wypelnienie mapy danymi, bierze liczbe z inputu jako klucz i nadaje mu wartosc wkolejnosci iteracji 'i'
        //jezeli dana kawiarnia zostala juz odwiedzona to przypisuje jej nowa wartosc
        //np. input to 1 3 2 1
        //klucz:1 (pobrany input 'int'), wartość: 0 (i = 0 na poczatku iteracji)
        //klucz:3, wartość: 1
        //k:2, w:2
        //k:1, w:3 <- klucz 1 wystapil juz wczesniej a wiec aktualizujemy wartosc
        for (int i = 0; i < numberOfCafesIndiced; i++) {
            int cafe = scanner.nextInt();
            lastVisited.put(cafe, i);
        }

        //inicjalizacja zmiennych
        //wartosc leastVisitedIndex = -1 aby miec pewnosc ze kazdy index (klucz, numer kawiarni) ze zbioru kawiarni bedzie wiekszy
        //jezeli mapa bedzie pusta to wartosc sie nie zmieni i zostanie wyswietlone -1 co oznacza pusta mape
        int leastVisitedIndex = -1;
        //leastVisitedTime = Integer.MAX_VALUE (najwieksza mozliwa wartosc dla integerow) aby miec pewnosc
        //ze podczas iteracji pierwszy napotkany numer (wartosc) stanie sie poczatkowa najmniejsza wartoscia
        int leastVisitedTime = Integer.MAX_VALUE;
        //iteracja przez mape aby znalezc najdawniej odwiedzona kawiarnie, bierze kazdy element z mapy
        //jezeli 'pierwszy klucz'.wartosc < maxymalna mozliwa wartosc integera (zawsze prawda - dla integerow)
        //przypisujemy zmiennej leastVisitedTime wartosc pierwszego klucza
        //przypisujemy zmiennej leastVisitedIndex index kawiarni (klucz)
        //np. pierwsza  iteracja -> klucz: 1, wartosc: 3
        //leastVisitedTime = 3
        //least VisitedIndex = 1
        //druga iteracja -> klucz:2, wartosc: 2
        //leastVisitedTime = 2
        //leastVisitedIndex= 2
        //trzecia iteracja -> klucz:3, wartosc:1
        //leastVisitedTime = 1
        //leastVisitedIndex = 3 -> co daje odpowiedz, ta kawiarnia zostala odwiedzona najdawniej
        for (Map.Entry<Integer, Integer> entry : lastVisited.entrySet()) {
            if (entry.getValue() < leastVisitedTime) {
                leastVisitedTime = entry.getValue();
                leastVisitedIndex = entry.getKey();
            }
        }

        System.out.println(leastVisitedIndex);
    }
}