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

# Skrypt 1 (Materiały do kolokwium 1)

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

# Skrypt 2 (Materiały do kolokwium 2)

# [Cześć A](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/A): 
Zadania sprawdzające znajomość implementacji konkretnych struktur danych

### [Zadanie 1.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/A) 
Implementacja tablicy dynamicznej (dst – tablica liczb całkowitych, db – tablica wartości opakowanych np. klasami Integer, Double, Float lub obiektów typu String, bdb – tablica złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.)

### [Zadanie  2.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/A) 
Implementacja uporządkowanej tablicy dynamicznej (dst – tablica liczb całkowitych, db – tablica wartości opakowanych np. klasami Integer, Double, Float lub obiektów typu String, bdb – tablica złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.)

### [Zadanie 3.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/A)
Implementacja listy powiązanej liczb całkowitych (dst – lista powiązana jednostronna, db – lista powiązana dwustronna, bdb – lista powiązana dwukierunkowa)

### [Zadanie 4.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/A)
Implementacja listy powiązanej uporządkowanej liczb całkowitych (dst – lista powiązana jednostronna, db – lista powiązana dwustronna, bdb – lista powiązana dwukierunkowa)

### [Zadanie 5.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/A)
Implementacja drzewa BST liczb całkowitych (dst – jedna funkcjonalność, db – dwie funkcjonalności, bdb – trzy funkcjonalności)

### [Zadanie 6.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/A)
Implementacja tablicy mieszającej metodą łańcuchową (dst – jedna funkcjonalność, db – dwie funkcjonalności, bdb – trzy funkcjonalności)

# [Cześć B](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/B): 
Zadania sprawdzające umiejętność implementowania abstrakcyjnych struktur danych przy wykorzystaniu standardowych konkretnych struktur danych
Przy implementacji można stosować metody: przez osadzanie lub przez dziedziczenie.

