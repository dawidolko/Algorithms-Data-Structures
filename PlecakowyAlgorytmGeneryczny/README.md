# Plecakowy algorytm generyczny

Rozwiąż decyzyjny problem plecakowy algorytmem
genetycznym. Opisz cały problem krok po kroku i zrób program
w języku J ava z rozwiązaniem oraz opisem każdej z funkcji.

Opis plecakowego algorytmu genetycznego:

Problem plecakowy jest klasycznym problemem optymalizacyjnym, w którym celem jest wybranie zbioru przedmiotów o maksymalnej wartości do umieszczenia w plecaku o określonej pojemności. Każdy przedmiot ma swoją wagę i wartość, a celem jest maksymalizacja wartości umieszczonych przedmiotów w plecaku, przy założeniu, że nie przekraczamy pojemności plecaka.

Algorytm genetyczny jest jednym ze znanych i popularnych algorytmów heurystycznych używanych do rozwiązywania problemów optymalizacyjnych. Działa on na podobnej zasadzie jak proces ewolucji w naturze, gdzie generowane są populacje potomków, a następnie są one modyfikowane i oceniane pod względem dostosowania do danego problemu.

Kroki algorytmu genetycznego dla plecakowego problemu:

Inicjalizacja populacji początkowej: Wygeneruj początkową populację osobników (rozwiązań) z losowo wybranymi przedmiotami do umieszczenia w plecaku.

Ocena populacji: Oblicz wartość każdego osobnika w populacji (czyli sumę wartości umieszczonych przedmiotów) i odrzuć te rozwiązania, które przekraczają pojemność plecaka.

Selekcja osobników: Wybierz najlepsze rozwiązania (osobniki) z populacji, które mają największą wartość. Można to zrobić za pomocą różnych strategii selekcji, na przykład selekcji turniejowej lub selekcji za pomocą ruletki.

Krzyżowanie (crossover): Wykonaj operację krzyżowania, aby stworzyć nowych potomków. Krzyżowanie odbywa się na losowo wybranych parach osobników z populacji, a nowi potomkowie otrzymują część genów od jednego rodzica i część od drugiego.

Mutacja: Wprowadź niewielkie zmiany w genach niektórych potomków, aby wprowadzić zróżnicowanie i uniknąć stagnacji w populacji.

Zastąpienie populacji: Zastąp starą populację nowymi potomkami.

Warunek stopu: Powtarzaj kroki 2-6 przez ustaloną liczbę generacji lub do momentu osiągnięcia zadowalającego rozwiązania.

Wynik: Ostateczne rozwiązanie to osobnik o największej wartości, który reprezentuje najlepszy wybór przedmiotów do umieszczenia w plecaku.
