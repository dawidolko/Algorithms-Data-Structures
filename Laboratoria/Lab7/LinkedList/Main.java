public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();

        list.insertFirst(22);
        list.insertFirst(44);
        list.insertFirst(66);

        list.insertLast(11);
        list.insertLast(33);
        list.insertLast(55);

        list.print();

        list.deleteFirst();
        list.deleteFirst();

        list.print();

        list.deleteLast();

        list.print();

        list.insertFirst(55);
        list.insertLast(55);

        list.print();
    }
}