import java.util.Random;

public class Main {

    // Deklaracje zmiennych statycznych do przechowywania zakresów i celu odgadnięcia.
    static int min = 0; // Minimalna wartość zakresu, w którym losowana jest liczba.
    static int max = 1000; // Maksymalna wartość zakresu.
    static Random rand = new Random(); // Generator liczb losowych.
    final static int finalNumber = rand.nextInt(max + 1); // Losowanie liczby, którą należy odgadnąć.
    static int counter = 0; // Licznik prób odgadnięcia liczby.

    public static void main(String[] args) {
        // Wyświetla cel gry i rozpoczyna proces odgadywania.
        System.out.println("Szukana liczba to " + finalNumber + ".\n");
        // Wywołuje metodę find, aby zacząć odgadywać z połowy zakresu.
        find(min, max, (int)(min + max) / 2);
    }

    // Metoda odpowiedzialna za znalezienie szukanej liczby przy użyciu rekurencji i podziału zakresu.
    public static void find(int minimum, int maximum, int guess) {
        // Inkrementacja licznika prób.
        counter++;
        // Wyświetla aktualnie sprawdzaną liczbę.
        System.out.println("Sprawdzam " + guess + ".");
        // Sprawdza, czy odgadnięta liczba jest równa wylosowanej.
        if (guess == finalNumber) {
            // W przypadku odgadnięcia liczby wyświetla gratulacje i liczbę prób.
            System.out.println("Gratulacje! Szukana liczba to " + guess + ". Została odgadnięta w " + counter + " probie.");
            return; // Zakończenie działania metody po odgadnięciu liczby.
        }

        // Jeśli odgadnięta liczba jest większa niż wylosowana, kontynuuje w lewej połowie zakresu.
        if (guess > finalNumber) {
            System.out.println("Liczba jest za duza.\n");
            // Wywołuje rekurencyjnie find z nowym maksimum jako obecnie zgadywaną liczbą.
            find(minimum, guess, (int)((minimum + guess) / 2));
        }

        // Jeśli odgadnięta liczba jest mniejsza niż wylosowana, kontynuuje w prawej połowie zakresu.
        if (guess < finalNumber) {
            System.out.println("Liczba jest za mala.\n");
            // Wywołuje rekurencyjnie find z nowym minimum jako obecnie zgadywaną liczbą.
            find(guess, maximum, (int)((guess + maximum) / 2));
        }
    }
}
