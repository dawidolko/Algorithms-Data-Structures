package A.A2_BDB;
// A2 Implementacja uporzatkowanej tablicy dynamicznej "OrdDynArray" - BDB
// Klasa OrdDynArray reprezentuje uporządkowaną tablicę dynamiczną przechowującą obiekty klasy Person.
public class OrdDynArray {
    public Person[] tab; // Tablica przechowująca obiekty klasy Person
    public int size; // Aktualna liczba elementów w tablicy
    // Konstruktor klasy OrdDynArray, inicjuje tablicę o początkowym rozmiarze size.
    OrdDynArray(int size) {
        tab = new Person[size];
        this.size = 0;
    }
    // Metoda add dodaje obiekt klasy Person do tablicy w porządku rosnącym.
    public void add(Person p) {
        if (size >= tab.length) {
            Person[] temp = new Person[tab.length * 2];
            for (int i = 0; i < size; i++) temp[i] = tab[i];
            tab = temp;
        }
        int i;
        for (i = 0; i < size; i++) {
            if (tab[i].compareTo(p) > 0) break;
        }
        for (int j = size; j > i; j--) {
            tab[j] = tab[j - 1];
        }
        tab[i] = p;
        size++;
    }
    // Metoda get zwraca element o podanym indeksie.
    public Person get(int index) {
        if (index >= size || index < 0) return null;
        return tab[index];
    }
    // Metoda size zwraca aktualną liczbę elementów w tablicy.
    public int size() {
        return size;
    }
    // Metoda remove usuwa element o podanym indeksie z tablicy.
    // Zwraca true, jeśli operacja powiedzie się, lub false w przeciwnym przypadku.
    public boolean remove(int index) {
        if (index >= size || index < 0) return false;
        for (int i = index; i < size - 1; i++) {
            tab[i] = tab[i + 1];
        }
        size--;
        return true;
    }
    // Metoda find szuka obiektu klasy Person w tablicy i zwraca jego indeks.
    // Zwraca -1, jeśli nie znajdzie.
    public int find(Person p) {
        for (int i = 0; i < size; i++) {
            if (tab[i].getImie().equals(p.getImie())
                    && tab[i].getNazwisko().equals(p.getNazwisko())
                    && tab[i].getWiek() == p.getWiek()) return i;
        }
        return -1;
    }
    // Metoda find2 szuka obiektu klasy Person w tablicy za pomocą metody compareTo.
    // Zwraca indeks, jeśli znajdzie, lub -1, jeśli nie.
    public int find2(Person p) {
        for (int i = 0; i < size; i++) if (tab[i].compareTo(p) == 0) return i;
        return -1;
    }
    // Metoda print wypisuje zawartość tablicy na konsoli.
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(tab[i]);
        }
    }
    // Metoda main zawiera przykładowe użycie klasy OrdDynArray.
    public static void main(String[] args) {
        OrdDynArray sortowana = new OrdDynArray(1);
        Person p1 = new Person("Kamil", "Nowak", 33);
        sortowana.add(p1);
        sortowana.add(new Person("Krystian", "Kuras", 22));
        sortowana.add(new Person("Mariusz", "Berkowicz", 31));
        sortowana.add(new Person("Wiktoria", "Wojtowicz", 11));
        sortowana.add(new Person("Julia", "Lisek", 23));
        sortowana.add(new Person("Kamila", "Kowal", 33));
        sortowana.print();

        System.out.println(sortowana.find(p1));
    }
}