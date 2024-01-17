package A.A5_DST;


//Klasa definiuje wezel drzewa poszukiowan binarnych

public class TreeNode
{
    public int iData;         // Element danych
    public TreeNode parent;       // Rodzic węzła
    public TreeNode left;         // Lewy potomek węzła
    public TreeNode right;        // Prawy lewy potomek węzła

    public TreeNode()
    {
        iData = 0;
        parent = null;
        left = null;
        right = null;
    }

    public String toString()
    {
        return "{"+iData+"}";
    }
}
