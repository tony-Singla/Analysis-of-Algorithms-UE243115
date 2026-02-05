import time
import matplotlib.pyplot as plt
import math

def power(a, b):
    if b == 0:
        return 1
    half = power(a, b // 2)
    if b % 2 == 0:
        return half * half
    else:
        return a * half * half

 
n_values = [10, 50, 100, 300, 600, 1000]
time_taken = []

for n in n_values:
    start = time.time()
    power(4, n)
    end = time.time()
    time_taken.append(end - start)

 
theoretical_time = [math.log2(n) for n in n_values]


scale = time_taken[-1] / theoretical_time[-1]
theoretical_time = [t * scale for t in theoretical_time]

plt.plot(n_values, time_taken, marker='o', label="Actual Time")
plt.plot(n_values, theoretical_time, marker='x', label="Theoretical O(log n)")
plt.xlabel("n (power)")
plt.ylabel("Time")
plt.title("Power Algorithm: Actual vs Theoretical O(log n)")
plt.legend()
plt.grid(True)
plt.show()

