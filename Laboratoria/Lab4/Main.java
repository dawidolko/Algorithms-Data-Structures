public class Main {
    public static void main(String[] args) {

        //METODA PROGRAMOWANIA DYNAMICZNEGO

        //Decyzyjny problem plecakowy

        final int maxWeight = 10;
        final int[] weights = {6, 2, 3, 2, 3, 1};
        final int[] values = {6, 4, 5, 7, 10, 2};
        final int items = weights.length;

        int[][] tab = new int[items][maxWeight+1];

        for (int i=0;i<maxWeight+1;i++) {
            if (weights[0]>i) tab[0][i] = 0;
            else tab[0][i] = values[0];
        }

        for (int i=1;i<items;i++) {
            for (int j=0;j<maxWeight+1;j++) {
                if (weights[i]>j) tab[i][j] = tab[i-1][j];
                else {
                    tab[i][j] = Math.max(tab[i-1][j], values[i]+tab[i-1][j-weights[i]]);
                }
            }
        }

        System.out.println("Najlepsza wartość plecaka to " + tab[items-1][maxWeight] + ".");
    }
}