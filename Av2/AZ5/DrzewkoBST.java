public class Drzewo {
    public DrzewoNode root;
    Drzewo()
    {
        root = null;
    }
    public DrzewoNode getRoot(){return root;}
    public void insert(int x)
    {
        DrzewoNode newNode = new DrzewoNode();
        newNode.iData = x;
        if(root == null) root = newNode;
        else{
            DrzewoNode curr = root;
            while(true)
            {
                DrzewoNode parent = curr;
                if(curr.iData > x)
                {
                    curr = curr.left;
                    if(curr == null)
                    {
                        parent.left = newNode;
                        newNode.parent = parent;
                        return;
                    }
                }
                else{
                    curr = curr.right;
                    if(curr == null)
                    {
                        parent.right = newNode;
                        newNode.parent = parent;
                        return;
                    }
                }
            }
        }
    }
    public boolean find(int elem)
    {
        if(root == null) return false;
        DrzewoNode curr = root;
        while(curr != null)
        {
            if(curr.iData > elem) curr = curr.left;
            else if(curr.iData < elem) curr = curr.right;
            else return true;
        }
        return false;
    }
    public DrzewoNode getSuccesor(DrzewoNode node)
    {
        DrzewoNode curr = node.right;
        while(curr.left != null) curr = curr.left;
        return curr;
    }
    private void deleteWithoutChilds(DrzewoNode node) {
        if (root == node) root = null;
        else {
            if (node.parent.left == node) node.parent.left = null;
            else node.parent.right = null;
            node.parent = null;
        }
    }
    private void deleteWithOneLeftChild(DrzewoNode node)
    {
        if(root == node) {
            root.left.parent = null;
            root = root.left;
        }
        else{
            if(node.parent.right == node) node.parent.right = node.left;
            else node.parent.left = node.left;
            node.left.parent = node.parent;
        }
    }
    private void deleteWithOneRightChild(DrzewoNode node)
    {
        if(root == node) {
            root.right.parent = null;
            root = root.right;

        }
        else{
            if(node.parent.right == node) node.parent.right = node.right;
            else node.parent.left = node.right;
            node.right.parent = node.parent;
        }
    }
    private void deleteWithTwoChilds(DrzewoNode node)
    {
        DrzewoNode succesor = getSuccesor(node);
        if(succesor.right == null) deleteWithoutChilds(succesor);
        else deleteWithOneRightChild(succesor);
        succesor.parent = node.parent;
        succesor.right = node.right;
        succesor.left = node.left;
        if(node.parent.right == node) node.parent.right = succesor;
        else node.parent.left = succesor;
        if(succesor.left != null) succesor.left.parent = succesor;
        if(succesor.right != null) succesor.right.parent = succesor;
    }
    public boolean delete(int elem)
    {
        if(root == null)return false;
        DrzewoNode curr = root;
        while(curr != null)
        {
            if(curr.iData > elem) curr = curr.left;
            else if(curr.iData < elem)curr = curr.right;
            else break;
        }
        if(curr == null) return false;
        if(curr.left != null && curr.right != null) deleteWithTwoChilds(curr);
        else{
            if(curr.left != null) deleteWithOneLeftChild(curr);
            else if(curr.right != null) deleteWithOneRightChild(curr);
            else deleteWithoutChilds(curr);
        }
        return true;
    }
    public void view(DrzewoNode node, int lvl)
    {
        if(node == null) return;
        for(int i = 0; i < lvl; i++)
        {
            System.out.print("- ");
        }
        System.out.println(node);
        if(node.left != null) view(node.left, lvl + 1);
        if(node.right != null) view(node.right, lvl + 1);
    }
    public void copyToArray(DrzewoNode node, ArrayList<DrzewoNode> lista)
    {
        if(node.left != null) copyToArray(node.left, lista);
        lista.add(node);
        if(node.right != null)copyToArray(node.right, lista);
    }
    public void print()
    {
        ArrayList<DrzewoNode> list = new ArrayList<>();
        copyToArray(root, list);
        for(int i = 0; i < list.size(); i++)
        {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Drzewo essa = new Drzewo();
        essa.insert(55);
        essa.insert(50);
        essa.insert(61);
        essa.insert(85);
        essa.insert(15);
        essa.insert(90);
        essa.insert(10);
        essa.insert(35);
        essa.insert(75);
        essa.insert(30);
        essa.print();
        essa.delete(85);
        essa.delete(15);
        essa.print();
    }
}
class DrzewoNode{
    public DrzewoNode parent, left, right;
    public int iData;
    DrzewoNode()
    {
        iData = 0;
        parent = null;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return " {"+ iData + '}';
    }
}
