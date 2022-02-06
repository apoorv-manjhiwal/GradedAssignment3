import java.io.*;
class Main
{
    public static Node node;
    static Node prevNode = null;
    static Node headNode = null;
   
    static void flatBTSke(Node root,int order)
    {
       
        if(root == null)
        {
            return;
        }
       
        if(order > 0)
        {
            flatBTSke(root.right, order);
        }
        else
        {
            flatBTSke(root.left, order);
        }
        Node rightNode = root.right;
        Node leftNode = root.left;
       
        if(headNode == null)
        {
            headNode = root;
            root.left = null;
            prevNode = root;
        }
        else
        {
            prevNode.right = root;
            root.left = null;
            prevNode = root;
        }
       
        if (order > 0)
        {
            flatBTSke(leftNode, order);
        }
        else
        {
            flatBTSke(rightNode, order);
        }
    }
   
    static void traverseRightSkewed(Node root)
    {
        if(root == null)
        {
            return;
        }
        System.out.print(root.val + " ");
        traverseRightSkewed(root.right);       
    }
   
    public static void main (String[] args)
    {
        Main tree = new Main();
        tree.node = new Node(50);
        tree.node.left = new Node(30);
        tree.node.right = new Node(60);
        tree.node.left.left = new Node(10);
        tree.node.right.left= new Node(55);

        int order = 0;
        flatBTSke(node, order);
        traverseRightSkewed(headNode);
    }
}
class Node
{
    int val;
    Node left, right;

    Node(int it)
    {
        val = it;
        left = right = null;
    }
}