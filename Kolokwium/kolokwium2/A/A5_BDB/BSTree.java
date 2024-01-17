package A.A5_BDB;
// A5 Implementacja drzewa liczb całkowitch "TreeBST" - BDB
import java.util.ArrayList;
public class BSTree {
    private TreeNode root; // Korzeń drzewa
    // Konstruktor tworzący puste drzewo.
    public BSTree() {
        root = null;
    }
    // Metoda zwracająca korzeń drzewa.
    public TreeNode getRoot() {
        return root;
    }
    // Metoda wstawiająca element do drzewa.
    public void insert(int element) {
        TreeNode newNode = new TreeNode(); // Tworzymy nowy węzeł
        newNode.iData = element; // Zapisujemy dane
        if (root == null)
            root = newNode; // Jeśli drzewo jest puste
        else {
            TreeNode current = root; // Zaczynamy poszukiwania od korzenia
            while (true) {
                TreeNode parent = current;
                if (element < current.iData) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        newNode.parent = parent;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        newNode.parent = parent;
                        return;
                    }
                }
            }
        }
    }
    // Metoda sprawdzająca, czy element istnieje w drzewie.
    public boolean contains(int element) {
        if (root == null)
            return false;
        TreeNode current = root;
        while (current.iData != element) {
            if (element < current.iData)
                current = current.left;
            else
                current = current.right;
            if (current == null)
                return false;
        }
        return true;
    }
    // Metoda usuwająca węzeł bez potomków.
    private void deleteNodeWithoutChildren(TreeNode currentNode) {
        if (currentNode == root) {
            root = null;
        } else {
            if (currentNode.parent.left == currentNode) {
                currentNode.parent.left = null;
            } else {
                currentNode.parent.right = null;
            }
            currentNode.parent = null;
        }
    }
    // Metoda usuwająca węzeł z jednym lewym potomkiem.
    private void deleteNodeWithLeftChild(TreeNode currentNode) {
        if (currentNode == root) {
            root = currentNode.left;
        } else {
            if (currentNode.parent.left == currentNode) {
                currentNode.parent.left = currentNode.left;
            } else {
                currentNode.parent.right = currentNode.left;
            }
            currentNode.left.parent = currentNode.parent;
        }
    }
    // Metoda usuwająca węzeł z jednym prawym potomkiem.
    private void deleteNodeWithRightChild(TreeNode currentNode) {
        if (currentNode == root) {
            root = currentNode.right;
        } else {
            if (currentNode.parent.left == currentNode) {
                currentNode.parent.left = currentNode.right;
            } else {
                currentNode.parent.right = currentNode.right;
            }
            currentNode.right.parent = currentNode.parent;
        }
    }
    // Metoda wyznaczająca następnik węzła.
    private TreeNode getSuccessor(TreeNode node) {
        TreeNode current = node.right;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
    // Metoda usuwająca węzeł z dwoma potomkami.
    private void deleteNodeWithTwoChildren(TreeNode currentNode) {
        TreeNode successor = getSuccessor(currentNode);
        if (successor.left == null && successor.right == null)
            deleteNodeWithoutChildren(successor);
        else
            deleteNodeWithRightChild(successor);
        TreeNode parentCurr = currentNode.parent;
        if (currentNode != root) {
            if (parentCurr.left == currentNode)
                parentCurr.left = successor;
            else
                parentCurr.right = successor;
        }
        successor.left = currentNode.left;
        successor.right = currentNode.right;
        successor.parent = parentCurr;
        if (successor.left != null)
            successor.left.parent = successor;
        if (successor.right != null)
            successor.right.parent = successor;
        if (currentNode == root)
            root = successor;
    }
    // Metoda usuwająca element z drzewa.
    public boolean delete(int element) {
        if (root == null)
            return false;
        TreeNode current = root;
        while (current.iData != element) {
            if (element < current.iData)
                current = current.left;
            else
                current = current.right;
            if (current == null)
                return false;
        }
        if (current.left == null && current.right == null)
            deleteNodeWithoutChildren(current);
        else if (current.right == null)
            deleteNodeWithLeftChild(current);
        else if (current.left == null)
            deleteNodeWithRightChild(current);
        else
            deleteNodeWithTwoChildren(current);
        return true;
    }
    // Metoda wizualizująca drzewo tekstowo.
    public void visualize(TreeNode node, int level) {
        if (node == null)
            return;
        for (int i = 0; i < level; i++)
            System.out.print("- ");
        System.out.println(node.iData);
        visualize(node.left, level + 1);
        visualize(node.right, level + 1);
    }
    // Metoda kopiująca drzewo BST do listy dynamicznej.
    private void copyBSTreeToArrayList(TreeNode node, ArrayList<TreeNode> nodeList) {
        if (node.left != null)
            copyBSTreeToArrayList(node.left, nodeList);
        nodeList.add(node);
        if (node.right != null)
            copyBSTreeToArrayList(node.right, nodeList);
    }
    // Metoda zwracająca iterator drzewa BST.
    public BSTreeIterator iterator() {
        ArrayList<TreeNode> nodeList = new ArrayList<TreeNode>();
        if (root != null) {
            copyBSTreeToArrayList(root, nodeList);
        }
        return new BSTreeIterator(nodeList);
    }
    // Metoda wypisująca zawartość drzewa BST.
    public void print() {
        System.out.print("BST:");
        BSTreeIterator iterator = this.iterator();
        while (iterator.hasNext()) {
            TreeNode node = iterator.next();
            System.out.print(node.toString());
            System.out.print(" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        BSTree tree = new BSTree();
        // Wstawianie elementów
        tree.insert(50);
        tree.insert(25);
        tree.insert(75);
        tree.insert(12);
        tree.insert(37);
        tree.insert(43);
        tree.insert(30);
        tree.insert(33);
        tree.insert(87);
        tree.insert(63);
        tree.insert(97);
        tree.visualize(tree.getRoot(), 0);
        System.out.println("\n\t<< delete(50) >>");
        tree.delete(50);
        tree.visualize(tree.getRoot(), 0);
        tree.print();
        boolean result1 = tree.contains(33);
        System.out.println("Wynik wyszukania 33:" + result1);
        boolean result2 = tree.contains(40);
        System.out.println("Wynik wyszukania 40:" + result2);
        System.out.println("\n\t<< delete(37) >>");
        tree.delete(37);
        tree.visualize(tree.getRoot(), 0);
        System.out.println("\n");
        System.out.println("\n\t<< delete(43) >>");
        tree.delete(43);
        tree.visualize(tree.getRoot(), 0);
        System.out.println("\n");
        System.out.println("\n\t<< delete(25) >>");
        tree.delete(25);
        tree.visualize(tree.getRoot(), 0);
        System.out.println("\n");
        tree.print();
    }
}