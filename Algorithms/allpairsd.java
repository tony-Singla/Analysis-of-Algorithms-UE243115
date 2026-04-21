import java.util.*;

public class allpairsd {
 
    static void printPath(int i, int j, int[][] path) {
        if (path[i][j] == -1) {
            System.out.println("No path");
            return;
        }
        System.out.print(i);
        while (i != j) {
            i = path[i][j];
            System.out.print(" -> " + i);
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices:");
        int n = sc.nextInt();

        int[][] cost = new int[n][n];
        int[][] A = new int[n][n];       
        int[][] path = new int[n][n];    
        System.out.println("Enter cost matrix (-1 for no edge):");
 
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        } 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    A[i][j] = 0;
                    path[i][j] = i;
                }
                else if (cost[i][j] != -1) {
                    A[i][j] = cost[i][j];
                    path[i][j] = j;
                }
                else {
                    A[i][j] = Integer.MAX_VALUE;
                    path[i][j] = -1;
                }
            }
        }
 
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {

                    if (A[i][k] != Integer.MAX_VALUE && A[k][j] != Integer.MAX_VALUE) {

                        if (A[i][j] > A[i][k] + A[k][j]) {
                            A[i][j] = A[i][k] + A[k][j];
                            path[i][j] = path[i][k];    
                        }
                    }
                }
            }
        }
 
        System.out.println("\nShortest Distance Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == Integer.MAX_VALUE)
                    System.out.print("INF ");
                else
                    System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
 
        System.out.println("\nPaths between all pairs:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    System.out.print("Path from " + i + " to " + j + ": ");
                    printPath(i, j, path);
                }
            }
        }

        sc.close();
    }
}