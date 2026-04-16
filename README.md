# Analysis-of-Algorithms-UE243115

Algorithms 

1. Horner Rule

Aim: Evaluate polynomial.

Pseudo code:
Take last coefficient
Multiply with x and add next
Repeat for all terms

Recurrence: T(n)=T(n-1)+1
Time Complexity: O(n)
Applications: Polynomial calculation, numerical methods

2. Tower of Hanoi

Aim: Move disks using recursion.

Pseudo code:

Move n-1 disks to helper
Move last disk
Move n-1 disks to destination

Recurrence: T(n)=2T(n-1)+1
Time Complexity: O(2ⁿ)
Applications: Recursion learning, puzzle solving

3. Binary Search

Aim: Search in sorted array.

Pseudo code:

Find middle element
Compare with key
Go left or right accordingly

Recurrence: T(n)=T(n/2)+1
Time Complexity: O(log n)
Applications: Database search, fast lookup

4. Convex Hull

Aim: Find boundary points.

Pseudo code:

Start from leftmost point
Select next boundary point
Repeat until complete

Recurrence: Depends
Time Complexity: O(n²) worst
Applications: Computer graphics, GIS

5. Cycle Detection

Aim: Detect cycle in graph.

Pseudo code:

Visit node
Mark visited
If visited again, cycle found

Recurrence: O(V+E)
Time Complexity: O(V+E)
Applications: Deadlock detection, network analysis

6. Dijkstra Algorithm

Aim: Find shortest path.

Pseudo code:

Set source distance zero
Pick minimum distance node
Update neighbors

Recurrence: Not recursive
Time Complexity: O(V²) / O(E log V)
Applications: GPS navigation, routing

7. First Duplicate

Aim: Find first duplicate element.

Pseudo code:

Check each element
Store visited values
Return if repeated

Recurrence: O(n)
Time Complexity: O(n)
Applications: Data validation, error detection

8. Insertion Sort

Aim: Sort elements.

Pseudo code:

Take one element
Insert into correct position
Repeat for all

Recurrence: T(n)=T(n-1)+n
Time Complexity: O(n²)
Applications: Small data sorting, online sorting

9. Knapsack (0/1)

Aim: Maximize value within weight.

Pseudo code:

Check include or exclude item
Take maximum value
Repeat for all items

Recurrence:
T(n,W)=max(T(n-1,W), T(n-1,W-w)+v)

Time Complexity: O(nW)
Applications: Resource allocation, budgeting

10. Fractional Knapsack

Aim: Maximize value with fractions.

Pseudo code:

Find value/weight ratio
Sort items
Take full or fraction

Recurrence: Not recursive
Time Complexity: O(n log n)
Applications: Profit maximization, greedy problems

11. Kruskal Algorithm

Aim: Find minimum spanning tree.

Pseudo code:

Sort edges
Pick smallest edge
Avoid cycles

Recurrence: Not recursive
Time Complexity: O(E log E)
Applications: Network design, cable layout

12. Linear Search

Aim: Search element.

Pseudo code:

Check each element
If match, return

Recurrence: O(n)
Time Complexity: O(n)
Applications: Unsorted data search, simple lookup

13. Matrix Chain Multiplication

Aim: Minimize multiplication cost.

Pseudo code:

Divide matrices
Find best split
Choose minimum cost

Recurrence:
T(i,j)=min(T(i,k)+T(k+1,j)+cost)

Time Complexity: O(n³)
Applications: Compiler design, matrix operations

14. Merge Sort

Aim: Sort using divide and merge.

Pseudo code:

Divide array
Sort both parts
Merge them

Recurrence: T(n)=2T(n/2)+n
Time Complexity: O(n log n)
Applications: Large data sorting, stable sorting

15. Missing Number

Aim: Find missing number.

Pseudo code:

Find expected sum
Subtract actual sum

Recurrence: O(n)
Time Complexity: O(n)
Applications: Data checking, sequence problems

16. Multistage Graph

Aim: Find shortest path in stages.

Pseudo code:

Start from last stage
Update cost backward
Find minimum path

Recurrence: O(n²)
Time Complexity: O(n²)
Applications: Routing, decision making

17. Permutation

Aim: Generate all arrangements.

Pseudo code:

Swap elements
Generate recursively
Backtrack

Recurrence: T(n)=n*T(n-1)
Time Complexity: O(n!)
Applications: Combinations, scheduling

18. Power

Aim: Compute power of number.

Pseudo code:

If even, square and divide
If odd, multiply by x
Repeat

Recurrence: T(n)=T(n/2)+1
Time Complexity: O(log n)
Applications: Fast calculations, cryptography

19. Prim’s Algorithm

Aim: Find minimum spanning tree.

Pseudo code:

Start from node
Pick smallest edge
Add to tree

Recurrence: Not recursive
Time Complexity: O(V²) / O(E log V)
Applications: Network design, wiring

20. Quick Sort

Aim: Sort using pivot.

Pseudo code:

Choose pivot
Divide into two parts
Sort both parts

Recurrence: T(n)=2T(n/2)+n
Time Complexity: O(n log n), worst O(n²)
Applications: Fast sorting, data processing

21. Ratio

Aim: Calculate value/weight ratio.

Pseudo code:

Divide value by weight
Sort items

Recurrence: Not recursive
Time Complexity: O(n log n)
Applications: Greedy algorithms, knapsack

22. Selection Sort

Aim: Sort elements.

Pseudo code:

Find minimum element
Swap with first
Repeat

Recurrence: O(n²)
Time Complexity: O(n²)
Applications: Simple sorting, small data

23. Sum

Aim: Find sum of elements.

Pseudo code:

Initialize sum to zero
Add all elements

Recurrence: O(n)
Time Complexity: O(n)
Applications: Total calculation, statistics

24. Truth Table

Aim: Generate truth table.

Pseudo code:

Generate all combinations
Evaluate expression

Recurrence: O(2ⁿ)
Time Complexity: O(2ⁿ)
Applications: Digital logic, Boolean algebra



<img width="751" height="577" alt="image" src="https://github.com/user-attachments/assets/e7b14755-2091-4658-81aa-5dfaf130690f" />


 
