package Kolokwium1;

public class DZBakterie
{
    public static void main(String[] args)
    {
        int[] cele = {1000, 10000, 100000, 1000000}; // Cele rozmnażania bakterii
        for (int cel : cele)
        {
            int czas = obliczCzas(1, cel, 0);
            System.out.println("Populacja zwiększyła się " + cel + " razy po " + czas + " minutach");
        }
    }

    public static int obliczCzas(int aktualnaLiczbaBakterii, int cel, int aktualnyCzas)
    {
        if (aktualnaLiczbaBakterii >= cel) return aktualnyCzas;
        else return obliczCzas(aktualnaLiczbaBakterii * 2, cel, aktualnyCzas + 2); // Obliczanie ilości bakterii
    }
}
