package B.B5_ArrayListList;

import java.util.ArrayList;

public class ArrayListList {
    private ArrayList<Cat> list;

    public ArrayListList() {
        list = new ArrayList<>();
    }

    public void addLast(Cat c) {
        list.add(c);
    }

    public Cat removeLast() {
        int index = list.size()-1;
        return list.remove(index);
    }

    public Cat get(int index) {
        return list.get(index);
    }

    public int size() {
        return list.size();
    }

    public int find(Cat c) {
        return list.indexOf(c);
    }

    public void print() {
        System.out.println("Zawartosc listy:");
        for (int i=0;i<size();i++) {
            System.out.println(list.get(i).toString());
        }
    }

    public static void main(String[] args) {
        Cat A = new Cat("Puszek", 4.78);
        Cat B = new Cat("Pisek", 4.21);
        Cat C = new Cat("Borys", 11.33);
        Cat D = new Cat("Cargo", 1.98);
        Cat E = new Cat("Wasek", 2.65);
        Cat F = new Cat("Czarny", 3.08);

        var list = new ArrayListList();

        list.addLast(A);
        list.addLast(B);
        list.addLast(C);

        list.print();

        list.removeLast();
        list.removeLast();

        list.print();

        list.addLast(D);
        list.addLast(E);
        list.addLast(F);

        list.print();
    }
}
