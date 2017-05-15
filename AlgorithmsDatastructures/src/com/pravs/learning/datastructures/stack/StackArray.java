package com.pravs.learning.datastructures.stack;

/**
 * Created by praveenkumarjv on 5/4/17.
 */
public class StackArray {

    private static final int MAX = 100;

    int top;

    StackArray()
    {
        top=-1;
    }

    boolean isEmpty()
    {
        if(top<0)
            return false;
        return true;
    }

    void push(int val)
    {
        if(top>MAX)
        {
            throw new StackOverflowError("Stack overflow error");
        }
//        a[++top] = val;
    }

    int pop()
    {
        if(isEmpty())
            return 0;

//        return a[top--];
        return 1;
    }

    public static void main(String[] args)
    {
        int[] a = new int[MAX];
        StackArray s = new StackArray();
        for(int i=0; i<10; i++)
        {
            a[i] = i;
        }

        s.push(18);
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" , ");
        System.out.println(s.pop());
    }

}
