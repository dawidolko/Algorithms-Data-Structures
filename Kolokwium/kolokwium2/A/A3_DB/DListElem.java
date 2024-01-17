package A.A3_DB;

public class DListElem {
    public int iData;
    public DListElem next;

    public DListElem(int iData) {
        this.iData = iData;
        next = null;
    }

    public String toString() {
        return Integer.toString(iData);
    }
}
