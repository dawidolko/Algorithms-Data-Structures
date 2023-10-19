### A.1 Decyzyjny problem plecakowy

Dany jest plecak o pojemności \( W = 10 \) oraz \( 6 \) przedmiotów ponumerowanych od \( 0 \) do \( 5 \). Każdy przedmiot ma określoną wartość i objętość. Należy zapakować plecak spośród przedmiotów ponumerowanych od \( 0 \) do \( 5 \) w taki sposób, aby wartość przedmiotów w nim zgromadzonych była największa. Wartości i objętości przedmiotów określone są w poniższej tabeli:

|   | 0 | 1 | 2 | 3 | 4 | 5 |
|---|---|---|---|---|---|---|
| v | 6 | 2 | 3 | 2 | 3 | 1 |
| w | 6 | 4 | 5 | 7 | 10 | 2 |

Odp: W plecaku o maksymalnej wartości znajdują się przedmioty 1,2,3,4 o wartości 26.

### A.2 Ogólny problem plecakowy

Dany jest plecak o objętości v = 23 oraz nieograniczona liczba egzemplarzy 6 różnych przed- miotów ponumerowanych od 0 do 5. Każdy przedmiot ma określoną wartość Wi i objętość Vi. Należy zapakować plecak spośród przedmiotów ponumerowanych od 0 do 5 w taki sposób, aby wartość przedmiotów w nim zgromadzonych była największa. Wartości i objętości przedmiotów określone są w poniższej tabeli:

|   | 0 | 1 | 2 | 3 | 4 | 5 |
|---|---|---|---|---|---|---|
| v | 6 | 2 | 3 | 2 | 3 | 1 |
| w | 6 | 4 | 5 | 7 | 10 | 2 |

Odp: W plecaku o maksymalnej wartości znajdzie się dziesięć przedmiotów z numerem 3 i jeden
przedmiot z numerem 4. Łączna wartość przedmiotów w plecaku wyniesie 80.

### A.3 Problem liczby pitagorejskich

Liczby pitagorejskie - to trzy liczby naturalne x, y, z, które spełniają warunek x2 + y2 = z2. Znaleźć wszystkie takie trójki liczb, przy założeniu, że każda z tych liczb ma należy do zbioru {1, ..., 30}.

### A.4 Problem doboru załogi statku kosmicznego

Organizowana jest załogowa ekspedycja kosmiczna na Marsa. W ramach kompletowania załogi statku kosmicznego główny organizator ekspedycji ma rozwiązać następujący problem. Do jego dyspozycji jest pięciu kosmonautów (k1, k2, k3, k4, k5), którzy przeszli pozytywnie kwalifikację wstępną do udziału w ekspedycji. Na pokładzie specjalnego statku kosmicznego spośród nich będzie potrzebny przynajmniej jeden specjalista w każdej z dziedzin: A, B, C i D. Wiadomym jest, że w dziedzinie A specjalizują się kosmonauci k1 i k4, w dziedzinie B specjalizują się kosmonauci k2, k3 i k4, w dziedzinie C specjalizują się kosmonauci k3 i k5 oraz w dziedzinie D specjalizują się kosmonauci k1, k2 i k5. Ze względu na szczupłość miejsca na pokładzie statku kosmicznego, z powyższej piątki trzeba wybrać jak najmniejszą grupkę kosmonautów, tak aby znajdował się w niej przynajmniej jeden specjalista w każdej z dziedzin A, B, C, D.

Odp: Na Marsa mogą polecieć np. kosmonauci k4 i k5.

### A.5 Problem wyprodukowania lodów wszystkich smaków

Fabryka lodów każdego dnia produkuje na tej samej maszynie lody o sześciu różnych smakach. Zmiana produkcji ze smaku \( i \) na smak \( j \) wymaga przestojenia maszyny, czyli przygotowania (w tym umycia) do nowej produkcji, które trwa określony czas. Podana niżej tablica zawiera informacje o czasach przestojenia maszyny.

| \( \ \)  | 1 | 2 | 3 | 4 | 5 | 6 |
|---------|---|---|---|---|---|---|
| **1**   | 1 | 0 | 7 | 21 | 12 | 23 |
| **2**   | 2 | 27 | 0 | 13 | 16 | 45 |
| **3**   | 53 | 15 | 0 | 25 | 27 | 6 |
| **4**   | 16 | 2 | 5 | 0 | 4 | 10 |
| **5**   | 18 | 29 | 18 | 17 | 0 | 4 |
| **6**   | 28 | 24 | 1 | 65 | 5 | 0 |

Znaleźć kolejność produkcji, przy której całkowity czas przestrojenia maszyny jest mini- malny. Przyjąć, że na koniec dnia maszyna ma być przygotowana do produkcji w następnym dniu.

Odp: Minimalny całkowity czas przestrojenia maszyny wynosi 63. Oto przykładowa kolejność produkcji lodów, dla której całkowity czas przestrojenia maszyny jest minimalny: 1,2,6,5,3,4,1.

### Podzbiory1

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

##Podzbiory2

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

###PPermutacje

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

###FiboDZ

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

