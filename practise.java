import java.util.*;
public class practise {
    public static int multnums(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * multnums(n-1);

    }
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int add = multnums(n);
       System.out.print(add);


    }
    
}
