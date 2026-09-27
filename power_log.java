public class power_log {
    public static int calc_power(int x, int n){
        if(n == 0){
            return 1;
        }
        else if(x == 0){
            return 0;
        }
        if(n % 2 == 0){
            return calc_power(x,n/2) *  calc_power(x,n/2);
        }
        else{
            return calc_power(x,n/2) *  calc_power(x,n/2) * x;
        }
        

    }
    public static void main(String args[]){
        int x = 2;
        int n = 5;
        int ans = calc_power(x,n);
        System.out.print(ans);
    }
}
