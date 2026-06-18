import java.util.*;
public class Array_partition {
    public static int arrayPairSum(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int sum = 0;
        int i = 0;
        while(i<n-1){
            int j = i+1;
            int numi = Math.min(arr[i],arr[j]);
            sum += numi;
            i+=2;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of array ");
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        int output = arrayPairSum(arr);
        System.out.println("Minimum sum of pair array is : " + output);
    }
}
