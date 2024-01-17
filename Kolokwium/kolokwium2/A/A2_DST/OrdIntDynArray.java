package A.A2_DST;

// A2 Implementacja uporzatkowanej tablicy dynamicznej "OrdDynArray" - DST

//Implementacja uporzadkowanej tablicy dynamicznej liczb calkowitych


public class OrdIntDynArray
{
    private int [] table;  //Referencja do tablicy
    private int nElems;  //Aktualna liczba elementow w tablicy

    public OrdIntDynArray(int maxSize)  // Konstruktor
    {
        table = new int[maxSize]; // Tworzymy tablice
        nElems = 0;               // Na razie brak elementow w tablicy
    }

    public void add(int value)    	// Wstawienie elementu do tablicy
    {
        if (nElems >= table.length) //Potrzeba relokacji
        {
            int [] locTable = new int[table.length*2];
            for (int i=0; i<table.length; i++) locTable[i]=table[i];
            table = locTable;
        }

        int j;
        for(j=0; j<nElems; j++)   // Znajdujemy miejsce dla elementu
           if(table[j] > value) break;

        for(int k=nElems; k>j; k--)    // Przesuwamy większe elementy
            table[k] = table[k-1];

        table[j] = value;       	// Wstawiamy element
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
        int left = 0;           // ograniczenie lewe
        int right = nElems - 1; // ograniczenie prawe
        int currIndex;  // aktualnie sprawdzany indeks

        while (true)
        {
            currIndex = (left + right) / 2;
            if (table[currIndex] == searchElem) return currIndex; //Element znaleziony
            else
                if (left > right) return -1; //Brak elementu
                else
                {
                    if (table[currIndex] < searchElem)
                    {
                        left = currIndex + 1; // Jest w górnej połowie tablicy
                    }
                    else
                    {
                        right = currIndex - 1; // Jest w dolnej połowie tablicy
                    }
                }
        }
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

        OrdIntDynArray array = new OrdIntDynArray(maxSize); 	// tworzymy tablice

        array.add(21);
        array.add(04); // wstawiamy 04 czyli de facto 4 - Java jest "madra" i interpretuje 04 jako inta o wartosci 4
        array.add(23);
        array.add(14);
        
        array.print();

        int index = array.find(23);
        System.out.println(index);

    }
}
