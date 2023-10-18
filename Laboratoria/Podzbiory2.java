package asd_lab_1;

public class Podzbiory2 {

    public static void main(String[] args) {
        final int N = 4; // moc zbioru
        int[] tab = new int[N+1];
        int s = (int) Math.pow(2, N);
        for (int l = 0; l < s; l++) {
            System.out.print("{ ");
            for (int i = 0; i < N; i++) {
                if (tab[i] == 1) {
                    System.out.print(i + 1 + " ");
                }
            }
            System.out.println("}");
            int i = 0;
            do {
                if (tab[i] == 1) {
                    tab[i] = 0;
                    i++;
                } else {
                    tab[i] = 1;
                    break;
                }
            } while (true);
            
            for (int j : tab) {
                System.out.print("\t"+j);
            }
            System.out.println("");
        }
    }
}
