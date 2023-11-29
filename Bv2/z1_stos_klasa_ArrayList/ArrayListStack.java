package B.z1_stos_klasa_ArrayList;

import java.util.ArrayList;

public class ArrayListStack {
    private ArrayList<Person> stack;//wyznaczanie miejsca essa
    ArrayListStack()
    {
        stack = new ArrayList<Person>();//deklaracja listy person
    }
    public void push(Person person)//dodanie człowieka na szczyt
    {
        stack.add(0, person);
    }
    public Person pop()//usuniecie człowieka za szczytu
    {
        return stack.remove(0);
    }
    public Person peek()//wypisanie człowieka ze szczytu
    {
        return stack.get(0);
    }
    public boolean isEmpty()//sprawdza czy czasami nie jest puste
    {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ArrayListStack theStack = new ArrayListStack();
        theStack.push(new Person("Adam", "Małysz", 44));
        theStack.push(new Person("Kamil", "Witkowski", 14));
        theStack.push(new Person("Kuba", "Nowakowski", 21));
        theStack.push(new Person("Wiktor", "Kowalski", 22));
        theStack.push(new Person("Ania", "Nowak", 31));
        theStack.push(new Person("Wiktoria", "Kowal", 18));
        while(!theStack.isEmpty())
        {
            System.out.println(theStack.pop());
        }
    }

}

class Person{
    private String imie, nazwisko;
    private int wiek;

    Person(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }
    Person(){}

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
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
