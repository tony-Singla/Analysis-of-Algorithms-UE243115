# Analysis-of-Algorithms-UE243115

Algorithms 

LAB 1 
HORNER RULE 
	Aim: Evaluate a polynomial efficiently by reducing repeated multiplications using a nested form. It converts polynomial into a simpler recursive structure. 
	Use Case: Used in polynomial evaluation in mathematics and programming for better efficiency. 
	Recurrence:
P(x)=a_n+x⋅P_(n-1) (x)
	Time Complexity: O(n) 
	Space Complexity: O(n) (recursion) 
Algorithm :
Algorithm HORNER(arr, i, x)

if i = 0 then
return arr[0]

return HORNER(arr, i - 1, x) * x + arr[i]

Code for implementation :
import java.util.*;
public class Hornerrule {
    static int horner(int[] arr, int i, int x) {
        if (i == 0)
            return arr[0];
        return horner(arr, i - 1, x) * x + arr[i];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(horner(arr, n, x));
        sc.close();
    }
}
 
TOWER OF HANOI
Aim: Move n disks from source to destination rod using an auxiliary rod while following rules (one disk at a time, no larger on smaller). It breaks problem into smaller subproblems recursively. 
 Use Case: Classic recursion problem, helps understand divide-and-conquer. 
Recurrence:
T(n)=2T(n-1)+1
 Time Complexity: O(2ⁿ) 
 Space Complexity: O(n)



Algorithm : 
if n = 0 then
return

HANOI(n - 1, F, U, T)

print "from", F, "to", T

HANOI(n - 1, U, F, T)

Code for implementation :
import java.util.*;
public class ToweofH {
    static void hanoi(int n, char F, char T, char U) {
        if (n == 0)
            return;
        hanoi(n - 1, F, U, T);
        System.out.println("from " + F + " to " + T);
        hanoi(n - 1, U, F, T);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 'F', 'T', 'U');
        sc.close();
    }
}
 

Missing Number
Aim: Find the missing number from a sequence (1 to n) by comparing expected sum with actual sum. It avoids checking each number individually. 
Use Case: Used in arrays, data validation, coding problems. 
 Recurrence: Not applicable (iterative formula-based) 
Time Complexity: O(n) 
Space Complexity: O(1)

Code for implementation :
import java.util.Arrays;
public class missingno {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        Arrays.sort(arr);
        int missing = n;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                missing = i + 1;
                break;
            }
        }
        System.out.println("Missing number: " + missing);
    }

String Permutation
Aim: Generate all possible arrangements of characters of a string using swapping/backtracking. Explores all configurations. 
Use Case: Used in combinatorial problems, anagrams, brute-force solutions. 
Recurrence:
T(n)=n⋅T(n-1)
Time Complexity: O(n!) 
Space Complexity: O(n)
Code for implementation :
public class permutation {
    public static void main(String[] args) {
        String s = "ABC";
        char[] arr = s.toCharArray();
        permute(arr, arr.length, arr.length);
    }
    static void permute(char[] arr, int n, int k) {
        if (n == 0) {
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(arr, i, n - 1);
            permute(arr, n - 1, k);
            swap(arr, i, n - 1);
        }
    }
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

 
Selection Sort 
  Aim: Sort an array by repeatedly selecting the smallest element and placing it at the correct position. It reduces unsorted portion step by step. 
  Use Case: Useful for small datasets and when swaps are costly. 
  Recurrence:
T(n)=T(n-1)+(n-1)
  Time Complexity: O(n²) 
  Space Complexity: O(1)

Code for implementation :
import java.util.*; 
public class selectionsort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int n =10;
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i< n ;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0 ; i< n-1 ; i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for(int j= i ; j < n ; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minidx = j ; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
        for(int i = 0 ; i< n ;i++){
            System.out.print(arr[i]+" " );
        }
       sc.close();
    }
}

Linear Search
Aim: Find an element by checking each element one by one until match is found. 
Use Case: Searching in unsorted or small datasets. 
Recurrence:
T(n)=T(n-1)+1
Time Complexity: O(n) 
Space Complexity: O(1)

