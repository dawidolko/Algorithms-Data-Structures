import java.util.Random;

public class Main {

    //METODA DZIEL I RZĄDŹ


    //Problem odgadywania liczby
    static int min = 0;
    static int max = 1000;
    static Random rand = new Random();
    final static int finalNumber = rand.nextInt(max+1);
    static int counter = 0;

    public static void main(String[] args) {
        System.out.println("Szukana liczba to " + finalNumber + ".\n");
        find(min, max, (int)(min+max)/2);
    }

    public static void find(int minimum, int maximum, int guess) {
        counter++;
        System.out.println("Sprawdzam " + guess + ".");
        if (guess==finalNumber) System.out.println("Gratulacje! Szukana liczba to " + guess + ". Została odgadnięta w " + counter + " probie.");

        if (guess>finalNumber) {
            System.out.println("Liczba jest za duza.\n");
            find(minimum, guess, (int)((minimum+guess)/2));
        }

        if (guess<finalNumber) {
            System.out.println("Liczba jest za mala.\n");
            find(guess, maximum, (int)((guess+maximum)/2));
        }
    }
}