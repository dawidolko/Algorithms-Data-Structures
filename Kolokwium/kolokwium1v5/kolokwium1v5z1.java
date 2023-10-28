public class kolokwium1v5z1 {

    // Metoda dziel i zwyciężaj
    public static int obliczWartosc(int n) {
        if (n == 1) {
            return 2;
        }
        if (n == 2) {
            return 4;
        }
        return (obliczWartosc(n - 1) * obliczWartosc(n - 2))/2;
    }

    public static void main(String[] args) {
        System.out.println(obliczWartosc(8)); // Wypisuje ósmy wyraz ciągu
    }
}
