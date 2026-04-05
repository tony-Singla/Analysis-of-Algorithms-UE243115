import java.util.Arrays;
import java.util.Scanner;

public class dijsktra_path {
    static final int INF = 1000000000;

    static void dijkstra(int[][] graph, int src, int dest) {
        int v = graph.length;
        int dist[] = new int[v];
        boolean visited[] = new boolean[v];
        int parent[] = new int[v];

        Arrays.fill(dist, INF);
        dist[src] = 0;
        parent[src] = -1;

        for (int i = 0; i < v - 1; i++) {
            int u = -1;

            for (int j = 0; j < v; j++) {
                if (!visited[j] && (u == -1 || dist[j] < dist[u])) {
                    u = j;
                }
            }

            if (u == -1) break; 

            visited[u] = true;

            for (int j = 0; j < v; j++) {
                if (graph[u][j] != 0 && !visited[j]) {
                    if (dist[u] + graph[u][j] < dist[j]) {
                        dist[j] = dist[u] + graph[u][j];
                        parent[j] = u;
                    }
                }
            }
        }

        printPath(dest, parent);
    }

    static void printPath(int j, int parent[]) {
        if (j == -1) return;
        printPath(parent[j], parent);
        System.out.print(j + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = sc.nextInt();
        int graph[][] = new int[v][v];

        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        dijkstra(graph, 0, v - 1);
    }
}
