package Kolokwium1;

public class CiagLiczbowyPD
{
    private static final int N = 10;

    public static void main(String[] args)
    {
        int liczba = obliczCiag();
        System.out.println("Obliczona liczba dla N = " + N + " wynosi: " + liczba);
    }

    private static int obliczCiag()
    {
        int[] wyniki = new int[N + 1];
        wyniki[1] = 1;
        wyniki[2] = 1;
        for(int i = 3; i <= N; i++)
        {
            if(i % 3 == 0) wyniki[i] = 2 * wyniki[i - 1];
            else if(i % 3 == 1) wyniki[i] = (int) Math.pow(wyniki[i - 2], 2);
            else wyniki[i] = (int) Math.pow(2, wyniki[i - 3]);
        }
        return wyniki[N];
    }
}
