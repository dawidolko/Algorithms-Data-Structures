package Kolokwium1;

public class EpidemiaPD
{
    private static double liczbaOsob = 100_000;
    private static double zdrowi = 100_000 - 10;
    private static double chorzy = 10;
    private static double chorzyCalkowicie = 10;
    private static double wyzdrowiali = 0;
    private static double[] dniZarazania = new double[7];
    private static int dzien = 1;
    public static int ileDniSprawdzic = 35;

    public static void main(String[] args)
    {
        obliczEpidemie();
    }

    private static void obliczEpidemie()
    {
        dniZarazania[0] = chorzy;
        while (dzien <= ileDniSprawdzic)
        {
            System.out.println("Dzień: " + dzien + ", zdrowi nie chorowali: " + zdrowi + ", zdrowi chorowali: " + wyzdrowiali + ", chorzy: " + chorzyCalkowicie);
            wyzdrowiali += dniZarazania[6];
            chorzyCalkowicie -= dniZarazania[6];
            for(int i = 6; i > 0; i--) { dniZarazania[i] = dniZarazania[i - 1]; }
            double noweZakarzenia = chorzyCalkowicie * 0.5 * 2;
            if(dniZarazania[0] > zdrowi) noweZakarzenia = zdrowi;
            dniZarazania[0] = noweZakarzenia;
            chorzyCalkowicie += dniZarazania[0];
            zdrowi -= dniZarazania[0];
            dzien++;
            if(chorzyCalkowicie > liczbaOsob / 2)
            {
                System.out.println("Epidemia dosięgnie ponad połowę populacji w dzień " + dzien + ". Będzie wtedy " + chorzyCalkowicie + " chorych osób.");
                break;
            }
        }
    }
}
