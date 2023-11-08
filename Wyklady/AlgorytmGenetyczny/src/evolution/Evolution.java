package evolution;

public class Evolution 
{
    private Population population;
    
    private double probMutation = 0.1;
    private double probCrossover = 0.3;
    
    public Evolution()
    {
        population = new Population();
    }
     
    
    //Symulacja ewolucji
    public void makeEvolution()
    {
        int chromosomeSize = 5; //Ustawienie dlugosci wektora wag w chromosomie
        int populationSize = 50; //Ustawienie wielkosci populacji
        
        //Inicjacja populacji
        population.initRandom(chromosomeSize, populationSize);        
        
        //Wyliczenie funkcji dopasowania
        population.computeFitness();
        
        int noPopulation = 100000; //Ustawienie liczby pokolen ewolucji
        
        int count = 0;        
        double globMaxFintess = 0.0;
        
        while (count<noPopulation)
        {
            population.crossover(probCrossover); //Krzyzowanie
            
            population.mutation(probMutation); //Mutacja
            
            population.computeFitness(); //Wyliczenie nowych wartosci funkcji dopasowania
            
            population = population.reproduction(populationSize); //Reprodukcja zgodnie z kolem ruletki
            
            int bestLocIndex = population.getBestChromosomeIndex(); //Pobranie numeru najlepszego chromosomu w populacji
            double maxLocFitness = population.getChromosome(bestLocIndex).getFitness();
            
            if (maxLocFitness>globMaxFintess)
            {
                System.out.println("maxFitness="+maxLocFitness);
                globMaxFintess = maxLocFitness;
            }
            
            count++;
        }
        
        //Raport koncowy
        int bestIndex = population.getBestChromosomeIndex(); //Pobranie numeru najlepszego chromosomu w populacji
        Chromosome bestChromosome = population.getChromosome(bestIndex);        
        double bestFitness = bestChromosome.getFitness();        
        System.out.println("Najlepsze fitness="+bestFitness);
        System.out.print("Wagi:");
        for (int i=0; i<bestChromosome.size(); i++)
        {
            double w = bestChromosome.getWeight(i);
            System.out.print(w+" ");
        }
        System.out.println();
    }
    
    
}
