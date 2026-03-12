import java.util.*;

class P {
    int x;
    int y;

    P(int a, int b) {
        x = a;
        y = b;
    }
}
public class convexhull{

    static int side(P a, P b, P c) {

        int v = (c.y - a.y) * (b.x - a.x) -
                (b.y - a.y) * (c.x - a.x);

        if (v > 0) return 1;
        if (v < 0) return -1;
        return 0;
    }

    static int distance(P a, P b, P c) {

        return Math.abs((c.y - a.y) * (b.x - a.x) -
                        (b.y - a.y) * (c.x - a.x));
    }

    static void findHull(P arr[], int n, P a, P b, int s) {

        int ind = -1;
        int max = 0;

        for (int i = 0; i < n; i++) {

            int d = distance(a, b, arr[i]);

            if (side(a, b, arr[i]) == s && d > max) {
                ind = i;
                max = d;
            }
        }

        if (ind == -1) {
            System.out.println(a.x + " " + a.y);
            System.out.println(b.x + " " + b.y);
            return;
        }

        findHull(arr, n, arr[ind], a,
                -side(arr[ind], a, b));

        findHull(arr, n, arr[ind], b,
                -side(arr[ind], b, a));
    }

    static void quickHull(P arr[], int n) {

        if (n < 3) {
            System.out.println("Hull not possible");
            return;
        }

        int min = 0, max = 0;

        for (int i = 1; i < n; i++) {

            if (arr[i].x < arr[min].x)
                min = i;

            if (arr[i].x > arr[max].x)
                max = i;
        }

        findHull(arr, n, arr[min], arr[max], 1);
        findHull(arr, n, arr[min], arr[max], -1);
    }

    public static void main(String args[]) {
        P points[] = {
            new P(0,3),
            new P(2,2),
            new P(1,1),
            new P(2,1),
            new P(3,0),
            new P(0,0),
            new P(3,3)
        };

        int n = points.length;
        System.out.println("Convex Hull Points:");

        quickHull(points, n);
    }
}