package com.pravs.learning.datastructures.arrays;

/**
 * Created by praveenkumarjv on 5/3/17.
 */
public class BasicOperations {

    //defining and initializing an array
    //Arrays store elements in contiguous locations. Linear in accessing elements iwth O(n) and inserting elementso(1)
    //disadv - fixed size.
    private static int[] unsortedArray = new int[8];
    public static void main(String[] args)
    {
        int[] sortedArray = new int[8];
        //initializing the arrays.
        sortedArray[0] = 5;
        sortedArray[1] = 8;
        sortedArray[2] = 10;
        sortedArray[3] = 13;
        sortedArray[4] = 16;
        printArray(sortedArray);
        insertSortedArray(9,sortedArray);
        printArray(sortedArray);
    }

    //printing elements
    public static void printArray(int[] array)
    {
        for(int i=0; i<array.length; ++i)
        {
            System.out.println(array[i]);
        }
    }

    //inserting elements into the array
    public static void insertSortedArray(int val, int[] a)
    {
        int i =0;
        for(i=0; i<a.length; i++)
        {
            if(a[i]>val)
            {
                break;
            }
        }

        for(int k=i; i<a.length-1; k++)
        {
            a[k+1] = a[k];
            a[i] = val;
        }

        printArray(a);
    }

    //accessing elements
//    for()
}
