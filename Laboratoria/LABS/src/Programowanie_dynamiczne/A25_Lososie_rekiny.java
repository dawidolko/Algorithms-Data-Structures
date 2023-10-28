package Programowanie_dynamiczne;

public class A25_Lososie_rekiny {
    public static void main(String[] args) {
        int lososie = 1000000;
        int[] tab = new int[7361];
        boolean dwa=false, trzy=false, dziesiec=false, sto=false;

        for(int i=0;i<tab.length;i++) {
            if (i==0) tab[i]=1000000;
            else tab[i] = (int)(((tab[i-1]*Math.exp(0.003)*0.998)*0.998));

            if (!dwa && tab[i]<lososie/2) {
                System.out.println("Polowa: po " + i + " minutach");
                dwa = true;
            }
            if (!trzy && tab[i]<lososie/3) {
                System.out.println("Jedna trzecia: po " + i + " minutach");
                trzy = true;
            }
            if (!dziesiec && tab[i]<lososie/10) {
                System.out.println("Jedna dziesiata: po " + i + " minutach");
                dziesiec = true;
            }
            if (!sto && tab[i]<lososie/100) {
                System.out.println("Jedna setna: po " + i + " minutach");
                sto = true;
            }
            if (tab[i]<100) {
                System.out.println("Wymrze: po " + i + " minutach");
                break;
            }
        }
    }
}
