// Zadanie 2

import java.util.Random;

public class kolokwium1v1z2 {

    public static double pole(int liczbaLos){
        Random random = new Random();
        int licz = 0;

        for(int i=0; i<liczbaLos; i++){
            double x = (double) random.nextInt(100+1)/100;
            double y = (double) random.nextInt(100+1)/100;

            if(y<=Math.pow(x,2)){
                licz++;
            }
        }

        return (double) licz/liczbaLos;
    }

    public static void main(String[] args) {
        int liczbaLos = 100;
        double odpowiedz = pole(liczbaLos);
        System.out.println("To jest pole: " + odpowiedz);
    }
}
