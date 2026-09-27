import java.util.*;

public class fibb_recur {
  
    public static void fib(int a, int b, int n) {
        if (n <= 0) {
            return;
        }
        int c = a + b;
        System.out.println(c);
        fib(b, c, n - 1);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = 0;
        int b = 1;
        
        System.out.println(a);
        System.out.println(b);
        
        System.out.print("Enter the total number of terms (n): ");
        int n = sc.nextInt();
        
        // Passing n-2 because the first 2 terms (0 and 1) are already printed
        fib(a, b, n - 2); 
        
        sc.close();
    }
}
