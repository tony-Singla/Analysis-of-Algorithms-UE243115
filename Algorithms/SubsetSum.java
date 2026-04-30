public class SubsetSum {
    static int w[] = {0, 5, 10, 12, 13, 15, 18};
    static int x[] = new int[10];
    static int m = 30;
    static int n = 6;

    static void sumofsub(int s, int k, int r) {
        x[k] = 1;

        if(s + w[k] == m) {
            for(int i = 1; i <= k; i++)
                System.out.print(x[i] + " ");
            System.out.println();
        }
        else if(s + w[k] + w[k+1] <= m) {
            sumofsub(s + w[k], k+1, r - w[k]);
        }

        if((s + r - w[k] >= m) && (s + w[k+1] <= m)) {
            x[k] = 0;
            sumofsub(s, k+1, r - w[k]);
        }
    }

    public static void main(String[] args) {
        int r = 0;
        for(int i = 1; i <= n; i++)
            r += w[i];

        sumofsub(0, 1, r);
    }
}