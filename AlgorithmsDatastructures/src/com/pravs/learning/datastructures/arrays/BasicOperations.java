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
        for(int i=0; i<7; ++i)
        {
            sortedArray[i] = i;
        }
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
        if()
    }

    //accessing elements
//    for()
}
