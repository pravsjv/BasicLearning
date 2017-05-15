package com.pravs.learning.datastructures.matrix;

/**
 * Created by praveenkumarjv on 5/15/17.
 */
public class PrintSpiralOrder {
    boolean flg;
    void printMatrixSpirally(int a[][], int i, boolean flg, int m, int n)
    {
        if(i<m)
        {
            if(flg == false)
            {
                for(int j=0; j<n; ++j)
                {
                    System.out.print(a[i][j]+",");
                }
                printMatrixSpirally(a,i+1,true,m,n);
            } else
            {
                for(int j=n-1; j>=0; --j)
                {
                    System.out.print(a[i][j]+",");
                }
                printMatrixSpirally(a,i+1,false,m,m);
            }
        }
    }

    public static void main(String[] args)
    {
        int[][] a = new int[4][4];
        a[0][0] = 1;a[0][1] = 2;a[0][2] = 3;a[0][3]=4;
        a[1][0] = 5;a[1][1] = 6;a[1][2] = 7;a[1][3]=8;
        a[2][0] = 9;a[2][1] = 10;a[2][2] = 9;a[2][3]=11;
        a[3][0] = 12;a[3][1] = 13;a[3][2]=14; a[3][3]=15;

        PrintSpiralOrder ps = new PrintSpiralOrder();
        ps.printMatrixSpirally(a,0,false,4,4);
    }
}
