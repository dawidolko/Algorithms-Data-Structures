import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //METODA MONTE CARLO

        //Obliczanie pola figury

        Random rand = new Random();

        int field = 0;
        for (int i=0; i<100; i++) {
            double x = rand.nextInt(701)/1000f;
            double y = rand.nextInt(701)/1000f + 0.4;

            if (Math.pow((x/10), x) >= y) field++;
        }
        System.out.println("Pole figury to " + (double)field/100 + ".");


        //Problem wydawania reszty

        Scanner input = new Scanner(System.in);
        Random rand1 = new Random();
        final int attempts = 50;
        final int moneyLimit = 11;
        final int[] nominals = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        int bestNumberOfMoney = Integer.MAX_VALUE;
        String result = "";

        System.out.print("Wprowadz reszte: ");
        int rest = (int)(input.nextDouble()*100);
        System.out.println("Wprowadzona reszta: " + rest);

        for (int i=0;i<attempts;i++) {
            int r = rest;
            String localResult = "";
            int localNumberOfMoney = 0;

            while (r>0) {
                int nominal = nominals[rand1.nextInt(nominals.length)];
                if (localNumberOfMoney==moneyLimit) break;
                else {
                    if (r - nominal >= 0) {
                        localResult += nominal/100f + " ";
                        r -= nominal;
                        localNumberOfMoney++;
                    }
                }
            }

            if (r==0 && localNumberOfMoney<bestNumberOfMoney) {
                bestNumberOfMoney=localNumberOfMoney;
                result = localResult;
            }
        }

        if (bestNumberOfMoney<Integer.MAX_VALUE) {
            System.out.println("Wydana reszta: ");
            System.out.println(result);
        } else {
            System.out.println("Nie udalo sie wydac tej reszty.");
        }
    }
}