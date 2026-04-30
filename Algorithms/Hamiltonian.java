public class Hamiltonian {
    static int x[] = new int[10];

    static int G[][] = {
        {0,1,1,0},
        {1,0,1,1},
        {1,1,0,1},
        {0,1,1,0}
    };

    static int n = 4;

    static boolean place(int k, int i) {

        if(G[x[k-1]][i] == 0)
            return false;

        for(int j = 1; j < k; j++) {
            if(x[j] == i)
                return false;
        }

        if(k == n && G[i][x[1]] == 0)
            return false;

        return true;
    }

    static void hamiltonian(int k) {
        for(int i = 1; i < n; i++) {
            if(place(k, i)) {
                x[k] = i;

                if(k == n) {
                    for(int j = 1; j <= n; j++)
                        System.out.print(x[j] + " ");
                    System.out.println(x[1]);
                }
                else {
                    hamiltonian(k+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        x[1] = 0;
        hamiltonian(2);
    }
}