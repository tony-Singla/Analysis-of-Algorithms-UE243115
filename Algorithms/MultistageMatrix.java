import java.util.*;

class MultistageSimple {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int graph[][] = new int[n + 1][n + 1];

        System.out.println("Enter adjacency matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        int stage[] = new int[n + 1];

        for (int i = 1; i <= n; i++)
            stage[i] = 1;

        for (int u = 1; u <= n; u++) {
            for (int v = 1; v <= n; v++) {

                if (graph[u][v] != 0) {
                    stage[v] = Math.max(stage[v], stage[u] + 1);
                }

            }
        }

        int maxStage = 0;

        for (int i = 1; i <= n; i++) {
            if (stage[i] > maxStage)
                maxStage = stage[i];
        }

        System.out.println("Number of stages = " + maxStage);

        for (int i = 1; i <= n; i++) {
            System.out.println("Vertex " + i + " -> Stage " + stage[i]);
        }

        sc.close();
    }
}