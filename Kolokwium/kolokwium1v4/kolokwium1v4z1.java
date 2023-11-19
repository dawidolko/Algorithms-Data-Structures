public class kolokwium1v4z1 {

    private static void populacja(double samce, double samice, int tydzien) {
        double
                wzrostSamcow = 0.1 * 0.45 - 0.02,
                wzrostSamic = 0.1 * 0.55 - 0.05;

        if (wzrostSamcow <= wzrostSamic) {
            System.out.println("Nigdy liczba samców nie będzie większa niż liczba samic.");
        }

        double osobniki = samce + samice;
        samce += (0.45 * 0.1 * osobniki) - samce * 0.02;
        samice += (0.55 * 0.1 * osobniki) - samice * 0.05;
        osobniki = samce + samice;
        tydzien++;

        // floor: Java floor method returns the largest integer that is less than or equal to the argument

        if (Math.floor(samce) >= Math.floor(samice)) {
            System.out.println("Po " + tydzien + " tygodniach liczba samców jest równa lub wyższa liczbie samic.");
            System.out.println("Liczba osobników:\t" + (Math.floor(samce) + Math.floor(samice)));
            System.out.println("Samce:\t" + Math.floor(samce));
            System.out.println("Samice:\t" + Math.floor(samice));
            return;
        }

        populacja(samce, samice, tydzien);
    }

    public static void main(String[] args) {
        populacja(450.0, 550.0, 0);
    }

}
