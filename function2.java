import java.util.*;
public class function2 {
    public static int average(int num1, int num2, int num3){
        int avg = (num1 + num2 + num3)/3;
        System.out.print("the average of three numbers is: "+avg);
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number1: ");
        int num1 = sc.nextInt();

        System.out.print("enter number2: ");
        int num2 = sc.nextInt();

        System.out.print("enter number3: ");
        int num3 = sc.nextInt();

        average(num1, num2, num3);
        sc.close();

    }
    
}
