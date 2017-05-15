package com.pravs.learning.datastructures.linkedlists;

/**
 * Created by praveenkumarjv on 5/12/17.
 */
public class ReverseLL {

    static Node head;

    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public static void main(String[] args)
    {
        ReverseLL ll = new ReverseLL();

        ll.head = new Node(1);
        ll.head.next = new Node(2);
        ll.head.next.next = new Node(3);
        ll.head.next.next.next = new Node(4);

        ll.head = ll.reverseList(head);
        ll.printLL(head);
    }

    public Node reverseList(Node curr)
    {
        Node prev = null;
        Node next = null;
        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void printLL(Node n)
    {
        if(n!=null)
        {
            System.out.print(n.data+"->");
            printLL(n.next);
        }
        if(n==null)
        {
            System.out.print("null");
        }
    }
}
