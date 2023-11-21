package Kolokwium1;

import java.util.Random;

public class MCLiczba
{
    static int duze;
    static int male;
    static Random random = new Random();

    public static void main(String[] args)
    {
        int prawidlowa = random.nextInt(1001);
        int jaka = 500;
        duze = 1001;
        male = 0;
        System.out.println("Wymyślona liczba: " + prawidlowa + "\n");
        jakaLiczba(prawidlowa, jaka,1);
    }

    public static void jakaLiczba(int prawidlowa, int jaka, int podejscia)
    {
        System.out.println("Czy jest to liczba " + jaka + "?");
        if(jaka>prawidlowa)
        {
            System.out.println("ZA DUŻA");
            duze = jaka;
            jaka = random.nextInt(duze - male) + male;
            jakaLiczba(prawidlowa, jaka, ++podejscia);
        }
        else if(jaka<prawidlowa)
        {
            System.out.println("ZA MAŁA");
            male = jaka + 1;
            jaka = random.nextInt(duze - male) + male;
            jakaLiczba(prawidlowa, jaka, ++podejscia);
        }
        else
        {
            System.out.println("TAK");
            System.out.println("\nGratulacje, zgadłem liczbę za " + podejscia + " razem!");
        }
    }
}
