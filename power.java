public class power {
    public static int calc_power(int x, int n){
        if(n == 0){
            return 1;
        }
        else if(x == 0){
            return 0;
        }
        int xpow = calc_power(x,n-1);
        int xpown = x * xpow;
        return xpown;


    }
    public static void main(String args[]){
        int x = 2;
        int n = 5;
        int ans = calc_power(x,n);
        System.out.print(ans);
    }
}
