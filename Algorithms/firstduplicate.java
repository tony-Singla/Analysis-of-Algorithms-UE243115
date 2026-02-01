import java.util.*;

public class firstduplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = -1;

        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    ans = i;
                    break;
                }
            }
            if (ans != -1)
                break;
        }

        if (ans != -1)
            System.out.println("First duplicate element idx " + ans);
        else
            System.out.println("No duplicate element found");

        sc.close();
    }
}
