package com.pravs.learning.datastructures.linkedlists;

/**
 * Created by praveenkumarjv on 5/4/17.
 */
public class RemoveMiddleElement {

    // here the access is given to that only node. The following can't be used to delete the last element
    Node head;
    static class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data = data;
            next = null;
        }
    }

    public boolean removeMiddleElement(Node n)
    {
        if(n ==null || n.next==null)
        {
            return false;
        }

        Node next = n.next;
        n.data = next.data;
        n.next = next.next;

        return true;
    }

    public static void main(String[] args)
    {
        RemoveMiddleElement ll = new RemoveMiddleElement();

        ll.head = new Node(15);
        ll.head.next = new Node(3);
        ll.head.next.next = new Node(8);
        ll.head.next.next.next = new Node(6);
        ll.head.next.next.next.next = new Node(4);
        ll.head.next.next.next.next.next = new Node(8);
        ll.head.next.next.next.next.next.next = new Node(3);
        ll.head.next.next.next.next.next.next.next = new Node(20);
        ll.head.next.next.next.next.next.next.next.next = new Node(4);

        System.out.println(ll.removeMiddleElement(ll.head.next.next.next.next));
        ll.printList();
    }

    void printList()
    {
        Node n = head;

        while(n!=null)
        {
            System.out.print(n.data+" , ");
            n = n.next;
        }
    }
}
