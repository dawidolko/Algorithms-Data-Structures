package A.A5_DB;

import java.util.ArrayList;

//Iterator do drzewa BST

public class BSTreeIterator
{
    private ArrayList<TreeNode> nodeList;
    private int currentNodeIndex;
    
    public BSTreeIterator(ArrayList<TreeNode> nodeList)
    {
        currentNodeIndex = 0;
        this.nodeList = nodeList;
    }

    public boolean hasNext()
    {
        if (currentNodeIndex>nodeList.size()-1) return false;
        else return true;
    }

    public TreeNode next()
    {
        if (currentNodeIndex==nodeList.size()) 
            return null;        
        TreeNode currentNode = nodeList.get(currentNodeIndex);
        if (currentNodeIndex<nodeList.size()) currentNodeIndex++;
            return currentNode;
    }
    
}
