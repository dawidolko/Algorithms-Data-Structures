package Kolokwium1;

import java.util.Random;

public class DZLiczba
{
    static int duze;
    static int male;

    public static void main(String[] args)
    {
        Random random = new Random();
        int prawidlowa = random.nextInt(1001);
        int jaka = 500;
        duze = 1000;
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
            duze = jaka - 1;
            jaka = duze - (duze - male)/2;
            System.out.println();
            jakaLiczba(prawidlowa, jaka, ++podejscia);
        }
        else if(jaka<prawidlowa)
        {
            System.out.println("ZA MAŁA");
            male = jaka + 1;
            jaka = male + (duze - male)/2;
            System.out.println();
            jakaLiczba(prawidlowa, jaka, ++podejscia);
        }
        else
        {
            System.out.println("TAK");
            System.out.println("\nGratulacje, zgadłem liczbę za " + podejscia + " razem!");
        }
    }
}
