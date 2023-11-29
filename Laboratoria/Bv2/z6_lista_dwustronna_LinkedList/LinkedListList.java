package B.z6_lista_dwustronna_LinkedList;

import java.util.LinkedList;

public class LinkedListList {
    private LinkedList<Person> llList;
    LinkedListList()
    {
        llList = new LinkedList<Person>();
    }
    public boolean isEmpty()
    {
        return llList.isEmpty();
    }
    public void insertFirst(Person p)
    {
        llList.addFirst(p);
    }
    public void insertLast(Person p)
    {
        llList.addLast(p);
    }
    public Person deleteLast()
    {
        return llList.removeLast();
    }
    public Person deleteFirst()
    {
        return llList.removeFirst();
    }
    public Person getFirst()
    {
        return llList.getFirst();
    }
    public Person getLast()
    {
        return llList.getLast();
    }
    public int size()
    {
        return llList.size();
    }
    public void print()
    {
        for(int i = 0; i < llList.size(); i++)
        {
            System.out.println(llList.get(i));
        }
    }

    public static void main(String[] args) {
        LinkedListList llList = new LinkedListList();
        llList.insertFirst(new Person("Marina", "Pazdzioch", 77));
        llList.insertFirst(new Person("Janusz", "Kowalski", 33));
        llList.insertFirst(new Person("Kazimierz", "Nowak", 22));
        llList.insertFirst(new Person("Władysława", "Kozioł", 42));
        llList.insertFirst(new Person("Paweł", "Wąs", 19));
        System.out.println(llList.getFirst());
        System.out.println(llList.getLast());
        System.out.println(llList.deleteLast());
        System.out.println(llList.getLast());
        llList.print();
    }
}

class Person{
    private String imie, nazwisko;
    private int wiek;

    Person(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }Person(){}


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

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
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
}