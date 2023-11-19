
import java.util.Random;

public class kolokwium1v6z2 {
    public static double obliczPole(int liczbaProb) {
        Random rand = new Random();
        int liczbaPunktowWFigurze = 0;

        for (int i = 0; i < liczbaProb; i++) {
            double x = (double) rand.nextInt(700+1)/1000;  // Losowanie x z zakresu [0, 0.7]
//            System.out.println("x: " +x); // funkcja pomocnicza zeby zobaczyc realnie zakres
            double y = 0.4 + (double) rand.nextInt(700+1)/1000; // Losowanie y z zakresu [0.4, 1.1]
//            System.out.println("y: " +y); // tu to samo pomocnicza

            if (y <= Math.pow((x/10), x))  { // Sprawdzenie, czy punkt należy do figury
                liczbaPunktowWFigurze++;
            }
        }

        return (double) liczbaPunktowWFigurze / liczbaProb; // Obliczenie pola figury
    }

    public static void main(String[] args) {
        int liczbaProb = 100; // Dla dokładniejszych wyników można zwiększyć liczbę prób
        System.out.println("Pole figury wynosi: " + obliczPole(liczbaProb));
    }
}
