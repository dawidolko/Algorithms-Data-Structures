package evolution;

import java.util.ArrayList;
import java.util.Random;


//Klasa reprezentujaca populacje chromosomow (potencjalnych rozwiazan)

public class Population 
{
    private ArrayList<Chromosome> population;
    
    public Population()
    {
        population = new ArrayList<Chromosome>();        
    }
    
    public int size() { return population.size(); }
    
    public Chromosome getChromosome(int index)
    {
        return population.get(index);
    }
    
    public void addChromosome(Chromosome chromosome)
    {
        population.add(chromosome);
    }
    
    //Inicjacja populacji chromosomow
    public void initRandom(int chromosomeSize,int populationSize)
    {
        for (int i=0; i<populationSize; i++)
        {
            Chromosome chromosome = new Chromosome(chromosomeSize);
            chromosome.initRandom();
            population.add(chromosome);
        }        
    }
    
    //Wyliczenie funkcji przystosowania dla kazdego chromosomu populacji
    public void computeFitness()
    {
        for (int i=0; i<size(); i++)
        {
            Chromosome chromosome = population.get(i);
            chromosome.computeFitness();
        }        
    }
    
    //Wyliczenie numeru najlepszego chromosomu, tj. chromosomu o najwayzszym fitness
    public int getBestChromosomeIndex()
    {
        int bestIndex = 0;
        double maxFitness = 0.0;
        for (int i=0; i<size(); i++)
        {
            double locFitness = population.get(i).getFitness();
            if (locFitness>maxFitness)
            {
                 maxFitness = locFitness;
                 bestIndex = i;
            }
        }        
        return bestIndex;
    }
    
    //Wyliczenie numeru chromosomu wybranego zgodnie z "kolem ruletki"
    private int getReproductionIndex(double sumFitness)
    {
        Random random = new Random();
                
        double randFract = (double)random.nextInt(100)/100; //Losowy ulamek z przedzialu [0,1)       
        double threshold = randFract * sumFitness; //Miejsce na kole ruletki
        
        double shortSumFitness = 0.0;
        for (int i=0; i<size(); i++) //Zlokalizowanie wybranego chromosomu
        {
            Chromosome chromosome = getChromosome(i);
            shortSumFitness = shortSumFitness + chromosome.getFitness();            
            if (shortSumFitness>threshold) return i;
        }
        
        throw new IndexOutOfBoundsException("Critical error. size()="+size());        
    }
    
    //Reprodukcja chromosomow wedlug kola ruletki (wybierane jest populationSize chromosomow)
    public Population reproduction(int populationSize)
    {
        Population newPopulation = new Population();
        
        double sumFitness = 0.0;
        for (int i=0; i<size(); i++) //Wyliczenie sumy fitness wszystkich chromosomow
        {
            Chromosome chromosome = getChromosome(i);
            sumFitness = sumFitness + chromosome.getFitness();
        }
        
        //Wybranie chromosomow zgodnie z kolem ruletki
        for (int i=0; i<populationSize; i++)
        {
            int repIndex = getReproductionIndex(sumFitness);            
            Chromosome newChromosome = new Chromosome(getChromosome(repIndex));
            newPopulation.addChromosome(newChromosome);            
        }
                
        return newPopulation;
    }
        
  
    
    public void copy(Population pop)
    {
        population.clear();
        
        for (int i=0; i<pop.size(); i++)
        {
            population.add(pop.getChromosome(i));
        }
    }
    
    //Wylosowanie czy dana operacja losowa ma miec miejsce
    private boolean isRandomOperation(double prob)
    {
        Random random = new Random();
        
        double r = (double)random.nextInt(101)/100;
        
        if (r<=prob) return true;
        else return false;
    }
    
    
    //Mutacja chromosomow
    public void mutation(double probMutation)
    {
        for (int i=0; i<size(); i++)
        {
            if (isRandomOperation(probMutation)) //Losujemy, czy ma byc mutacja z udzialem chromosomu numer i
            {
                Chromosome chromosome = population.get(i);
                chromosome.mutation(); //Dokunujemy mutacji 
            }
        }        
    }
    
    
    //Metoda dokonujaca krzyzowanie dwoch chromosomow o podanych numerach
    private void makeCrossover(int index1,int index2)
    {
        Chromosome chromosome1 = population.get(index1);
        Chromosome chromosome2 = population.get(index2);
        
        Random random = new Random();                
        int crossPoint = random.nextInt(chromosome1.size());
                
        if (crossPoint<chromosome1.size()-1) //Chromosomy wymieniaja sie tylko czescia genow
        {
            //Wymiana genow miedzy chromosomami od poczatku do pozycji crossPoint
            for (int i=0; i<chromosome1.size(); i++)
            {
                if (i<=crossPoint)
                {
                    double temp = chromosome1.getWeight(i);
                    chromosome1.setWeight(i, chromosome2.getWeight(i));                
                    chromosome2.setWeight(i, temp);
                }
                else break;            
            }
        }
    }
    
    //Krzyzowanie chromosomow
    public void crossover(double probCrossover)
    {
        for (int i=0; i<size(); i++)
        {    
            if (isRandomOperation(probCrossover)) //Losujemy, czy ma byc krzyzowanie z udzialem chromosomu numer i
            {
                Random random = new Random();                
                int index2 = random.nextInt(size()); //Losowanie drugiego chromosomu do skrzyzowania
                if (i!=index2)
                {
                    makeCrossover(i,index2); //Dokonujemy krzyzowania
                }
            }
        }         
    }
    
    
    
}
