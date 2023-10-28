public class kolokwium1v2z2 {

        public static void main(String[] args) {
            int kwota =97; // Przykładowa kwota, jaką chcemy wydać w groszach (197 oznacza 1.97zł)
            wydajReszte(kwota);
        }

        public static void wydajReszte(int kwota) {
            int[] nominaly = {1, 2, 5, 10, 20, 50, 100, 200, 500};
            int[] dostepneMonety = {5, 7, 4, 1, 5, 3, 0, 2, 5};
            String[] wynik = new String[9];

            for (int i = nominaly.length - 1; i >= 0; i--) {
                int iloscMonet = Math.min(kwota / nominaly[i], dostepneMonety[i]);
                kwota -= iloscMonet * nominaly[i];
                if(nominaly[i] < 100) {
                    wynik[i] = iloscMonet + " monet o nominale " + nominaly[i] + "gr";
                } else {
                    wynik[i] = iloscMonet + " monet o nominale " + (nominaly[i] / 100) + "zł";
                }
            }

            if (kwota > 0) {
                System.out.println("Nie można wydać dokładnej reszty.");
                return;
            }

            for (String s : wynik) {
                if (!s.startsWith("0")) {
                    System.out.println(s);
                }
            }
        }
    }