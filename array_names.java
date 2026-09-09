import java.util.*;

public class array_names {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of the array: ");
        int size = sc.nextInt();
        String names [] = new String[size];

        //input
        for(int i = 0; i < size; i++){
            names[i] = sc.next();

        }
        //output
        for(int i =0; i < names.length; i++){
            System.out.println("Name: "+names[i]);
        }
        

    }
}
