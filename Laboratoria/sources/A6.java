package asd_lab_1;

import java.util.Random;

public class A6 {

    static Random rand = new Random();
    public static int min = 0;
    public static int max = 1000;
    public static int number = rand.nextInt(max+1);

    public static void zgaduj(int min, int center, int max) {
        if (center==number) System.out.println("Twoja liczba to " + center);
        if (center>number) {
            System.out.println(center + " jest za duza");
            zgaduj(min, (int)((min+center)/2), center);
        }
        if (center<number) {
            System.out.println(center + " jest za mala");
            zgaduj(center, (int)((center+max)/2), max);
        }
    }

    public static void main(String[] args) {
        zgaduj(min, (int)((min+max)/2), max);
    }
}
