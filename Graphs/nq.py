import time
import matplotlib.pyplot as plt
import math

# -------- GLOBAL VARIABLE --------
solutions = []


# -------- PLACE FUNCTION --------
def place(x, k, i):
    for j in range(1, k):
        if x[j] == i or abs(x[j] - i) == abs(j - k):
            return False
    return True


# -------- N-QUEEN FUNCTION --------
def nqueen(k, n, x):
    global solutions

    for i in range(1, n + 1):
        if place(x, k, i):
            x[k] = i

            if k == n:
                solutions.append(x[1:n+1].copy())
            else:
                nqueen(k + 1, n, x)


# -------- TIME MEASUREMENT --------
def measure_time(n):
    global solutions

    x = [0] * (n + 1)
    solutions = []

    start = time.time()
    nqueen(1, n, x)
    end = time.time()

    return end - start


# -------- MAIN PROGRAM --------
sizes = [4, 5, 6, 7, 8]

actual = []
theoretical = []

for n in sizes:
    actual.append(measure_time(n))
    theoretical.append(math.factorial(n))   # approx growth

# scale theoretical
theoretical_scaled = [t / max(theoretical) * max(actual) for t in theoretical]

# -------- PLOT GRAPH --------
plt.plot(sizes, actual, marker='o', label="Actual Time")
plt.plot(sizes, theoretical_scaled, marker='s', label="Theoretical (~ n!)")

plt.xlabel("Number of Queens (n)")
plt.ylabel("Time")
plt.title("N-Queen: Actual vs Theoretical")

plt.legend()
plt.grid()
plt.show()