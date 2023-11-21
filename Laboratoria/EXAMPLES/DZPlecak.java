package Kolokwium1;

public class DZPlecak
{
    final static int N = 6;                 // Liczba przedmiotów
    final static int MAX_V = 10;            // Objętość plecaka
    final static int[] VI = {6,2,3,2,3,1};  // Objętości przedmiotów
    final static int[] WI = {6,4,5,7,10,2}; // Wartości przedmiotów

    public static void main(String[] args)
    {
        int wartoscPlecaka = plecak(N - 1, MAX_V);
        System.out.println("Wartość plecaka: " + wartoscPlecaka);
    }

    public static int plecak(int i, int v)
    {
        // W przypadku, gdy i == 0:
        // Jeżeli do zapakowania mamy tylko przedmiot z numerem 0 i nie mieści się on do plecaka,
        // to maksymalna wartość plecaka o objętości v jest równa 0.
        if (i == 0 && v < VI[0]) { return 0; }
        // Jeżeli do zapakowania mamy tylko przedmiot z numerem 0 i mieści się on do plecaka,
        // to maksymalna wartość plecaka o objętości v jest równa wartości tego przedmiotu.
        else if (i == 0) { return WI[0]; }

        // W przypadku, gdy i > 0:
        // Jeżeli i-ty przedmiot nie mieści się do plecaka, to maksymalna wartość plecaka o objętości v,
        // zapakowanego spośród przedmiotów ponumerowanych od 0 do i jest równa maksymalnej wartości
        // plecaka o objętości v, zapakowanego spośród przedmiotów ponumerowanych od 0 do i − 1.
        int w1 = plecak(i - 1, v);
        int w2 = WI[i] + plecak(i - 1, v - VI[i]);
        if (v < VI[i]) { return w1; }
        // Jeżeli i-ty przedmiot mieści się do plecaka, to maksymalna wartość plecaka o objętości v,
        // zapakowanego spośród przedmiotów ponumerowanych od 0 do i jest równa większej z dwu wartości:
            // a) maksymalnej wartości plecaka o objętości v, zapakowanego spośród przedmiotów ponumerowanych od 0 do i − 1,
            // b) maksymalnej wartości plecaka o objętości v − Vi, zapakowanego spośród przedmiotów ponumerowanych od 0 do i − 1 plus wartość i-tego przedmiotu.
        else { return Math.max(w1, w2); }
    }
}
