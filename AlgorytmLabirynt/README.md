# Algorytm labirynt

Napisać program znajdujący optymalne (najkrótsze) wyjście z labiryntu.

Opis algorytmu labiryntu:

Ten algorytm jest używany do znajdowania optymalnego (najkrótszego) wyjścia z labiryntu. Labirynt można traktować jako graf, gdzie każda komórka labiryntu reprezentuje wierzchołek, a korytarze między komórkami reprezentują krawędzie. Podczas przeszukiwania tego grafu, algorytm stara się znaleźć najkrótszą ścieżkę od punktu początkowego (wejścia) do punktu docelowego (wyjścia) w labiryncie.

Podstawowym podejściem w algorytmie labiryntu jest wykorzystanie techniki przeszukiwania grafu. Jednym z najbardziej popularnych algorytmów do tego celu jest algorytm BFS (Breadth-First Search) lub DFS (Depth-First Search). Oba algorytmy można zastosować, aby znaleźć najkrótszą ścieżkę w labiryncie.

Opis algorytmu BFS:

Rozpocznij od punktu początkowego (wejścia) labiryntu i dodaj go do kolejki.
Ustaw odwiedzony punkt początkowy na true, aby oznaczyć, że został już odwiedzony.
Dopóki kolejka nie jest pusta, wykonuj następujące czynności:
a. Pobierz pierwszy element z kolejki.
b. Sprawdź, czy ten punkt jest punktem docelowym (wyjściem). Jeśli tak, to znaleźliśmy najkrótszą ścieżkę i możemy zakończyć.
c. W przeciwnym razie sprawdź sąsiadów tego punktu (komórki sąsiednie w labiryncie).
d. Jeśli sąsiad nie był wcześniej odwiedzony i nie jest ścianą, oznacz go jako odwiedzonego, dodaj do kolejki i zapisz go jako "rodzic" tego punktu.
e. Powtarzaj kroki b-d dla wszystkich nieodwiedzonych sąsiadów tego punktu.
Jeśli kolejka zostanie wyczerpana bez znalezienia wyjścia, oznacza to, że nie ma możliwości wyjścia z labiryntu.
Po wykonaniu powyższych kroków, będziemy mieli listę "rodziców" dla każdej komórki w labiryncie, co pozwoli nam odtworzyć najkrótszą ścieżkę od punktu początkowego do punktu końcowego. W celu odtworzenia ścieżki, możemy rozpocząć od punktu końcowego i śledzić "rodziców" aż dotrzemy do punktu początkowego. W ten sposób uzyskamy optymalną (najkrótszą) trasę przez labirynt.
