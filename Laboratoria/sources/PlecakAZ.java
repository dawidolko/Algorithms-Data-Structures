package asd_lab_4.zachlanne;

public class PlecakAZ
{
    final static int N = 6;                // liczba przedmiotow
    final static int MAX_V = 10;           // objetosc plecaka

    final static int[] V = {6,2,3,2,3,1};  // objetosci przedmiotow
    final static int[] W = {6,4,5,7,10,2}; // wartosci przedmiotow

    //Wersja 1: Wybieramy w kolejnosci rosnacych objetosci przedmiotow (od najmniejszego)
    public static void pakujMale()
    {
        boolean [] rozw = new boolean[N]; //tablica na optymalny podzbior
        for (int i=0; i<N; i++) 
            rozw[i] = false; //Na poczatku nic nie zostalo zabrane (pusty plecak)

        int sumW = 0;
        int sumV = 0;

        while(true)
        {
            int minV = Integer.MAX_VALUE; 
            int maxPoz = -1;
            for(int i=0; i<N; i++) //Szukamy najmniejszego przedmiotu, ktory jeszcze nie zostal zabrany
            {
                if(!rozw[i]) //jesli jeszcze nie zabrany ...
                {
                    if((sumV+V[i]<=MAX_V)&&(V[i]<minV)) // spr. czy sie jeszcze zmiesci i czy objetosc mniejsza od minV
                    {
                        minV = V[i]; 
                        maxPoz = i;
                    }
                }
            }
            if (maxPoz>-1)
            {
                rozw[maxPoz]=true;
                sumW = sumW + W[maxPoz];
                sumV = sumV + V[maxPoz];
            }
            else 
                break;
        }

        System.out.println("Wartosc optymalnie zapakowanego plecaka - metoda PAKUJ MALE: " + sumW);
        System.out.print("Przedmioty w plecaku: ");

        for (int i = 0; i < N; i++) // Wypisanie przedmiotow
            if (rozw[i]) 
		System.out.print(i + " ");

        System.out.println(); 
    }

    //Wersja 2: Wybieramy w kolejnosci malejacych wartosci predmiotow (od najbardziej wartosciowego)
    public static void pakujCenne()
    {
        boolean [] rozw = new boolean[N]; //tablica na optymalny podzbior
        for (int i=0; i<N; i++) 
            rozw[i] = false; //Na poczatku nic nie zostalo zabrane (pusty plecak)

        int sumW = 0;
        int sumV = 0;

        while(true)
        {
            int maxW = 0; 
            int maxPoz = -1;
            for (int i=0; i<N; i++) //Szukamy najcenniejszego przedmiotu, ktory jeszcze nie zostal zabrany
            {
                if (!rozw[i]) //jesli jeszcze nie zabrany
                {
                    if ((sumV+V[i]<=MAX_V)&&(W[i]>maxW)) // spr. czy sie jeszcze zmiesci i czy wartosc wieksza od maxW
                    {
                        maxW = W[i]; 
                        maxPoz = i;
                    }
                }
            }

            if (maxPoz>-1) 
            {             
                rozw[maxPoz]=true; 
                sumW = sumW + W[maxPoz];
                sumV = sumV + V[maxPoz];
            }
            else 
                break;
        }

        System.out.println("Wartosc optymalnie zapakowanego plecaka - metoda PAKUJ CENNE: " + sumW);
        System.out.print("Przedmioty w plecaku: ");

        for (int i = 0; i < N; i++)
            if (rozw[i]) 
		System.out.print(i + " ");

        System.out.println();
    }

    //Wersja 3: Wybieramy w kolejnosci malejacych wartosci ilorazu: wartosc/objetosc
    public static void pakujNaIlorazie()
    {
        boolean [] rozw = new boolean[N]; //tablica na optymalny podzbior
        for (int i=0; i<N; i++) 
            rozw[i] = false; //Na poczatku nic nie zostalo zabrane (pusty plecak)

        int sumW = 0;
        int sumV = 0;

        while(true)
        {
            double maxFrac = 0; // iloraz wartosc/objetosc
            int maxPoz = -1;
            for (int i=0; i<N; i++) //Szukamy najlepszego w sensie ilorazu, ktory jeszcze nie zostal zabrany
            {
                if (!rozw[i]) //jesli jeszcze nie zabrany
                {
                    double frac = (double)W[i]/V[i];
                    if ((sumV+V[i]<=MAX_V)&&(frac>maxFrac)) // spr. czy sie jeszcze zmiesci
                    {
                        maxFrac = frac; 
                        maxPoz = i;
                    }
                }
            }

            if (maxPoz>-1)
            {
                rozw[maxPoz]=true;
                sumW = sumW + W[maxPoz];
                sumV = sumV + V[maxPoz];
            }
            else 
                break;
        }

        System.out.println("Wartosc optymalnie zapakowanego plecaka - metoda PAKUJ NA ILORAZIE: " + sumW);
        System.out.print("Przedmioty w plecaku: ");

        for (int i = 0; i < N; i++)
            if (rozw[i]) 
		System.out.print(i + " ");

        System.out.println();
    }

    public static void main(String[] args)
    {
        pakujMale();
        pakujCenne();
        pakujNaIlorazie();
    }
}

