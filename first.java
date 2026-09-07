import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number1: ");
        int num1 = sc.nextInt();
        System.out.println("enter number2: ");
        int num2 = sc.nextInt();
        System.out.print("enter the operation you want to solve(+,-,*,/,%): ");
        String op = sc.next();

        switch(op){
            case "+": System.out.println(num1 + num2);
            break;
            case "-": System.out.println(num1 - num2);
            break;
            case "*": System.out.println(num1 * num2);
            break;
            case "/": if(num2 > 0){
                System.out.println(num1/num2);
            }else{
                System.out.println("invalid output");
            }
            break;
            case "%": System.out.println(num1 % num2);
            break;
            default: System.out.println("invalid input try again!!");
        }
        sc.close();


    }
}