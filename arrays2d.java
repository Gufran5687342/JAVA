import java.util.*;

public class arrays2d {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter rows: ");
        int rows = sc.nextInt();
        System.out.println("enter columns: ");
        int cols = sc.nextInt();

        int nums[][] = new int[rows][cols];
        for(int i = 0; i <rows; i++){
            for(int j = 0; j <cols; j++){
                nums[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter the number to search (x): ");
        int x = sc.nextInt();

        for(int i = 0; i < rows; i++){
            for(int j = 0; j <cols; j++){
                if(x == nums[i][j]){
                    System.out.println("x found at index: (" + i + ", " + j + ")");
                }
            }
        }
    }    
}
