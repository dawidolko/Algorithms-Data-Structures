
public class kolokwium1v2z2 {

    public static void main(String[] args) {
        int kwota = 197; // Przykładowa kwota, jaką chcemy wydać w groszach (197 oznacza 1.97zł)
        wydajReszte(kwota);
    }

    public static void wydajReszte(int kwota) {
        int[] nominaly = {1, 2, 5, 10, 20, 50, 100, 200, 500}; // Poprawiona zgodnie z dostępnymi monetami
        int[] dostepneMonety = {5, 7, 4, 1, 5, 3, 0, 2, 5}; // Zaktualizowano zgodnie z treścią zadania
        int[] wynik = new int[nominaly.length]; // Tablica do przechowywania ilości monet

        for (int i = nominaly.length - 1; i >= 0; i--) {
            while (kwota >= nominaly[i] && dostepneMonety[i] > 0) {
                kwota -= nominaly[i];
                dostepneMonety[i]--;
                wynik[i]++;
            }
        }

        if (kwota > 0) {
            System.out.println("Nie można wydać dokładnej reszty.");
        } else {
            for (int i = 0; i < wynik.length; i++) {
                if (wynik[i] > 0) {
                    System.out.println("Monet o nominale " + nominaly[i] + "gr: " + wynik[i]);
                }
            }
        }
    }
}
