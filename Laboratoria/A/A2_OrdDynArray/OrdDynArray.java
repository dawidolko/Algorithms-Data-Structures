package A.A2_OrdDynArray;

public class OrdDynArray {
    private Person[] tab;
    private int nElems;

    public OrdDynArray(int n) {
        nElems = 0;
        tab = new Person[n];
    }

    public void add(Person p) {
        if (nElems >= tab.length) {
            Person[] tempTab = new Person[nElems+4];
            for (int i=0;i<nElems;i++) tempTab[i] = tab[i];
            tab = tempTab;
        }

        int i=0;
        for (i=0;i<nElems;i++) if (tab[i].compareTo(p)>0) break;

        for (int j=nElems;j>i;j--) tab[j] = tab[j-1];

        tab[i] = p;
        nElems++;
    }

    public boolean remove(int index) {
        if (index<0 || index>=nElems) return false;

        for (int i=index;i<nElems;i++) tab[i] = tab[i+1];
        nElems--;
        return true;
    }

    public int size() {
        return nElems;
    }

    public Person get(int index) {
        return tab[index];
    }

    public int find1(Person p) {
        for (int i=0; i<nElems;i++) if (p.equals(tab[i])) return i;
        return -1;
    }

    public int find2(Person p) {
        for (int i=0; i<nElems;i++) {
            if (tab[i].getName().equals(p.getName()) && tab[i].getPesel()==p.getPesel()) return i;
        }
        return -1;
    }

    public void print1() {
        System.out.println("Zawartosc tablicy:");
        for (int i=0;i<nElems;i++) System.out.println(tab[i].toString());
    }

    public void print2() {
        System.out.println("Zawartosc tablicy:");
        for (int i=0;i<nElems;i++) System.out.println("Person: Name=" + tab[i].getName() + ", PESEL=" + tab[i].getPesel());
    }

    public static void main(String[] args) {
        Person p1 = new Person("Grzegorz", 123);
        Person p2 = new Person("Anna", 421);
        Person p3 =  new Person("Anna", 123);

        OrdDynArray array = new OrdDynArray(1);
        array.add(p1);
        array.add(p2);
        array.add(p3);

        array.print1();

        array.remove(1);
        array.print2();
    }
}
