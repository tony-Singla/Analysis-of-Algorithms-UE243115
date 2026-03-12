import java.util.*;

class krushkal{

    static int V = 7;  
    static class Edge implements Comparable<Edge> {
        int src, dest, weight;

        Edge(int s, int d, int w) {
            src = s;
            dest = d;
            weight = w;
        }

        public int compareTo(Edge other) {
            return this.weight - other.weight; 
        }
    }

    static int find(int parent[], int i) {
        if (parent[i] == i)
            return i;
        return find(parent, parent[i]);
    }

    static void union(int parent[], int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    public static void main(String[] args) {

        PriorityQueue<Edge> pq = new PriorityQueue<>();

        pq.add(new Edge(0, 1, 2));
        pq.add(new Edge(0, 2, 4));
        pq.add(new Edge(1, 2, 1));
        pq.add(new Edge(1, 3, 7));
        pq.add(new Edge(2, 4, 3));
        pq.add(new Edge(3, 4, 2));
        pq.add(new Edge(3, 5, 1));
        pq.add(new Edge(4, 5, 5));
        pq.add(new Edge(5, 6, 6));

        int parent[] = new int[V];

        for (int i = 0; i < V; i++)
            parent[i] = i;
        
       int mstCost = 0;
       int count = 0;

        while (count < V - 1 && !pq.isEmpty()) {
            Edge edge = pq.poll(); 
            int x = find(parent, edge.src);
            int y = find(parent, edge.dest);
            if (x != y) {
                union(parent, x, y);              
                 count++;
                mstCost += edge.weight;
            }
        }
        System.out.println(mstCost);
    }
}
