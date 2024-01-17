package B.B5_DB;

// B5 Implementacja listy z bezpośrednim dostępem do każdego elementu poprzez podanie jego numeru za pomocą klasy "ArrayList" - DB

import java.util.ArrayList;

public class ArrayListList 
{

    private ArrayList<Object> oList;
    
    public ArrayListList()          // konstruktor
    {
        oList = new ArrayList<Object>();
    }
    
    public boolean addLast(Object elem)  // dodawanie elementow
    {
        return oList.add(elem);
    }
    
    public Object removeLast()  // usuwanie elementow
    {
        int lastIndex = oList.size()-1;
        return oList.remove(lastIndex);
    }

    public Object get(int index)  // pobieranie elementu o danym indeksie
    {
        return oList.get(index);
    }
    
    public int find(Object elem)  // wyszukiwanie elementow
    {
        return oList.indexOf(elem);
    }
    
    public int size()  // rozmiar listy
    {
        return oList.size();
    }
    
    public void print()  // wypisywanie listy
    {
        for (int i = 0; i < oList.size(); i++) 
        {
            System.out.print(oList.get(i)+" ");
        }
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayListList theList = new ArrayListList();
        
        theList.addLast("elem0");
        theList.addLast("elem1");
        theList.addLast("elem2");
        theList.addLast("elem3");
        theList.addLast("elem4");
        
        theList.print();
        System.out.println("");
        
        System.out.println(theList.get(3));
        System.out.println("");
        
        theList.print();
        System.out.println("");
        
        System.out.println(theList.removeLast());
        System.out.println("");
        
        System.out.println(theList.find("elem4"));
        System.out.println("");
        
        theList.print();
        System.out.println("");
    }
    
}
