import java.util.*;
public class Factorial{
    public static int calc_fact(int n){
        if(n == 1 || n == 0){
            return 1;
        }
        int factnm = calc_fact(n-1);
        int factn = n * factnm;
        return factn;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = sc.nextInt();

        int ans = calc_fact(n);
        System.out.print(ans);

    }
}