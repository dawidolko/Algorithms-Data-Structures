## ALGORYTMY I STRUKTURY DANYCH
### KOLOKWUM 1

Rozwiąż poniższe problemy informatyczne za pomocą wskazanych metod. Napisz kody źródłowe programów rozwiązujących te zadania.

1. **Dany jest pewien ciąg liczbowy \(f(n)\), którego kolejne elementy określone są wzorem:**

   \[
   f(n) = \begin{cases} 
   1 & \text{dla } n = 1 \text{ lub } n = 2 \\
   2 \cdot f(n - 1) & \text{dla } n > 1 \text{ i } n \% 3 = 0 \\
   f(n - 2) & \text{dla } n > 2 \text{ i } n \% 3 = 1 \\
   2 \cdot f(n - 2) & \text{dla } n > 2 \text{ i } n \% 3 = 2
   \end{cases}
   \]

   Utwórz projekt, a w nim metodę (funkcję) wykorzystującą **metodę programowania dynamicznego**. Za pomocą wywołania utworzonej metody wyznacz dziesiąty element tego ciągu.

2. **Dana jest tabela nominałów monet i ich liczby:**

   | NOMINAŁ           | 1gr | 2gr | 5gr | 10gr | 20gr | 50gr | 1zł | 2zł | 5zł |
   |-------------------|-----|-----|-----|------|------|------|-----|-----|-----|
   | ILOŚĆ DOSTĘPNYCH MONET | 30  | 7   | 4   | 1    | 5    | 3    | 0   | 1   | 7   |

   Uwzględniając powyższe dane skonstruuj metodę, do której na wejście podajemy pewną kwotę pieniędzy, czyli resztę, jaką trzeba wydać; natomiast na wyjściu wypisywane są monety za pomocą, których należy tę kwotę wydać. Program powinien wydawać resztę za pomocą możliwie najmniejszej liczby monet, a w przypadku braku możliwości wydania reszty – wypisać stosowny komunikat. Zadanie rozwiązując **metodą zachłanną**. Wywołaj utworzoną metodę dla reszty równej 7,53 zł.

---

**Maksymalna liczba punktów:** 18

| Ocena | ndst | dst | +dst | db   | +db  | bdb  |
|-------|------|-----|------|------|------|------|
| Liczba punktów | 0 – 8 | 9 - 10 | 11 - 12 | 13 - 14 | 15 - 16 | 17 - 18 |

Warunkiem otrzymania oceny pozytywnej jest uzyskanie co najmniej 50% możliwych punktów z całości kolokwium, w tym co najmniej 30% punktów z każdego zadania!
