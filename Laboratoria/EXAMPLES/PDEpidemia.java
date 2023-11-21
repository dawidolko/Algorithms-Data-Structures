package Kolokwium1;

public class PDEpidemia
{
    static int chorychMAX = 0; // Liczba maksymalnie chorych osób
    static int dzienChorychMAX = 0; // Liczba chorych w danym dniu
    static final int LUDZI = 100000; // Ile ludzi bierzemy pod lupę
    static final int DNI_CHOROBY = 7; // Ile trwa chorowanie
    static final int DNI_OKRESU_PRZEJSCIOWEGO = 14; // Po ilu dniach można znowu zarażać
    static int[] chorzyDni = new int[DNI_CHOROBY]; // Tablica ile w danym dniu jest chorych osób
    static int[] zdroweOsoby = new int[DNI_OKRESU_PRZEJSCIOWEGO]; // Tablica ile w danym dniu jest zdrowych osób

    public static void main(String[] args)
    {
        System.out.println("Wariant 1 - wyzdrowiałe osoby nie mogą zarażać:");
        wykonajSymulacje(false);
        chorychMAX = 0;
        System.out.println("\nWariant 2 - wyzdrowiałe osoby mogą zarażać po 2 tygodniach:");
        wykonajSymulacje(true);
    }

    private static void wykonajSymulacje(boolean czyMogaZarazac)
    {
        int zdrowiNowi = LUDZI - 10; // Ile zdrowych osób
        int zdrowiOzdrowiency = 0; // Ile zdrowych osób co już przechorowało
        int chorzy = 10; // Ile chorych osób
        int dzien = 1; // Dzień epidemii
        chorzyDni[0] = 10;

        while (chorzy > 0)
        {
            while (chorzy > 0)
            {
                int chorzyNowi = obliczNowychChorych(zdrowiNowi);
                if (czyMogaZarazac)
                {
                    zdrowiNowi = aktualizujOzdrowiency(chorzyNowi, zdrowiNowi);
                }
                else
                {
                    zdrowiNowi -= chorzyNowi;
                }
                aktualizujChorych(chorzyNowi);

                chorzy = obliczLiczbeChorych();
                zdrowiOzdrowiency += chorzyDni[DNI_CHOROBY - 1];
                if (chorzy > chorychMAX)
                {
                    chorychMAX = chorzy;
                    dzienChorychMAX = dzien;
                }
                dzien++;
            }

        System.out.println("Epidemia skończy się po " + dzien + " dniach");
        System.out.println("Najwięcej chorych będzie w " + dzienChorychMAX + " dzień");
        }
    }

    private static int obliczNowychChorych(int zdrowiNowi)
    {
        int nowiChorzy = 0;
        for (int i = 0; i < DNI_CHOROBY; i++)
        {
            nowiChorzy += chorzyDni[i] * 2;
        }
        return Math.min(nowiChorzy, zdrowiNowi);
    }

    private static void aktualizujChorych(int chorzyNowi)
    {
        System.arraycopy(chorzyDni, 0, chorzyDni, 1, DNI_CHOROBY - 1);
        chorzyDni[0] = chorzyNowi;
    }

    private static int aktualizujOzdrowiency(int chorzyNowi, int zdrowiNowi)
    {
        System.arraycopy(zdroweOsoby, 0, zdroweOsoby, 1, DNI_OKRESU_PRZEJSCIOWEGO - 1);
        zdroweOsoby[0] = chorzyDni[DNI_CHOROBY - 1];
        return zdrowiNowi + zdroweOsoby[DNI_OKRESU_PRZEJSCIOWEGO - 1] - chorzyNowi;
    }

    private static int obliczLiczbeChorych()
    {
        int sumaChorych = 0;
        for (int i = 0; i < DNI_CHOROBY; i++)
        {
            sumaChorych += chorzyDni[i];
        }
        return sumaChorych;
    }
}
