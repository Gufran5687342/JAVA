import java.util.*;

public class practise {

    public static int countPaths(int i, int j,int n, int m) {
        if(i == n || j == m){
            return 0;
        }
        if(i == n-1 && j == m-1){
            return 1;
        }
        //downwards
         int downPaths = countPaths(i+1, j, n, m);
         //right side
         int rightpaths = countPaths(i, j+1, n, m);

         return downPaths + rightpaths;
}
public static void main(String[] args) {
    int total = countPaths(0, 0, 3, 4);
    System.out.println(total);
  
}
}
       
  
    

