package com.pravs.learning.datastructures.binarytree;

import java.util.LinkedList;
import java.util.*;

/**
 * Created by praveenkumarjv on 5/8/17.
 */

class Node
{
    int key;
    Node left, right;

    Node(int key)
    {
        this.key = key;
        left = right = null;
    }
}

public class BinaryTree {
    Node root;

    BinaryTree()
    {
        root = null;
    }

    public static void main(String[] args)
    {
        BinaryTree bt = new BinaryTree();

        bt.root = new Node(1);

        bt.root.left = new Node(2);
        bt.root.right = new Node(3);

        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);

        bt.root.right.left = new Node(6);
        bt.root.right.right = new Node(7);

        System.out.print("InOrder Traversal of the BinaryTree: ");
        bt.inOrderTraversal();
        System.out.println();
        System.out.print("PreOrder Traversal of the BinaryTree: ");
        bt.preOrderTraversal();
        System.out.println();
        System.out.print("PostOrder Traversal of the BinaryTree: ");
        bt.postOrderTraversal();

        System.out.println();
        bt.levelOrderTraversal();
    }

    void preOrderTraversal()
    {
        preOrderTraversal(root);
    }

    void preOrderTraversal(Node n)
    {
        if(n == null)
            return;

        System.out.print(n.key+" ");
        preOrderTraversal(n.left);
        preOrderTraversal(n.right);
    }

    void postOrderTraversal()
    {
        postOrderTraversal(root);
    }

    void postOrderTraversal(Node n)
    {
        if(n == null)
            return;

        postOrderTraversal(n.left);
        postOrderTraversal(n.right);
        System.out.print(n.key+" ");
    }

    void inOrderTraversal()
    {
        inOrderTraversal(root);
    }
    void inOrderTraversal(Node n)
    {
        if(n == null)
            return;

        inOrderTraversal(n.left);
        System.out.print(n.key+" ");
        inOrderTraversal(n.right);
    }

    void levelOrderTraversal()
    {
        int h = height(root);
        System.out.println("Height of the tree: "+h);
        for(int i=0; i<=h; i++)
            levelOrderTraversal(root,i);
    }

    void levelOrderTraversal(Node n, int level)
    {
        if(n==null)
            return;

        if(level==1)
            System.out.print(n.key+" ");
        else if(level>1)
        {
            levelOrderTraversal(n.left,level-1);
            levelOrderTraversal(n.right,level-1);
        }
    }

    int height(Node n)
    {
        if(n==null)
            return 0;
        else
        {
            int lheight = height(n.left);
            int rheight = height(n.right);

            if(lheight>rheight)
                return lheight+1;
            else
                return rheight+1;
        }
    }


    void levelOrderTraversalQueue()
    {
//        Queue<Node> q = new LinkedList();


    }
}
