package evolution;

//Klasa kodująca pojedyncze rozwiazanie (zestaw wag)

import java.util.Random;


public class Chromosome 
{
    private double [] weights;
    private double fitness;
    
    public Chromosome(int size)
    {
        weights = new double[size];
        for (int i=0; i<size; i++) weights[i] = 0.0;                
        fitness = 0.0;
    }
    
    public Chromosome(Chromosome chromosome)
    {
        weights = new double[chromosome.size()];
        for (int i=0; i<chromosome.size(); i++) 
        {
            weights[i] = chromosome.getWeight(i);
        }                
        
        fitness = chromosome.getFitness();
    }
    
    //Inicjacja losowa zestawu wag
    public void initRandom()
    {
        Random rnd = new Random();
                        
        for (int i=0; i<weights.length; i++)
        {
            weights[i] = (double)rnd.nextInt(101)/100; //Liczba losowa z przedzialu [0,1]           
        }
    }
    
    
    //Mutacja losowo wybranego genu
    public void mutation()
    {
        Random rnd = new Random();
        int rndIndex = rnd.nextInt(weights.length); //Losujemy numer genu
        weights[rndIndex] = (double)rnd.nextInt(101)/100; //Dokonujemy mutacji (lowowe wybranie wagi z przedzialu [0,1]
        
    }
    
    
    public void copy(Chromosome chromosome)
    {
        weights = new double[chromosome.size()];
        
        for (int i=0; i<size(); i++)
        {
            weights[i] = chromosome.getWeight(i);
        }
        
        fitness = chromosome.getFitness();        
    }
    
    //Pobranie wagi o podanym numerze
    public double getWeight(int index)
    {
        return weights[index];
    }
    
    //Ustawienie wagi o podanym numerze
    public void setWeight(int index, double w)
    {
        weights[index] = w;
    }
    
    //Pobranie wartosci fitness
    public double getFitness()
    {
        return fitness;
    }
    
    
    //Obliczenie fitness
    public void computeFitness()
    {
        //Przykladowe wyliczenie fitness
        //Chodzi o znalezienie wektora, ktory bedzie jak najblizej (0.5, 0.5,...,0.5)
        
        //TUTAJ TRZEBA WSTAWIC WYKONANIE TESTU NA WEKTORZE WAG
        
        //ZAKLADAM, ŻE WARTOŚĆ FITNESS MA BYĆ Z PRZEDZIALU [0,1]
        
        double sum = 0.0;
        
        for (int i=0; i<size(); i++)
        {    
            double w = getWeight(i);
            if (w>0.5)
            {
                sum = sum + Math.abs(1.0-getWeight(i));
            }
            else
            {
                sum = sum + getWeight(i);
            }            
        }    
        
        fitness = sum/size();      
    }
    
    public int size() { return weights.length; }
    
    
}

