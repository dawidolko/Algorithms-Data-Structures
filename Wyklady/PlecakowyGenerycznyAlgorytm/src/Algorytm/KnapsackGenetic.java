package Algorytm;

import java.util.Arrays;
import java.util.Random;

class KnapsackGenetic {
    private final Random random = new Random();
    private final int[] weights;
    private final int[] values;
    private final int capacity;
    private final int populationSize;
    private final double mutationRate;
    private int[][] population;
    private int[] fitness;

    public KnapsackGenetic(int[] weights, int[] values, int capacity, int populationSize, double mutationRate) {
        this.weights = weights;
        this.values = values;
        this.capacity = capacity;
        this.populationSize = populationSize;
        this.mutationRate = mutationRate;
        this.population = new int[populationSize][weights.length];
        this.fitness = new int[populationSize];

        initializePopulation();
        calculateFitness();
    }

    public int[] solve(int numGenerations) {
        for (int i = 0; i < numGenerations; i++) {
            int[][] newPopulation = new int[populationSize][weights.length];

            for (int j = 0; j < populationSize; j++) {
                int[] parent1 = population[selectParent()];
                int[] parent2 = population[selectParent()];
                int[] child = crossover(parent1, parent2);
                mutate(child);
                newPopulation[j] = child;
            }

            population = newPopulation;
            calculateFitness();
        }

        return population[bestSolutionIndex()];
    }

    private void initializePopulation() {
        for (int i = 0; i < populationSize; i++) {
            int[] individual = new int[weights.length];
            for (int j = 0; j < weights.length; j++) {
                individual[j] = random.nextBoolean() ? 1 : 0;
            }
            population[i] = individual;
        }
    }

    private void calculateFitness() {
        for (int i = 0; i < populationSize; i++) {
            fitness[i] = calculateValue(population[i]);
        }
    }

    private int selectParent() {
        int fitnessSum = Arrays.stream(fitness).sum();
        if (fitnessSum <= 0) {
            initializePopulation();
            calculateFitness();
            fitnessSum = Arrays.stream(fitness).sum();
        }
        int limit = random.nextInt(fitnessSum);
        int fitnessCounter = 0;
        for (int i = 0; i < populationSize; i++) {
            fitnessCounter += fitness[i];
            if (fitnessCounter >= limit) {
                return i;
            }
        }
        return populationSize - 1;
    }

    private int[] crossover(int[] parent1, int[] parent2) {
        int crossoverPoint = random.nextInt(weights.length);
        int[] child = new int[weights.length];
        for (int i = 0; i < weights.length; i++) {
            child[i] = i < crossoverPoint ? parent1[i] : parent2[i];
        }
        return child;
    }

    private void mutate(int[] individual) {
        for (int i = 0; i < weights.length; i++) {
            if (random.nextDouble() < mutationRate) {
                individual[i] = individual[i] == 0 ? 1 : 0;
            }
        }
    }

    private int bestSolutionIndex() {
        int bestValue = 0;
        int bestIndex = 0;
        for (int i = 0; i < populationSize; i++) {
            int currentValue = calculateValue(population[i]);
            if (currentValue > bestValue) {
                bestValue = currentValue;
                bestIndex = i;
            }
        }
        return bestIndex;
    }

    public int calculateValue(int[] individual) {
        int weightSum = 0;
        int valueSum = 0;
        for (int i = 0; i < individual.length; i++) {
            if (individual[i] == 1) {
                weightSum += weights[i];
                valueSum += values[i];
            }
        }
        return weightSum > capacity ? 0 : valueSum;
    }
}