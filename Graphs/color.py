import time
import matplotlib.pyplot as plt

# ---------- YOUR GRAPH COLORING (BACKTRACKING) ----------

def next_value(k, x, G, m, n):
    while True:
        x[k] = (x[k] + 1) % (m + 1)

        if x[k] == 0:
            return False   # no color possible

        j = 0
        while j < n:
            if G[k][j] != 0 and x[k] == x[j]:
                break
            j += 1

        if j == n:
            return True    # valid color found


def m_coloring(k, x, G, m, n):
    while True:
        if not next_value(k, x, G, m, n):
            return False

        if k == n - 1:
            return True    # one solution found
        else:
            if m_coloring(k + 1, x, G, m, n):
                return True


def graph_coloring(G, m):
    n = len(G)
    x = [0] * n
    m_coloring(0, x, G, m, n)


# ---------- TIME MEASUREMENT ----------

def measure_time(n):
    # create complete graph (worst case)
    G = [[1 if i != j else 0 for j in range(n)] for i in range(n)]
    
    m = 3   # number of colors

    start = time.time()
    graph_coloring(G, m)
    end = time.time()

    return end - start


# ---------- GRAPH PLOTTING ----------

sizes = [1, 2, 3, 4, 5]   # vertices
actual = []
theoretical = []

m = 3

for n in sizes:
    actual.append(measure_time(n))
    theoretical.append(m ** n)   # O(m^n)

# scale theoretical for comparison
theoretical_scaled = [t / max(theoretical) * max(actual) for t in theoretical]

plt.plot(sizes, actual, marker='o', label="Actual Time")
plt.plot(sizes, theoretical_scaled, marker='s', label="Theoretical O(m^n)")

plt.xlabel("Number of Vertices (n)")
plt.ylabel("Time")
plt.title("Graph Coloring: Actual vs Theoretical")

plt.legend()
plt.grid()
plt.show()