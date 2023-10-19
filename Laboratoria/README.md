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
```
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
```
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
