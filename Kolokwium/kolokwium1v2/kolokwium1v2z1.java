public class kolokwium1v2z1 {

    public static void main(String[] args) {
        double initialBacteria = 12; // Początkowa liczba bakterii
        double targetMultiplier = 1000; // Docelowe zwiększenie liczby bakterii
        int minutesNeeded = calculateTimeToIncrease(initialBacteria, targetMultiplier);
        System.out.println("Liczba bakterii zwiększy się 1000 razy po " + minutesNeeded + " minutach.");
    }

    private static int calculateTimeToIncrease(double initialBacteria, double targetMultiplier) {
        double currentBacteria = initialBacteria;
        int minutesPassed = 0; // Licznik czasu

        // Obliczanie, kiedy liczba bakterii zwiększy się 1000 razy
        while (currentBacteria < initialBacteria * targetMultiplier) {
            // Podział bakterii co 2 minuty
            currentBacteria *= Math.pow(2, 5); // Bakterie podwajają się 5 razy w ciągu 10 minut

            // Śmierć bakterii co 10 minut (50% populacji)
            currentBacteria /= 2; // Połowa umiera

            // Zwiększenie licznika czasu o 10 minut po każdym cyklu
            minutesPassed += 10;
        }

        return minutesPassed;
    }
}
