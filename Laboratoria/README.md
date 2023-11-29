# Laboratoria:
### [Lab 1](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/Lab1) - Laboratoria 1
### [Lab 2](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/Lab2) - Laboratoria 2
### [Lab 3](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/Lab3) - Laboratoria 3
### [Lab 4](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/Lab4) - Laboratoria 4
### [Lab 5](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/Lab5) - Laboratoria 5
### [Lab 6](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/Lab6) - Laboratoria 6
### [Lab 7](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/Lab7/LinkedList) - Laboratoria 7
### [Lab 8](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/Lab8) - Laboratoria 8
### [Lab 9](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/Lab9) - Laboratoria 9

<hr>

### [A.1](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/sources/A1.java) Decyzyjny problem plecakowy

Dany jest plecak o pojemności \( W = 10 \) oraz \( 6 \) przedmiotów ponumerowanych od \( 0 \) do \( 5 \). Każdy przedmiot ma określoną wartość i objętość. Należy zapakować plecak spośród przedmiotów ponumerowanych od \( 0 \) do \( 5 \) w taki sposób, aby wartość przedmiotów w nim zgromadzonych była największa. Wartości i objętości przedmiotów określone są w poniższej tabeli:

|   | 0 | 1 | 2 | 3 | 4 | 5 |
|---|---|---|---|---|---|---|
| v | 6 | 2 | 3 | 2 | 3 | 1 |
| w | 6 | 4 | 5 | 7 | 10 | 2 |

Odp: W plecaku o maksymalnej wartości znajdują się przedmioty 1,2,3,4 o wartości 26.

### [A.2](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/sources/A2.java) Ogólny problem plecakowy

Dany jest plecak o objętości v = 23 oraz nieograniczona liczba egzemplarzy 6 różnych przed- miotów ponumerowanych od 0 do 5. Każdy przedmiot ma określoną wartość Wi i objętość Vi. Należy zapakować plecak spośród przedmiotów ponumerowanych od 0 do 5 w taki sposób, aby wartość przedmiotów w nim zgromadzonych była największa. Wartości i objętości przedmiotów określone są w poniższej tabeli:

|   | 0 | 1 | 2 | 3 | 4 | 5 |
|---|---|---|---|---|---|---|
| v | 6 | 2 | 3 | 2 | 3 | 1 |
| w | 6 | 4 | 5 | 7 | 10 | 2 |

Odp: W plecaku o maksymalnej wartości znajdzie się dziesięć przedmiotów z numerem 3 i jeden
przedmiot z numerem 4. Łączna wartość przedmiotów w plecaku wyniesie 80.

### [A.3](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/sources/A3.java) Problem liczby pitagorejskich

Liczby pitagorejskie - to trzy liczby naturalne x, y, z, które spełniają warunek x2 + y2 = z2. Znaleźć wszystkie takie trójki liczb, przy założeniu, że każda z tych liczb ma należy do zbioru {1, ..., 30}.

### [A.4](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/sources/A4.java) Problem doboru załogi statku kosmicznego / Podzbiory2Kosmos

Organizowana jest załogowa ekspedycja kosmiczna na Marsa. W ramach kompletowania załogi statku kosmicznego główny organizator ekspedycji ma rozwiązać następujący problem. Do jego dyspozycji jest pięciu kosmonautów (k1, k2, k3, k4, k5), którzy przeszli pozytywnie kwalifikację wstępną do udziału w ekspedycji. Na pokładzie specjalnego statku kosmicznego spośród nich będzie potrzebny przynajmniej jeden specjalista w każdej z dziedzin: A, B, C i D. Wiadomym jest, że w dziedzinie A specjalizują się kosmonauci k1 i k4, w dziedzinie B specjalizują się kosmonauci k2, k3 i k4, w dziedzinie C specjalizują się kosmonauci k3 i k5 oraz w dziedzinie D specjalizują się kosmonauci k1, k2 i k5. Ze względu na szczupłość miejsca na pokładzie statku kosmicznego, z powyższej piątki trzeba wybrać jak najmniejszą grupkę kosmonautów, tak aby znajdował się w niej przynajmniej jeden specjalista w każdej z dziedzin A, B, C, D.

Odp: Na Marsa mogą polecieć np. kosmonauci k4 i k5.

### [A.5](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/sources/A5.java) Problem wyprodukowania lodów wszystkich smaków

Fabryka lodów każdego dnia produkuje na tej samej maszynie lody o sześciu różnych smakach. Zmiana produkcji ze smaku \( i \) na smak \( j \) wymaga przestojenia maszyny, czyli przygotowania (w tym umycia) do nowej produkcji, które trwa określony czas. Podana niżej tablica zawiera informacje o czasach przestojenia maszyny.

