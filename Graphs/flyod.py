import time
import matplotlib.pyplot as plt

INF = 99999
 
def floyd_warshall(graph, n):
    dist = [row[:] for row in graph]

    for k in range(n):
        for i in range(n):
            for j in range(n):
                if dist[i][j] > dist[i][k] + dist[k][j]:
                    dist[i][j] = dist[i][k] + dist[k][j]

    return dist

 
def create_graph(n):
    graph = [[INF]*n for _ in range(n)]
    for i in range(n):
        graph[i][i] = 0
        for j in range(i+1, n):
            graph[i][j] = 1
            graph[j][i] = 1
    return graph

 
def measure_time(n):
    graph = create_graph(n)

    start = time.time()
    floyd_warshall(graph, n)
    end = time.time()

    return end - start


# Input sizes
sizes = [5, 10, 15, 20, 25]

actual = []
theoretical = []

for n in sizes:
    actual.append(measure_time(n))
    theoretical.append(n**3)   

 
theoretical_scaled = [t / max(theoretical) * max(actual) for t in theoretical]

 
plt.plot(sizes, actual, marker='o', label="Actual Time")
plt.plot(sizes, theoretical_scaled, marker='s', label="Theoretical O(n^3)")

plt.xlabel("Number of Vertices (n)")
plt.ylabel("Time")
plt.title("Floyd-Warshall: Actual vs Theoretical")

plt.legend()
plt.grid()
plt.show()