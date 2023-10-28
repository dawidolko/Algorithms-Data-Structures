package OrdDynArray;

public class OrdDynArray {
    private Samochod[] tab;
    private int nElems;

    public OrdDynArray(int maxSize) {
        this.tab = new Samochod[maxSize];
        this.nElems = 0;
    }

    public void add(Samochod sam) {
        if (this.nElems >= this.tab.length) {
            Samochod[] tempTab = new Samochod[this.nElems+2];
            for (int i=0;i<nElems;i++) tempTab[i] = this.tab[i];
            this.tab = tempTab;
        }

        int j = 0;
        for (j=0;j<nElems;j++) if (this.tab[j].compareTo(sam)>0) break;

        for (int k=nElems;k>j;k--) this.tab[k] = this.tab[k-1];

        this.tab[j] = sam;
        nElems++;
    }

    public Samochod get(int index) {
        return this.tab[index];
    }

    public int size() {
        return nElems;
    }

    public boolean remove(int index) {

        if (index<0 || index>=nElems) return false;

        for (int i=index;i<nElems;i++) this.tab[i]=this.tab[i+1];
        this.nElems--;
        return true;
    }

    public int find1(Samochod sam) {
        for (int i=0;i<nElems;i++) if (tab[i].equals(sam)) return i;
        return -1;
    }

    public int find2(Samochod sam) {
        for (int i=0;i<nElems;i++) {
            if (tab[i].getPrzebieg() == sam.getPrzebieg()
                    && tab[i].getMarka().equals(sam.getMarka())
                    && tab[i].getModel().equals(sam.getModel())) return i;
        }
            return -1;
    }

    public void print1() {
        for (int i=0;i<nElems;i++) System.out.println(tab[i].toString());
        System.out.println();
    }

    public void print2() {
        for (int i=0;i<nElems;i++) System.out.println(tab[i].getMarka() + " " + tab[i].getModel() + " " + tab[i].getPrzebieg());
        System.out.println();
    }
}
