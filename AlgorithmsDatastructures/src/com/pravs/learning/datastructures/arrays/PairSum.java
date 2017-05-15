package com.pravs.learning.datastructures.arrays;

/**
 * Created by praveenkumarjv on 5/11/17.
 */
public class PairSum {

    private static final int MAX = 100000;

    void printPairs(int[] a, int sum)
    {
        boolean[] binmap = new boolean[MAX];

        for (int i=0; i<a.length; ++i)
        {
            int temp = sum-a[i];

            // checking for condition
            if (temp>=0 && binmap[temp])
            {
                System.out.println("Pair with given sum " +
                        sum + " is (" + a[i] +
                        ", "+temp+")");
            }
            binmap[a[i]] = true;
        }
    }

    public static void main(String[] args)
    {
        int[] a = {4,9,2,12,20,-14};
        PairSum p = new PairSum();
        p.printPairs(a, 6);
    }
}
