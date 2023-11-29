package B.z9_zbior_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetSet {
    private HashSet<Person> hsSet;

    public HashSetSet() {
        hsSet = new HashSet<Person>();
    }

    public HashSet<Person> getHsSet() {
        return hsSet;
    }
    public int size()
    {
        return hsSet.size();
    }
    public void insert(Person elem)
    {
        if(!member(elem)) hsSet.add(elem);
    }
    public boolean member(Person elem)
    {
        return hsSet.contains(elem);
    }
    public boolean delete(Person elem)
    {
        if(member(elem)) {
            return hsSet.remove(elem);
        }
        return false;
    }
    public HashSetSet union(HashSetSet secondSet)
    {
        HashSetSet summarySet = new HashSetSet();
        Iterator<Person> iterator = hsSet.iterator();
        while(iterator.hasNext())
        {
            Person tempSet = iterator.next();
            summarySet.insert(tempSet);
        }
        Iterator<Person> secIter = hsSet.iterator();
        while(secIter.hasNext())
        {
            Person temp = secIter.next();
            summarySet.insert(temp);
        }
        return summarySet;
    }
    public HashSetSet intersection(HashSetSet secSet)
    {
        HashSetSet intersectionSet = new HashSetSet();
        Iterator<Person> iterator = hsSet.iterator();
        while(iterator.hasNext())
        {
            Person temp = iterator.next();
            if(secSet.member(temp)) intersectionSet.insert(temp);
        }
        return intersectionSet;
    }
    public HashSetSet difference(HashSetSet secSet)
    {
        HashSetSet differenceSet = new HashSetSet();
        Iterator<Person> iterator = hsSet.iterator();
        while(iterator.hasNext())
        {
            Person temp = iterator.next();
            if(!secSet.member(temp)) differenceSet.insert(temp);
        }
        return differenceSet;
    }
    public void print()
    {
        Iterator<Person> iterator = hsSet.iterator();
        while(iterator.hasNext())
        {
            Person temp = iterator.next();
            System.out.println(temp + " ");
        }
    }

    public static void main(String[] args) {
        HashSetSet hsSet = new HashSetSet();
        hsSet.insert(new Person("Jan", "Matejko", 44));
        hsSet.insert(new Person("Jan", "Kolwaski", 55));
        hsSet.insert(new Person("Kamil", "Kowaslski", 51));
        hsSet.insert(new Person("Adam", "Małysz", 33));
        hsSet.insert(new Person("Wojciech", "Wojcik", 31));
        hsSet.insert(new Person("Wiktoria", "Nowak", 35));
        HashSetSet hsSet2 = new HashSetSet();
        hsSet2.insert(new Person("Kamil", "Matejko", 44));
        hsSet2.insert(new Person("Jan", "Matejko", 44));
        hsSet2.insert(new Person("Kamil", "Kowaslski", 51));
        hsSet2.insert(new Person("Wojciech", "Małysz", 33));
        hsSet2.insert(new Person("Wiktoria", "Wojcik", 31));
        hsSet2.insert(new Person("Wojciech", "Wojcik", 31));
        hsSet2.insert(new Person("Wiktoria", "Nowak", 35));
        hsSet.difference(hsSet2).print();
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

