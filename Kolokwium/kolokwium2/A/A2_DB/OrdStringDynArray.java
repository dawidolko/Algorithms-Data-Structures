package A.A2_DB;

// A2 Implementacja uporzatkowanej tablicy dynamicznej "OrdDynArray" - DB

//Implementacja uporzadkowanej tablicy dynamicznej Stringow

public class OrdStringDynArray
{
    private String [] table;  //Referencja do tablicy
    private int nElems;  //Aktualna liczba elementow w tablicy

    public OrdStringDynArray(int maxSize)  // Konstruktor
    {
        table = new String[maxSize]; // Tworzymy tablice
        nElems = 0;               // Na razie brak elementow w tablicy
    }

    public void add(String value)    	// Wstawienie elementu do tablicy
    {
        if (nElems >= table.length) //Potrzeba relokacji
        {
            String[] locTable = new String[table.length * 2];
            for (int i = 0; i < table.length; i++)
                locTable[i] = table[i];
            table = locTable;
        }

        int j;
        for (j = 0; j < nElems; j++)   // Znajdujemy miejsce dla elementu
            if (table[j].compareTo(value) > 0)
                break;

        for (int k = nElems; k > j; k--)    // Przesuwamy większe elementy
            table[k] = table[k - 1];

        table[j] = value;       	// Wstawiamy element
        nElems++;                      	// Zwiekszamy licznik elementow
    }

    public String get(int index) // Pozyskanie elementu o danym indeksie
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
        for (int j = index; j < nElems - 1; j++) 	// Przesuwamy pozostale elementy w lewo
            table[j] = table[j + 1];
        nElems--;                   		// Zmniejszamy licznik elementow
        return true;
    }

    public int find(String searchElem) // Szukanie okreslonego elementu
    {
        int left = 0;           // ograniczenie lewe
        int right = nElems - 1; // ograniczenie prawe
        int currIndex;  // aktualnie sprawdzany indeks

        while (true)
        {
            currIndex = (left + right) / 2;
            if (table[currIndex].equals(searchElem))
                return currIndex; //Element znaleziony
            else if (left > right)
                return -1; //Brak elementu
            else
            {
                if (table[currIndex].compareTo(searchElem) < 0)
                    left = currIndex + 1; // Jest w górnej połowie tablicy
                else
                    right = currIndex - 1; // Jest w dolnej połowie tablicy
            }
        }
    }

    public void print()
    {
        for (int i = 0; i < nElems; i++)
            System.out.print(get(i) + " ");
        System.out.println();
    }

    public static void main(String[] args)
    {
        int maxSize = 2;
        OrdStringDynArray array = new OrdStringDynArray(maxSize);
        array.add("Ola");
        array.add("Ala");
        array.add("Tola");
        array.print();
        array.remove(1);
        array.print();
        array.add("Lolek");
        array.print();

        int elemIndex = array.find("Tola");
        System.out.println(elemIndex);

    }
}
