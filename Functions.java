import java.util.*;
public class Functions{
    public static int addnums(int num1, int num2){
        int sum = num1 + num2;
        System.out.println(sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number1: ");
        int num1 = sc.nextInt();
                
        System.out.print("Enter number2: ");
        int num2 = sc.nextInt();

        addnums(num1, num2);
        sc.close();

    }
}