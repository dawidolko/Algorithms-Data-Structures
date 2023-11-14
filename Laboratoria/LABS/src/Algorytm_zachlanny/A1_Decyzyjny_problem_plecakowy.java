package Algorytm_zachlanny;

public class A1_Decyzyjny_problem_plecakowy {

    // Stałe przechowujące objętości i wartości przedmiotów oraz maksymalną pojemność plecaka
    final static int[] objetosci = {6, 2, 3, 2, 3, 1};
    final static int[] wartosci = {6, 4, 5, 7, 10, 2};
    final static int MAX = 10; // Maksymalna objętość plecaka
    final static int przedmioty = objetosci.length; // Liczba dostępnych przedmiotów

    public static void main(String[] args) {
        // Wywołanie trzech różnych strategii rozwiązywania problemu plecakowego
        poObjetosci();
        poWartosci();
        poWspolczynniku();
    }

    public static void poObjetosci() {
        boolean[] tab = new boolean[przedmioty]; // Tablica śledząca, które przedmioty zostały wybrane

        int objetosc = 0; // Aktualna objętość plecaka
        int wartosc = 0;  // Aktualna wartość przedmiotów w plecaku

        // Pętla działa, dopóki znajdują się przedmioty, które można dodać do plecaka
        while (true) {
            int najmniejszaObjetosc = Integer.MAX_VALUE;
            int pozycja = -1; // Pozycja wybranego przedmiotu

            // Pętla szukająca przedmiotu o najmniejszej objętości, który można dodać do plecaka
            for (int i = 0; i < przedmioty; i++) {
                if (!tab[i] && objetosc + objetosci[i] <= MAX && objetosci[i] < najmniejszaObjetosc) {
//                    System.out.println(!tab[i]+" i "+ objetosc+"+"+objetosci[i]+"<="+MAX+" i "+objetosci[i]+"<"+najmniejszaObjetosc);
                    najmniejszaObjetosc = objetosci[i];
                    pozycja = i;
                }
            }

            // Dodanie przedmiotu do plecaka, jeśli znaleziono odpowiedni przedmiot
            if (pozycja > -1) {
                tab[pozycja] = true; // Oznaczenie przedmiotu jako wybranego
                wartosc += wartosci[pozycja]; // Dodanie wartości przedmiotu do łącznej wartości
                objetosc += objetosci[pozycja]; // Dodanie objętości przedmiotu do łącznej objętości
            } else {
                break; // Zakończenie pętli, jeśli nie można dodać więcej przedmiotów
            }
        }

        // Wyświetlenie wyników
        System.out.print("Przedmioty: ");
        for (int i = 0; i < przedmioty; i++) {
            if (tab[i]) {
                System.out.print(i + " "); // Wyświetlanie indeksów wybranych przedmiotów
            }
        }
        System.out.println("\tWartosc: " + wartosc); // Wyświetlenie łącznej wartości przedmiotów w plecaku
    }

    public static void poWartosci() {
        boolean[] tab = new boolean[przedmioty]; // Tablica śledząca, które przedmioty zostały wybrane

        int objetosc = 0; // Aktualna objętość plecaka
        int wartosc = 0;  // Aktualna wartość przedmiotów w plecaku

        // Pętla działa, dopóki znajdują się przedmioty, które można dodać do plecaka
        while (true) {
            int pozycja = -1; // Pozycja wybranego przedmiotu
            int maksymalnaWartosc = Integer.MIN_VALUE; // Największa znaleziona wartość przedmiotu

            // Pętla szukająca przedmiotu o największej wartości, który można dodać do plecaka
            for (int i = 0; i < przedmioty; i++) {
                if (!tab[i] && wartosci[i] > maksymalnaWartosc && objetosc + objetosci[i] <= MAX) {
//                    System.out.println(!tab[i]+" i "+wartosci[i]+">"+maksymalnaWartosc+" i "+objetosci[i]+"<="+MAX);
                    maksymalnaWartosc = wartosci[i];
                    pozycja = i;
                }
            }

            // Dodanie przedmiotu do plecaka, jeśli znaleziono odpowiedni przedmiot
            if (pozycja > -1) {
                tab[pozycja] = true; // Oznaczenie przedmiotu jako wybranego
                wartosc += wartosci[pozycja]; // Dodanie wartości przedmiotu do łącznej wartości
                objetosc += objetosci[pozycja]; // Dodanie objętości przedmiotu do łącznej objętości
            } else {
                break; // Zakończenie pętli, jeśli nie można dodać więcej przedmiotów
            }
        }

        // Wyświetlenie wyników
        System.out.print("Przedmioty: ");
        for (int i = 0; i < przedmioty; i++) {
            if (tab[i]) {
                System.out.print(i + " "); // Wyświetlanie indeksów wybranych przedmiotów
            }
        }
        System.out.println("\tWartosc: " + wartosc); // Wyświetlenie łącznej wartości przedmiotów w plecaku
    }

    public static void poWspolczynniku() {
        boolean[] tab = new boolean[przedmioty]; // Tablica śledząca, które przedmioty zostały wybrane

        double[] wspolczynniki = new double[przedmioty];
        for (int i = 0; i < przedmioty; i++) {
            wspolczynniki[i] = (double) wartosci[i] / objetosci[i]; // Obliczanie współczynnika wartości do objętości dla każdego przedmiotu
        }

        int objetosc = 0; // Aktualna objętość plecaka
        int wartosc = 0;  // Aktualna wartość przedmiotów w plecaku

        // Pętla działa, dopóki znajdują się przedmioty, które można dodać do plecaka
        while (true) {
            int pozycja = -1; // Pozycja wybranego przedmiotu
            double najWspolczynnik = Double.MIN_VALUE; // Największy znaleziony współczynnik

            // Pętla szukająca przedmiotu z największym współczynnikiem, który można dodać do plecaka
            for (int i = 0; i < przedmioty; i++) {
                if (!tab[i] && wspolczynniki[i] > najWspolczynnik && objetosc + objetosci[i] <= MAX) {
                    System.out.println(!tab[i] +" i "+ wspolczynniki[i] +" > "+ najWspolczynnik +" i "+ objetosc +" + "+ objetosci[i] +" <= "+ MAX);
                    najWspolczynnik = wspolczynniki[i];
                    pozycja = i;
                }
            }

            // Dodanie przedmiotu do plecaka, jeśli znaleziono odpowiedni przedmiot
            if (pozycja > -1) {
                tab[pozycja] = true; // Oznaczenie przedmiotu jako wybranego
                wartosc += wartosci[pozycja]; // Dodanie wartości przedmiotu do łącznej wartości
                objetosc += objetosci[pozycja]; // Dodanie objętości przedmiotu do łącznej objętości
            } else {
                break; // Zakończenie pętli, jeśli nie można dodać więcej przedmiotów
            }
        }

        // Wyświetlenie wyników
        System.out.print("Przedmioty: ");
        for (int i = 0; i < przedmioty; i++) {
            if (tab[i]) {
                System.out.print(i + " "); // Wyświetlanie indeksów wybranych przedmiotów
            }
        }
        System.out.println("\tWartosc: " + wartosc); // Wyświetlenie łącznej wartości przedmiotów w plecaku
    }
}
