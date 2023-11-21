package Kolokwium1;

public class CIagLiczbowy3DZ
{
    private static final int N = 8;

    public static void main(String[] args)
    {
        int wartosc = obliczCiag(N);
        System.out.println("Wartość ciągu dla N = " + N + " wyniesie: " + wartosc);
    }

    private static int obliczCiag(int n)
    {
        if(n == 1) return 2;
        else if(n == 2) return 4;
        else return ((obliczCiag(n - 1) * obliczCiag(n - 2)) / 2);
    }
}
