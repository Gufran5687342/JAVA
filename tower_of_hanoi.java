import java.util.*;
public class tower_of_hanoi{
    public static void TOH(int n, String src, String helper, String destination){

        if(n == 1){
            System.out.println("transfer disk "+n +" from "+ src + " to "+ destination);
            return;
        }
        TOH(n-1,src,destination,helper);
        System.out.println("transfer disk "+n +" from "+ src + " to "+ destination);
        TOH(n-1,helper,src,destination);

    }
    public static void main(String args[])
    {
        int n = 3;
        TOH(n,"S","H","D");

    }
}