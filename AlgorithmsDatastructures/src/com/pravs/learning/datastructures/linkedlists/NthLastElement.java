package com.pravs.learning.datastructures.linkedlists;

/**
 * Created by praveenkumarjv on 5/4/17.
 */
public class NthLastElement {
    Node head;
    static class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            next = null;
        }
    }

    public static void main(String[] args)
    {
        NthLastElement ll = new NthLastElement();

        ll.head = new Node(15);
        ll.head.next = new Node(3);
        ll.head.next.next = new Node(8);
        ll.head.next.next.next = new Node(6);
        ll.head.next.next.next.next = new Node(4);
        ll.head.next.next.next.next.next = new Node(8);
        ll.head.next.next.next.next.next.next = new Node(3);
        ll.head.next.next.next.next.next.next.next = new Node(20);
        ll.head.next.next.next.next.next.next.next.next = new Node(4);

        System.out.println(ll.lastNElement(4));

    }

    public int lastNElement(int n)
    {
        Node fast = head;
        Node slow = head;

        for(int i=0; i<n-1; ++i)
        {
            if(fast == null)
                return 0;

            fast = fast.next;
        }

        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        return slow.data;
    }
}
