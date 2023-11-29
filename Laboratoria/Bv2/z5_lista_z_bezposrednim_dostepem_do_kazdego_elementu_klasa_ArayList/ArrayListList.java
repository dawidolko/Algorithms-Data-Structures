package B.z5_lista_z_bezposrednim_dostepem_do_kazdego_elementu_klasa_ArayList;

import java.util.ArrayList;

public class ArrayListList {
    private ArrayList<Person> alList;
    ArrayListList()//konstruktor
    {
        alList = new ArrayList<Person>();
    }
    public boolean addLast(Person p)//dodawanie
    {
        return alList.add(p);
    }
    public Person removeLast()//usuwanie
    {
        return alList.remove(alList.size() - 1);
    }
    public Person get(int index)//pobieranie
    {
        return alList.get(index);
    }
    public Person find(Person p)//szukanie
    {
        for(int i = 0; i < alList.size(); i++)
        {
            if(alList.get(i).getImie().equals(p.getImie())
                    && alList.get(i).getNazwisko().equals(p.getNazwisko())
                    && alList.get(i).getWiek() == p.getWiek()) return alList.get(i);
        }
        return null;
    }
    public int size()
    {
        return alList.size();
    }//size
    public void print()//wypisywanie wszystkiego
    {
        for(int i = 0; i < alList.size(); i++)
        {
            System.out.println(alList.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayListList alList = new ArrayListList();
        alList.addLast(new Person("Jacek", "Murański", 66));
        alList.addLast(new Person("Mateusz", "Nowak", 55));
        alList.addLast(new Person("Michał", "Baron", 44));
        alList.addLast(new Person("Julia", "Najman", 33));
        alList.addLast(new Person("Maria", "Kowalski", 22));
        alList.print();
        System.out.println(alList.size());
        System.out.println(alList.get(4));
        System.out.println(alList.find(new Person("Jacek", "Murański", 66)));
        System.out.println(alList.find(new Person("Jacek", "Muranski", 66)));
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