| \( \ \)  | 1 | 2 | 3 | 4 | 5 | 6 |
|---------|---|---|---|---|---|---|
| **1**   | 0 | 7 | 20 | 21 | 12 | 23 |
| **2**   | 27 | 0 | 13 | 16 | 46 | 5 |
| **3**   | 53 | 15 | 0 | 25 | 27 | 6 |
| **4**   | 16 | 2 | 5 | 0 | 47 | 10 |
| **5**   | 31 | 29 | 5 | 18 | 0 | 4 |
| **6**   | 28 | 24 | 1 | 17 | 5 | 0 |

Znaleźć kolejność produkcji, przy której całkowity czas przestrojenia maszyny jest mini- malny. Przyjąć, że na koniec dnia maszyna ma być przygotowana do produkcji w następnym dniu.

Odp: Minimalny całkowity czas przestrojenia maszyny wynosi 63. Oto przykładowa kolejność produkcji lodów, dla której całkowity czas przestrojenia maszyny jest minimalny: 1,2,6,5,3,4,1.

### [A.6](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/sources/A6.java) Problem odgadywania liczby
Jak odgadnac liczbe pomyslana przez rozmówce z zakresu od 0 do 1000, zadajac jak najmniejsza
liczbe pytan rozmówcy? Przy czym, pytania zadawane rozmówcy musza byc jedynie
typu: „Czy to jest liczba 546?”, na które rozmówca moze odpowiadac na jeden z nastepujacych
sposobów: „TAK”, „ZA MAŁA” lub „ZA DUZA”.

### [A.19](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/METHODS/src/Algorytm_zachlanny/A19_Dijkstry.java) Problem najkrótszej drogi
Wyznaczyc najkrótsza droge z Warszawy do Sofii, korzystajac z sieci połaczen przedstawionej
w ponizszej tabeli, gdzie w przypadku istniejacego połaczenia pomiedzy miastami, podane sa
odległosci (w kilometrach). Natomiast jesli pomiedzy dwoma miastami nie ma bezposredniego
połaczenia - zamiast odległosci umieszczono słowo: brak.

|  Miasta   | Warszawa | Katowice | Zakopane | Lwów | Wiedeń | Budapeszt | Bukareszt | Zagrzeb | Sofia |
|-----------|----------|----------|----------|------|-------|----------|----------|--------|------|
| Warszawa  |    0     |   300    |   402    | 356  | brak  |   brak   |   brak   | brak   | brak |
| Katowice  |   300    |    0     |   brak   | brak |  440  |   474    |   brak   | brak   | brak |
| Zakopane  |   402    |   brak   |    0     | brak | brak  |   330    |   brak   | brak   | brak |
| Lwów      |   356    |   brak   |   brak   |  0   | brak  |   brak   |   823    | brak   | brak |
| Wiedeń    |   brak   |   440    |   brak   | brak |  0    |   brak   |   813    |  430   | brak |
| Budapeszt |   brak   |   474    |   330    | brak | brak  |    0     |   813    |  365   | 774  |
| Bukareszt |   brak   |   brak   |   brak   | 823  |  813  |   813    |    0     | brak   | 403  |
| Zagrzeb   |   brak   |   brak   |   brak   | brak |  430  |   365    |   brak   |  0     | 768  |
| Sofia     |   brak   |   brak   |   brak   | brak | brak  |   774    |   403    |  768   |  0   |

Odp: Najkrótsza droga z Warszawy do Sofii ma długosc 1506 km i prowadzi przez Zakopane oraz
Budapeszt.

### [A.20](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/sources/A20.java) Problem przewidywania liczebnosci populacji królików
Wroku 1202 Leonardo Fibonacci sformułował nastepujacy, obecnie bardzo popularny w informatyce
problem, dotyczacy rozmnazania sie królików. Na poczatku mamy pare nowonarodzonych
królików i o kazdej parze królików zakładamy, ze:

² nowa para staje sie płodna po miesiacu zycia,

² kazda płodna para rodzi jedna pare nowych królików w miesiacu,

² króliki nigdy nie umieraja.

W oparciu o powyzsze warunki, Fibonacci sformułował nastepujace pytanie: ile bedzie par królików
po upływie roku, które mozna uogólnic pytajac o to: ile bedzie par królików po upływie n
miesiecy? Liczbe te zwykle oznacza sie przez Fn, jest ona nazywana liczba Fibonacciego. Przeprowadzic
symulacje majaca na celu stwierdzenie: po ilu miesiacach populacja królików osiagnie:
100, 1000, 10000, 100000 oraz 1 milion par.

