package A.A4_DST;

public class ListElem
{
    public int iData;              // Dana w elemencie listy (liczba calkowita)
    public ListElem next;          // Referencja do następnego elementu listy

    public ListElem(int iData) // konstruktor
    {
        this.iData = iData;   // Inicjalizacja danych
        next = null; //Pole next ma na poczatku wartosc null
    }

    public String toString()
    {
        return Integer.toString(iData);
    }
}