package A.A5_BSTree;

import java.util.ArrayList;

public class BSTreeIterator {
    private ArrayList<Node> nodeList;
    private int currentNodeIndex;

    public BSTreeIterator(ArrayList<Node> nodeList)
    {
        currentNodeIndex = 0;
        this.nodeList = nodeList;
    }

    public boolean hasNext()
    {
        if (currentNodeIndex>nodeList.size()-1) return false;
        else return true;
    }

    public Node next()
    {
        if (currentNodeIndex==nodeList.size())
            return null;
        Node currentNode = nodeList.get(currentNodeIndex);
        if (currentNodeIndex<nodeList.size()) currentNodeIndex++;
        return currentNode;
    }
}
