package C.C2_DB;

// C1 Implementacja metody sortowania przez wybór "Selection Sort" - DB

import java.util.Random;

public class SelectionSort {
    private static int[] table;
    private static int N = 10;

    public static void main(String[] args) {
        table = new int[N];

        // Wypełnienie tablicy losowymi wartościami
        Random rand = new Random();
        for (int i = 0; i < table.length; i++) {
            table[i] = rand.nextInt(100);
        }

        System.out.println("Przed sortowaniem:");
        print();

        selectionSort();  // Sortowanie przez wybór

        System.out.println("Po sortowaniu:");
        print();
    }

    public static void selectionSort() {
        for (int i = 0; i < table.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < table.length; j++) {
                if (table[j] < table[minPos]) {
                    minPos = j;
                }
            }
            swap(i, minPos);
        }
    }

    public static void swap(int one, int two) {
        int temp = table[one];
        table[one] = table[two];
        table[two] = temp;
    }

    public static void print() {
        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }
}
