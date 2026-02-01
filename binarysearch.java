
public class binarysearch {
    static boolean  flag = false;

    static void bs1(int lo , int hi ,int x ,  int arr[]){

        if(lo>hi)  return;

        int mid = (lo+hi)/2;
        if(arr[mid] == x) flag = true;

        if(arr[mid] > x){

              bs1(lo,mid-1,x,arr);
        }
        else if(arr[mid]<x){

             bs1(mid+1,hi,x,arr) ; 
        } 

    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        
        int n = arr.length;

        bs1(0,n-1,19,arr);

        System.out.println(flag);
    }
}
