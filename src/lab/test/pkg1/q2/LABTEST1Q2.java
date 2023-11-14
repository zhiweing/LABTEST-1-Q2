package lab.test.pkg1.q2;
import java.util.Scanner;
// create public class called LABTEST1Q2
public class LABTEST1Q2 {
 // create main method
    public static void main(String[] args) {
        // create object(input) of a Scanner
      Scanner input=new Scanner(System.in);
      //Prompt user to enter the integers
        System.out.println("Enter an integers:");
        int originalInt=input.nextInt(); 
        int digit,sign=1,reverseInt=0;
                
        //Handle negative sign if input is negative
        if (originalInt<0){
            sign=-1;
            originalInt=Math.abs(originalInt);
        }
        
        //Reverse the digits by using while loop
        while (originalInt>0){
            digit=originalInt%10;
            reverseInt=reverseInt*10+digit;
            originalInt=originalInt/10;
        }
        reverseInt*=sign;
        System.out.println("Reversed integer: "+reverseInt);
        }
         
                
      
        
        
    }  
    
    