Code for implementation :
import java.util.*;
public class search {
    static boolean search1(int[] arr, int k, int i) {
        if (i == arr.length)
            return false;
        if (arr[i] == k)
            return true;
        return search1(arr, k, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (search1(arr, k, 0))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        sc.close();
    }
}

 

First Duplicate finder
Aim: Identify the first repeating element in an array by tracking visited elements. Stops when first duplicate is found. 
Use Case: Detect duplicates in data, validation problems. 
Recurrence: Not applicable 
Time Complexity: O(n) 
Space Complexity: O(n) (using set) / O(1) (optimized)
Code for implementation :
import java.util.*;
public class firstduplicate {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    ans = i;
                    break;
                }
            }
            if (ans != -1)
                break;
        }
        if (ans != -1)
            System.out.println("First duplicate element idx " + ans);
        else
            System.out.println("No duplicate element found");
 

POWER
Aim: Compute power x^nusing recursion by multiplying base repeatedly. Breaks problem into smaller powers. 
Use Case: Mathematical computations, exponentiation problems. 
Recurrence:
T(n)=T(n-1)+1
Time Complexity: O(n) 
Space Complexity: O(n)

   


TRUTH TABLE	
Aim: Generate all possible combinations of boolean variables and evaluate logical expressions. Uses binary counting approach. 
Use Case: Digital logic design, boolean algebra. 
Recurrence: Not applicable 
Time Complexity: O(2ⁿ) 
Space Complexity: O(n)
import java.util.*;
public class truthtable {
        static void generate(boolean[] arr, int n, int k) {
        if (n == 0) {
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        arr[n - 1] = false;
        generate(arr, n - 1, k);
        arr[n - 1] = true;
        generate(arr, n - 1, k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[n];
        generate(arr, n, n);

       
 
________________________________________
LAB 2)
Insertion Sort
Aim: Sort elements by inserting each element into its correct position in the already sorted part of the array. Builds sorted array step by step. 
Use Case: Efficient for small or nearly sorted datasets. 
Recurrence:
T(n)=T(n-1)+n
Time Complexity: O(n²) worst, O(n) best 
Space Complexity: O(1)

Code for implementation :
public class insertion {
    static void insertsort(int[] arr){
        int n = arr.length;
        for(int i = 1 ; i<n ; i++){
            int j = i ; 
            while(j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
 
    public static void main(String[] args) {
        int[] arr = {10,23,1,2,3,456,0,76,32,12,89};
        int n = arr.length;
        insertsort(arr);
        for(int i= 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
 
________________________________________
LAB3 : 
MERGE SORT
	Aim: Sort array using divide-and-conquer by splitting into halves, sorting, and merging. 
	Use Case: Efficient sorting for large datasets, stable sorting. 
	Recurrence:
T(n)=2T(n/2)+n
	Time Complexity: O(n log n) 
	Space Complexity: O(n) 
Code for implementation :
public class mergesort {
    static void mergeSort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1;
        int n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
 

QUICK SORT
Aim: Sort elements by selecting a pivot and partitioning the array into elements less than and greater than pivot, then recursively sorting parts. 
Use Case: Fast in practice, widely used for in-place sorting. 
Recurrence:
T(n)=T(k)+T(n-k-1)+n
(Best/Average: balanced → 2T(n/2)+n) 
Time Complexity: O(n log n) average, O(n²) worst 
Space Complexity: O(log n)

Code for implementation :
public class quicksort {
    static void quickSort1(int arr[], int low, int high) 
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort1(arr, low, p);         
            quickSort1(arr, p + 1, high);    
      
    static int partition(int arr[], int low, int high) {
        int pivot = arr[low];    
        int i = low - 1;
        int j = high + 1;
        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j)
                return j;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};
        quickSort1(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
 
________________________________________
LAB 4 ) 
Finding Minmax (Divide and conquer)
Aim: Multiply two matrices by dividing them into smaller submatrices and recursively computing their products, then combining results. 
Use Case: Basis for advanced algorithms like Strassen’s; used in scientific and engineering computations. 
Recurrence:
T(n)=8T(n/2)+O(n^2)
Time Complexity: O(n³) 
Space Complexity: O(n²)
public class maxmin {
    static int finalMin;
    static int finalMax;
    public static void mergeSort(int arr[], int lo, int hi) {
        if (lo == hi) {
            finalMin = arr[lo];
            finalMax = arr[lo];
            return;
        }
        int mid = (lo + hi) / 2;
        mergeSort(arr, lo, mid);
        int lmin = finalMin;
        int lmax = finalMax;
        mergeSort(arr, mid + 1, hi);
        int rmin = finalMin;
        int rmax = finalMax;
        if (lmin < rmin)
            finalMin = lmin;
        else
            finalMin = rmin;
        if (lmax > rmax)
            finalMax = lmax;
        else
            finalMax = rmax;
    }
    public static void main(String[] args) {
        int arr[] = {12, 4, 7, 9, 1, 15, 3}
        mergeSort(arr, 0, arr.length - 1);
________________________________________
 LAB 5 ) 
QUICK HULL
Aim: Find the convex hull of a set of points by recursively selecting farthest points and dividing the set, similar to Quick Sort strategy	. 
Use Case: Computational geometry, pattern recognition, image processing. 
Recurrence:
T(n)=T(k)+T(n-k-1)+n
Time Complexity: O(n log n) average, O(n²) worst 
Space Complexity: O(n)

Algorithm QUICKHULL(arr, n)
    if n < 3 then
        print "Convex Hull not possible"
        return
    min = 1
    max = 1

    for i = 2 to n do
        if arr[i].x < arr[min].x then
            min = i
        if arr[i].x > arr[max].x then
            max = i

    FINDHULL(arr, n, arr[min], arr[max], 1)
    FINDHULL(arr, n, arr[min], arr[max], -1)

Algorithm FINDHULL(arr, n, a, b, side)
    ind = -1
    maxDist = 0
    for i = 1 to n do
        d = DISTANCE(a, b, arr[i])
        if SIDE(a, b, arr[i]) = side AND d > maxDist then
            ind = i
            maxDist = d

    if ind = -1 then
        print a
        print b
        return

    FINDHULL(arr, n, arr[ind], a, -SIDE(arr[ind], a, b))
    FINDHULL(arr, n, arr[ind], b, -SIDE(arr[ind], b, a))

Algorithm SIDE(a, b, c)
    value = (c.y - a.y)*(b.x - a.x) - (b.y - a.y)*(c.x - a.x)
    if value > 0 return 1
    else if value < 0 return -1
    else return 0

Algorithm DISTANCE(a, b, c)

    return |(c.y - a.y)*(b.x - a.x) - (b.y - a.y)*(c.x - a.x)|
________________________________________
MATRIX MULTIPLICATION DIVIDE AND CONQUER 
Aim: Multiply two matrices by dividing them into smaller submatrices and recursively computing their products, then combining results. 
 Use Case: Basis for advanced algorithms like Strassen’s; used in scientific and engineering computations. 
Recurrence:
T(n)=8T(n/2)+O(n^2)
Time Complexity: O(n³) 
Space Complexity: O(n²)
Aim: Multiply two matrices by dividing them into smaller submatrices and recursively computing their products. Combines results to get final matrix. 
Use Case: Basis for advanced methods like Strassen’s algorithm; useful in large matrix computations. 
Recurrence:
T(n)=8T(n/2)+O(n^2)
Time Complexity: O(n³) 
Space Complexity: O(n²)

Code for implementation :
Multiply(A, B)
{
if n == 1 return A * B

divide A into A11, A12, A21, A22
divide B into B11, B12, B21, B22

C11 = Multiply(A11, B11) + Multiply(A12, B21)
C12 = Multiply(A11, B12) + Multiply(A12, B22)
C21 = Multiply(A21, B11) + Multiply(A22, B21)
C22 = Multiply(A21, B12) + Multiply(A22, B22)

combine C11, C12, C21, C22 → C
return C
} 
 

STRASSAN 
Aim: Multiply two matrices faster than the standard method by reducing number of multiplications using divide-and-conquer. Splits matrices into submatrices. 
Use Case: Efficient matrix multiplication in large-scale computations. 
Recurrence:
T(n)=7T(n/2)+O(n^2)
Time Complexity: O(n^{2.81}) 
Space Complexity: O(n²)

Algorithm Used :
Strassen(A, B)
{
if n == 1 return A * B

divide A into A11, A12, A21, A22
divide B into B11, B12, B21, B22

M1 = Strassen(A11 + A22, B11 + B22)
M2 = Strassen(A21 + A22, B11)
M3 = Strassen(A11, B12 - B22)
M4 = Strassen(A22, B21 - B11)
M5 = Strassen(A11 + A12, B22)
M6 = Strassen(A21 - A11, B11 + B12)
M7 = Strassen(A12 - A22, B21 + B22)

C11 = M1 + M4 - M5 + M7
C12 = M3 + M5
C21 = M2 + M4
C22 = M1 + M3 - M2 + M6

combine C11, C12, C21, C22 → C
return C
} 



________________________________________
FRACTIONAL KNAPSACK 
  
Aim: Maximize total profit by selecting items such that fractions of items can be taken. Items are chosen based on highest profit-to-weight ratio. 
Use Case: Resource allocation where items can be divided (e.g., cutting materials, loading goods). 
Recurrence: Not applicable (greedy approach) 
Time Complexity: O(n log n) (sorting by ratio) 
Space Complexity: O(1)import java.util.*;

public class ratio {
    static class Item {
        int weight, profit;
        double ratio;
        Item(int weight, int profit) {
            this.weight = weight;
            this.profit = profit;
            this.ratio = (double) profit / weight;
        }
    }
    public static void main(String[] args) {
        int[] weight = {10, 20, 30};
        int[] profit = {60, 100, 120};
        int capacity = 50;
        Item[] items = new Item[weight.length];
        for (int i = 0; i < weight.length; i++) {
            items[i] = new Item(weight[i], profit[i]);
        }
        Arrays.sort(items, (a, b) -> Double.compare(b.ratio, a.ratio));
        double totalProfit = 0.0;
        for (int i = 0; i < items.length; i++) {
            if (capacity >= items[i].weight) {
                capacity -= items[i].weight;
                totalProfit += items[i].profit;
            } else {
                totalProfit += items[i].ratio * capacity;
                break;
            }
        }
        System.out.println("profit :  " + totalProfit);
    }
}
 
________________________________________
LAB 6 :
 Activity Selection Problem 
Aim: Determine whether a graph contains a cycle by traversing nodes using DFS or Union-Find method. 
Use Case: Deadlock detection, dependency resolution, graph validation. 
Recurrence: Not applicable 
Time Complexity: O(V + E) 
Space Complexity: O(V)

Code for implementation :
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
________________________________________
DIJSTRAS CODE
	Aim: Find shortest path from a source vertex to all other vertices in a weighted graph with non-negative weights. 
	Use Case: Routing, GPS navigation systems. 
	Recurrence: Not applicable (greedy) 
	Time Complexity: O(V²) / O(E log V) (with priority queue) 
	Space Complexity: O(V) 
Code for implementation :
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
 
________________________________________
PRIMS
Aim: Find Minimum Spanning Tree (MST) by starting from a node and repeatedly adding the smallest edge connecting to a new vertex. 
Use Case: Network design, minimum cost connections. 
Recurrence: Not applicable (greedy) 
Time Complexity: O(V²) (basic) / O(E log V) (using priority queue) 
Space Complexity: O(V)
Prim(cost, n)
{
    find minimum edge (u, v)
    t[1] = (u, v)
    mincost = cost[u][v]
    for i = 1 to n do
        near[i] = (cost[i][u] < cost[i][v]) ? u : v
    near[u] = near[v] = 0
    for i = 2 to n-1 do
    {
        find j such that near[j] ≠ 0 and cost[j][near[j]] is minimum
        t[i] = (j, near[j])
        mincost = mincost + cost[j][near[j]]
        near[j] = 0
        for k = 1 to n do
            if near[k] ≠ 0 and cost[k][near[k]] > cost[k][j]
                near[k] = j
    }
 
KRUSHKAL 	
Aim: Find MST by sorting edges and adding smallest edges one by one without forming cycles (using union-find). 
Use Case: Network optimization, clustering problems. 
Recurrence: Not applicable (greedy) 
Time Complexity: O(E log E) 
Space Complexity: O(V)	

Code for implementation :
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
________________________________________
LAB 7)
CYCLE DETECTION 
Aim: Select maximum number of non-overlapping activities from given start and finish times. Uses greedy strategy by choosing earliest finishing activity. 
Use Case: Scheduling problems (meetings, tasks, resource allocation). 
Recurrence: Not applicable (greedy choice) 
Time Complexity: O(n log n) (sorting) 
Space Complexity: O(1)

import java.util.*;
class ActivitySelection {
    static class Activity {
        int start, finish;
        Activity(int s, int f) {
            start = s;
            finish = f;
        }
    }
    public static void main(String[] args) 
        System.out.print("Enter number of activities: ");
        int n = sc.nextInt();
        int start[] = new int[n];
        int finish[] = new int[n];
        System.out.println("Enter start times:");
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }
        System.out.println("Enter finish times:");
        for (int i = 0; i < n; i++) {
            finish[i] = sc.nextInt();
        }
        Activity arr[] = new Activity[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Activity(start[i], finish[i]);
        }
        Arrays.sort(arr, (a, b) -> a.finish - b.finish);
        System.out.println("Selected Activities:");
        int i = 0;
        System.out.println("(" + arr[i].start + "," + arr[i].finish + ")");
        for (int j = 1; j < n; j++) {
            if (arr[j].start >= arr[i].finish) {
                System.out.println("(" + arr[j].start + "," + arr[j].finish + ")");
                i = j;
            }
        }
        sc.close();
________________________________________
MULTISTAGE GRAPH
	Aim: Compute minimum cost from source to destination by dividing graph into stages and solving stage-wise. 
	Use Case: Used in shortest path problems with structured stages (like pipelines). 
	Recurrence:
cost(i)=min⁡(w(i,j)+cost(j))
	Time Complexity: O(E) 
	Space Complexity: O(V) 

Code for implementation :
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
    }
}

LAB 8 ) 
MUTISTAGE GRAPH BACKWARD 
Aim: Find shortest path by starting from destination and moving backward computing optimal cost at each stage. 
Use Case: Dynamic programming approach for multistage decision problems. 
Recurrence:
cost(i)=min⁡(w(i,j)+cost(j))
Time Complexity: O(E) 
Space Complexity: O(V)

Code for implementation :
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
MUTISTAGE GRAPH FORWARD  
Aim:
Find shortest path from source to destination by moving forward and computing optimal cost at each stage.
Use Case:
Dynamic programming for multistage decision problems.
Recurrence:
cost(j) = min(cost(i) + w(i,j))
Time Complexity: O(E)
Space Complexity: O(V)

public class multistage_forward {
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

        int fcost[] = new int[n];
        int d[] = new int[n];

        for(int i = 0; i < n; i++)
            fcost[i] = INF;

        fcost[0] = 0;

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                if(cost[i][j] != INF) {
                    if(fcost[i] + cost[i][j] < fcost[j]) {
                        fcost[j] = fcost[i] + cost[i][j];
                        d[j] = i;
                    }
                }
            }
        }

        System.out.println("Minimum Cost: " + fcost[n-1]);

        int path[] = new int[n];
        int k = n-1;
        int index = 0;

        while(k != 0) {
            path[index++] = k;
            k = d[k];
        }
        path[index] = 0;

        System.out.print("Path: ");
        for(int i = index; i >= 0; i--) {
            System.out.print((path[i] + 1) + " ");
        }
    }
}

________________________________________
MCM 
Aim: Find the most efficient way to multiply a chain of matrices by minimizing total scalar multiplications using DP. 
Use Case: Optimization problems in matrix operations. 
Recurrence:
M[i,j]=min⁡(M[i,k]+M[k+1,j]+p_(i-1) p_k p_j)
Time Complexity: O(n³) 
Space Complexity: O(n²)

Code for implementation :
Algorithm PRINT_OPTIMAL(s, i, j)

    if i = j then
        print "A", i
        return

    print "("
    PRINT_OPTIMAL(s, i, s[i][j])
    PRINT_OPTIMAL(s, s[i][j] + 1, j)
    print ")"
________________________________________
Algorithm MATRIX_CHAIN_MULTIPLICATION(p)

    n = length(p) - 1

    declare m[1..n][1..n], s[1..n][1..n]

    for i = 1 to n do
        m[i][i] = 0

    for l = 2 to n do
        for i = 1 to n - l + 1 do
            j = i + l - 1
            m[i][j] = ∞

            for k = i to j - 1 do
                q = m[i][k] + m[k+1][j] + p[i-1] * p[k] * p[j]

                if q < m[i][j] then
                    m[i][j] = q
                    s[i][j] = k

    for i = 1 to n do
        for j = 1 to n do
            print m[i][j]

    print "Minimum Cost =", m[1][n]

    print "Optimal Solution ="
    PRINT_OPTIMAL(s, 1, n)
 
________________________________________
LAB 9) 	
LCS 
Aim: Find the longest subsequence common to two sequences using dynamic programming. 
Use Case: String comparison, DNA sequencing. 
Recurrence:
If match: L[i,j]=1+L[i-1,j-1]
Else: L[i,j]=max⁡(L[i-1,j],L[i,j-1])
Time Complexity: O(n·m) 
Space Complexity: O(n·m)
Code for implementation :
import java.util.*;
class lcs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        int m = s1.length();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) {
            for(int j = 0; j <= n; j++) {
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else if(s1.charAt(i-1) == s2.charAt(j-1))
                    dp[i][j] = 1 + dp[i-1][j-1];
                else
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }
        System.out.println(dp[m][n]);
    }
}
 
ALL PAIR SHORTEST DISTANCE
Aim: Find shortest paths between all pairs of vertices using dynamic programming. 
Use Case: Graph analysis, routing. 
Recurrence:
D[i,j]=min⁡(D[i,j],"  " D[i,k]+D[k,j])
Time Complexity: O(n³) 
Space Complexity: O(n²)

Code for implementation :
Algorithm PRINTPATH(i, j, path)

    if path[i][j] = -1 then
        print "No path"
        return

    print i
    while i ≠ j do
        i = path[i][j]
        print " -> ", i
________________________________________
Algorithm ALLPAIRS_SHORTEST_PATH(n, cost)

    declare A[n][n], path[n][n]

    for i = 0 to n-1 do
        for j = 0 to n-1 do
            if i = j then
                A[i][j] = 0
                path[i][j] = i
            else if cost[i][j] ≠ -1 then
                A[i][j] = cost[i][j]
                path[i][j] = j
            else
                A[i][j] = ∞
                path[i][j] = -1

    for k = 0 to n-1 do
        for i = 0 to n-1 do
            for j = 0 to n-1 do
                if A[i][k] ≠ ∞ AND A[k][j] ≠ ∞ then
                    if A[i][j] > A[i][k] + A[k][j] then
                        A[i][j] = A[i][k] + A[k][j]
                        path[i][j] = path[i][k]

    for i = 0 to n-1 do
        for j = 0 to n-1 do
            if A[i][j] = ∞ then
                print "INF"
            else
                print A[i][j]

    for i = 0 to n-1 do
        for j = 0 to n-1 do
            if i ≠ j then
                print "Path from", i, "to", j
                PRINTPATH(i, j, path)

 
________________________________________
LAB 10 ) 
0/1 KNAPSACK 
Aim: Maximize profit by selecting items without exceeding capacity, each item either taken or not. 
Use Case: Resource allocation problems. 
Recurrence:
K[i,w]=max⁡(K[i-1,w],"  " profit_i+K[i-1,w-weight_i])
Time Complexity: O(nW) 
Space Complexity: O(nW)

Code for implementation : 
import java.util.*;
class dpknapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    
        int wt[] = new int[n];
        int val[] = new int[n];
        for(int i = 0; i < n; i++)
            wt[i] = sc.nextInt();
        for(int i = 0; i < n; i++)
            val[i] = sc.nextInt();
        int W = sc.nextInt();   
        int dp[][] = new int[n+1][W+1];
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= W; j++) {
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else if(wt[i-1] <= j)
                    dp[i][j] = Math.max(val[i-1] + dp[i-1][j - wt[i-1]], dp[i-1][j]);
                else
                    dp[i][j] = dp[i-1][j];
            }
        }
        System.out.println(dp[n][W]);
    }
 
