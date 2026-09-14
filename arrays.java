import java.util.*;


public class arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      String nums[] = new String[size];


      //input
      for(int i=0; i<size; i++) {
          nums[i] = sc.next();
      }
     
      //output
       for(int i=0; i<nums.length; i++) {
           System.out.println("number " + (i+1) +" is : " + nums[i]);
       }
      
   }
}
