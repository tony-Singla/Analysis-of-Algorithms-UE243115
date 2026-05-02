

HORNER RULE 
	Aim: Evaluate a polynomial efficiently by reducing repeated multiplications using a nested form. It converts polynomial into a simpler recursive structure. 
	Use Case: Used in polynomial evaluation in mathematics and programming for better efficiency. 
	Recurrence:
P(x)=a_n+x⋅P_(n-1) (x)
	Time Complexity: O(n) 
	Space Complexity: O(n) (recursion) 
Algorithm :
Algorithm HORNER(arr, i, x)

if i = 0 then
return arr[0]

return HORNER(arr, i - 1, x) * x + arr[i]

Code for implementation :
import java.util.*;
public class Hornerrule {
    static int horner(int[] arr, int i, int x) {
        if (i == 0)
            return arr[0];
        return horner(arr, i - 1, x) * x + arr[i];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(horner(arr, n, x));
        sc.close();
    }
}

<img width="751" height="515" alt="image" src="https://github.com/user-attachments/assets/210d9349-9ab5-4357-936d-cf4926794483" />

TOWER OF HANOI
Aim: Move n disks from source to destination rod using an auxiliary rod while following rules (one disk at a time, no larger on smaller). It breaks problem into smaller subproblems recursively. 
 Use Case: Classic recursion problem, helps understand divide-and-conquer. 
Recurrence:
T(n)=2T(n-1)+1
 Time Complexity: O(2ⁿ) 
 Space Complexity: O(n)



Algorithm : 
if n = 0 then
return

HANOI(n - 1, F, U, T)

print "from", F, "to", T

HANOI(n - 1, U, F, T)

Code for implementation :
import java.util.*;
public class ToweofH {
    static void hanoi(int n, char F, char T, char U) {
        if (n == 0)
            return;
        hanoi(n - 1, F, U, T);
        System.out.println("from " + F + " to " + T);
        hanoi(n - 1, U, F, T);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 'F', 'T', 'U');
        sc.close();
    }
}
 

Missing Number
Aim: Find the missing number from a sequence (1 to n) by comparing expected sum with actual sum. It avoids checking each number individually. 
Use Case: Used in arrays, data validation, coding problems. 
 Recurrence: Not applicable (iterative formula-based) 
Time Complexity: O(n) 
Space Complexity: O(1)

Code for implementation :
import java.util.Arrays;
public class missingno {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        int n = 5;
        Arrays.sort(arr);
        int missing = n;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                missing = i + 1;
                break;
            }
        }
        System.out.println("Missing number: " + missing);
    }

String Permutation
Aim: Generate all possible arrangements of characters of a string using swapping/backtracking. Explores all configurations. 
Use Case: Used in combinatorial problems, anagrams, brute-force solutions. 
Recurrence:
T(n)=n⋅T(n-1)
Time Complexity: O(n!) 
Space Complexity: O(n)
Code for implementation :
public class permutation {
    public static void main(String[] args) {
        String s = "ABC";
        char[] arr = s.toCharArray();
        permute(arr, arr.length, arr.length);
    }
    static void permute(char[] arr, int n, int k) {
        if (n == 0) {
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }
        for (int i = 0; i < n; i++) {
            swap(arr, i, n - 1);
            permute(arr, n - 1, k);
            swap(arr, i, n - 1);
        }
    }
    static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

 
Selection Sort 
  Aim: Sort an array by repeatedly selecting the smallest element and placing it at the correct position. It reduces unsorted portion step by step. 
  Use Case: Useful for small datasets and when swaps are costly. 
  Recurrence:
T(n)=T(n-1)+(n-1)
  Time Complexity: O(n²) 
  Space Complexity: O(1)

Code for implementation :
import java.util.*; 
public class selectionsort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int n =10;
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i< n ;i++){
            arr[i] = sc.nextInt();
        }
        for(int i =0 ; i< n-1 ; i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for(int j= i ; j < n ; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minidx = j ; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        } 
        for(int i = 0 ; i< n ;i++){
            System.out.print(arr[i]+" " );
        }
       sc.close();
    }
}

Linear Search
Aim: Find an element by checking each element one by one until match is found. 
Use Case: Searching in unsorted or small datasets. 
Recurrence:
T(n)=T(n-1)+1
Time Complexity: O(n) 
Space Complexity: O(1)

Code for implementation :
import java.util.*;
public class search {
    static boolean search1(int[] arr, int k, int i) {
        if (i == arr.length)
            return false;
        if (arr[i] == k)
            return true;
        return search1(arr, k, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        if (search1(arr, k, 0))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        sc.close();
    }
}

 
