package com.pravs.learning.datastructures.binarytree;

/**
 * Created by praveenkumarjv on 5/8/17.
 */
public class LevelOrderTraversal {

    Node root;

    static class Node
    {
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
            left= right = null;
        }
    }

    void levelOrder()
    {
        levelOrder(root);
    }

    void levelOrder(Node n)
    {
        int h = height(n);
        if(n!=null)
        {
            for(int i=0; i<=h; i++){
                printLevelOrdertraversal(n, i);
            }
        }
    }

    void printLevelOrdertraversal(Node n, int level)
    {
        if(n==null)
            return;
        if(level==1) {
            System.out.print(n.data + " ");
        }
        printLevelOrdertraversal(n.left, level-1);
        printLevelOrdertraversal(n.right, level-1);
    }

    int height(Node n)
    {
        if(n!=null)
        {
            int lheight = height(n.left);
            int rheight = height(n.right);
            if(lheight>rheight)
            {
                return lheight+1;
            }
            else
            {
                return rheight+1;
            }
        }
        return 0;
    }

    public static void main(String[] args)
    {
        LevelOrderTraversal tree = new LevelOrderTraversal();

        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.root.right.left = new Node(23);

        tree.levelOrder();
    }
}
