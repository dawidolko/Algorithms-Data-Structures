package B.z3_kolejka_klasa_ArrayList;

import B.z1_stos_klasa_ArrayList.ArrayListStack;

import java.util.ArrayList;

public class ArrayListQueue {

    private ArrayList<Person> queue;
    ArrayListQueue()
    {
        queue = new ArrayList<Person>();
    }
    public void insert(Person elem)
    {
        queue.add(elem);
    }
    public Person remove()
    {
        return queue.remove(0);
    }
    public Person peek()
    {
        return queue.get(0);
    }
    public boolean isEmpty()
    {
        return queue.isEmpty();
    }
    public int size()
    {
        return queue.size();
    }

    public static void main(String[] args) {
        ArrayListQueue qList = new ArrayListQueue();
        qList.insert(new Person("Adam", "Nowak", 21));
        qList.insert(new Person("Jacek", "Kowalski", 24));
        qList.insert(new Person("Dawid", "Nowakowski", 31));
        qList.insert(new Person("Mateusz", "Wojcik", 30));
        while(!qList.isEmpty()) System.out.println(qList.remove());
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
