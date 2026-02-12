public class quicksort {

    static void quickSort1(int arr[], int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);
            quickSort1(arr, low, p);         
            quickSort1(arr, p + 1, high);    
        }
    }

    static int partition(int arr[], int low, int high) {

        int pivot = arr[low];    
        int i = low - 1;
        int j = high + 1;

        while (true) {
            do {
                i++;
            } while (arr[i] < pivot);
            do {
                j--;
            } while (arr[j] > pivot);
            if (i >= j)
                return j;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {10, 7, 8, 9, 1, 5};

        quickSort1(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        for (int num : arr)
            System.out.print(num + " ");
    }
}
