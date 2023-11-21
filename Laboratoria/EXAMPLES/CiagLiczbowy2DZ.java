package Kolokwium1;

public class CiagLiczbowy2DZ
{
    private static final int N = 5;

    public static void main(String[] args)
    {
        int liczba = obliczCiag(N);
        System.out.println("Obliczona liczba dla N = " + N + " wynosi: " + liczba);
    }

    private static int obliczCiag(int i)
    {
        if(i == 1 || i == 2) return 1;
        else return (obliczCiag(i - 1) * obliczCiag(i - 2)) * 3;
    }
}
