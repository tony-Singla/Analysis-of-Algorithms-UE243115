import time
import random
import matplotlib.pyplot as plt
import math

def add(A, B):
    n = len(A)
    return [[A[i][j] + B[i][j] for j in range(n)] for i in range(n)]

def sub(A, B):
    n = len(A)
    return [[A[i][j] - B[i][j] for j in range(n)] for i in range(n)]

def strassen(A, B):
    n = len(A)

    if n == 1:
        return [[A[0][0] * B[0][0]]]

    mid = n // 2

    A11 = [row[:mid] for row in A[:mid]]
    A12 = [row[mid:] for row in A[:mid]]
    A21 = [row[:mid] for row in A[mid:]]
    A22 = [row[mid:] for row in A[mid:]]

    B11 = [row[:mid] for row in B[:mid]]
    B12 = [row[mid:] for row in B[:mid]]
    B21 = [row[:mid] for row in B[mid:]]
    B22 = [row[mid:] for row in B[mid:]]

    M1 = strassen(add(A11, A22), add(B11, B22))
    M2 = strassen(add(A21, A22), B11)
    M3 = strassen(A11, sub(B12, B22))
    M4 = strassen(A22, sub(B21, B11))
    M5 = strassen(add(A11, A12), B22)
    M6 = strassen(sub(A21, A11), add(B11, B12))
    M7 = strassen(sub(A12, A22), add(B21, B22))

    C11 = add(sub(add(M1, M4), M5), M7)
    C12 = add(M3, M5)
    C21 = add(M2, M4)
    C22 = add(sub(add(M1, M3), M2), M6)

    C = [[0]*n for _ in range(n)]

    for i in range(mid):
        for j in range(mid):
            C[i][j] = C11[i][j]
            C[i][j+mid] = C12[i][j]
            C[i+mid][j] = C21[i][j]
            C[i+mid][j+mid] = C22[i][j]

    return C


# Use powers of 2 (important)
n_values = [2, 4, 8, 16, 32, 64]
time_taken = []

REPEAT = 2

for n in n_values:
    total = 0
    for _ in range(REPEAT):
        A = [[random.randint(1, 10) for _ in range(n)] for _ in range(n)]
        B = [[random.randint(1, 10) for _ in range(n)] for _ in range(n)]

        start = time.perf_counter()
        strassen(A, B)
        end = time.perf_counter()

        total += (end - start)

    time_taken.append(total / REPEAT)


# Theoretical O(n^2.81)
theoretical_time = [n**2.81 for n in n_values]

scale = time_taken[0] / theoretical_time[0]
theoretical_time = [t * scale for t in theoretical_time]


plt.plot(n_values, time_taken, marker='o', label="Actual Time")
plt.plot(n_values, theoretical_time, marker='x', label="Theoretical O(n^2.81)")
plt.xlabel("Matrix Size (n x n)")
plt.ylabel("Time")
plt.title("Strassen Matrix Multiplication")
plt.legend()
plt.grid(True)
plt.show()