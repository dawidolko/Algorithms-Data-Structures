package A.A2_BDB;
// Klasa Person reprezentuje osobę z informacjami o imieniu, nazwisku i wieku.
class Person implements Comparable<Person> {
    private String imie, nazwisko; // Prywatne pola przechowujące imię i nazwisko osoby
    private int wiek; // Prywatne pole przechowujące wiek osoby
    // Konstruktor klasy Person, inicjuje obiekt osobą przyjmując imię, nazwisko i wiek.
    Person(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    // Metoda getImie() zwraca imię osoby.
    public String getImie() {
        return imie;
    }
    // Metoda getNazwisko() zwraca nazwisko osoby.
    public String getNazwisko() {
        return nazwisko;
    }
    // Metoda getWiek() zwraca wiek osoby.
    public int getWiek() {
        return wiek;
    }
    // Przesłonięta metoda compareTo() pozwala na porównywanie obiektów Person.
    // Obiekty są porównywane na podstawie wieku, imienia i nazwiska.
    @Override
    public int compareTo(Person o) {
        if (this.getWiek() > o.getWiek()) return 1;
        else if (this.getWiek() < o.getWiek()) return -1;
        else {
            if (this.getImie().compareTo(o.getImie()) != 0) return this.getImie().compareTo(o.getImie());
            else return this.getNazwisko().compareTo(o.getNazwisko());
        }
    }
    // Przesłonięta metoda toString() zwraca reprezentację tekstową obiektu Person.
    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
