import time
import matplotlib.pyplot as plt
import sys

sys.setrecursionlimit(20000)

def recursive_sum(n):
    if n == 0:
        return 0
    return n + recursive_sum(n - 1)

n_values = [100, 500, 1000, 2000, 4000, 8000, 12000]
time_taken = []

for n in n_values:
    start = time.time()
    recursive_sum(n)
    end = time.time()
    time_taken.append(end - start)

plt.plot(n_values, time_taken, marker='o')
plt.xlabel("n (number)")
plt.ylabel("Time (seconds)")
plt.title("n vs Time for Recursive Sum (O(n))")
plt.show()
