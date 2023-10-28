// Zadanie 1
public class kolokwium1v1z1 {

    // Funkcja rekurencyjna do obliczenia n-tego wyrazu ciągu
    public static int wyrazCiągu(int n) {
        // Warunki początkowe dla pierwszego i drugiego wyrazu
        if (n == 1 || n == 2) {
            return 1;
        }

        // Metoda "dzieli i zwyciężaj"
        int poprzedni = wyrazCiągu(n - 1);
        int przedPoprzedni = wyrazCiągu(n - 2);

        return 3 * poprzedni * przedPoprzedni;
    }

    public static void main(String[] args) {
        System.out.println("Piąty wyraz ciągu wynosi: " + wyrazCiągu(5));
    }
}