import time
import matplotlib.pyplot as plt
import random
import sys

sys.setrecursionlimit(20000)

def partition(arr, low, high):
    pivot = arr[low]
    i = low - 1
    j = high + 1

    while True:
        i += 1
        while arr[i] < pivot:
            i += 1

        j -= 1
        while arr[j] > pivot:
            j -= 1

        if i >= j:
            return j

        arr[i], arr[j] = arr[j], arr[i]

def quickSort1(arr, low, high):
    if low < high:
        p = partition(arr, low, high)
        quickSort1(arr, low, p)
        quickSort1(arr, p + 1, high)

n_values = [100, 500, 1000, 2000, 4000, 8000]
time_taken = []

for n in n_values:
    arr = [random.randint(1, 10000) for _ in range(n)]

    start = time.time()
    quickSort1(arr, 0, len(arr) - 1)
    end = time.time()

    time_taken.append(end - start)

plt.plot(n_values, time_taken, marker='o')
plt.xlabel("n (Array Size)")
plt.ylabel("time")
plt.title("n vs Time for Quick Sort ")
plt.show()

