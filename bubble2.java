public class bubble2{
    public static void print_arr(int arr[]){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = {99,54,61,23,10,100,2};
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j <arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        print_arr(arr);

    }
}