
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


