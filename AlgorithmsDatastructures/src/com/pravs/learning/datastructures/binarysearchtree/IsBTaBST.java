package com.pravs.learning.datastructures.binarysearchtree;

/**
 * Created by praveenkumarjv on 5/8/17.
 */
public class IsBTaBST {

    Node root;
    Node prev;

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

    boolean isBST()
    {
        prev = null;
        return isBST(root);
    }

    boolean isBST(Node node)
    {
//        if(node==null)
//            return false;

        if (node != null)
        {
            if (!isBST(node.left))
                return false;

            // allows only distinct values node
            if (prev != null && node.data <= prev.data )
                return false;
            prev = node;
            return isBST(node.right);
        }
        return true;
    }


    public static void main(String[] args)
    {
        IsBTaBST treeNode = new IsBTaBST();

        treeNode.root = new Node(4);
        treeNode.root.left = new Node(2);
        treeNode.root.right = new Node(5);
        treeNode.root.left.left = new Node(1);
        treeNode.root.left.right = new Node(3);

        if(treeNode.isBST())
            System.out.print("Given Binary Tree is a BinarySearchTree");
        else
            System.out.print("Given Binary Tree isn't a BinarySearchTree");

    }

}
