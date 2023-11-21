package Kolokwium1;

public class DZKroliki
{
    public static void main(String[] args)
    {
        kroliki(1,0,1,1);
    }

    public static void kroliki(int mlode, int stare, int miesiac, int zobacz)
    {
        int populacja = mlode+stare;
        if(populacja>=100 && zobacz==1) { System.out.println("\nPo " + miesiac + " miesiącach populacja królików przekroczyła liczbę 100 par"); zobacz++; }
        if(populacja>=1_000 && zobacz==2) { System.out.println("\nPo " + miesiac + " miesiącach populacja królików przekroczyła liczbę 1_000 par"); zobacz++; }
        if(populacja>=10_000 && zobacz==3) { System.out.println("\nPo " + miesiac + " miesiącach populacja królików przekroczyła liczbę 10_000 par"); zobacz++; }
        if(populacja>=100_000 && zobacz==4) { System.out.println("\nPo " + miesiac + " miesiącach populacja królików przekroczyła liczbę 100_000 par"); zobacz++; }
        if(populacja>=1_000_000 && zobacz==5) { System.out.println("\nPo " + miesiac + " miesiącach populacja królików przekroczyła liczbę 1_000_000 par"); zobacz++; }
        int noweMlode=stare;
        stare+=mlode;
        if(stare+mlode<=Integer.MAX_VALUE/2) { kroliki(noweMlode,stare,miesiac+1,zobacz); }
    }
}
