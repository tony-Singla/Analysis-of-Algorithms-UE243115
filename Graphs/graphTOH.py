import time
import matplotlib.pyplot as plt

def toh(n, a, b, c):
    if n == 1:
        return
    toh(n - 1, a, c, b)
    toh(n - 1, b, a, c)

n_values = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
actual_time = []

for n in n_values:
    start = time.time()
    toh(n, 'a', 'b', 'c')
    end = time.time()
    actual_time.append(end - start)

theoretical_time = [2**n for n in n_values]
 
scale = actual_time[-1] / theoretical_time[-1]
theoretical_time = [t * scale for t in theoretical_time]

plt.figure()
plt.plot(n_values, actual_time)
plt.plot(n_values, theoretical_time)
plt.xlabel("Number of Disks (n)")
plt.ylabel("Time (scaled)")
plt.title("Tower of Hanoi: Actual vs Theoretical O(2^n)")
plt.show()
