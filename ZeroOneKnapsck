
import java.util.Scanner;


public class ZeroOneKnapsack

{



    public void calculate(int[] w, int[] p, int m, int n)

    {

        //initialize arrays
        int[][] mArray = new int[n + 1][m + 1];

        int[][] hold = new int[n + 1][m + 1];


        //sorts everything based on weight
        for (int i = 1; i <= n; i++)

        {

            for (int j = 0; j <= m; j++)

            {
                //new array to hold content
                int mHigh = mArray[i - 1][j];
                //sets m2 to lowest possible number(neg infinity)
                int mLow = Integer.MIN_VALUE;
                //if j greater or equal to weight
                if (j >= w[i]) {
                    mLow = mArray[i - 1][j - w[i]] + p[i];
                }
                //pick the max between these two nums
                mArray[i][j] = Math.max(mHigh, mLow);
                //set hold to 0 if mHigh is larger
                if(mHigh>mLow)
                {
                    hold[i][j]=0;
                }else {
                    hold[i][j] = 1;

                }//end else if


            }//end inner for

        }//end outer for


        //put objects chosen by algorithm here
        int[] chosen = new int[n + 1];
        int  mHold = m;
        //goes through n items backwards
        for (int nHold = n; nHold > 0; nHold--)

        {
            //if hold isnt 1(higher)
            if (hold[nHold][mHold] != 0)

            {
                //make equal to hold
                chosen[nHold] = 1;
                //hold minnus the weight of w
                mHold = mHold - w[nHold];

            } else
                //make the chosen equal to the hold and do nothing w it
                chosen[nHold] = 0;

        }
        //print this out for easiest ui
        System.out.print("\nItems with weight ");
        // total weight
        int total = 0;
        //goes through until n+1 elements to look thru chosen
        for (int i = 1; i < n + 1; i++)

            if (chosen[i] == 1) {
                //prints out chosen numbers based on alg
                System.out.print(p[i] + " ");
                total += p[i];

            }


        System.out.println("are chosen");

        System.out.println("Solution : " + total);

    }

}
