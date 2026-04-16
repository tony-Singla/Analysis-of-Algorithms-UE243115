public class mutistage_backward {
  public static void main(String[] args) {
        int INF = 9999;
        int cost[][] = {
            {0, 2, 1, 3, INF, INF, INF, INF},
            {INF, 0, INF, INF, 2, 3, INF, INF},
            {INF, INF, 0, INF, 6, 7, INF, INF},
            {INF, INF, INF, 0, 6, 8, 9, INF},
            {INF, INF, INF, INF, 0, INF, INF, 6},
            {INF, INF, INF, INF, INF, 0, INF, 4},
            {INF, INF, INF, INF, INF, INF, 0, 5},
            {INF, INF, INF, INF, INF, INF, INF, 0}
        };

        int n = 8;

        int bcost[] = new int[n];
        int d[] = new int[n];  

        bcost[n-1] = 0;  

        for(int j = n-2; j >= 0; j--) {
            bcost[j] = INF;
            for(int r = j+1; r < n; r++) {
                if(cost[j][r] != INF) {
                    if(cost[j][r] + bcost[r] < bcost[j]) {
                        bcost[j] = cost[j][r] + bcost[r];
                        d[j] = r;
                    }
                }
            }
        }

        System.out.println("Minimum Cost: " + bcost[0]);
 
        int p[] = new int[n];
        p[0] = 0;

        for(int j = 1; j < n; j++) {
            p[j] = d[p[j-1]];
        }

        System.out.print("Path: ");
        int i = 0;
        System.out.print("1 ");
        while(i != n-1) {
            i = d[i];
            System.out.print("-> " + (i+1) + " ");
        }
    }
    
}
