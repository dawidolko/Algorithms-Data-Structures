package A.A5_BDB;
import java.util.ArrayList;
// Iterator do drzewa BST
public class BSTreeIterator {
    private ArrayList<TreeNode> nodeList; // Lista węzłów drzewa BST
    private int currentNodeIndex; // Indeks aktualnego węzła w liście
    // Konstruktor przyjmujący listę węzłów i inicjujący iterator.
    public BSTreeIterator(ArrayList<TreeNode> nodeList) {
        currentNodeIndex = 0; // Ustawiamy indeks na początek listy
        this.nodeList = nodeList; // Przypisujemy listę węzłów
    }
    // Metoda sprawdzająca, czy istnieje kolejny węzeł do przeglądania.
    public boolean hasNext() {
        return currentNodeIndex < nodeList.size(); // Zwracamy true, jeśli indeks jest mniejszy od rozmiaru listy
    }
    // Metoda zwracająca kolejny węzeł z iteratora.
    public TreeNode next() {
        if (currentNodeIndex == nodeList.size())
            return null; // Jeśli doszliśmy do końca listy, zwracamy null
        TreeNode currentNode = nodeList.get(currentNodeIndex); // Pobieramy aktualny węzeł
        currentNodeIndex++; // Przesuwamy indeks na następny węzeł
        return currentNode; // Zwracamy aktualny węzeł
    }
}
