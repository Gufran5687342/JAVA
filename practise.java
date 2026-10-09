import java.util.*;
public class practise {
    public static int CountCode(String str, int idx){
        if(idx >= str.length()-3){
            return 0;
        }
        if(str.charAt(idx) == 'c' ){
            if(str.charAt(idx+1) == 'o'){
                if(str.charAt(idx+3) == 'e'){
                    return 1+CountCode(str, idx+1);
                }
            }

        }
        return 0+CountCode(str, idx+1);

    }
 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int add = CountCode(str, 0);
        System.out.print(add);


        }
       
  
    }
    

