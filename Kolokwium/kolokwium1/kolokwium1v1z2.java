import java.util.Random;

public class kolokwium1v1z2 {

    public static void main(String[] args) {
        int liczbaPunktow = 100; // Liczba losowych punktów
        double pole = obliczPole(liczbaPunktow);
        System.out.println("Przybliżone pole figury wynosi: " + pole);
    }

    public static double obliczPole(int liczbaPunktow) {
        Random losowaLiczba = new Random();
        int punktyPodKrzywa = 0;

        for (int i = 0; i < liczbaPunktow; i++) {
            double x = losowaLiczba.nextDouble();
            double y = losowaLiczba.nextDouble();

            // Sprawdzamy, czy punkt leży poniżej krzywej y = x^2
            if (y < Math.pow(x, 2)) {
                punktyPodKrzywa++;
            }
        }

        // Oblicz pole przy użyciu wzoru
        double przyblizonePole = (double) punktyPodKrzywa / liczbaPunktow;

        return przyblizonePole;
    }
}