### [A.23](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/sources/A23.java) Problem przewidywania przebiegu epidemii
W pewnej zamknietej społecznosci liczacej 100000 osób pojawiło sie 10 osób chorych na
katar, co spowodowało „epidemie kataru”. Wiedzac, ze sposród 10 osób chorych na katar kazda
zaraza codziennie jeszcze dwie osoby, podac przewidywany przebieg epidemii. W szczególnosci
odpowiedziec na pytania: kiedy bedzie najwiecej chorych i kiedy epidemia wygasnie z powodu
braku osób podatnych na zachorowanie? Załozyc przy tym, ze katar trwa 7 dni od dnia zarazenia
i przez ten okres chorzy moga zarazac inne osoby. Oprócz tego osoby, które wyzdrowiały nie
moga juz zachorowac. Jak zmieni sie przebieg epidemii jesli dopuscimy, ze po 2 tygodniach po
wyzdrowieniu, znowu mozna zachorowac na katar?

### [A.24](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/sources/A24.java) Problem rozmnazania bakterii
Rozwazmy proces rozmnazania bakterii. Zakładamy, ze bakterie znajduja sie w srodowisku o
stałych parametrach, w zwiazku z czym szybkosc i sposób ich rozmnazania jest stały. Wiadomo,
ze bakterie rozmnazaja sie przez podział, w którego wyniku z jednej bakterii powstaje 2 nowe.
Podział ten nastepuje co 2 minuty. Przyjac, ze wszystkie bakterie dziela sie w tych samych
chwilach. Po jakim czasie liczba bakterii zwiekszy sie 1000 razy, 10000 razy, 100000 razy oraz 1
mln razy.

### [A.25](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/sources/A25.java) Problem łososi i rekinów
Pewna rodzina łososi rozwija sie zgodnie z prawem Malthusa, co mozna wyrazic w ten sposób,
ze jesli wielkosc populacji w chwili t wynosi p(t), to w wyniku naturalnego rozrodu populacji
w chwili t + 1 jej wielkosc wynosi:
```
p(t + 1) = p(t) * e^0.003
```
gdzie t jest czasem mierzonym w minutach. Rekiny, które zagniezdziły sie na wodach zasiedlonych
przez łososie, zjadaja 2 promile populacji łososi na minute. Poza tym, ze wzgledu na niekorzystne
warunki 2 promile łososi z całej populacji na minute odpływa z tych wód. Wiedzac, ze w chwili
poczatkowej było milion łososi, odpowiedziec na pytanie jak bedzie zmieniac sie liczebnosc populacji
łososi tzn. jesli liczebnosc bedzie sie zmniejszac, to kiedy osiagnie jakies istotne progi
(np. 1/2, 1/3, 1/10, 1/100 poczatkowej liczebnosci) oraz czy i kiedy populacja łososi na omawianym
obszarze wymrze. Za moment wymarcia populacji łososi uwazamy sytuacje, kiedy liczebnosc
łososi spadnie ponizej 100 sztuk.

### [A.28](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/METHODS/src/Algorytm_zachlanny/A28_Wydawanie_reszty.java) Problem wydawania reszty
Jak wydawac reszte za pomoca mozliwie najmniejszej liczby monet o nominałach 1gr, 2gr,
5gr, 10gr, 20gr, 50gr, 1zł, 2zł i 5zł. Skonstruuj algorytm, do którego na wejscie podajemy pewna
sume pieniedzy, czyli reszte, jaka trzeba wydawac; natomiast na wyjsciu wypisywane sa monety
za pomoca których nalezy te sume wydac.

<hr>

# Cześć A: 
Zadania sprawdzające znajomość implementacji konkretnych struktur danych

### [Zadanie 1.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/A/A1_DynArray) 
Implementacja tablicy dynamicznej (dst – tablica liczb całkowitych, db – tablica wartości opakowanych np. klasami Integer, Double, Float lub obiektów typu String, bdb – tablica złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.)

### [Zadanie  2.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/A/A2_OrdDynArray) 
Implementacja uporządkowanej tablicy dynamicznej (dst – tablica liczb całkowitych, db – tablica wartości opakowanych np. klasami Integer, Double, Float lub obiektów typu String, bdb – tablica złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.)

### [Zadanie 3.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/A/A3_LinkedList)
Implementacja listy powiązanej liczb całkowitych (dst – lista powiązana jednostronna, db – lista powiązana dwustronna, bdb – lista powiązana dwukierunkowa)

### [Zadanie 4.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/A/A4_OrdLinkedList)
Implementacja listy powiązanej uporządkowanej liczb całkowitych (dst – lista powiązana jednostronna, db – lista powiązana dwustronna, bdb – lista powiązana dwukierunkowa)

