package A.A5_BSTree;


import java.util.ArrayList;

public class BSTree {
    private Node root;

    public BSTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void insert(int elem) {
        Node newNode = new Node();
        newNode.Data = elem;

        if (root == null) {
            root = newNode;
        }
        else {
            Node current = root;

            while (true) {
                Node parent = current;

                if (elem<current.Data) {

                    current = current.left;
                    if (current==null) {
                        parent.left = newNode;
                        newNode.parent = parent;
                        return;
                    }

                } else {

                    current = current.right;
                    if (current==null) {
                        parent.right = newNode;
                        newNode.parent = parent;
                        return;
                    }
                }
            }
        }
    }

    public boolean find(int elem) {
        if (root==null) return false;

        Node current = root;
        while(current.Data!=elem) {
            if (elem < current.Data) current = current.left;
            else current = current.right;

            if (current == null) return false;
        }
        return true;
    }

    public Node getSuccesor(Node node) {
        Node current = node.right;
        while(current.left != null) {
            current = current.left;
        }
        return current;
    }

    public void deleteWithoutChilds(Node current) {
        if (current == root) {
            root = null;
        } else {
            if (current.parent.left == current) current.parent.left = null;
            else current.parent.right = null;
        }
        current.parent = null;
    }

    public void deleteWithOneLeftChild(Node current) {
        if (current == null) {
            current = null;
        } else {
            if (current.parent.left == current) current.parent.left = null;
            else current.parent.right = null;
        }
        current.left.parent = current.parent;
    }

    public void view(Node node, int level) {
        if (node==null) return;

        for (int i=0; i<level; i++) System.out.print("- ");
        System.out.println(node.Data);

        view(node.left, level+1);
        view(node.right, level+1);
    }

    private void copyBSTreeToArrayList(Node node, ArrayList<Node> nodeList) {
        if (node.left!=null) copyBSTreeToArrayList(node.left, nodeList);
        nodeList.add(node);
        if (node.right!=null) copyBSTreeToArrayList(node.right, nodeList);
    }

    public BSTreeIterator iterator() {
        ArrayList<Node> nodeList = new ArrayList<Node>();
        if (root!=null) {
            copyBSTreeToArrayList(root,nodeList);
        }
        return new BSTreeIterator(nodeList);
    }

    public void print() {
        System.out.print("BST:");
        BSTreeIterator iterator = this.iterator();

        while (iterator.hasNext()) {
            Node node = iterator.next();
            System.out.print(node.toString());
            System.out.print(" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        BSTree tree = new BSTree();

        tree.insert(65);
        tree.insert(55);
        tree.insert(77);
        tree.insert(35);

        tree.view(tree.getRoot(),0);
    }
}
