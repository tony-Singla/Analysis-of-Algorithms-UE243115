import time
import matplotlib.pyplot as plt

# Missing number logic (same idea as Java)
def find_missing(arr, n):
    arr.sort()
    for i in range(len(arr)):
        if arr[i] != i + 1:
            return i + 1
    return n

# Different input sizes
n_values = [1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000]

actual_time = []

for n in n_values:
    
    arr = list(range(1, n + 1))
    arr.remove(n // 2)    

    start = time.time()
    find_missing(arr, n)
    end = time.time()

    actual_time.append(end - start)
 
theoretical_time = n_values
 
scale = actual_time[-1] / theoretical_time[-1]
theoretical_time = [t * scale for t in theoretical_time]

 
plt.figure()
plt.plot(n_values, actual_time)
plt.plot(n_values, theoretical_time)

plt.xlabel("Input Size (n)")
plt.ylabel("Time")
plt.title("Missing Number Algorithm: Actual vs O(n)")
plt.show()