TRAVELLING SALESMAN 
	Aim: Find minimum cost path visiting all cities exactly once and returning to start. 
	Use Case: Logistics, route optimization. 
	Recurrence (DP):
T(S,i)=min⁡(T(S-i,j)+d_(j,i))
	Time Complexity: O(n²·2ⁿ) 
	Space Complexity: O(n·2ⁿ) 

Code for implementation :
public class TSP {
    static int n = 4;
    static int x[] = new int[10];
    static int cost[][] = {
        {0, 10, 15, 20},
        {10, 0, 35, 25},
        {15, 35, 0, 30},
    };
    static int mincost = 9999;
    static void tsp(int k, int sum) {
        if(k == n) {
            if(cost[x[k-1]][x[0]] != 0) {
                int total = sum + cost[x[k-1]][x[0]];
                if(total < mincost) {
                    mincost = total;
                    for(int i = 0; i < n; i++)
                        System.out.print((x[i]+1) + " ");
                    System.out.println((x[0]+1));
                }
            }
            return;
        }
        for(int i = 1; i < n; i++) {
            boolean visited = false;
            for(int j = 0; j < k; j++) {
                if(x[j] == i) {
                    visited = true;
                    break;
                }
            }
            if(!visited && cost[x[k-1]][i] != 0) {
                x[k] = i;
                tsp(k+1, sum + cost[x[k-1]][i]);
            }
        }
    }
    public static void main(String[] args) {
        x[0] = 0;    
        tsp(1, 0);
        System.out.println("Minimum Cost: " + mincost);
    }
}
 

