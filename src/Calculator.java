/**
 *
 * @author Khutso Elias Langa
 */

//importing the Scanner package
import java.util.*;

public class Calculator 
{
    
    public static void main(String[] args) 
    {
     
     //initializing scanner packgage
     Scanner input = new Scanner(System.in);
     
     //allowing input from user
        System.out.println("Enter first number");
        double num1 = input.nextDouble();
        
        //choice of operators to use by the user
        System.out.println("Enter operator: '*, / , + , - '");
        char op = input.next().charAt(0);
        
        //entering second number
        System.out.println("Enter second number");
        double num2 = input.nextDouble();
        
        double result = 0;
    
        //switch case for the math operations used
        switch(op) 
        {   
            //addition
            case '+': 
            result = num1 + num2;
            break;
            
            //multiplication
            case '*':
                
            result = num1 * num2;
            break;
            
            //subtraction
            case '-':
            result = num1 - num2;
            break;
            
            //division
            case '/':
                
            //checking if num2 is not zero
            //numbers cannot be divided by zero    
            if (num2 == 0) 
            {
                System.out.println("Number cannot be divided by zero"); 
            return;
            }
            else
            {
           result = num1 / num2;     
            }
            break;
            
            default: System.out.println("invalid operator, enter correct operator");
            return;
        }
    
        
        //final output
        System.out.println(num1 + " " + op + " " + num2 + "\nresult: " + result);
    } 
    
}
