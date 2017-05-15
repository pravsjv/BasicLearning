package com.pravs.learning.datastructures.linkedlists;

/**
 * Created by praveenkumarjv on 5/12/17.
 */
public class MiddleLL {

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
        MiddleLL ll = new MiddleLL();

        ll.head = new Node(15);
        ll.head.next = new Node(3);
        ll.head.next.next = new Node(8);
        ll.head.next.next.next = new Node(6);
        ll.head.next.next.next.next = new Node(4);
        ll.head.next.next.next.next.next = new Node(8);
        ll.head.next.next.next.next.next.next = new Node(3);
        ll.head.next.next.next.next.next.next.next = new Node(20);
        ll.head.next.next.next.next.next.next.next.next = new Node(4);

        int middleElement = ll.middleElement(head);
        System.out.print(middleElement);
    }

    public int middleElement(Node n)
    {
        Node slow = head;
        Node fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
}
