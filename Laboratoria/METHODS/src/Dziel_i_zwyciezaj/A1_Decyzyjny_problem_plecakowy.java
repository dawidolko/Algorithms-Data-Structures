package Dziel_i_zwyciezaj;

public class A1_Decyzyjny_problem_plecakowy {

    final static int[] objetosci = {6, 2, 3, 2, 3, 1};
    final static int[] wartosci = {6, 4, 5, 7, 10, 2};
    final static int MAX = 10;
    final static int przedmioty = objetosci.length;

    // Metoda rekurencyjna do obliczania maksymalnej wartości, jaką można umieścić w plecaku
    public static int plecak(int i, int obj) {
        if (i == 0) {
            // Jeśli jest to pierwszy przedmiot, sprawdzamy, czy się mieści
            if (obj < objetosci[i]) return 0; // Nie mieści się, zwracamy 0
            else return wartosci[i]; // Mieści się, zwracamy jego wartość
        } else if (obj < objetosci[i]) {
            // Jeśli przedmiot się nie mieści, nie bierzemy go
            return plecak(i - 1, obj);
        } else {
            // Obliczamy wartość plecaka bez tego przedmiotu
            int bezPrzedmiotu = plecak(i - 1, obj);
            // Obliczamy wartość plecaka z tym przedmiotem
            int zPrzedmiotem = wartosci[i] + plecak(i - 1, obj - objetosci[i]);
            // Zwracamy większą wartość z obliczonych
            if (bezPrzedmiotu > zPrzedmiotem) return bezPrzedmiotu;
            else return zPrzedmiotem;
        }
    }

    public static void main(String[] args) {
        // Wywołujemy metodę rekurencyjną i wyświetlamy wynik
        System.out.println("Najlepsza wartosc plecaka: " + plecak(przedmioty - 1, MAX));
    }
}
