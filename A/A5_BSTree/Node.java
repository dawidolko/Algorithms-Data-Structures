package A.A5_BSTree;

public class Node {
    public int Data;
    public Node parent, left, right;

    public Node() {
        Data = 0;
        parent = null;
        left = null;
        right = null;
    }

    public String toString() {
        return "{" + Data + "}";
    }
}
