package com.pravs.learning.datastructures.binarytree;

import com.pravs.learning.datastructures.binarysearchtree.IsBTaBST;

/**
 * Created by praveenkumarjv on 5/8/17.
 */
public class BoundaryTraversal
{
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
    public static void main(String[] args)
    {
        BoundaryTraversal tree = new BoundaryTraversal();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        tree.root.right = new Node(22);
        tree.root.right.right = new Node(25);
        tree.root.right.left = new Node(23);

        tree.printBoundaryTraversal();
    }

    void printBoundaryTraversal()
    {
        printBoundaryTraversal(root);
    }

    void printBoundaryTraversal(Node n)
    {
        printLeftBoundary(n);
        printLeaves(n.left);
        printLeaves(n.right);
        printRightBoundary(n);

    }

    void printLeaves(Node n)
    {
        if(n!=null)
        {
            printLeaves(n.left);
            if(n.left==null && n.right==null)
                System.out.print(n.data+" ");
            printLeaves(n.right);
        }
    }

    void printLeftBoundary(Node n)
    {
        if(n!=null)
        {
            if(n.left!=null)
            {
                System.out.print(n.data+" ");
                printLeftBoundary(n.left);
            } else if(n.right!=null)
            {
                System.out.print(n.data+" ");
                printLeftBoundary(n.right);
            }
        }
    }
    void printRightBoundary(Node n)
    {
        if(n!=null)
        {
            if(n.right != null)
            {
                System.out.print(n.data+" ");
                printRightBoundary(n.right);
            }
            else if(n.left!=null)
            {
                System.out.print(n.data+" ");
                printRightBoundary(n.left);
            }
        }
    }
}
