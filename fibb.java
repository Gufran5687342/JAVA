import java.util.*;

class fibb {
    public static void printFibonacci(int n) {
        if (n <= 0) {
            System.out.println("Please enter a number greater than 0.");
            return;
        }

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Calculate the next term
            int nextTerm = firstTerm + secondTerm;
            
            // Shift variables forward for the next iteration
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(); // New line at the end
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of terms (n): ");
        int n = sc.nextInt();
        
        printFibonacci(n);
        
        sc.close();
    }
}

public static void greaternum(int num1,int num2){
    if(num1 > num2 ){
        System.out.println("number1 is greater");
    }
    else if(num1 == num2){
        System.out.println("both are equal");

    else{
        System.out.println("number2 is greater");
    }
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number1: ");
    int num1 = sc.nextInt();
    System.out.println("enter number2: ");
    int num2 = sc.nextInt();
    greaternum(num1, num2);

}
