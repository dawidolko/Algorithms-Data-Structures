package Kolokwium1;

public class PDKroliki
{
    public static void main(String[] args)
    {
        final int N = 35; // N-ty wyraz ciągu
        kroliki(N);
    }

    public static void kroliki(int n)
    {
        int[] populacja = new int[n+1];
        populacja[1] = 1;
        populacja[2] = 1;
        int zobacz = 1;
        for (int i=3; i<populacja.length; i++)
        {
            populacja[i] = populacja[i-1] + populacja[i-2];
            if(populacja[i]>=100 && zobacz==1) { System.out.println("\nPo " + i + " miesiącach populacja królików przekroczyła liczbę 100 par"); zobacz++; }
            if(populacja[i]>=1_000 && zobacz==2) { System.out.println("\nPo " + i + " miesiącach populacja królików przekroczyła liczbę 1_000 par"); zobacz++; }
            if(populacja[i]>=10_000 && zobacz==3) { System.out.println("\nPo " + i + " miesiącach populacja królików przekroczyła liczbę 10_000 par"); zobacz++; }
            if(populacja[i]>=100_000 && zobacz==4) { System.out.println("\nPo " + i + " miesiącach populacja królików przekroczyła liczbę 100_000 par"); zobacz++; }
            if(populacja[i]>=1_000_000 && zobacz==5) { System.out.println("\nPo " + i + " miesiącach populacja królików przekroczyła liczbę 1_000_000 par"); zobacz++; }
        }
    }
}
