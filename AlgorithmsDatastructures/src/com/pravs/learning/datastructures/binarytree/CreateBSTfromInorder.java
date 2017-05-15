package com.pravs.learning.datastructures.binarytree;

/**
 * Created by praveenkumarjv on 5/8/17.
 */
public class CreateBSTfromInorder {
    Node root;
    static class Node{
        int data;
        Node left, right;
        Node(int data)
        {
            this.data = data;
            left=right=null;
        }
    }

    Node createBinaryTree(int[] inorder, int start, int end)
    {
        int i =0;
        int maxNumber = 0;
        for(i=start; i<=end; i++)
        {
            if(inorder[i]>maxNumber)
                maxNumber = inorder[i];
        }

        Node root = new Node(maxNumber);
        root.left = createBinaryTree(inorder, start, i-1);
        root.right = createBinaryTree(inorder, i+1, end);

        return root;

    }

    public static void main(String[] args)
    {
        CreateBSTfromInorder tree = new CreateBSTfromInorder();

        int[] inorder = {1,5,10,40,30,15,28,20};

        Node n = tree.createBinaryTree(inorder, 0, 7);

        tree.printLevelOrderTraversal(n);
    }

    void printLevelOrderTraversal(Node n)
    {
        int h = height(n);

        for(int i=0; i<=h; i++)
        {
            printLevelOrder(n, i);
        }
    }

    void printLevelOrder(Node n, int level)
    {
        if(n==null)
            return;

        if(level==1)
            System.out.print(n.data+" ");

        if(level>1)
        {
            printLevelOrder(n.left, level-1);
            printLevelOrder(n.right, level-1);
        }
    }

    int height(Node n)
    {
        if(n!=null)
        {
            int lheight = height(n.left);
            int rheight = height(n.right);

            if(lheight>rheight)
                return lheight;
            else
                return rheight;
        }
        return 0;
    }
}
