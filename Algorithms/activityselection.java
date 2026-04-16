import java.util.*;

class ActivitySelection {

    static class Activity {
        int start, finish;

        Activity(int s, int f) {
            start = s;
            finish = f;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of activities: ");
        int n = sc.nextInt();

        int start[] = new int[n];
        int finish[] = new int[n];

        System.out.println("Enter start times:");
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
        }

        System.out.println("Enter finish times:");
        for (int i = 0; i < n; i++) {
            finish[i] = sc.nextInt();
        }

        Activity arr[] = new Activity[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Activity(start[i], finish[i]);
        }

        Arrays.sort(arr, (a, b) -> a.finish - b.finish);

        System.out.println("Selected Activities:");

        int i = 0;
        System.out.println("(" + arr[i].start + "," + arr[i].finish + ")");

        for (int j = 1; j < n; j++) {
            if (arr[j].start >= arr[i].finish) {
                System.out.println("(" + arr[j].start + "," + arr[j].finish + ")");
                i = j;
            }
        }

        sc.close();
    }
}