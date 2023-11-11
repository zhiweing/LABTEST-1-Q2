package lab.test.pkg1.q2;
import java.util.Scanner;
// create public class called Viva1Q2
public class LABTEST1Q2 {
 // create main method
    public static void main(String[] args) {
        // create object(input) of a Scanner
      Scanner imput=new Scanner(System.in);
      //Prompt user to enter the integers
        System.out.println("Enter an integers: ");
        int originalInt=imput.nextInt(); 
        
        
        int digit,sign=1;
        String reverseInt="";
        
        //Handle negative sign if input is negative
        if (originalInt<0){
            sign=-1;
            originalInt=Math.abs(originalInt);
        }
        //Reverse the digits by using while loop
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
    

