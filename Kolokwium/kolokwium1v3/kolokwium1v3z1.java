// kolokwium1v3z1
public class kolokwium1v3z1 {

    // Metoda wykorzystująca programowanie dynamiczne do obliczenia n-tego wyrazu ciągu
    public static int wyrazCiągu(int n) {
        if (n == 1 || n == 2) return 1;

        int[] f = new int[n + 1];
        f[1] = f[2] = 1;

        for (int i = 3; i <= n; i++) {
            if (i % 3 == 0) {
                f[i] = 2 * f[i-1];
            } else if (i % 3 == 1) {
                f[i] = f[i-2] * f[i-2];
            } else if (i%3==2){
                f[i] = 2^(f[i-3]);
            }
        }


        return f[n];
    }

    public static void main(String[] args) {
        System.out.println("Dziesiąty wyraz ciągu wynosi: " + wyrazCiągu(10));
    }
}