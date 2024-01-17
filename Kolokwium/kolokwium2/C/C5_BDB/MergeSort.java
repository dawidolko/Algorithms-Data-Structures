package C.C5_BDB;
// C1 Implementacja metody sortowania przez scalanie "MergeSort" - BDB
// Importowanie potrzebnych bibliotek Java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// Deklaracja klasy MergeSort
public class MergeSort {
    // Deklaracja i inicjalizacja listy, która będzie sortowana
    public static ArrayList<Integer> list = new ArrayList<>();
    // Metoda sortowania przez scalanie
    public static void mergeSort(int left, int right) {
        // Warunek stopu dla rekurencji
        if (left < right) {
            // Obliczenie środka listy
            int center = (left + right) / 2;
            // Wywołanie sortowania przez scalanie dla lewej i prawej połowy listy
            mergeSort(left, center);
            mergeSort(center + 1, right);
            // Scalanie dwóch posortowanych podlist w jedną posortowaną listę
            merge(left, center, right);
        }
    }
    // Metoda scalania dwóch podlist
    public static void merge(int left, int center, int right) {
        // Tworzenie tymczasowej listy na wynik scalania
        ArrayList<Integer> listP = new ArrayList<>();
        int i = left;
        int j = center + 1;
        // Scalanie elementów z dwóch podlist
        while ((i <= center) || (j <= right)) {
            if (i > center) {
                listP.add(list.get(j));
                j++;
            } else if (j > right) {
                listP.add(list.get(i));
                i++;
            } else {
                if (list.get(i) <= list.get(j)) {
                    listP.add(list.get(i));
                    i++;
                } else {
                    listP.add(list.get(j));
                    j++;
                }
            }
        }
        // Kopiowanie posortowanych elementów z listy tymczasowej z powrotem do oryginalnej listy
        int l = left;
        for (int i2 = 0; i2 < listP.size(); i2++) {
            list.set(l, listP.get(i2));
            l++;
        }
    }
    // Metoda główna programu
    public static void main(String[] args) {
        // Inicjalizacja listy wartościami
        List<Integer> values = Arrays.asList(4, 9, 3, 2, 8, -4, -9, 9, 0, 1);
        list.addAll(values);
        // Wyświetlanie oryginalnej listy
        for (int e : list) {
            System.out.print(e + " ");
        }
        // Sortowanie listy za pomocą algorytmu sortowania przez scalanie
        int nElems = list.size();
        mergeSort(0, nElems - 1);
        // Wyświetlanie posortowanej listy
        System.out.println();
        for (int e : list) {
            System.out.print(e + " ");
        }
    }
}
