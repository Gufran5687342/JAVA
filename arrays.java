import java.util.*;


public class arrays {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int sizes = sc.nextInt();
      String numms[] = new String[sizes];


      //input
      for(int i=0; i<sizes; i++) {
          numms[i] = sc.next();
      }
     
      //output
       for(int i=0; i<numms.length; i++) {
           System.out.println("number " + (i+1) +" is : " + numms[i]);
       }
      
   }
}
