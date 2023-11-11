package lab.test.pkg1.q2;
import java.util.Scanner;
public class LABTEST1Q2 {
    public static void main(String[] args) {
      Scanner x=new Scanner(System.in);
      //Prompt user to enter the integers
        System.out.println("Enter an integers: ");
        int originalInt=x.nextInt(); 
        int digit,sign=1;
        String reverseInt="";
        
        //Handle negative sign if input is negative
        if (originalInt<0){
            sign=-1;
            originalInt=Math.abs(originalInt);
        }
        //Reverse the digits
        while (originalInt>0){
            digit=originalInt%10;
            reverseInt=reverseInt+digit;
            originalInt=originalInt/10;
        }
        //Add the sign back if the input was negative
        if (sign==-1){
            reverseInt="-"+reverseInt;
        }
          System.out.println("Reversed integer: "+reverseInt);
                
      
        
        
    }  
    }
    