MERGE PURGE 
	Aim: Solve 0/1 knapsack by generating all feasible (weight, profit) pairs stage-wise, then merging and removing dominated pairs (purging) to keep only optimal choices. 
	Use Case: Dynamic programming approach to reduce unnecessary states in knapsack problems. 
	Time Complexity: O(n · 2ⁿ) (worst case) 
	Space Complexity: O(2ⁿ) 

Algorithm MERGE_PURGE(L1, L2, W)

    L = merge L1 and L2 in increasing order of weight

    Result = empty list
    maxProfit = -∞

    for each (weight, profit) in L do
        if weight ≤ W AND profit > maxProfit then
            add (weight, profit) to Result
            maxProfit = profit

    return Result
________________________________________
Algorithm KNAPSACK(weights, profits, n, W)

    L = {(0, 0)}

    for i = 1 to n do

        L2 = empty list

        for each (w, p) in L do
            add (w + weights[i], p + profits[i]) to L2

        L = MERGE_PURGE(L, L2, W)

    return maximum profit in L

________________________________________
LAB 11
NQUEENS 
Aim: Place N queens on an N×N board such that no two queens attack each other using backtracking. 
Use Case: Constraint satisfaction problems. 
Recurrence: Not exact (backtracking), but try all columns recursively 
Time Complexity: O(N!) 
Space Complexity: O(N)

