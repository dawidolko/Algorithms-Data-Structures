package Kolokwium1;

public class CiagLiczbowyDZ
{
    private static final int N = 5;

    public static void main(String[] args)
    {
        int liczba = obliczCIag(N);
        System.out.println("Obliczona wartość dla N = " + N + " wynosi: " + liczba);
    }

    static int obliczCIag(int i)
    {
        if(i == 1) return 1;
        else if(i == 2) return 3;
        else return obliczCIag(i - 1) + obliczCIag(i - 2);
    }
}
