public class kolokwium1v2z1 {
        public static void main(String[] args) {
            double poczatkowaIlosc = 12.0;
            double czas = obliczCzas(poczatkowaIlosc);
            System.out.println("Aby liczba bakterii była większa niż 1000-krotność początkowej liczby, musi minąć: " + czas + " minut.");
        }

        public static double obliczCzas(double poczatkowaIlosc) {
            double czas = 0;
            double obecnaIlosc = poczatkowaIlosc;
            double docelowaIlosc = poczatkowaIlosc * 1000;

            while (obecnaIlosc < docelowaIlosc) {
                if (czas % 10 == 0 && czas != 0) {
                    obecnaIlosc = obecnaIlosc * 0.5; // co 10 minut umiera 50% bakterii
                }
                obecnaIlosc *= 2; // podział bakterii co 2 minuty
                czas += 2;
            }

            return czas;
        }
    }

