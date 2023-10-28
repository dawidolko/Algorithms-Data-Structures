package asd_lab_3.dzielzwyciezaj;

public class PlecakDZWypisz
{

    final static int N = 6;                // liczba przedmiotow
    final static int MAX_V = 10;           // objetosc plecaka

    final static int[] V = {6,2,3,2,3,1};  // objetosci przedmiotow
    final static int[] W = {6,4,5,7,10,2}; // wartosci przedmiotow
    
    static int[] p = new int[N]; // stan plecaka, gdzie nr indeksu odpowiada nr przedmiotu 
                                // oraz wartosc 0 - przedmiot nie zostal zabrany, wartosc 1 - przedmiot zostal zapakowany

    static int plecak(int i, int v)
    {
        int w1; // wartosc, gdy nie bierzemy i-tego przedmiotu
        int w2; // wartosc, gdy bierzemy i-ty przedmiot
        
//Jezeli do zapakowania mamy tylko przedmiot z numerem 0 i ...
        
        //... nie miesci sie on do plecaka, to maksymalna wartosc plecaka o objetosci v jest rowna 0
        if (i == 0 && v < V[0])
        {
            p[i]=0;
            return 0;
        }
        //... miesci sie on do plecaka, to maksymalna wartosc plecaka o objetosci v
        //jest rowna wartosci tego przedmiotu
        if (i == 0 && v >= V[0])
        {
            p[i]=1;
            return W[0];
        }
        
// Jesli mamy wiecej niz jeden przedmiot (czyli nie tylko przedmiot z numerem 0) ...
        
        w1 = plecak(i - 1, v); 
        
        //Jezeli i-ty przedmiot nie miesci sie do plecaka, to maksymalna wartosc plecaka
        //o objetosci v, zapakowanego sposrod przedmiotow ponumerowanych od 0 do i 
        //jest równa maksymalnej wartosci plecaka o objetosci v, zapakowanego 
        //sposrod przedmiotow ponumerowanych od 0 do i-1.
        if (i > 0 && v < V[i])
        {
            return w1;
        }
        
        w2 = W[i] + plecak(i - 1, v - V[i]);
        
        //Jezeli i-ty przedmiot miesci sie do plecaka, to maksymalna wartosc plecaka
        //o objetosci v, zapakowanego sposrod przedmiotow ponumerowanych od 0 do i 
        //jest rowna wiekszej z dwu wartosci:
            //maksymalnej wartosci plecaka o objetosci v - Vi, zapakowanego sposrod przedmiotow
            // ponumerowanych od 0 do i - 1 plus wartosc i-tego przedmiotu,
        //lub
            //-maksymalnej wartosci plecaka o objetosci v, zapakowanego sposrod przedmiotow
            //ponumerowanych od 0 do i - 1
        if (w2 > w1) // gdy i > 0 && v >= V[i]
        {
            p[i]=1;
            return w2;
        }
        else
        {
            p[i]=0;
            return w1;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("Wartosc przedmiotow: " + plecak(N - 1, MAX_V));
//        for (int i : p) {
//            System.out.println(""+i);
//        }
        
        for (int i = 0; i < p.length; i++) {
            if(p[i]==1)
                System.out.print((i)+" ");
        }
    }
}
