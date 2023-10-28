# Fabryka lodów

Fabryka lodów każdego dnia produkuje na tej samej maszynie lody o sześciu różnych smakach. Zmiana produkcji ze smaku i na smak j wymaga przestrojenia maszyny, czyli przygotowania (w tym umycia) do nowej produkcji, które trwa określony czas. Poniżej znajduje się tabela prezentująca informacje o czasie przestrojenia maszyny ze smaku i na smak j. 

Symbolem „x” oznaczono brak możliwości przestawienia maszyny z danego smaku na inny.

|   | 1  | 2  | 3  | 4  | 5  | 6  |
|---|----|----|----|----|----|----|
| 1 | 0  | 7  | 20 | x  | 12 | 23 |
| 2 | 27 | 0  | 13 | 16 | x  | 5  |
| 3 | 53 | x  | 0  | 25 | 27 | 6  |
| 4 | 16 | 2  | 35 | 0  | 47 | x  |
| 5 | 31 | 29 | x  | 18 | 0  | 4  |
| 6 | x  | 24 | 1  | 17 | 5  | 0  |

**Zadanie:** Znaleźć kolejność produkcji, przy której całkowity czas przestrojenia maszyny jest minimalny. Zakładamy, że na koniec dnia maszyna ma być przygotowana do produkcji w następnym dniu.

Rozwiązanie powinno wykorzystać **metodę Monte Carlo**. Proszę wprowadzić ograniczenie liczby analizowanych rozwiązań do 100. Następnie wywołać utworzoną metodę w funkcji głównej w celu wypisania kolejności produkcji i sumarycznego czasu przestrojenia maszyny.
