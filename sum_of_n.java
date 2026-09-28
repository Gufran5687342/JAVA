import java.util.*;
class sum_of_n{
    public static void calc_sum(int n, int sum){
        if(n == 0){
            System.out.println(sum);
            return;
        }
        sum += n;
        calc_sum(n-1 , sum);

    }
    public static void main(String args[]){
        calc_sum(5 , 0);

    }
}