### [Zadanie 1.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/B)
Implementacja stosu za pomocą klasy ArrayList (dst – stos liczb całkowitych, db – stos wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – stos złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg eksperymentu: tworzymy strukturę, wstawiamy do struktury A, B, C; usuwamy dwa elementy; wstawiamy D i E; usuwamy wszystkie elementy wypisując je na ekran.

### [Zadanie 2.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/B)
Implementacja stosu za pomocą klasy LinkedList (dst – stos liczb całkowitych, db – stos wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – stos złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg eksperymentu: tworzymy strukturę, wstawiamy do struktury A, B, C; usuwamy dwa elementy; wstawiamy D i E; usuwamy wszystkie elementy wypisując je na ekran.

### [Zadanie 3.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/B)
Implementacja kolejki za pomocą klasy ArrayList (dst – kolejka liczb całkowitych, db – kolejka wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – kolejka złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg eksperymentu: tworzymy strukturę, wstawiamy do struktury A, B, C; usuwamy dwa elementy; wstawiamy D i E; usuwamy wszystkie elementy wypisując je na ekran.

### [Zadanie 4.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/B)
Implementacja kolejki za pomocą klasy LinkedList (dst – kolejka liczb całkowitych, db – kolejka wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – kolejka złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg eksperymentu: tworzymy strukturę, wstawiamy do struktury A, B, C; usuwamy dwa elementy; wstawiamy D i E; usuwamy wszystkie elementy wypisując je na ekran.

### [Zadanie 5.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/B)
Implementacja listy z bezpośrednim dostępem do każdego elementu poprzez podanie jego numeru za pomocą klasy ArrayList (dst – lista liczb całkowitych, db – lista wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – lista złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 6 różnych elementów A, B, C, D, E, F (). Przebieg eksperymentu: tworzymy strukturę, wstawiamy do listy A, B, C, D; wypisujemy elementy listy; usuwamy element drugi i trzeci; wypisujemy elementy listy; wstawiamy E i F; wypisujemy elementy listy.

### [Zadanie 6.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/B)
Implementacja listy dwustronnej za pomocą klasy LinkedList (dst – lista liczb całkowitych, db – lista wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – lista złożonych obiektów zdefiniowanych przez użytkownika, np. tablica osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów A, B, C, D, E. Przebieg eksperymentu: tworzymy listę L, wstawiamy do listy L elementy A, B i C od lewej strony; wypisujemy elementy listy; wstawiamy do listy L elementy D i E od prawej strony; wypisujemy elementy listy; usuwamy element z lewej strony i element z prawej strony; wypisujemy elementy listy; sprawdzamy, czy na liście jest element B i wypisujemy wynik testu; sprawdzamy, czy na liście jest element E i wypisujemy wynik testu.

### [Zadanie 7.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/B)
Implementacja zbioru za pomocą klasy ArrayList (dst – zbiór liczb całkowitych, db – zbiór wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – zbiór złożonych obiektów zdefiniowanych przez użytkownika, np. zbiór osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów a, b, c, d, e. Przebieg eksperymentu: tworzymy zbiory A i B, wstawiamy do A elementy a, b, c, d oraz do B elementy c, d, e; wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B; usuwamy ze zbioru A element c i ze zbioru B element e; powtórnie wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B.

### [Zadanie 8.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/B)
Implementacja zbioru za pomocą klasy TreeSet (dst – zbiór liczb całkowitych, db – zbiór wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – zbiór złożonych obiektów zdefiniowanych przez użytkownika, np. zbiór osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów a, b, c, d, e. Przebieg eksperymentu: tworzymy zbiory A i B, wstawiamy do A elementy a, b, c, d oraz do B elementy c, d, e; wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B; usuwamy ze zbioru A element c i ze zbioru B element e; powtórnie wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B.

### [Zadanie 9.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/B)
Implementacja zbioru za pomocą klasy HashSet (dst – zbiór liczb całkowitych, db – zbiór wartości opakowanych np. klasami Double, Float lub obiektów typu String, bdb – zbiór złożonych obiektów zdefiniowanych przez użytkownika, np. zbiór osób [imię nazwisko, wiek], książek [tytuł, wydawnictwo, rok wydania] itp.).

- Wykonać następujący eksperyment ze strukturą w której bierze udział 5 różnych elementów a, b, c, d, e. Przebieg eksperymentu: tworzymy zbiory A i B, wstawiamy do A elementy a, b, c, d oraz do B elementy c, d, e; wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B; usuwamy ze zbioru A element c i ze zbioru B element e; powtórnie wyliczamy i wypisujemy zbiory: iloczyn A i B, suma A i B, różnica A\B.

# [Część C](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/C):
Zadania sprawdzające umiejętność implementowania metod sortowania

### [Zadanie 1.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/C) 
Implementacja metody sortowania bąbelkowego (bubble sort) dla tablicy liczb całkowitych.

- Wykonać eksperyment polegający na sortowaniu liczb: 5, 6, 3, 2, 8, -4, -9, 9, 0, 1

### [Zadanie 2.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/C)
Implementacja metody sortowania przez wybór (selection sort) dla tablicy dynamicznej (Array List) liczb całkowitych.

- Wykonać eksperyment polegający na sortowaniu liczb: 5, 6, 3, 2, 8, -4, -9, 9, 0, 1

### [Zadanie 3.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/C)
Implementacja metody sortowania przez wstawianie (insertion sort) dla tablicy dynamicznej (Array List) liczb całkowitych.

- Wykonać eksperyment polegający na sortowaniu liczb: 5, 6, 3, 2, 8, -4, -9, 9, 0, 1

### [Zadanie 4.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/C)
Implementacja metody sortowania szybkiego (quick sort) dla tablicy dynamicznej (Array List) liczb całkowitych.

- Wykonać eksperyment polegający na sortowaniu liczb: 5, 6, 3, 2, 8, -4, -9, 9, 0, 1

### [Zadanie 5.](https://github.com/dawidolko/Algorithms-Data-Structures/tree/main/Kolokwium/kolokwium2/C)
Implementacja metody sortowania przez scalanie (merge sort) dla tablicy dynamicznej (Array List) liczb całkowitych.

- Wykonać eksperyment polegający na sortowaniu liczb: 5, 6, 3, 2, 8, -4, -9, 9, 0, 1

<hr>
