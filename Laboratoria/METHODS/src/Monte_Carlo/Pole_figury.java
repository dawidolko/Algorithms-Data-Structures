package Monte_Carlo;

import java.util.Random;

public class Pole_figury {
    public static void main(String[] args) {
        //Przyblizamy pole pod funkcja y=x^2-x w x [1.2,3], w y = [1.1, 2.9]

        Random rand = new Random();
        int field = 0;

        for (int i=0;i<1000;i++) {
            double x = (double)rand.nextInt(1800+1)/1000 + 1.2;
            double y = (double)rand.nextInt(1800+1)/1000 + 1.1;

            if (y<=x*x-x) field ++;
        }

        System.out.println("Pole figury " + (float)field/1000);
    }
}
