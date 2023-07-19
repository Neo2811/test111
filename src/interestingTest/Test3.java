package interestingTest;

import java.util.Scanner;

public class Test3 {
    public static void main(String args[])
    {
        System.out.println("Enter The Value For N :");
        int n = 5;
        int m = 5;

        int[][] spiral = new int[n][m];

        int value = 1;

        int minCol = 0;

        int maxCol = n-1;

        int minRow = 0;

        int maxRow = m-1;

        while (value <= n*n)
        {
            for (int i = minCol; i <= maxCol; i++)
            {
                spiral[minRow][i] = value;

                value++;
            }

            for (int i = minRow+1; i <= maxRow; i++)
            {
                spiral[i][maxCol] = value;

                value++;
            }

            for (int i = maxCol-1; i >= minCol; i--)
            {
                spiral[maxRow][i] = value;

                value++;
            }

            for (int i = maxRow-1; i >= minRow+1; i--)
            {
                spiral[i][minCol] = value;

                value++;
            }

            minCol++;

            minRow++;

            maxCol--;

            maxRow--;
        }

        for (int i = 0; i < spiral.length; i++)
        {
            for (int j = 0; j < spiral.length; j++)
            {
                System.out.print(spiral[i][j]+ "\t");
            }

            System.out.println();
        }
    }
}
