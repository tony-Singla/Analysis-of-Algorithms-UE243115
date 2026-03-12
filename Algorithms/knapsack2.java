import java.util.*;

class Knapsack2 {

    public static void main(String args[]) {

        int item[][] = { {1,40}, {4,10}, {4,20}, {6,60} };

        int capacity = 20;
        int profit = 0;
        int n = item.length;

        Arrays.sort(item, (x,y) -> y[1] - x[1]);

        for(int i = 0; i < n; i++) {

            int w = item[i][0];
            int p = item[i][1];

            if(w <= capacity) {
                profit = profit + p;
                capacity = capacity - w;
            }
        }

        System.out.println("Profit = " + profit);
    }
}