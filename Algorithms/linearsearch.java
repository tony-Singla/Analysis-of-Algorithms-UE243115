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


