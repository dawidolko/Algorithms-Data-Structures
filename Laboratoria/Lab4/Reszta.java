import java.util.Scanner;

public class Reszta {
    public static void main(String[] args) {

        // Algorytmy zachłanne

        // Problem wydawania reszty

        Scanner wejscie = new Scanner(System.in);

        final int[] nominały = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] ilości = new int[9];
        int[] pozostałe = {2, 1, 2, 1, 0, 1, 3, 2, 4}; // 14.83 zł

        System.out.print("Podaj resztę: ");
        double reszta = wejscie.nextDouble();
        reszta = (int) (reszta * 100);
        System.out.println("Podana reszta to " + (int) reszta + " gr.");

        int i = 0;
        while (reszta > 0) {
            if (i < nominały.length) {
                if (reszta - nominały[i] >= 0 && pozostałe[i] > 0) {
                    reszta -= nominały[i];
                    pozostałe[i]--;
                    ilości[i]++;
                } else i++;
            } else break;
        }

        System.out.println("\nWydana reszta:");
        for (i = 0; i < nominały.length; i++)
            System.out.println(((double) nominały[i] / 100 + "\t" + ilości[i]));

        if (reszta == 0) System.out.println("Cała reszta została wydana.");
        else if (reszta == 1) System.out.println("Będę winien grosika :)");
        else System.out.println("Nie udało się wydać całej reszty. Zabrakło " + (double) reszta / 100 + " zł.");

        wejscie.close();
    }
}
