package Dziel_i_zwyciezaj;

public class A20_Populacja_krolikow {

    // Deklaracje zmiennych statycznych, które będą śledzić, czy określone progi populacji zostały osiągnięte
    static boolean sto, tysiac, diesiectys, stotys, milion;

    // Metoda zliczaj() rekurencyjnie oblicza n-ty termin sekwencji Fibonacciego, który reprezentuje populację królików
    public static int zliczaj(int n) {
        // Warunek bazowy rekurencji: pierwsze dwa miesiące mają po jednym parze królików
        if (n == 1 || n == 2) return 1;
        // Rekurencyjne wywołanie metody dla dwóch poprzednich miesięcy i sumowanie ich wartości
        int kroliki = zliczaj(n - 1) + zliczaj(n - 2);

        // Sprawdzanie, czy osiągnięto próg 100 królików i wypisywanie odpowiedniej informacji
        if (kroliki > 100 && !sto) {
            System.out.println("Sto: " + n);
            sto = true; // Ustawienie flagi, aby informacja nie była powielana
        }

        // Analogiczne operacje dla kolejnych progów: 1000, 10000 i 1000000
        if (kroliki > 1000 && !tysiac) {
            System.out.println("Tysiac: " + n);
            tysiac = true;
        }

        if (kroliki > 10000 && !diesiectys) {
            System.out.println("Dziesiec tysiecy: " + n);
            diesiectys = true;
        }

        if (kroliki > 100000 && !stotys) {
            System.out.println("Sto tysiecy: " + n);
            stotys = true;
        }
        if (kroliki > 1000000 && !milion) {
            System.out.println("Milion: " + n);
            milion = true;
        }

        // Zwrócenie obliczonej wartości liczby królików dla n-tego miesiąca
        return kroliki;
    }

    // Główna metoda klasy – uruchamia proces zliczania populacji królików
    public static void main(String[] args) {
        // Definicja stałej N określającej n-ty miesiąc, dla którego ma zostać obliczona populacja
        final int N = 40;
        // Wywołanie metody zliczaj z argumentem N
        zliczaj(N);
    }
}
