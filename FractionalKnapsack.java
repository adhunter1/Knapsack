import java.util.*;

public class FractionalKnapsack {


    //recursively goes through to calculate the knapsack
    static double calculate(int m, int w[], int p[], int n1)
    {
        //if there is nothing in the knapsack end the program
        if (n1 == 0 || m == 0) {
            return 0;
        }

        //if the last object is larger than the capacity
        if (w[n1-1] > m) {
            //recursively goes through the till it goes through the last number in the set
            return calculate(m, w, p, n1 - 1);
        } else {//if the weight is less than the capacity
            return Math.max( p[n1-1] + calculate(m-w[n1-1], w, p, n1-1),  calculate(m, w, p, n1-1));
        }



    }

}
