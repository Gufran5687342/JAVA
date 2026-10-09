import java.util.*;
public class practise {
    public static void reverseArr(int arr[], int left, int right){
        if(left >= right){
            return;
        }
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseArr(arr, left+1, right-1);

    }
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = {20,30,86,56,12,11,9};
        reverseArr(arr, 0, arr.length-1);
        for(int i = 0; i <= arr.length-1; i++){
            System.out.print(" "+arr[i]);

        }
       
        




    }
    
}
