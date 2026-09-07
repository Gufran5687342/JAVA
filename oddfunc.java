import java.util.*;
class oddfunc{
    public static int odd(int n){
        int  sum =0;
        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                sum += i; 
            }
        }
        
        System.out.print("the sum of all odd numbers is: " + sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        odd(n);
        sc.close();
    }


}