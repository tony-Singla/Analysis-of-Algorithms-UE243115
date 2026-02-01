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

