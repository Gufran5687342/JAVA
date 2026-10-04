import java.util.*;
public class practise {
    public static int findMax(int arr[],int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int maxOfRest = findMax(arr, idx+1);
        return Math.max(arr[idx], maxOfRest);
               

    }
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {3,8,2,5,7};
       int add = findMax(arr, 2);
       System.out.print(add);


    }
    
}
