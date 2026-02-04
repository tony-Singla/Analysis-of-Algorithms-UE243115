import time
import matplotlib.pyplot as plt

def selection_sort(arr):
    n = len(arr)
    for i in range(n - 1):
        min_idx = i
        for j in range(i, n):
            if arr[j] < arr[min_idx]:
                min_idx = j
        arr[i], arr[min_idx] = arr[min_idx], arr[i]

n_values = [50, 100, 150, 200, 250, 300]
actual_time = []

for n in n_values:
    arr = list(range(n, 0, -1))
    start = time.perf_counter()
    selection_sort(arr)
    end = time.perf_counter()
    actual_time.append(end - start)

theoretical_time = [n * n for n in n_values]

scale = actual_time[-1] / theoretical_time[-1]
theoretical_time = [t * scale for t in theoretical_time]

plt.figure()
plt.plot(n_values, actual_time, marker='o', label="Actual Time")
plt.plot(n_values, theoretical_time, marker='x', label="Theoretical O(n²)")
plt.xlabel("Input Size (n)")
plt.ylabel("Time (scaled)")
plt.title("Selection Sort: Actual vs Theoretical O(n²)")
plt.legend()
plt.grid(True)
plt.show()
