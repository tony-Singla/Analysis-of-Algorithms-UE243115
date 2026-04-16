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

<img width="740" height="597" alt="image" src="https://github.com/user-attachments/assets/876f5f43-6741-41d7-a4f7-01810bd6a06d" />


2. Tower of Hanoi

Aim: Move disks using recursion.

Pseudo code:

Move n-1 disks to helper
Move last disk
Move n-1 disks to destination

Recurrence: T(n)=2T(n-1)+1
Time Complexity: O(2ⁿ)
Applications: Recursion learning, puzzle solving

<img width="739" height="589" alt="image" src="https://github.com/user-attachments/assets/769300a0-f807-47dd-b329-901a08e34249" />


3. Binary Search

Aim: Search in sorted array.

Pseudo code:

Find middle element
Compare with key
Go left or right accordingly

Recurrence: T(n)=T(n/2)+1
Time Complexity: O(log n)
Applications: Database search, fast lookup

<img width="755" height="589" alt="image" src="https://github.com/user-attachments/assets/81623cdc-1525-432f-8269-91214af50c00" />


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

<img width="770" height="579" alt="image" src="https://github.com/user-attachments/assets/7a65c3a7-0e75-4658-909a-9331dfd198c2" />


8. Insertion Sort

Aim: Sort elements.

Pseudo code:

Take one element
Insert into correct position
Repeat for all

Recurrence: T(n)=T(n-1)+n
Time Complexity: O(n²)
Applications: Small data sorting, online sorting

<img width="746" height="591" alt="image" src="https://github.com/user-attachments/assets/b18dfead-2dd1-450f-b79b-7687bbf596fa" />


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

<img width="770" height="594" alt="image" src="https://github.com/user-attachments/assets/b2207fbe-dd88-459f-907c-c522c414c6cf" />


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

<img width="775" height="591" alt="image" src="https://github.com/user-attachments/assets/c1f4ef12-8520-496a-acf0-99e7d21c0ab0" />


15. Missing Number

Aim: Find missing number.

Pseudo code:

Find expected sum
Subtract actual sum

Recurrence: O(n)
Time Complexity: O(n)
Applications: Data checking, sequence problems

<img width="763" height="591" alt="image" src="https://github.com/user-attachments/assets/b06b2735-7a5d-429f-9e56-fa82fe153124" />


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

<img width="772" height="599" alt="image" src="https://github.com/user-attachments/assets/518cd935-d4bf-4555-a2c4-6c51ab4807c7" />


18. Power

Aim: Compute power of number.

Pseudo code:

If even, square and divide
If odd, multiply by x
Repeat

Recurrence: T(n)=T(n/2)+1
Time Complexity: O(log n)
Applications: Fast calculations, cryptography

<img width="767" height="588" alt="image" src="https://github.com/user-attachments/assets/336093be-077f-4286-8a88-e3f3393f730e" />


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

<img width="768" height="587" alt="image" src="https://github.com/user-attachments/assets/9f2e401d-5836-41dc-bb05-2013a95c420a" />


21. Ratio

Aim: Calculate value/weight ratio.

Pseudo code:

Divide value by weight
Sort items

Recurrence: Not recursive
Time Complexity: O(n log n)
Applications: Greedy algorithms, knapsack

<img width="725" height="576" alt="image" src="https://github.com/user-attachments/assets/bda2993e-7688-4150-b4c7-04cfdc6d176f" />


22. Selection Sort

Aim: Sort elements.

Pseudo code:

Find minimum element
Swap with first
Repeat

Recurrence: O(n²)
Time Complexity: O(n²)
Applications: Simple sorting, small data

<img width="764" height="600" alt="image" src="https://github.com/user-attachments/assets/96fd99c0-29f3-4e0c-bd49-6ee2bb87241a" />


23. Sum

Aim: Find sum of elements.

Pseudo code:

Initialize sum to zero
Add all elements

Recurrence: O(n)
Time Complexity: O(n)
Applications: Total calculation, statistics

<img width="784" height="596" alt="image" src="https://github.com/user-attachments/assets/80170904-2a4f-4f94-b30e-f62885e72ee8" />


24. Truth Table

Aim: Generate truth table.

Pseudo code:

Generate all combinations
Evaluate expression

Recurrence: O(2ⁿ)
Time Complexity: O(2ⁿ)
Applications: Digital logic, Boolean algebra

<img width="792" height="577" alt="image" src="https://github.com/user-attachments/assets/4abe412e-6026-436f-b595-281447348afb" />

 


 
