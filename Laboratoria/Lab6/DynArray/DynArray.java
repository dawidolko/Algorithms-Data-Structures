public class DynArray {
    private Osoba[] tab;
    private int nElems;

    public DynArray(int maxSize) {
        this.tab = new Osoba[maxSize];
        this.nElems = 0;
    }

    public void add(Osoba os) {

        if (this.nElems >= this.tab.length) {
            Osoba[] tempTab = new Osoba[this.nElems+2];
            for (int i=0;i<this.nElems;i++) tempTab[i] = this.tab[i];
            this.tab = tempTab;
        }

        this.tab[this.nElems] = os;
        this.nElems++;
    }

    public boolean remove(int index) {

        if (index<0 || index>=nElems) return false;

        for (int i=index;i<this.nElems-1;i++) this.tab[i] = this.tab[i+1];
        nElems--;
        return true;
    }

    public Osoba get(int index) {
        return this.tab[index];
    }

    public int size() {
        return this.nElems;
    }

    public int find1(Osoba os) {
        for (int i=0;i<nElems;i++) if (this.tab[i].equals(os)) return i;
        return -1;
    }
    public int find2(Osoba os) {
        for (int i=0;i<nElems;i++) {
            if (os.getImie().equals(this.tab[i].getImie())
            && os.getNazwisko().equals(this.tab[i].getNazwisko())
            && os.getWiek()==this.tab[i].getWiek()) return i;
        }
        return -1;
    }

    public void print1() {
        for (int i=0;i<nElems;i++) System.out.println(this.tab[i].toString());
        System.out.println();
    }
    public void print2() {
        for (int i=0;i<nElems;i++) System.out.println(this.tab[i].getImie() + " " + this.tab[i].getNazwisko() + " " + this.tab[i].getWiek());
        System.out.println();
    }
}
