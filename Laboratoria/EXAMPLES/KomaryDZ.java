package Kolokwium1;

public class KomaryDZ
{
    private static double POPULACJA = 1000;
    private static double SAMICE = 550;
    private static double SAMCE = 450;
    public static double tygodnie = 50; // Wartość do regulacji według użytkownika

    public static void main(String[] args)
    {
        obliczKomary();
    }

    private static void obliczKomary()
    {
        double ileSamcow, ileSamic, ileRazem;
        for(int i = 1; i <= tygodnie; i++)
        {
            ileRazem = (POPULACJA * 0.1); // Ile rozrodzi się nowych komarów
            ileSamcow = (ileRazem * 0.45); // Ile nowych samców
            ileSamic = ileRazem - ileSamcow; // Ile nowych samic
            SAMICE = (SAMICE * 0.95); // Ile pozostanie starych samic po wymarciu
            SAMCE = (SAMCE * 0.98); // Ile pozostanie starych samców po wymarciu
            SAMICE += ileSamic;
            SAMCE += ileSamcow;
            POPULACJA = SAMCE + SAMICE;
            System.out.println("Populacja po " + i + " tygodniach wynosi " + SAMICE + " samic i " + SAMCE + " samców");
            System.out.println("Razem: " + POPULACJA + "\n");
            if(SAMCE >= SAMICE)
            {
                System.out.println("Po " + i + " liczba samców zrówna się lub przewyższy liczbę samic");
                break;
            }
        }
    }
}
