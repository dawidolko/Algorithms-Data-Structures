package A.A1_DST;

// A1 Implementacja tablicy dynamicznej "DynArray" - DST

// Implementacja tablicy dynamicznej liczb calkowitych

public class IntDynArray
{
    static private int [] table;  //Referencja do tablicy
    private int nElems;  //Aktualna liczba elementow w tablicy

    public IntDynArray(int maxSize)  // Konstruktor
    {
        table = new int[maxSize]; // Tworzymy tablice
        nElems = 0;             // Na razie brak elementow w tablicy
    }

    //Add z relokacja
    public void add(int value)    	// Wstawienie elementu do tablicy
    {
        if (nElems >= table.length)
        {
            int [] locTable = new int[table.length*2];
            for(int i=0; i<table.length; i++) 
                locTable[i]=table[i];
            // LUB: System.arraycopy(table, 0, locTable, 0, table.length);
            table = locTable;
        }

        table[nElems] = value;       	// Wstawiamy element
        nElems++;                      	// Zwiekszamy licznik elementow
    }

    public int get(int index) // Pozyskanie elementu o danym indeksie
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

    public int find(int searchElem) // Szukanie okreslonego elementu
    {
        for (int j = 0; j < nElems; j++)
        {
            if (table[j] == searchElem) return j; //Element znaleziono
        }
        return -1; // Elementu nie znaleziono
    }

    public void print()
    {
        for (int i = 0; i < nElems; i++)
        {
            System.out.print(get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        int maxSize = 2;

        IntDynArray array = new IntDynArray(maxSize); 	// tworzymy tablice

        array.add(11);
        array.add(33);
        array.add(22);
        array.add(44);

        array.print();

        array.remove(1); // Usuwamy 2 elementy
        array.print();
        array.remove(1);
        array.print();
        
        array.add(55);
        array.add(66);

        array.print();

        int elemIndex = array.find(55);
        System.out.println(elemIndex);

    }
}
