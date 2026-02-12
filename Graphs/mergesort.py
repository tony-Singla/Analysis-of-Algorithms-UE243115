import time
import random
import matplotlib.pyplot as plt
import sys

sys.setrecursionlimit(20000)

def mergeSort(arr, l, r):
    if l < r:
        m = (l + r) // 2
        mergeSort(arr, l, m)
        mergeSort(arr, m + 1, r)
        merge(arr, l, m, r)

def merge(arr, l, m, r):

    n1 = m - l + 1
    n2 = r - m

    L = [0] * n1
    R = [0] * n2

    for i in range(n1):
        L[i] = arr[l + i]

    for j in range(n2):
        R[j] = arr[m + 1 + j]

    i = 0
    j = 0
    k = l

    while i < n1 and j < n2:
        if L[i] <= R[j]:
            arr[k] = L[i]
            i += 1
        else:
            arr[k] = R[j]
            j += 1
        k += 1

    while i < n1:
        arr[k] = L[i]
        i += 1
        k += 1

    while j < n2:
        arr[k] = R[j]
        j += 1
        k += 1

n_values = [100, 500, 1000, 2000, 4000, 8000, 12000]
time_taken = []

for n in n_values:
    arr = [random.randint(1, 10000) for _ in range(n)]

    start = time.time()
    mergeSort(arr, 0, len(arr) - 1)
    end = time.time()

    time_taken.append(end - start)

plt.plot(n_values, time_taken, marker='o')
plt.xlabel("n (array size)")
plt.ylabel("Time")
plt.title("n vs Time for Merge Sort")
plt.show()

