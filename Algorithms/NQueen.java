public class NQueen {
    static int x[] = new int[10];

    static boolean place(int k, int i) {
        for(int j = 1; j < k; j++) {
            if(x[j] == i || Math.abs(x[j] - i) == Math.abs(j - k))
                return false;
        }
        return true;
    }

    static void nqueen(int k, int n) {
        for(int i = 1; i <= n; i++) {
            if(place(k, i)) {
                x[k] = i;

                if(k == n) {
                    for(int j = 1; j <= n; j++)
                        System.out.print(x[j] + " ");
                    System.out.println();
                }
                else {
                    nqueen(k+1, n);
                }
            }
        }
    }

    public static void main(String[] args) {
        nqueen(1, 4);
    }
}