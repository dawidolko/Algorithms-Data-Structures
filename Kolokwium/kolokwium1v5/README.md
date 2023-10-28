## ALGORYTMY I STRUKTURY DANYCH - KOLOKWUM 1

Rozwiąż poniższe problemy informatyczne za pomocą wskazanych metod. Napisz kody źródłowe programów rozwiązujących te zadania.

1. **Dany jest pewien ciąg liczbowy \(fn\), której dwa pierwsze wyrazy równe są odpowiednio 2 i 4.** Następny element ciągu równy jest połowie wartości iloczynu dwóch poprzednich wyrazów ciągu.
   - Utwórz klasę, a w niej metodę umożliwiającą wyznaczenie n-tego wyrazu ciągu \(fn\).
   - Używając tej metody, wyznacz osmy wyraz tego ciągu. (9 pkt)

2. **Dane są odległości między miastami prezentowane w poniższej tabeli:**

   Wyznacz najkrótszą drogę biegnącą poprzez wszystkie miasta korzystając z sieci połączeń przedstawionej w poniższej tabeli, gdzie w przypadku istniejącego połączenia pomiędzy miastami podane są odległości (w                kilometrach). Natomiast jeśli pomiędzy dwoma miastami nie ma bezpośredniego połączenia - zamiast odległości umieszczono słowo: "brak".
      
      | Miasta     | Warszawa | Katowice | Zakopane | Łowów | Wiedeń | Budapeszt | Bukareszt | Zagrzeb | Sofia |
      |------------|----------|----------|----------|-------|--------|-----------|-----------|---------|-------|
      | Warszawa   | -        | 300      | 400      | 352   | 474    | brak      | brak      | brak    | brak  |
      | Katowice   | 300      | -        | brak     | 440   | 474    | brak      | brak      | brak    | brak  |
      | Zakopane   | 400      | brak     | -        | brak  | 330    | 823      | brak      | brak    | brak  |
      | Łowów      | 352      | 440      | brak     | -     | brak   | 813      | 365       | 774     | brak  |
      | Wiedeń     | 474      | 474      | 330      | brak  | -      | 430      | brak      | brak    | 403   |
      | Budapeszt  | brak     | brak     | 823      | 813   | 430    | -        | brak      | 365     | 768   |
      | Bukareszt  | brak     | brak     | brak     | 365   | brak   | brak     | -         | 403     | 0     |
      | Zagrzeb    | brak     | brak     | brak     | 774   | brak   | 365      | 403       | -       | 768   |
      | Sofia      | brak     | brak     | brak     | brak  | 403    | 768      | 0         | 768     | -     |

   Utwórz projekt, w którym używaj metody algorytmu zachłannego. Następnie wywołaj utworzoną metodę w funkcji głównej w celu wypisania kolejności odwiedzania miast i sumarycznej długości trasy.

   **Przyjmij heurystykę w której:**
   - Pierwsze miasto (z którego wyruszamy) wybierane jest na podstawie największej liczby możliwych połączeń do innych miast (wylicza program).
   - Kolejne miasta wybierane są na podstawie kryterium najkrótszej drogi. (9 pkt)

---

**Warunkiem otrzymania oceny pozytywnej jest uzyskanie co najmniej 50% możliwych punktów z każdego zadania!**

