import time
import matplotlib.pyplot as plt

def insertion_sort(arr):
    n = len(arr)
    for i in range(1, n):
        j = i
        while j > 0 and arr[j - 1] > arr[j]:
            arr[j], arr[j - 1] = arr[j - 1], arr[j]
            j -= 1

n_values = [200, 400, 600, 800, 1000, 1200, 1400]

best_actual = []
worst_actual = []

for n in n_values:
    best_arr = list(range(n))
    start = time.time()
    insertion_sort(best_arr)
    end = time.time()
    best_actual.append(end - start)

    worst_arr = list(range(n, 0, -1))
    start = time.time()
    insertion_sort(worst_arr)
    end = time.time()
    worst_actual.append(end - start)

best_theoretical = n_values
worst_theoretical = [n * n for n in n_values]

best_scale = best_actual[-1] / best_theoretical[-1]
worst_scale = worst_actual[-1] / worst_theoretical[-1]

best_theoretical = [t * best_scale for t in best_theoretical]
worst_theoretical = [t * worst_scale for t in worst_theoretical]

plt.figure()
plt.plot(n_values, best_actual, label="Best Case Actual Time")
plt.plot(n_values, best_theoretical, label="Best Case Theoretical O(n)")
plt.plot(n_values, worst_actual, label="Worst Case Actual Time")
plt.plot(n_values, worst_theoretical, label="Worst Case Theoretical O(n²)")

plt.xlabel("Input Size (n)")
plt.ylabel("Time")
plt.title("Insertion Sort: Actual vs Theoretical (Best and Worst Case)")
plt.legend()
plt.show()
