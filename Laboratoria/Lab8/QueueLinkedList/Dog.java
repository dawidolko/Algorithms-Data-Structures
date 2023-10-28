package QueueLinkedList;

public class Dog {
    private String name;
    private int old;

    public Dog(String name, int old) {
        this.name = name;
        this.old = old;
    }

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", old=" + old +
                '}';
    }
}
