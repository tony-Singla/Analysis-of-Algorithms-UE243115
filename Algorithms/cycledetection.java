import java.util.*;

public class cycledetection{
    static int find(int i, int parent[]) {
        if (parent[i] != i) {
            parent[i] = find(parent[i], parent);
        }
        return parent[i];
    }

    static boolean union(int a, int b, int parent[]) {
        int x = find(a, parent);
        int y = find(b, parent);

        if (x == y) {
            return true;
        } else {
            parent[x] = y;
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int[][] adj = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                adj[i][j] = sc.nextInt();
            }
        }

        int parent[] = new int[v];
        for (int i = 0; i < v; i++) {
            parent[i] = i;
        }

        boolean cycle = false;

        for (int i = 0; i < v; i++) {
            for (int j = i + 1; j < v; j++) {
                if (adj[i][j] == 1) {
                    if (union(i, j, parent)) {
                        cycle = true;
                        break;
                    }
                }
            }
        }

        if (cycle) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("No cycle");
        }

        sc.close();
    }
}