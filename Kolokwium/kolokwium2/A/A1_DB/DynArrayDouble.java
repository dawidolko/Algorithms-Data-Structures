package A.A1_DB;

// A1 Implementacja tablicy dynamicznej "DynArray" - DB

// Implementacja tablicy dynamicznej obiektow typu Double

public class DynArrayDouble
{
    private Double [] table;  //Referencja do tablicy
    private int nElems;  //Aktualna liczba elementow w tablicy

    public DynArrayDouble(int maxSize)  // Konstruktor
    {
        table = new Double[maxSize]; // Tworzymy tablice
        nElems = 0;               // Na razie brak elementow w tablicy
    }

    public void add(Double value)    	// Wstawienie elementu do tablicy
    {
        if (nElems >= table.length)
        {
            Double [] locTable = new Double[table.length*2];
            for (int i=0; i<table.length; i++) locTable[i]=table[i];
            // LUB: System.arraycopy(table, 0, locTable, 0, table.length);
            table = locTable;
        }

        table[nElems] = value;       	// Wstawiamy element
        nElems++;                      	// Zwiekszamy licznik elementow
    }

    public Double get(int index) // Pozyskanie elementu o danym indeksie
    {
        return table[index];
    }

    public int size() // Aktualna liczba elementow w tablicy
    {
        return nElems;
    }

    public boolean remove(int index) 	// Usuniecie elementu o danym indeksie
    {
        if (nElems==0 || index>=nElems || index<0)  
            return false;
        for (int j = index; j < nElems-1; j++) 	// Przesuwamy pozostale elementy w lewo
        {
            table[j] = table[j + 1];
        }
        nElems--;                   		// Zmniejszamy licznik elementow
        return true;
    }

    public int find(Double searchElem) // Szukanie okreslonego elementu
    {        
        for (int j = 0; j < nElems; j++)
        {
            if (table[j].doubleValue() == searchElem.doubleValue()) // porownujemy wartosci
                return j; //Element znaleziono
        }
        return -1; // Elementu nie znaleziono
    }

    public void print()
    {
        for (int i = 0; i < nElems; i++) 
            System.out.print(get(i).toString()+" ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        int maxSize = 5;
        DynArrayDouble array = new DynArrayDouble(maxSize);
        
        array.add(Double.valueOf(123));
        array.add(Double.valueOf(234.432));
        array.add(Double.valueOf(345));
        array.print();
        array.remove(1);
        array.print();
        array.add(Double.valueOf(555.55));
        array.print();
        array.add(Double.valueOf(666.666));
        array.print();
        System.out.println(array.find(Double.valueOf(555.55)));
    }
}
