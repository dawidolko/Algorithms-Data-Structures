public class ArrayNotSort {
    public Person[] tab;
    public int elem;
    ArrayNotSort(int size)
    {
        tab = new Person[size];
        elem = 0;
    }
    public void add(Person p)
    {
        if(elem >= tab.length)
        {
            Person[] temp = new Person[tab.length * 2];
            for(int i = 0; i < elem; i++) temp[i] = tab[i];
            tab = temp;
        }
        tab[elem] = p;
        elem++;
    }
    public Person get(int index)
    {
        if(index >= elem || index < 0) return null;
        return tab[index];
    }
    public int size()
    {
        return elem;
    }
    public boolean remove(int index)
    {
        if(index >= elem || index < 0) return false;
        for(int i = index; i < elem - 1; i++)
        {
            tab[i] = tab[i + 1];
        }
        elem--;
        return true;
    }
    public int find(Person p)
    {
        for(int i = 0 ; i < elem; i++)
        {
            if(tab[i].compareTo(p) == 0) return i;
        }
        return -1;
    }
    public int find2(Person p)
    {
        for(int i = 0; i < elem; i++)
        {
            if(tab[i].getImie().equals(p.getImie())
            && tab[i].getNazwisko().equals(p.getNazwisko())
            && tab[i].getWiek() == p.getWiek()) return i;
        }
        return -1;
    }
    public void print()
    {
        for(int i = 0; i < elem; i++)
        {
            System.out.println(tab[i]);
        }
    }
    public void print2()
    {
        for(int i = 0; i < elem; i++)
        {
            System.out.println("Imie:\t" + tab[i].getImie() + "\tnazwisko:\t" + tab[i].getNazwisko() + "\twiek:\t" + tab[i].getWiek());
        }
    }

    public static void main(String[] args) {
        ArrayNotSort nowa = new ArrayNotSort(1);
        nowa.add(new Person("Janek", "Nowak", 44));
        nowa.add(new Person("Adam", "Wojt", 22));
        nowa.add(new Person("Basia", "Kiszka", 11));
        nowa.add(new Person("Celina", "Baryła", 33));
        nowa.add(new Person("Daria", "Ludwik", 66));
        nowa.add(new Person("Ewa", "Kowal", 51));
        nowa.print();
        nowa.remove(4);
        nowa.print2();
    }
}
class Person implements Comparable<Person>
{
    private String imie, nazwisko;
    private int wiek;

    Person(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    @Override
    public int compareTo(Person o) {
        if(this.getWiek() > o.getWiek()) return 1;
        else if(this.getWiek() < o.getWiek()) return -1;
        else{
            if(this.getImie().compareTo(o.getImie()) != 0) return this.getImie().compareTo(o.getImie());
            else return this.getNazwisko().compareTo(o.getNazwisko());
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }
}