Code for implementation :
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
 
________________________________________
Graph Coloring Problem
	Aim: Assign colors to vertices of a graph such that no two adjacent vertices have the same color, using minimum number of colors. Solved using backtracking or greedy methods. 
	Use Case: Map coloring, scheduling problems, register allocation in compilers. 
	Recurrence: Not exact (backtracking), but
try all colors for vertex kensuring no conflict with adjacent vertices 
	Time Complexity: O(mⁿ) (backtracking, where m = colors, n = vertices) 
	Space Complexity: O(n)
Algorithm: mColoring(k)
Algorithm mColoring(k)
{
    repeat
    {
        NextValue(k)            
        if x[k] = 0 then
            return              
        if k = n then
            print x[1..n]       
        else
            mColoring(k + 1)    

    } until false
}

Algorithm: NextValue(k)
Algorithm NextValue(k)
{
    repeat
    {
        x[k] = (x[k] + 1) mod (m + 1)

        if x[k] = 0 then
            return       

        for j = 1 to n do
        {
            if G[k][j] ≠ 0 AND x[k] = x[j] then
                break    
        }

        if j = n + 1 then
            return       

    } until false
}
 
________________________________________
SUBSET SUM 
Aim: Find whether a subset of given set has sum equal to target using backtracking/DP. 
Use Case: Partition problems, decision problems. 
Recurrence:
S(i,sum)=S(i-1,sum)"  "∣∣"  " S(i-1,sum-a_i)
Time Complexity: O(2ⁿ) 
 Space Complexity: O(n)
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
        if((s + r - w[k] >= m) && (s + w[k+1] <= m)) {
            x[k] = 0;
            sumofsub(s, k+1, r - w[k]);
    public static void main(String[] args) {
        int r = 0;
        for(int i = 1; i <= n; i++)
            r += w[i];
        sumofsub(0, 1, r);
    }
 
________________________________________
HAMILTONIAN CYCLE
Aim: Find a cycle that visits every vertex exactly once and returns to start using backtracking. 
Use Case: Graph traversal, routing problems. 
Recurrence: Not exact (backtracking exploration) 
Time Complexity: O(N!) 
Space Complexity: O(N)

Code for implementation :
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
        for(int i = 1; i < n; i++) {       if(place(k, i)) {
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
 


 


 
