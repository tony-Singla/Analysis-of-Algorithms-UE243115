class Prims {

    static int INF = 999;

    void prim(int cost[][], int n) {

        int t[][] = new int[10][2];
        int near[] = new int[10];
        int minCost = 0;

        int i, j;
        int u = 0, v = 0;
        int min = INF;

        for (i = 1; i <= n; i++) {
            for (j = i; j <= n; j++) {
                if (cost[i][j] < min) {
                    min = cost[i][j];
                    u = i;
                    v = j;
                }
            }
        }

        t[1][0] = u;
        t[1][1] = v;
        minCost = cost[u][v];

        for (i = 1; i <= n; i++) {
            if (cost[i][v] < cost[i][u])
                near[i] = v;
            else
                near[i] = u;
        }

        near[u] = 0;
        near[v] = 0;

        for (i = 2; i <= n - 1; i++) {

            min = INF;
            int w = 0;

            for (j = 1; j <= n; j++) {
                if (near[j] != 0 && cost[j][near[j]] < min) {
                    min = cost[j][near[j]];
                    w = j;
                }
            }

            t[i][0] = w;
            t[i][1] = near[w];
            minCost = minCost + cost[w][near[w]];

            near[w] = 0;

            for (j = 1; j <= n; j++) {
                if (near[j] != 0 && cost[j][near[j]] > cost[j][w]) {
                    near[j] = w;
                }
            }
        }

        System.out.println("MST Edges:");

        for (i = 1; i <= n - 1; i++) {
            System.out.println(t[i][0] + " - " + t[i][1]);
        }

        System.out.println("Cost = " + minCost);
    }
}