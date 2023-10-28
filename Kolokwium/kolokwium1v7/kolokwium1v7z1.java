public class kolokwium1v7z1 {

    // Metoda dziel i zwyciężaj
    public static int obliczWartosc(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 3;
        }
        return obliczWartosc(n - 1) + obliczWartosc(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(obliczWartosc(5)); // Wypisuje ósmy wyraz ciągu
    }
}
