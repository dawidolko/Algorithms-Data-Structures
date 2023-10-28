package QueueArrayList;

import java.util.ArrayList;

public class QueueArrayList {
    private ArrayList<Page> queue;

    public QueueArrayList() {
        queue = new ArrayList<>();
    }

    public void insert(Page p) {
        if (queue.size()==0) queue.add(p);
        else queue.add(queue.size(), p);
    }

    public Page remove() {
        return queue.remove(0);
    }

    public Page peek() {
        return queue.get(0);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public static void main(String[] args) {
        var queue = new QueueArrayList();

        Page p1 = new Page("stron.pl", "Aglomerex");
        Page p2 = new Page("cola.pl", "Pepsi");
        Page p3 = new Page("budowme.pl", "Bomea");
        Page p4 = new Page("baby.pl", "Bebiko");
        Page p5 = new Page("page.pl", "Page");

        queue.insert(p1);
        queue.insert(p2);
        queue.insert(p3);

        System.out.println(queue.remove().toString());
        System.out.println(queue.remove().toString());

        queue.insert(p4);
        queue.insert(p5);

        while (!queue.isEmpty()) {
            System.out.println(queue.remove().toString());
        }
    }
}
