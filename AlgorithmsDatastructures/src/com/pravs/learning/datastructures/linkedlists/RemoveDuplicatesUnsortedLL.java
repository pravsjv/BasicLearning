package com.pravs.learning.datastructures.linkedlists;

import java.util.HashSet;
/**
 * Created by praveenkumarjv on 5/4/17.
 */
public class RemoveDuplicatesUnsortedLL {

    Node head;
    static class Node{
        Node next;
        Node prev;
        int data;

        Node(int data)
        {
            this.data = data;
            next = null;
            prev = null;
        }
    }

    /**
     * Method to remove the duplicate values from an unsorted linked list.
     */
    public void removeDuplicates()
    {
        HashSet container = new HashSet();

        Node curr = head;
        Node prev = null;
        while(curr!=null)
        {
            if(!(container.contains(new Integer(curr.data)))){
                container.add(new Integer(curr.data));
                prev = curr;
            }
            else
            {
                prev.next = curr.next;
            }
            curr = curr.next;
        }
    }

    /**
     * Method to print the values in LinkedList
     */
    void printList()
    {
        Node n = head;
        while(n!=null)
        {
            System.out.print(n.data+" , ");
            n = n.next;
        }
    }

    public static void main(String[] args)
    {
        RemoveDuplicatesUnsortedLL ll = new RemoveDuplicatesUnsortedLL();

        ll.head = new Node(15);
        ll.head.next = new Node(3);
        ll.head.next.next = new Node(8);
        ll.head.next.next.next = new Node(6);
        ll.head.next.next.next.next = new Node(4);
        ll.head.next.next.next.next.next = new Node(8);
        ll.head.next.next.next.next.next.next = new Node(3);
        ll.head.next.next.next.next.next.next.next = new Node(20);
        ll.head.next.next.next.next.next.next.next.next = new Node(4);

        ll.removeDuplicates();
        ll.printList();
    }
}
