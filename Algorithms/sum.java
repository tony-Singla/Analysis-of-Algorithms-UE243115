import java.util.*;
public class sum {

    static int sum1(int i ){
        if(i==0) return 0 ;
        return i + sum1(i-1); 
    }
    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        int sum = sc.nextInt();
        Syatem.out.println("The sum of Numbers :");
        System.out.println(sum1(sum));
        sc.close();
    }

}

