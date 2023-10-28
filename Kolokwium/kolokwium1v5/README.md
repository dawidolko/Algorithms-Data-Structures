## ALGORYTMY I STRUKTURY DANYCH - KOLOKWUM 1

Rozwiąż poniższe problemy informatyczne za pomocą wskazanych metod. Napisz kody źródłowe programów rozwiązujących te zadania.

1. **Dany jest pewien ciąg liczbowy \(fn\), której dwa pierwsze wyrazy równe są odpowiednio 2 i 4.** Następny element ciągu równy jest połowie wartości iloczynu dwóch poprzednich wyrazów ciągu.
   - Utwórz klasę, a w niej metodę umożliwiającą wyznaczenie n-tego wyrazu ciągu \(fn\).
   - Używając tej metody, wyznacz osmy wyraz tego ciągu. (9 pkt)

2. **Dane są odległości między miastami prezentowane w poniższej tabeli:**

   | Miasta     | Warszawa | Katowice | Kraków | Zakopane | Lwów | Wiedeń | Budapest | Bukareszt | Zagrzeb | Sofia |
   |------------|----------|----------|--------|----------|------|--------|----------|-----------|---------|-------|
   | Warszawa   | -        | 300      | 402    | 536      | brak | brak   | brak     | brak      | brak    | brak  |
   | Katowice   | 300      | -        | 80     | 220      | brak | brak   | brak     | brak      | brak    | brak  |
   ... (i tak dalej dla wszystkich miast)

   Utwórz projekt, w którym używaj metody algorytmu zachłannego. Następnie wywołaj utworzoną metodę w funkcji głównej w celu wypisania kolejności odwiedzania miast i sumarycznej długości trasy.

   **Przyjmij heurystykę w której:**
   - Pierwsze miasto (z którego wyruszamy) wybierane jest na podstawie największej liczby możliwych połączeń do innych miast (wylicza program).
   - Kolejne miasta wybierane są na podstawie kryterium najkrótszej drogi. (9 pkt)

---

**Warunkiem otrzymania oceny pozytywnej jest uzyskanie co najmniej 50% możliwych punktów z każdego zadania!**

