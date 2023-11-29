package B.z4_kolejka_klasa_LinkedList;

import java.util.LinkedList;

public class LinkedListQueue {
    private LinkedList<Person> llQueue;
    LinkedListQueue()
    {
        llQueue = new LinkedList<Person>();
    }
    public void insert(Person p)
    {
        llQueue.add(p);
    }
    public Person remove()
    {
        return llQueue.remove(0);
    }
    public Person peek()
    {
        return llQueue.peekFirst();
    }
    public boolean isEmpty()
    {
        return llQueue.isEmpty();
    }
    public int size()
    {
        return llQueue.size();
    }

    public static void main(String[] args) {
        LinkedListQueue llQueue = new LinkedListQueue();
        llQueue.insert(new Person("Adaś", "Nowak", 55));
        llQueue.insert(new Person("Nikodem", "Dyzma", 22));
        llQueue.insert(new Person("Patryk", "Vega", 39));
        llQueue.insert(new Person("Maria", "Kowalska", 25));
        System.out.println(llQueue.remove() + " <--- usuniety przed Wiktorią");
        llQueue.insert(new Person("Wiktoria", "Jeleniewska", 21));
        while(!llQueue.isEmpty()) System.out.println(llQueue.remove());
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
