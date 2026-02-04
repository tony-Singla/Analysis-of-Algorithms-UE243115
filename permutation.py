import time
import matplotlib.pyplot as plt
import math

def permute(arr, n):
    if n == 1:
        return
    for i in range(n):
        arr[i], arr[n-1] = arr[n-1], arr[i]
        permute(arr, n-1)
        arr[i], arr[n-1] = arr[n-1], arr[i]

n_values = [1, 2, 3, 4, 5, 6, 7]
actual_time = []

for n in n_values:
    arr = list(range(n))
    start = time.perf_counter()
    permute(arr, n)
    end = time.perf_counter()
    actual_time.append(end - start)

theoretical_time = [math.factorial(n) for n in n_values]

scale = actual_time[-1] / theoretical_time[-1]
theoretical_time = [t * scale for t in theoretical_time]

plt.figure()
plt.plot(n_values, actual_time, marker='o', label="Actual Time")
plt.plot(n_values, theoretical_time, marker='x', label="Theoretical O(n!)")
plt.xlabel("Input Size (n)")
plt.ylabel("Time (scaled)")
plt.title("Permutation Algorithm: Actual vs Theoretical O(n!)")
plt.legend()
plt.grid(True)
plt.show()
