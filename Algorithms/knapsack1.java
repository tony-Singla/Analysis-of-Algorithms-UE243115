import java.util.*;

class Knapsack1 {

    public static void main(String args[]) {

        int item[][] = { {1,40}, {4,10}, {4,20}, {6,60} };

        int capacity = 20;
        int profit = 0;
        int n = item.length;

        Arrays.sort(item, (x,y) -> x[0] - y[0]);

        for(int i = 0; i < n; i++) {

            int w = item[i][1];
            int p = item[i][0];

            if(w <= capacity) {
                profit = profit + p;
                capacity = capacity - w;
            }
        }

        System.out.println("Profit = " + profit);
    }
}