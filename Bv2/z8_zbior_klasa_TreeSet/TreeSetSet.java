package B.z8_zbior_klasa_TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetSet {
    private TreeSet<Person> tSet;
    TreeSetSet()
    {
        tSet = new TreeSet<Person>();
    }
    public TreeSet<Person> gettSet()
    {
        return tSet;
    }
    public int size()
    {
        return tSet.size();
    }
    public boolean member(Person elem){
        return tSet.contains(elem);
    }
    public void insert(Person p)
    {
        if(!member(p)) tSet.add(p);
    }
    public boolean delete(Person p)
    {
        if(member(p)) {tSet.remove(p); return true;}
        return false;
    }
    public TreeSetSet union(TreeSetSet secondSet)//oblicza sumę zbioru bierzącego ze zbirem z parametru metody
    {
        TreeSetSet unionSet = new TreeSetSet();//deklaracja nowa
        Iterator<Person> iterator = tSet.iterator();//do iteratora se przypisuje wartosci z drzewa
        while(iterator.hasNext())//dopuki w iteratorze są kolejne wartości(przechodzi po całym drzewie)
        {
            Person tempElem = iterator.next();//tworze chwilowy obiekt z następną osobą
            unionSet.insert(tempElem);//wrzucam go do naszego uniona
        }
        Iterator<Person> iteratorS = secondSet.gettSet().iterator();//kolejne drzewko ale teraz wartosci z drzewa które podajemy
        while(iteratorS.hasNext())//dopuki ma cos kolejnego
        {
            Person tempElem = iteratorS.next();//wstaw
            unionSet.insert(tempElem);//wstaw do uniona
        }
        return unionSet;//zwraca wszystkie elementy z obu drzew
    }
    public TreeSetSet insertSection(TreeSetSet secondSet)//zwróci wartosci które się pokrywają w obu drzewach
    {
        TreeSetSet insertSet = new TreeSetSet();
        Iterator<Person> iterator = tSet.iterator();
        while(iterator.hasNext())
        {
            Person tempElem = iterator.next();
            if(secondSet.member(tempElem)) insertSet.insert(tempElem);
        }
        return insertSet;
    }
    public TreeSetSet diferenceSection(TreeSetSet secondSet)
    {
        TreeSetSet diferentSet = new TreeSetSet();
        Iterator<Person> iterator = tSet.iterator();
        while(iterator.hasNext())
        {
            Person tempPerson = iterator.next();
            if(!secondSet.member(tempPerson)) diferentSet.insert(tempPerson);
        }
        return diferentSet;
    }
    public void print()
    {
        Iterator<Person> iterator = tSet.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }
    }

    public static void main(String[] args) {
        TreeSetSet tsSet = new TreeSetSet();
        tsSet.insert(new Person("Jan", "Kolwaski", 55));
        tsSet.insert(new Person("Kamil", "Kowaslski", 51));
        tsSet.insert(new Person("Adam", "Małysz", 33));
        tsSet.insert(new Person("Wojciech", "Wojcik", 31));
        tsSet.insert(new Person("Wiktoria", "Nowak", 35));
        tsSet.print();
    }
}
class Person implements Comparable<Person> {

    private String imie, nazwisko;
    private int wiek;

    Person(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Person{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        //wiek
        //imie
        //nazwisko
        if(o.getWiek() < this.getWiek()) return 1;
        else if(o.getWiek() > this.getWiek()) return -1;
        else if(o.getWiek() == this.getWiek() && !o.getImie().equals(this.getImie())) return o.getImie().compareTo(this.getImie());
        else if(o.getWiek() == this.getWiek() && o.getImie().equals(this.getImie())) return o.getNazwisko().compareTo(this.getNazwisko());
        return 0;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }
}
