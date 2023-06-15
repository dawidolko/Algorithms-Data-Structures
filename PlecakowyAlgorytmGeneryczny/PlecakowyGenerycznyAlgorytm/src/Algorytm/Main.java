package Algorytm;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] weights = {10, 20, 30};
        int[] values = {60, 100, 120};
        int capacity = 50;
        int populationSize = 100;
        double mutationRate = 0.1;  // Increased mutation rate
        int numGenerations = 2000;  // Increased number of generations

        KnapsackGenetic knapsackGenetic = new KnapsackGenetic(weights, values, capacity, populationSize, mutationRate);
        int[] solution = knapsackGenetic.solve(numGenerations);

        System.out.println("Best solution: " + Arrays.toString(solution));
        System.out.println("Best value: " + knapsackGenetic.calculateValue(solution));
    }
}

