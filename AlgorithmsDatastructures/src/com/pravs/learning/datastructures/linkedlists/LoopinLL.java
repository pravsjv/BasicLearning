package com.pravs.learning.datastructures.linkedlists;

/**
 * Created by praveenkumarjv on 5/12/17.
 */
public class LoopinLL {

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
        LoopinLL ll = new LoopinLL();

        ll.head = new Node(15);
        ll.head.next = new Node(3);
        ll.head.next.next = new Node(8);
        ll.head.next.next.next = new Node(6);
        ll.head.next.next.next.next = new Node(4);
        ll.head.next.next.next.next.next = new Node(8);
        ll.head.next.next.next.next.next.next = new Node(3);
        ll.head.next.next.next.next.next.next.next = new Node(20);
        ll.head.next.next.next.next.next.next.next.next = new Node(4);

        //creating the loop
        ll.head.next.next.next.next = ll.head;

        boolean loopexists = ll.findLoopinLL(head);
        System.out.print(loopexists);
    }

    public boolean findLoopinLL(Node curr)
    {
        Node slow = head;
        Node fast = head;

        while(slow!=null && slow.next!=null && fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
                return true;
        }

        return false;
    }
}
