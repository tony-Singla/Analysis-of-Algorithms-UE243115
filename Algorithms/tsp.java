public class tsp {

    static int n = 4;
    static int x[] = new int[10];
    static int cost[][] = {
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
        {20, 25, 30, 0}
    };

    static int mincost = 9999;

    static void tsp1(int k, int sum) {

        if(k == n) {
            if(cost[x[k-1]][x[0]] != 0) {
                int total = sum + cost[x[k-1]][x[0]];
                if(total < mincost) {
                    mincost = total;

                    for(int i = 0; i < n; i++)
                        System.out.print((x[i]+1) + " ");
                    System.out.println((x[0]+1));
                }
            }
            return;
        }

        for(int i = 1; i < n; i++) {

            boolean visited = false;
            for(int j = 0; j < k; j++) {
                if(x[j] == i) {
                    visited = true;
                    break;
                }
            }
            if(!visited && cost[x[k-1]][i] != 0) {
                x[k] = i;
                tsp1(k+1, sum + cost[x[k-1]][i]);
            }
        }
    }

    public static void main(String[] args) {
        x[0] = 0;   // start from city 1
        tsp1(1, 0);

        System.out.println("Minimum Cost: " + mincost);
    }
}