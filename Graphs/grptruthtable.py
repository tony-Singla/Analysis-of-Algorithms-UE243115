import time
import matplotlib.pyplot as plt
import math

def generate(arr, n, k):
    if n == 0:
        return
    arr[n - 1] = False
    generate(arr, n - 1, k)
    arr[n - 1] = True
    generate(arr, n - 1, k)

n_values = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
actual_time = []

for n in n_values:
    arr = [False] * n
    start = time.perf_counter()
    generate(arr, n, n)
    end = time.perf_counter()
    actual_time.append(end - start)

theoretical_time = [2 ** n for n in n_values]

scale = actual_time[-1] / theoretical_time[-1]
theoretical_time = [t * scale for t in theoretical_time]

plt.figure()
plt.plot(n_values, actual_time, marker='o', label="Actual Time")
plt.plot(n_values, theoretical_time, marker='x', label="Theoretical O(2ⁿ)")
plt.xlabel("Number of Variables (n)")
plt.ylabel("Time (scaled)")
plt.title("Truth Table Generation: Actual vs Theoretical O(2ⁿ)")
plt.legend()
plt.grid(True)
plt.show()

