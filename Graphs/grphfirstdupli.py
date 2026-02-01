import time
import matplotlib.pyplot as plt

 
def first_duplicate(arr):
    n = len(arr)
    for i in range(n):
        for j in range(i + 1, n):
            if arr[i] == arr[j]:
                return i
    return -1

 
n_values = [200, 400, 600, 800, 1000, 1200, 1400]

actual_time = []

 
for n in n_values:
    arr = list(range(n))  

    start = time.time()
    first_duplicate(arr)
    end = time.time()

    actual_time.append(end - start)

 
theoretical_time = [n**2 for n in n_values]

 
scale = actual_time[-1] / theoretical_time[-1]
theoretical_time = [t * scale for t in theoretical_time]

 
plt.figure()
plt.plot(n_values, actual_time)
plt.plot(n_values, theoretical_time)

plt.xlabel("Input Size (n)")
plt.ylabel("Time")
plt.title("First Duplicate Element: Actual vs O(n^2)")
plt.show()
