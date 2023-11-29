package B.z2_stos_likedList;

import java.util.LinkedList;

public class LinkedListStack {
    private LinkedList<Person> stack;
    LinkedListStack()
    {
        stack = new LinkedList<Person>();
    }
    public void push(Person p)//dodaje element na szczyt
    {
        stack.push(p);
    }
    public Person pop()//pobiera element ze szczytu i go usuwa
    {
        return stack.pop();
    }
    public Person peek()//podgląd wartości na szczycie stosu
    {
        return stack.peek();
    }
    public boolean isEmpty()
    {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        LinkedListStack linkedStack = new LinkedListStack();
        linkedStack.push(new Person("Adam", "Nowak", 30));
        linkedStack.push(new Person("Krystian", "Filipak", 41));
        linkedStack.push(new Person("Michał", "Wojtowicz", 17));
        System.out.println(linkedStack.peek() + " <-- aktualnie nawyższa wartość");
        linkedStack.push(new Person("Ania", "Zalewski", 25));
        linkedStack.push(new Person("Klaudia", "Kowalski", 15));
        while(!linkedStack.isEmpty()) System.out.println(linkedStack.pop());
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