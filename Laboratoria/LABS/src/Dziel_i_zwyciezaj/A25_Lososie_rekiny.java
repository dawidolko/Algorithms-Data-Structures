package Dziel_i_zwyciezaj;

public class A25_Lososie_rekiny {

    static boolean dwa;
    final static int MAX = 1000000;

    public static void ekosystem(int lososie, int min) {
        if (lososie<MAX/2 && !dwa) {
            System.out.println("Polowa: po " + min + " minutach");
            dwa=true;
        }
        if (lososie<100)  {
            System.out.println("Populacja wymrze po " + min + " minutach");
            return;
        }

        lososie = (int)(((lososie*Math.exp(0.003))*0.998)*0.998);
        ekosystem(lososie, min+1);
    }

    public static void main(String[] args) {
        ekosystem(MAX, 0);
    }
}