### [Zadanie 5.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/A/A5_BSTree)
Implementacja drzewa BST liczb całkowitych (dst – jedna funkcjonalność, db – dwie funkcjonalności, bdb – trzy funkcjonalności)

### [Zadanie 6.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/A/A6_HashTable)
Implementacja tablicy mieszającej metodą łańcuchową (dst – jedna funkcjonalność, db – dwie funkcjonalności, bdb – trzy funkcjonalności)

# Cześć B: 
Zadania sprawdzające umiejętność implementowania abstrakcyjnych struktur danych przy wykorzystaniu standardowych konkretnych struktur danych
Przy implementacji można stosować metody: przez osadzanie lub przez dziedziczenie.

### [Zadanie 1.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/B/B1_ArrayListStack)
Implementacja stosu za pomocą klasy ArrayList (dst – stos liczb całkowitych, db – stos wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – stos złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg eksperymentu: tworzymy strukturę, wstawiamy do struktury A, B, C; usuwamy dwa elementy; wstawiamy D i E; usuwamy wszystkie elementy wypisując je na ekran.

### [Zadanie 2.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/B/B2_LinkedListStack)
Implementacja stosu za pomocą klasy LinkedList (dst – stos liczb całkowitych, db – stos wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – stos złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg eksperymentu: tworzymy strukturę, wstawiamy do struktury A, B, C; usuwamy dwa elementy; wstawiamy D i E; usuwamy wszystkie elementy wypisując je na ekran.

### [Zadanie 3.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/B/B3_ArrayListQueue)
Implementacja kolejki za pomocą klasy ArrayList (dst – kolejka liczb całkowitych, db – kolejka wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – kolejka złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg eksperymentu: tworzymy strukturę, wstawiamy do struktury A, B, C; usuwamy dwa elementy; wstawiamy D i E; usuwamy wszystkie elementy wypisując je na ekran.

### [Zadanie 4.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/B/B4_LinkedListQueue)
Implementacja kolejki za pomocą klasy LinkedList (dst – kolejka liczb całkowitych, db – kolejka wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – kolejka złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg eksperymentu: tworzymy strukturę, wstawiamy do struktury A, B, C; usuwamy dwa elementy; wstawiamy D i E; usuwamy wszystkie elementy wypisując je na ekran.

### [Zadanie 5.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/B/B5_ArrayListList)
Implementacja listy z bezpośrednim dostępem do każdego elementu poprzez podanie jego numeru za pomocą klasy ArrayList (dst – lista liczb całkowitych, db – lista wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – lista złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 6 różnych elementów A, B, C, D, E, F (). Przebieg eksperymentu: tworzymy strukturę, wstawiamy do listy A, B, C, D; wypisujemy elementy listy; usuwamy element drugi i trzeci; wypisujemy elementy listy; wstawiamy E i F; wypisujemy elementy listy.

### [Zadanie 6.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/B/B6_LinkedListList)
Implementacja listy dwustronnej za pomocą klasy LinkedList (dst – lista liczb całkowitych, db – lista wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – lista złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg eksperymentu: tworzymy listę L, wstawiamy do listy L elementy A, B i C od lewej strony; wypisujemy elementy listy; wstawiamy do listy L elementy D i E od prawej strony; wypisujemy elementy listy; usuwamy element z lewej strony i element z prawej strony; wypisujemy elementy listy; sprawdzamy, czy na liście jest element B i wypisujemy wynik testu; sprawdzamy, czy na liście jest element E i wypisujemy wynik testu.

### [Zadanie 7.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/B)
Implementacja zbioru za pomocą klasy ArrayList (dst – zbiór liczb całkowitych, db – zbiór wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – zbiór złożonych obiektów zdefiniowanych przez użytkownika, np. zbiór osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów a, b, c, d, e. Przebieg eksperymentu: tworzymy zbiory A i B, wstawiamy do A elementy a, b, c, d oraz do B elementy c, d, e; wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B; usuwamy ze zbioru A element c i ze zbioru B element e; powtórnie wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B.

### [Zadanie 8.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/B/B8_TreeSetSet)
Implementacja zbioru za pomocą klasy TreeSet (dst – zbiór liczb całkowitych, db – zbiór wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – zbiór złożonych obiektów zdefiniowanych przez użytkownika, np. zbiór osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów a, b, c, d, e. Przebieg eksperymentu: tworzymy zbiory A i B, wstawiamy do A elementy a, b, c, d oraz do B elementy c, d, e; wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B; usuwamy ze zbioru A element c i ze zbioru B element e; powtórnie wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B.

### [Zadanie 9.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/B/B9_HashSetSet)
Implementacja zbioru za pomocą klasy HashSet (dst – zbiór liczb całkowitych, db – zbiór wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – zbiór złożonych obiektów zdefiniowanych przez użytkownika, np. zbiór osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów a, b, c, d, e. Przebieg eksperymentu: tworzymy zbiory A i B, wstawiamy do A elementy a, b, c, d oraz do B elementy c, d, e; wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B; usuwamy ze zbioru A element c i ze zbioru B element e; powtórnie wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B.

# Część C:
Zadania sprawdzające umiejętność implementowania metod sortowania

### [Zadanie 1.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/C) 
Implementacja metody sortowania bąbelkowego (bubble sort) dla tablicy liczb całkowitych.

- Wykonać eksperyment polegający na sortowaniu liczb: 5, 6, 3, 2, 8, -4, -9, 9, 0, 1

### [Zadanie 2.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/C)
Implementacja metody sortowania przez wybór (selection sort) dla tablicy dynamicznej (Array List) liczb całkowitych.

- Wykonać eksperyment polegający na sortowaniu liczb: 5, 6, 3, 2, 8, -4, -9, 9, 0, 1

### [Zadanie 3.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/C)
Implementacja metody sortowania przez wstawianie (insertion sort) dla tablicy dynamicznej (Array List) liczb całkowitych.

- Wykonać eksperyment polegający na sortowaniu liczb: 5, 6, 3, 2, 8, -4, -9, 9, 0, 1

### [Zadanie 4.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/C)
Implementacja metody sortowania szybkiego (quick sort) dla tablicy dynamicznej (Array List) liczb całkowitych.

- Wykonać eksperyment polegający na sortowaniu liczb: 5, 6, 3, 2, 8, -4, -9, 9, 0, 1

### [Zadanie 5.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Laboratoria/C)
Implementacja metody sortowania przez scalanie (merge sort) dla tablicy dynamicznej (Array List) liczb całkowitych.

- Wykonać eksperyment polegający na sortowaniu liczb: 5, 6, 3, 2, 8, -4, -9, 9, 0, 1

<hr>

### [Podzbiory1](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/Podzbiory1.java)

Ciąg binarny b1, b2, ..., bn może posłużyć do wygenerowania dowolnego podzbioru zbioru n-elementowego. Przy małej liczbie elementów zbioru X, wszystkie jego podzbiory można wygenerować przy pomocy n-krotnie zagnieżdżonej pętli for. W przypadku zbioru cztero- elementowego otrzymujemy następujący algorytm:
```
   Dla b1 := 0..1 wykonuj:
     Dla b2 := 0..1 wykonuj:
       Dla b3 := 0..1 wykonuj:
         Dla b4 := 0..1 wykonuj:
           Generuj podzbiór zakodowany jako {b1,b2,b3,b4}
```

Oto program, który realizuje powyższy algorytm:
```java
   class Podzbiory1
   {
     public static void main(String[] args)
     {
       int b1,b2,b3,b4;
       for (b1 = 0; b1 <= 1; b1++)
         for (b2 = 0; b2 <= 1; b2++)
           for (b3 = 0; b3 <= 1; b3++)
             for (b4 = 0; b4 <= 1; b4++)
             {
               System.out.print("{ ");
               if (b1 == 1) System.out.print("1 ");
               if (b2 == 1) System.out.print("2 ");
               if (b3 == 1) System.out.print("3 ");
               if (b4 == 1) System.out.print("4 ");
               System.out.println("}");
             }
      }
}
```

Program ten wypisuje następujący tekst:
```
{}
{4}
{3}
{34}
{2}
{24}
{23}
{234}
{1}
{14}
{13}
{134}
{12}
{124}
{123}
{1234}
```

## [Podzbiory2](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/Podzbiory2.java)

Aby wygenerować wszystkie podzbiory zbioru X = {1,2,...,n}, dla dowolnie ustalonego n, musimy wykorzystać inną metodę. Zauważmy, że każdy ciąg binarny b1, b2, ..., bn odpowiada wzajemnie jednoznacznie liczbie dwójkowej b1b2...bn z przedziału od 0 do 2n − 1. Wszystkie liczby całkowite z przedziału od 0 do 2n − 1 możemy wygenerować zaczynając od 0 i dodając w każdym kolejnym kroku liczbę 1, a ich reprezentacje binarne określą wszystkie podzbiory zbioru n-elementowego. Otrzymujemy następujący algorytm:
 1. Utwórz n+1 elementową tablicę liczb całkowitych.
    
 2. Przypisz: s := 2^n.
    
 3. Dla l = 0..s-1 wykonuj:
    
    a) generuj podzbiór określony przez liczbę dwójkową z tablicy,
    
    b) dodaj 1 do liczby dwójkowej z tablicy.
    
Oto program, który realizuje powyższy algorytm:
```java
   class Podzbiory2
   {
     public static void main(String[] args)
     {
       final int N = 3; // moc zbioru
       int[] tab = new int[N+1];
       int s = (int)Math.pow(2,N);
       for (int l = 0; l < s; l++)
       {
         System.out.print("{ ");
         for (int i = 0; i < N; i++)
           if (tab[i] == 1) System.out.print(i+1 + " ");
         System.out.println("}");
         int i = 0;
         do
         {
           if (tab[i] == 1)
           {
            tab[i] = 0;
            i++; }
            else {
            tab[i] = 1;
            break; }
         } while (true);
       } 
  }
}
```

Program ten wypisuje następujący tekst:
```
{}
{1}
{2}
{12}
{3}
{13}
{23}
{123}
```

Z problemem generowania podzbiorów spotykamy się w wielu praktycznych zagadnieniach. Na przykład w decyzyjnym problemie plecakowym (patrz podrozdział A.1) potencjalnymi roz- wiązaniami problemu są podzbiory zbioru wszystkich przedmiotów pakowanych do plecaka. Po- dobnie w problemie doboru załogi statku kosmicznego (patrz podrozdział A.4) potencjalnymi rozwiązaniami są podzbiory zbioru kosmonautów.

### [Permutacje](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/Permutacje.java) / [PermutacjeDebug](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/PermutacjeDebug.java)

Z permutacjami spotykamy się w wielu praktycznych problemach. Na przykład w problemie wyprodukowania lodów wszystkich smaków (patrz podrozdział A.5) rozwiązanie tego problemu jest permutacją zbioru smaków.
Stosując strategię z powracaniem, problem wypisywania wszystkich permutacji zbioru {1, ..., n} można rozwiązać za pomocą następującej procedury.
procedura permutacje(l: lista elementów)

  Jeśli liczba elementów na liście l jest równa n, to:
     wypisz elementy z listy l,
  w przeciwnym razie, dla każdego elementu i ze zbioru {1,...,n},
  
  którego nie ma jeszcze na liście l wykonuj:
     a) dodaj element i na koniec listy l,
     b) wywołaj rekurencyjnie: permutacje(l),
     c) usuń element i z końca listy.
     
Oto program, który realizuje powyższy algorytm:
```java
   class Permutacje
   {
     final static int N = 3; // permutacje n-elementowe
     private static int[] l = new int[N];
     public static void main(String[] args)
     {
       permutacje(0);
     }
     static void permutacje(int i)
     {
      if (i == N) {
               for(int j = 0; j < N; j++)
                 System.out.print(l[j] + " ");
               System.out.println();
       }
      else {
         for (int j = 1; j <= N; j++)
         {
           int k;
           for (k = 0; k < i; k++)
             if (l[k] == j) break;
           if (k == i)
           {
             l[k] = j;
             permutacje(i+1);
           }
      }
      }
   }
}
```

Powyższy program wypisuje następujący tekst:
```
123
132
213
231
312
321
```

### [FiboDZ](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/FiboDZ.java)

Pierwszy i drugi wyraz ciągu Fibonacciego ma wartość 1, a każdy kolejny wyraz ciągu jest sumą dwóch poprzednich wyrazów ciągu. Zwróćmy uwagę, że powyższa definicja odpowiada idei metody „dziel i zwyciężaj”. Aby wyznaczyć n-ty wyraz ciągu Fibonacciego należy najpierw wyznaczyć n − 1 oraz n − 2 wyraz ciągu, czyli rozwiązać podproblemy o mniejszym rozmiarze.

Oto program, który wyznacza n-ty wyraz ciągu Fibonacciego:
```java
   class FiboDZ
   {
     public static void main(String[] args)
     {
       final int N = 5; // n-ty wyraz ciągu
       System.out.println(fibo(N));
     }
     static int fibo(int n)
     {
       if (n == 1 || n == 2)
         return 1;
       else
         return fibo(n-1) + fibo(n-2);
      }
}
```

Analiza wywołania metody fibo(5) prowadzi do grafu wywołań z rys. 2.1. Każdy liść (za- kreskowany wierzchołek) tego grafu reprezentuje problem elementarny. Natomiast każdy inny wierzchołek grafu reprezentuje problem złożony o rozmiarze n ≥ 3, który dzielony jest na dwa podproblemy o rozmiarach n−1 i n−2. Zauważmy, że w powyższym algorytmie pewne obliczenia są powtarzane wielokrotnie (np. obliczenie fibo(3)). Aby uniknąć takiej sytuacji, do rozwiązania problemu Fibonacciego zamiast metody „dziel i zwyciężaj” należy zastosować pokrewną metodę programowania dynamicznego (patrz podrozdział 2.4).
Niektóre problemy wymagają rozwiązania na danym etapie obliczeń tylko jednego podpro- blemu o mniejszym rozmiarze. Dla przykładu, aby wyznaczyć wartość n! wystarczy wyznaczyć wartość (n − 1)! i pomnożyć ją przez n.

Oto program, który oblicza wartość n silnia:
```java
class SilniaDZ
{
  public static void main(String[] args)
  {
      fibo(3)
          fibo(3)
      fibo(2)
      fibo(2)
      fibo(1)
        fibo(2)
      fibo(1)
     final int N = 5; // liczymy n!
    System.out.println(silnia(N));
  }
  static int silnia(int n)
  {
    if (n == 0 || n == 1)
      return 1;
    else
      return n * silnia(n-1);
   }
}
```

Podamy jeszcze jeden przykład problemu, który można rozwiązać metodą „dziel i zwyciężaj”. Dany jest plecak o objętości v oraz n przedmiotów ponumerowanych od 0 do n − 1. Każdy przedmiot ma określoną wartość Wi i objętość Vi. Należy zapakować plecak spośród przedmiotów ponumerowanych od 0 do n − 1 w taki sposób, aby wartość przedmiotów w nim zgromadzonych
była największa (patrz podrozdział A.1).

### [PlecDec](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/PlecakDec.java)

Oto program, który formalizuje powyższe rozważania:
```java
class PlecakDec
{
  final static int N = 6;                // liczba przedmiotów
  final static int MAX_V = 10;           // objetość plecaka
  final static int[] V = {6,2,3,2,3,1};  // objetości przedmiotów
  final static int[] W = {6,4,5,7,10,2}; // wartości przedmiotów
  static int P(int i, int v)
{
      int w1; // wartość, gdy nie bierzemy i-tego przedmiotu int w2; // wartość, gdy bierzemy i-ty przedmiot if(i==0&&v<V[0]) return0;
      if (i == 0 && v >= V[0]) return W[0];
      w1 = P(i-1,v);
      if (i > 0 && v < V[i]) return w1;
      w2 = W[i] + P(i-1,v-V[i]);
      if (w2 > w1) // gdy i > 0 && v >= V[i]
      return w2;
    else
      return w1; }
  public static void main(String[] args)
  {
    System.out.println("Wartosc przedmiotow: " + P(N-1,MAX_V));
  }
}
```

### [PlecWyp](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/PlecakDecWyp.java)

Podamy teraz analogiczny program, który oprócz wartości plecaka wypisuje również numery przedmiotów zapakowanych do plecaka:
```java
class PlecakDecWyp
{
   final static int N=6; // liczba wszystkich przedmiotow final static int MAX_V = 10; // objetosc plecaka
   final static int[] V = {6,2,3,2,3,1}; // objetosci przedmiotow
   final static int[] W = {6,4,5,7,10,2}; // wartosci przedmiotow
  static class Plecak
  {
   int wartosc;
    int[] zawartosc = new int[N];
  }
  public static void main(String[] args)
  {
    Plecak p = P(N-1,MAX_V);
   System.out.println("Wartosc plecaka: " + p.wartosc);
   System.out.print("Przedmioty w plecaku: ");
  for (int i = 0; i < N; i++)
    if (p.zawartosc[i] == 1) System.out.print(i + " ");
  System.out.println();
}
static Plecak P(int i, int v)
{
  Plecak p1 = new Plecak(); // plecak, gdy nie bierzemy i-tego przedmiotu
  Plecak p2 = new Plecak(); // plecak, gdy bierzemy i-ty przedmiot
  if (i == 0 && v < V[0])
  {
    p1.zawartosc[0] = 0;
    p1.wartosc = 0;
    return p1;
  }
  if (i == 0 && v >= V[0])
  {
    p2.zawartosc[0] = 1;
    p2.wartosc = W[0];
    return p2;
  }
  Plecak p = P(i-1,v);
  p1.zawartosc = p.zawartosc;
  p1.zawartosc[i] = 0;
  p1.wartosc = p.wartosc;
  if (i > 0 && v < V[i]) return p1;
  p = P(i-1,v-V[i]);
  p2.zawartosc = p.zawartosc;
  p2.zawartosc[i] = 1;
  p2.wartosc = W[i] + p.wartosc;
  if (p2.wartosc > p1.wartosc) // gdy i > 0 && v >= V[i]
    return p2;
  else
   return p1; }
}
```

W powyższym programie plecak reprezentowany jest przez obiekt klasy Plecak. Atrybuty obiektów klasy Plecak określone są przez zmienną wartosc, która przechowuje wartość plecaka oraz przez zmienną zawartosc, która przechowuje referencję do tablicy przedmiotów z plecaka. Jeśli i-ty przedmiot znajduje się w plecaku, to w tablicy, w komórce z indeksem i mamy liczbę 1. Jeśli w plecaku i-ty przedmiot się nie znajduje, to w tablicy, w komórce z indeksem i mamy liczbę 0.
Metoda statyczna P(int i, int v) zwraca plecak o objętości v i maksymalnej wartości, zapakowany spośród przedmiotów ponumerowanych od 0 do i.

Rozwiazanie problemu metoda „programowania dynamicznego”, podobnie jak w metodzie
„dziel i zwyciezaj”, konstruuje sie na podstawie rozwiazan jego podproblemów. Jednakze w metodzie
programowania dynamicznego wyniki rozwiazan podproblemów zapamietywane sa w tablicy.
Pozwala to wyeliminowac problem wielokrotnego rozwiazywania tych samych podproblemów,
charakterystyczny dla metody „dziel i zwyciezaj”. W metodzie „programowania dynamicznego”
kazdy podproblem rozwiazuje sie tylko raz.

Konstrukcja programu wykorzystujacego zasade programowania dynamicznego moze zostac
zrealizowana w nastepujacych etapach:

1. Skonstruowanie rozwiazania problemu metoda dziel i zwyciezaj (wraz z jednoznacznym
okresleniem przypadków elementarnych).

2. Stworzenie tablicy, w której bedzie mozna zapamietac rozwiazania przypadków elementarnych
i rozwiazania podproblemów, które zostana obliczone na ich podstawie.

3. Wpisanie do tablicy wartosci numerycznych, odpowiadajacych przypadkom elementarnym.

4. Na podstawie wartosci numerycznych wpisanych do tablicy, uzywajac formuły rekurencyjnej,
obliczenie rozwiazan problemów wyzszych rzedów i wpisanie ich do tablicy az do
problemu o zadanym rozmiarze.

Dla przykładu podamy rozwiazanie problemu Fibonacciego, zrealizowane metoda programowania
dynamicznego:

### [FiboDyn](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/FiboDyn.java)

```java
class FiboDyn
{
   public static void main(String[] args)
   {
      final int N = 5; // n-ty wyraz ciagu
      System.out.println(fibo(N));
      }
      static int fibo(int n)
      {
         int[] tab = new int[n+1];
         tab[1] = 1;
         tab[2] = 1;
         for (int i = 3; i < tab.length; i++)
         tab[i] = tab[i-1] + tab[i-2];
         return tab[tab.length - 1];
   }
}
```

Klasycznym przypadkiem problemu, który mozna rozwiazac za pomoca powyzszego podejscia
jest problem wydawania reszty (patrz podrozdział A.28). Aby rozwiazac ten problem wystarczy
zauwazyc, ze aby szybko wydac ustalona kwote pieniedzy (tzn. minimalna liczba monet), trzeba
wydawac mozliwie najwieksze nominały, az do wydania całej reszty. Tak sformułowany pomysł,
mozna bardziej formalnie zapisac w postaci nastepujacej procedury:
```
procedura wydajReszte(r: reszta do wydania)
1. Wybierz monete M o najwiekszym nominale.
2. Dopóki r > 0 wykonuj:
Jesli r >= M, to:
a) wydaj monete M,
b) odejmij od reszty wartosc monety M,
w przeciwnym razie:
wybierz monete M o mniejszym nominale.
```
Oto program, który realizuje powyzszy algorytm:
### [ResztaZachlanny](https://github.com/dawidolko/Algorithms-Data-Structures/blob/main/Laboratoria/ResztaZachlanny.java)

Metody aproksymacyjne

```java
import java.io.*;
class ResztaZachlanny
{
   public static void main(String[] args) throws IOException
   {
      InputStreamReader str = new InputStreamReader(System.in);
      BufferedReader wejscie = new BufferedReader(str);
      String tekst;
      final int[] M = {500,200,100,50,20,10,5,2,1};
      int zl, gr, r, i = 0;
      System.out.println("Podaj reszte..");
      System.out.print("zlotych: ");
      tekst = wejscie.readLine();
      zl = Integer.parseInt(tekst);
      System.out.print("groszy: ");
      tekst = wejscie.readLine();
      gr = Integer.parseInt(tekst);
      System.out.print("Reszta: ");
      r = zl*100 + gr;
      while (r > 0)
      {
         if (r >= M[i])
      {
      System.out.print(M[i]/100.0 + " ");
      r = r - M[i];
      }
         else
            i++;
         }
            System.out.println();
         }
}
```
