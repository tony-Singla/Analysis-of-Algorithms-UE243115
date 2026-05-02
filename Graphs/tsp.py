import time
import math
import matplotlib.pyplot as plt

# -------- GLOBAL VARIABLES --------
mincost = float('inf')
best_path = []


# -------- TSP FUNCTION (BACKTRACKING) --------
def tsp(k, sum_cost, x, cost, n):
    global mincost, best_path

    if k == n:
        if cost[x[k-1]][x[0]] != 0:
            total = sum_cost + cost[x[k-1]][x[0]]
            if total < mincost:
                mincost = total
                best_path = x[:] + [x[0]]
        return

    for i in range(1, n):
        visited = False
        for j in range(k):
            if x[j] == i:
                visited = True
                break

        if not visited and cost[x[k-1]][i] != 0:
            x[k] = i
            tsp(k+1, sum_cost + cost[x[k-1]][i], x, cost, n)


# -------- TIME MEASUREMENT --------
def measure_time(n):
    global mincost, best_path

    # Create complete graph
    cost = [[0 if i == j else 10 for j in range(n)] for i in range(n)]

    x = [0] * n
    x[0] = 0

    mincost = float('inf')
    best_path = []

    start = time.time()
    tsp(1, 0, x, cost, n)
    end = time.time()

    return end - start


# -------- MAIN PROGRAM --------
sizes = [3, 4, 5, 6, 7]

actual = []
theoretical = []

for n in sizes:
    actual.append(measure_time(n))
    theoretical.append(math.factorial(n))   # O(n!)

# Scale theoretical for graph
theoretical_scaled = [t / max(theoretical) * max(actual) for t in theoretical]

# -------- PLOT GRAPH --------
plt.plot(sizes, actual, marker='o', label="Actual Time")
plt.plot(sizes, theoretical_scaled, marker='s', label="Theoretical O(n!)")

plt.xlabel("Number of Cities (n)")
plt.ylabel("Time")
plt.title("TSP Backtracking: Actual vs Theoretical")

plt.legend()
plt.grid()
plt.show()