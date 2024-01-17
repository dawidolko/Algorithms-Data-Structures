package A.A5_BDB;
// Klasa definiuje węzeł drzewa poszukiwań binarnych
public class TreeNode {
    public int iData;         // Element danych
    public TreeNode parent;   // Rodzic węzła
    public TreeNode left;     // Lewy potomek węzła
    public TreeNode right;    // Prawy potomek węzła
    // Konstruktor inicjujący wartości elementów węzła
    public TreeNode() {
        iData = 0;
        parent = null;
        left = null;
        right = null;
    }
    // Przesłonięta metoda toString() zwracająca wartość węzła jako tekst w klamrach
    public String toString() {
        return "{" + iData + "}";
    }
}
