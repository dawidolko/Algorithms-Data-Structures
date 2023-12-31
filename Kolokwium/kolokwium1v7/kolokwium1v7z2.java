import java.util.Random;

public class kolokwium1v7z2 {
    public static void main(String[] args) {
        int liczbaProb = 200;
        double pole = obliczPoleMonteCarlo(liczbaProb);
        System.out.println("Przybliżone pole figury: " + pole);
    }

    public static double obliczPoleMonteCarlo(int liczbaProb) {
        Random rand = new Random();
        int trafienia = 0;

        for (int i = 0; i < liczbaProb; i++) {
            double x = (double) rand.nextInt(100+1)/100;
            double y = (double) rand.nextInt(100+1)/100;
            if (y <= Math.sqrt(x)) {
                trafienia++;
            }
        }
        return (double) trafienia / liczbaProb;
    }
}
