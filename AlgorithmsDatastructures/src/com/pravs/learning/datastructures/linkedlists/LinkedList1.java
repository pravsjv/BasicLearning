package com.pravs.learning.datastructures.linkedlists;

/**
 * Created by praveenkumarjv on 5/4/17.
 */
public class LinkedList1 {
    private Node1 head;
    static class Node1{
        Node1 next;
        Node1 prev;
        int data;

        Node1(int data)
        {
            this.data=data;
        }
    }

    public static void main(String[] args)
    {
        LinkedList1 l = new LinkedList1();
        l.head = new Node1(1);
        l.head.next = new Node1(2);
        l.head.next.next = new Node1(4);
        l.head.next.next.next = new Node1(5);

        //method call to print the linkedlist
        l.printLL();
        l.push(0);
        l.insertAfter(3,l.head.next.next);
        l.insertLast(6);
        l.printLL();

        l.deleteFirst();
        l.deleteNode(l.head.next.next);
        l.deleteLast();
        l.printLL();

    }

    //method to traverse the LinkedList
    private void printLL()
    {
        Node1 n = head;
        while(n != null)
        {
            System.out.println(n.data);
            n = n.next;
        }
    }

    private void insertAfter(int key, Node1 prev_node)
    {
        // create the new Node with the given key val
        // traverse till the prev_node
        // Assign the next_node of prev_node to temp
        // assign the prev_node next to new_node
        //assign the new_node next to temp

        Node1 new_node = new Node1(key);
        Node1 n = head;
        while(n!=null && n!=prev_node)
        {
            n = n.next;
        }
        Node1 temp = n.next;
        n.next = new_node;
        new_node.next = temp;
    }

    private void push(int key)
    {
        Node1 new_node = new Node1(key);

        new_node.next = head;
        head = new_node;

    }

    private void insertLast(int key)
    {
        //create the new_node with the given key
        //traverse the list till last
        // then assign the last node next to the new node
        //assign null to the new_node next

        Node1 new_node = new Node1(key);
        Node1 n = head;
        Node1 prev = null;
        while(n!=null)
        {
            prev = n;
            n = n.next;
        }
        prev.next = new_node;
        new_node.next = null;
    }

    public void deleteFirst()
    {
        Node1 temp = head;
        head = head.next;
        temp = null;
    }


    public void deleteNode(Node1 del_node)
    {
        //traverse till that node
        //copy the next of node to be deleted in temp
        //make a note of prev value of node to be deleted
        //assign next of prev node to tmp

        Node1 n = head;
        Node1 prev = null;
        Node1 temp = null;
        while(n!=null && n!=del_node)
        {
            prev = n;
            n = n.next;
        }
        temp = n.next;
        prev.next = temp;
        n = null; // releases memory
    }

    public void deleteLast()
    {
        //traverse till the last node
        // Assign null to prev node next
        // Assign null to last node
        Node1 n = head;
        Node1 prev = null;
        while(n.next!=null)
        {
            prev = n;
            n = n.next;
        }
        prev.next=null;
        n = null;
    }
}
