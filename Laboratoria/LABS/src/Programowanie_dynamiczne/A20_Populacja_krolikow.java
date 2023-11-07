package Programowanie_dynamiczne;

public class A20_Populacja_krolikow {

    // Zmienne statyczne do śledzenia, kiedy populacja przekroczy określone progi
    static boolean sto, tysiac, dziesiectys, stotys, milion;

    // Metoda zliczaj() obliczająca populację królików używając programowania dynamicznego
    public static int zliczaj(int n) {
        // Inicjalizacja tablicy do przechowywania wyników subproblemów
        int[] fib = new int[n+1];

        // Warunki początkowe: pierwszy i drugi miesiąc mają po jednej parze królików
        fib[1] = 1;
        fib[2] = 1;

        // Obliczanie kolejnych wartości sekwencji Fibonacciego,
        // zaczynając od trzeciego miesiąca
        for (int i = 3; i <= n; i++) { // może być i < n+1
            fib[i] = fib[i - 1] + fib[i - 2];

            // Sprawdzanie, czy osiągnięto określone progi
            if (!sto && fib[i] >= 100) {
                System.out.println("Sto: " + i);
                sto = true;
            }
            if (!tysiac && fib[i] >= 1000) {
                System.out.println("Tysiac: " + i);
                tysiac = true;
            }
            if (!dziesiectys && fib[i] >= 10000) {
                System.out.println("Dziesiec tysiecy: " + i);
                dziesiectys = true;
            }
            if (!stotys && fib[i] >= 100000) {
                System.out.println("Sto tysiecy: " + i);
                stotys = true;
            }
            if (!milion && fib[i] >= 1000000) {
                System.out.println("Milion: " + i);
                milion = true;
            }
        }

        // Zwrócenie liczby par królików w n-tym miesiącu
        return fib[n];
    }

    // Główna metoda klasy
    public static void main(String[] args) {
        final int N = 40; // Zmienić N na większą wartość, aby symulować dłuższy czas
        zliczaj(N);
    }
}

