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
}

    

