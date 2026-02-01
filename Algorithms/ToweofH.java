
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


