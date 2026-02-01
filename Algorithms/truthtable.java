import java.util.*;
public class truthtable {
        static void generate(boolean[] arr, int n, int k) {
        if (n == 0) {
            for (int i = 0; i < k; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            return;
        }
        arr[n - 1] = false;
        generate(arr, n - 1, k);

        arr[n - 1] = true;
        generate(arr, n - 1, k);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] arr = new boolean[n];
        generate(arr, n, n);

        sc.close();
    }
}
