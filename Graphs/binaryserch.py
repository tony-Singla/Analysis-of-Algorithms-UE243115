import time
import matplotlib.pyplot as plt
import math

def bs1(arr, lo, hi, x):
    if lo > hi:
        return False
    mid = (lo + hi) // 2
    if arr[mid] == x:
        return True
    if arr[mid] > x:
        return bs1(arr, lo, mid - 1, x)
    else:
        return bs1(arr, mid + 1, hi, x)

n_values = [1000, 2000, 4000, 8000, 16000, 32000]
actual_time = []

for n in n_values:
    arr = list(range(n))
    x = -1
    start = time.perf_counter()
    bs1(arr, 0, n - 1, x)
    end = time.perf_counter()
    actual_time.append(end - start)

theoretical_time = [math.log2(n) for n in n_values]

scale = actual_time[-1] / theoretical_time[-1]
theoretical_time = [t * scale for t in theoretical_time]

plt.figure()
plt.plot(n_values, actual_time, marker='o', label="Actual Time")
plt.plot(n_values, theoretical_time, marker='x', label="Theoretical O(log n)")
plt.xlabel("Input Size (n)")
plt.ylabel("Time (scaled)")
plt.title("Binary Search: Actual vs Theoretical O(log n)")
plt.legend()
plt.grid(True)
plt.show()

