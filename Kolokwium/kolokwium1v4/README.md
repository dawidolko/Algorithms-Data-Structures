## ALGORYTMY I STRUKTURY DANYCH - KOLOKWUM 1

Rozwiąż poniższe problemy informatyczne za pomocą wskazanych metod. Napisz kody źródłowe programów rozwiązujących te zadania.

1. **Dla pewien gatunek komarów obowiązują następujące informacje:**
   - Populacja tego gatunku wynosi obecnie 1000 osobników, z czego 450 to samce, zaś reszta to samice.
   - W wyniku naturalnego rozrodu populacji każdego tygodnia przybywa 10%.
   - Wśród nowych osobników 45% stanowią samce i 55% samice.
   - Jednocześnie każdego tygodnia umiera 5% samców i 2% samiców.

   Dlaczego po pewnym czasie liczność samców zaczyna być zbliżona do liczby samic, a nawet przekracza ją, a nie maleje (jak by wynikało z większej śmiertelności samców)? Utwórz kod, który modeluje tygodniowe zmiany w liczbie samców i samic. Wskazówka: używaj typu danych `double`. W odpowiedzi uwzględnij: jakie są proporcje między samcami a samicami po upływie danego czasu (w tygodniach) korzystając z metody dzieli i zwyciężaj. Następnie, odpowiedź na pytanie zawarte w treści zadania.

2. **Dana jest tabela nominałów monet i ich liczby:**

   | NOMINAŁ           | 1gr | 2gr | 5gr | 10gr | 20gr | 50gr | 1zł | 2zł | 5zł |
   |-------------------|-----|-----|-----|------|------|------|-----|-----|-----|
   | ILOŚĆ DOSTĘPNYCH MONET | 5   | 3   | 4   | 1    | 0    | 7    | 0   | 1   | 3   |

   Uwzględniając powyższe dane skonstruuj metodę, do której na wejście podajemy pewną kwotę pieniędzy, czyli resztę, jaką trzeba wydać; natomiast na wyjściu wypisywane są monety za pomocą, których należy tę kwotę wydać. Program powinien wydawać resztę za pomocą możliwie najmniejszej liczby monet, a w przypadku braku możliwości wydania reszty – wypisać stosowny komunikat. Zadanie rozwiązując **metodą zachłanną (algorytm zachłanny)**. Wywołaj utworzoną metodę dla reszty równej 9,28 zł.

---

**Warunkiem otrzymania oceny pozytywnej jest uzyskanie co najmniej 50% możliwych punktów z każdego zadania!**

