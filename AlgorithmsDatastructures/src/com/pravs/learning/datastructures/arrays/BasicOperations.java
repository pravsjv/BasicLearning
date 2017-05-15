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
        sortedArray[5] = 19;
        sortedArray[6] = 21;

        insertSortedArray(9,sortedArray);
        printArray(sortedArray);

        deleteSortedArray(13, sortedArray);
    }

    //printing elements
    public static void printArray(int[] array)
    {
        for(int i=0; i<array.length; ++i)
        {
            System.out.print(array[i]+" , ");
        }
        System.out.println();
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
        if(i<a.length) {
            for (int k = a.length - 1; k > i; k--) {
                a[k] = a[k - 1];
            }
            a[i] = val;
        }
    }

    public static void deleteSortedArray(int val, int[] a) {
        int i = 0;
        int len = a.length;
        for (i = 0; i < len - 1; i++) {
            if (a[i] == val) {
                break;
            }
        }
        for (int k = i; k < len - 1; k++) {
            a[k] = a[k + 1];
        }
        len--;

        for(int j=0; j<len; j++)
        {
            System.out.print(a[j]+" , ");
        }
    }

    //accessing elements
//    for()
}
