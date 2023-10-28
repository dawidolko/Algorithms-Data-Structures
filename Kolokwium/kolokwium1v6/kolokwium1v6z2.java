import java.util.Random;

public class kolokwium1v6z2 {
        public static double obliczPole(int liczbaProb) {
            Random rand = new Random();
            int liczbaPunktowWFigurze = 0;

            for (int i = 0; i < liczbaProb; i++) {
                double x = rand.nextDouble() * 0.7;  // Losowanie x z zakresu [0, 0.7]
                double y = 0.4 + rand.nextDouble() * 0.7; // Losowanie y z zakresu [0.4, 1.1]

                if (y <= Math.pow((x/10), x) && y >= 0.4) { // Sprawdzenie, czy punkt należy do figury
                    liczbaPunktowWFigurze++;
                }
            }

            double poleObszaru = 0.7 * 0.7; // Pole obszaru, w którym losowaliśmy punkty
            return (double) liczbaPunktowWFigurze / liczbaProb * poleObszaru; // Obliczenie pola figury
        }

        public static void main(String[] args) {
            int liczbaProb = 100; // Dla dokładniejszych wyników można zwiększyć liczbę prób
            System.out.println("Pole figury wynosi: " + obliczPole(liczbaProb));
        }
    }
