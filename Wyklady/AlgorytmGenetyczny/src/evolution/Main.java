package evolution;


//Klasa uruchamiajaca algorytm ewolucyjny

public class Main 
{    
    public static void main(String[] args)
    {
        System.out.println("Test ewolucji");
        try
        {
            Evolution evolution = new Evolution();
            evolution.makeEvolution();            
        }
        catch (Exception e)
        {
            System.out.println("ERROR: "+e.getMessage());
            e.printStackTrace();
        }
        System.out.println("KONIEC");
    }
    
}
