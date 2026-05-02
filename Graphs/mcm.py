import time
import matplotlib.pyplot as plt
 
def matrix_chain_multiplication(p):
    n = len(p) - 1
    m = [[0] * (n + 1) for _ in range(n + 1)]

    for l in range(2, n + 1):
        for i in range(1, n - l + 2):
            j = i + l - 1
            m[i][j] = float('inf')

            for k in range(i, j):
                q = m[i][k] + m[k + 1][j] + p[i - 1] * p[k] * p[j]
                if q < m[i][j]:
                    m[i][j] = q

    return m

 
def measure_time(n):
    # generate dimensions   
    p = [i + 2 for i in range(n + 1)]

    start = time.time()
    matrix_chain_multiplication(p)
    end = time.time()

    return end - start

 
sizes = [5, 10, 15, 20, 25]

actual = []
theoretical = []

for n in sizes:
    actual.append(measure_time(n))
    theoretical.append(n**3)    

 
theoretical_scaled = [t / max(theoretical) * max(actual) for t in theoretical]

 
plt.plot(sizes, actual, marker='o', label="Actual Time")
plt.plot(sizes, theoretical_scaled, marker='s', label="Theoretical O(n^3)")

plt.xlabel("Number of Matrices (n)")
plt.ylabel("Time")
plt.title("MCM: Actual vs Theoretical")

plt.legend()
plt.grid()
plt.show()