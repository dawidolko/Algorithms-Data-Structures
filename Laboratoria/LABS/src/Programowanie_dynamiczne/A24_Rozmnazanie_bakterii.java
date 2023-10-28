package Programowanie_dynamiczne;

public class A24_Rozmnazanie_bakterii {
    public static void main(String[] args) {

        final int max = 1000000;
        int N = (int)Math.ceil((Math.log(max)/Math.log(2))+1);
        int[] tab = new int[N];
        boolean tysiac = false, dziesiecysiecy = false, stotysiecy = false, milion = false;

        for (int i=0;i<N;i++) {
            if (i==0) tab[i]=1;
            else tab[i] = 2*tab[i-1];

            if (!tysiac && tab[i]>1000) {
                System.out.println("Tysiac razy: po " + (i*2) + " minutach");
                tysiac = true;
            }

            if (!dziesiecysiecy && tab[i]>10000) {
                System.out.println("Dziesiec tysiecy razy: po " + (i*2) + " minutach");
                dziesiecysiecy = true;
            }

            if (!stotysiecy && tab[i]>100000) {
                System.out.println("Sto tysiecy razy: po " + (i*2) + " minutach");
                stotysiecy = true;
            }

            if (!milion && tab[i]>1000000) {
                System.out.println("Milion razy: po " + (i*2) + " minutach");
                milion = true;
            }
        }
    }
}
