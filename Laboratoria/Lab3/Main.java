import java.util.Random;

public class Main {

    // Deklaracje zmiennych statycznych do przechowywania zakresów i celu odgadnięcia.
    static int min = 0; // Minimalna wartość zakresu, w którym losowana jest liczba.
    static int max = 1000; // Maksymalna wartość zakresu.
    static Random rand = new Random(); // Generator liczb losowych.
    final static int docelowaLiczba = rand.nextInt(max + 1); // Losowanie liczby, którą należy odgadnąć.
    static int licznik = 0; // Licznik prób odgadnięcia liczby.

    public static void main(String[] args) {
        // Wyświetla cel gry i rozpoczyna proces odgadywania.
        System.out.println("Szukana liczba to " + docelowaLiczba + ".\n");
        // Wywołuje metodę find, aby zacząć odgadywać z połowy zakresu.
        znajdz(min, max, (int)(min + max) / 2);
    }

    // Metoda odpowiedzialna za znalezienie szukanej liczby przy użyciu rekurencji i podziału zakresu.
    public static void znajdz(int minimum, int maximum, int zgaduj) {
        // Inkrementacja licznika prób.
        licznik++;
        // Wyświetla aktualnie sprawdzaną liczbę.
        System.out.println("Sprawdzam " + zgaduj + ".");
        // Sprawdza, czy odgadnięta liczba jest równa wylosowanej.
        if (zgaduj == docelowaLiczba) {
            // W przypadku odgadnięcia liczby wyświetla gratulacje i liczbę prób.
            System.out.println("Gratulacje! Szukana liczba to " + zgaduj + ". Została odgadnięta w " + licznik + " próbie.");
            return; // Zakończenie działania metody po odgadnięciu liczby.
        }

        // Jeśli odgadnięta liczba jest większa niż wylosowana, kontynuuje w lewej połowie zakresu.
        if (zgaduj > docelowaLiczba) {
            System.out.println("Liczba jest za duża.\n");
            // Wywołuje rekurencyjnie znajdz z nowym maksimum jako obecnie zgadywaną liczbą.
            znajdz(minimum, zgaduj, (int)((minimum + zgaduj) / 2));
        }

        // Jeśli odgadnięta liczba jest mniejsza niż wylosowana, kontynuuje w prawej połowie zakresu.
        if (zgaduj < docelowaLiczba) {
            System.out.println("Liczba jest za mała.\n");
            // Wywołuje rekurencyjnie znajdz z nowym minimum jako obecnie zgadywaną liczbą.
            znajdz(zgaduj, maximum, (int)((zgaduj + maximum) / 2));
        }
    }
}
