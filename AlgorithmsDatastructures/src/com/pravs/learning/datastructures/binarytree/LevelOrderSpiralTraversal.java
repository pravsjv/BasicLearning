package com.pravs.learning.datastructures.binarytree;

/**
 * Created by praveenkumarjv on 5/8/17.
 */
public class LevelOrderSpiralTraversal {

    Node root;

    static class Node
    {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
            left = right = null;
        }
    }

    int height(Node n)
    {
        if(n!=null)
        {
            int lheight = height(n.left);
            int rheight = height(n.right);

            if(lheight>rheight)
                return lheight+1;
            else
                return rheight+1;
        }
        return 0;
    }

    void levelOrderSpiralTraversal()
    {
        levelOrderSpiralTraversal(root);
    }

    void levelOrderSpiralTraversal(Node n)
    {
        int h = height(n);
        boolean flag = false;

        for(int i=0; i<=h; i++)
        {
            printLevelOrderSpiralTraversal(n, i, flag);
            flag = !flag;
        }
    }

    void printLevelOrderSpiralTraversal(Node n, int level, boolean flag)
    {
        if(n==null)
            return;

        if(level==1)
            System.out.print(n.data+" ");

        if(level>1)
        {
            if(flag !=false)
            {
                printLevelOrderSpiralTraversal(n.left, level-1, flag);
                printLevelOrderSpiralTraversal(n.right, level-1, flag);
            }
            else
            {
                printLevelOrderSpiralTraversal(n.right, level-1, flag);
                printLevelOrderSpiralTraversal(n.left, level-1, flag);
            }

        }
    }

    public static void main(String[] args)
    {
        LevelOrderSpiralTraversal tree = new LevelOrderSpiralTraversal();

        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.root.right.left = new Node(23);

        tree.levelOrderSpiralTraversal();
    }
}
