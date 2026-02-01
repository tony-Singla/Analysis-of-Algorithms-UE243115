import java.util.*; 
public class selectionsort {
    public static void main(String[] args) {
        int arr[] = new int[10];
        int n =10;
        Scanner sc = new Scanner(System.in);

        for(int i = 0 ; i< n ;i++){
            arr[i] = sc.nextInt();
        }

        for(int i =0 ; i< n-1 ; i++){
            int min = Integer.MAX_VALUE;
            int minidx = -1;
            for(int j= i ; j < n ; j++){
                if(arr[j]<min){
                    min = arr[j];
                    minidx = j ; 
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }

        for(int i = 0 ; i< n ;i++){
            System.out.print(arr[i]+" " );
        }
       sc.close();

    }
}

