package Programowanie_dynamiczne;

public class A1_Decyzyjny_problem_plecakowy {
    public static void main(String[] args) {
        final int[] objetosci = {6, 2, 3, 2, 3, 1};
        final int[] wartosci = {6, 4, 5, 7, 10, 2};
        final int MAX = 10;
        final int przedmioty = objetosci.length;
        int[][] tab = new int[przedmioty][MAX+1];

        for (int i=0;i<przedmioty;i++) {
            for (int j=0;j<MAX+1;j++) {
                if (i==0 && objetosci[i]>j) tab[i][j]=0;
                else if (i==0 && objetosci[i]<=j) tab[i][j] = wartosci[i];
                else if (i>0 && objetosci[i]>j) tab[i][j] = tab[i-1][j];
                else if (i>0 && objetosci[i]<=j) tab[i][j] = Math.max(tab[i - 1][j], wartosci[i] + tab[i - 1][j - objetosci[i]]);
            }
        }

        System.out.println(tab[przedmioty-1][MAX]);
    }
}
