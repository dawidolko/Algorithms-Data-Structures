package C;

public class IntDynArrWithSort {
    private int[] tab;
    private int nElems;

    public IntDynArrWithSort(int maxSize) {
        tab = new int[maxSize];
        this.nElems = 0;
    }
    public void add(int elem)
    {
        if(nElems >= tab.length)
        {
            int[] tempTab = new int[tab.length * 2];
            for(int i = 0; i < tab.length; i++) tempTab[i] = tab[i];
            tab = tempTab;
        }
        tab[nElems] = elem;
        nElems++;
    }
    public int get(int index)
    {
        return tab[index];
    }
    public int size()
    {
        return nElems;
    }
    public boolean remove(int index)
    {
        if(nElems == 0) return false;
        for(int i = index; i < tab.length - 1; i++)
        {
            tab[i] = tab[i + 1];
        }
        nElems--;
        return true;
    }
    public int find(int elem)
    {
        for(int i = 0; i < tab.length; i++)
        {
            if(tab[i] == elem) return i;
        }
        return - 1;
    }
    public void bubbleSort()//sortowanie bąbelkowe
    {
        for(int i = nElems - 1; i > 0; i--)//przechodz schodkowo od wszystkich do jednego
        {
            for(int j = 0; j < i; j++)//przechodz ciagle od zera do konda po wszytskich elementach
            {
                if(tab[j] > tab[j + 1]) swap(j, j + 1);//jak wczesniejsza liczba jest wieksza to zamieniaj miejscami
            }
        }
    }
    public void swap(int a, int b)
    {
        int temp = tab[a];
        tab[a] = tab[b];
        tab[b] = temp;
    }
    public void selectionSort()
    {
        for(int i = 0; i < nElems; i++)
        {
            System.out.print(" i = " + i + ", przed: ");
            for(int j = 0; j < nElems; j++)
            {
                System.out.print(tab[j] + " ");
            }
            int minPos = i;
            for(int j = i + 1; j < nElems; j++)
            {
                if(tab[j] < tab[minPos]) minPos = j;
            }
            swap(minPos, i);
            System.out.print("\t Po: ");
            for(int j = 0; j < nElems; j++)
            {
                System.out.print(tab[j] + " ");
            }
            System.out.println();
        }
    }
    public void insertionSort()
    {
        for(int i = 1; i < nElems; i++)
        {
            int e = tab[i];
            System.out.print("i = " + i + " temp = [" + e + "]\tPrzed: ");
            for(int j = 0; j < nElems; j++)
            {
                System.out.print(tab[j] + " ");
            }
            int j = i;
            while(j > 0 && tab[j - 1] >= e)
            {
                tab[j] = tab[j - 1];
                j--;
            }
            tab[j] = e;
            System.out.print(" Po: ");
            for(j = 0; j < nElems; j++)
            {
                System.out.print(tab[j] + " ");
            }
            System.out.println();
        }
    }

    private void merge(int left,int mid,int right) //łącz fragment od l do mid z fragmentem od mid+1 do r
    {
        int [] tab1 = new int[right-left+1]; //Tworz tablice pomocnicza

        int k = 0; //Indeks w scalanej tablicy
        int i = left; //Indeks w pierwszym fragmencie do scalenia
        int j = mid+1; //Indeks w drugim fragmencie do scalenia

        while ((i<mid+1) || (j<right+1)) //...az do konca obydwu scalanych fragmentow
        {
            if (i==mid+1) //Jesli pierwszy fragment juz jest scalony...
            {
                tab1[k++] = tab[j++]; //...kopiuj kolejna liczbe z drugiego fragmentu

            }
            else if (j == right + 1) //Jesli drugi fragment juz jest scalony...
            {
                tab1[k++] = tab[i++]; //...kopiuj kolejna liczbe z pierwszego fragmentu
            }
            else //Scalanie elementow z obydwu fragmentow
            {
                if (tab[i] <= tab[j]) //Element z pierwszego fragmentu jest mniejszy i ma byc scalony jako pierwszy
                {
                    tab1[k++] = tab[i++]; //... i jest scalany jako pierwszy
                }
                else // table[j]<table[i], czyli element z drugiego fragmentu jest mniejszy
                {
                    tab1[k++] = tab[j++]; //... i jest scalany jako pierwszy
                }
            }
        }
        int l = left;
        for (i=0; i<tab1.length; i++)
        {
            tab[l++] = tab1[i];
        }
    }

    public void mergeSort(int left, int right) //Sortowanie przez scalanie
    {
        if (left < right)
        {
            int mid = (left + right) / 2;  //Wyliczenie srodka
            mergeSort(left, mid); //Sortowanie lewej czesci
            mergeSort(mid + 1, right); //Sortowanie prawej czesci
            merge(left, mid, right); //Sacalnie posortowanych czesci
        }
    }
    public void print()
    {
        for(int i = 0; i < nElems; i++)
        {
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args)
    {
        int maxSize = 2;

        IntDynArrWithSort array = new IntDynArrWithSort(maxSize);

        array.add(9);
        array.add(5);
        array.add(7);
        array.add(6);
        array.add(1);
        array.add(11);
        array.add(4);
        array.add(14);
        array.add(2);
//        array.bubbleSort();
        array.print();
        array.mergeSort(0, array.size() - 1);
        array.print();
//        array.selectionSort();

//        array.quickSort(0,array.size()-1);
//        array.mergeSort(0,array.size()-1);

//        array.print();
    }
}
