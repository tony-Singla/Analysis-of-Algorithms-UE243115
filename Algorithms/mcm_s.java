public class mcm_s {
  
    static void os(int[][] s, int i, int j) {
        if (i == j) {
            System.out.print("A" + i);
            return;
        }
        System.out.print("(");
        os(s, i, s[i][j]);
        os(s, s[i][j] + 1, j);
        System.out.print(")");
    }

    public static void main(String[] args) {

        int p[] = {2,4,2,5,6,2};

        int n = p.length - 1;

        int m[][] = new int[n+1][n+1];
        int s[][] = new int[n+1][n+1 ];

        for (int i = 1; i <= n; i++) {
            m[i][i] = 0;
        }

        for (int l = 2; l <= n; l++) {
            for (int i = 1; i <= n - l + 1; i++) {
                int j = i + l - 1;
                m[i][j] = Integer.MAX_VALUE;

                for (int k = i; k < j; k++) {
                    int q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j];

                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }

        System.out.println("matrix :");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
 
        System.out.println("\nMinimum Cost: " + m[1][n]);
 
        System.out.print("Optimal SOLUTION : ");
        os(s, 1, n);
    }
}


