import time
import matplotlib.pyplot as plt
import sys

sys.setrecursionlimit(20000)

def linear_search(arr, k, i):
    if i == len(arr):
        return False
    if arr[i] == k:
        return True
    return linear_search(arr, k, i + 1)

n_values = [100, 500, 1000, 2000, 4000, 8000]
time_taken = []

for n in n_values:
    arr = list(range(n))
    k = -1   

    start = time.time()
    linear_search(arr, k, 0)
    end = time.time()

    time_taken.append(end - start)

plt.plot(n_values, time_taken, marker='o')
plt.xlabel("n (array size)")
plt.ylabel("Time")
plt.title("n vs Time for Recursive Linear Search (O(n))")
plt.show()

