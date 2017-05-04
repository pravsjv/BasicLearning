package com.pravs.learning.datastructures.arrays;

/**
 * Created by praveenkumarjv on 5/3/17.
 */
public class BasicOperations {

    //defining and initializing an array
    //Arrays store elements in contiguous locations. Linear in accessing elements and inserting elements
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
    public static void printArray(int[] sortedArray)
    {
        for(int i=0; i<sortedArray.length; ++i)
        {
            System.out.println(sortedArray[i]);
        }
    }

    //accessing elements
//    for()
}
