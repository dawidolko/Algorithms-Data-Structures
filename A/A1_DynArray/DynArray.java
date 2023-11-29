package A.A1_DynArray;

public class DynArray {
    public int nElems;
    public Point[] tab;

    public DynArray(int n) {
        tab = new Point[n];
        nElems = 0;
    }

    public void add(Point p) {
        if (nElems>=tab.length) {
            Point[] tempTab = new Point[nElems+2];
            for (int i=0;i<nElems;i++) tempTab[i] = tab[i];
            tab = tempTab;
        }

        tab[nElems] = p;
        nElems++;
    }

    public boolean remove(int index) {
        if (index<0 || index>=nElems) return false;

        for (int i=index;i<nElems-1;i++) tab[i] = tab[i+1];
        nElems--;
        return true;
    }

    public Point get(int index) {
        return tab[index];
    }

    public int size() {
        return nElems;
    }

    public int find1(Point p) {
        for (int i=0;i<nElems;i++) {
            if (p.equals(tab[i])) return i;
        }
        return -1;
    }

    public int find2(Point p) {
        for (int i=0;i<nElems;i++) {
            if (p.getX()==tab[i].getX() && p.getY()==tab[i].getY()) return i;
        }
        return -1;
    }

    public void print1() {
        System.out.println("Zawartosc listy:");
        for (int i=0;i<nElems;i++) {
            System.out.println(tab[i].toString());
        }
    }

    public void print2() {
        System.out.println("Zawartosc listy:");
        for (int i=0;i<nElems;i++) {
            System.out.println("Punkt: x=" + tab[i].getX() + ", y=" + tab[i].getY());
        }
    }


    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(0, 9);
        Point p4 = new Point(4, 5);

        DynArray tab = new DynArray(1);
        tab.add(p1);
        tab.add(p2);
        tab.add(p3);
        tab.add(p4);

        tab.print1();

        tab.remove(2);
        System.out.println(tab.find2(p1));

        tab.print2();
    }
}
