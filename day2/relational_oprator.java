package day2;

import java.util.Scanner;

/*RELATIONAL OPERATOR: <(less than)
                       >(greater than)
                       ==(Equal to equal)
                       <=(less than or equal to)
                       >=(greater than or equal to) */
public class relational_oprator {
        public static void main(String[]args){
                Scanner input =new Scanner(System.in);
                System.out.println("Enter a age.");
                int age = input.nextInt();
                
        
        if(age>=18){
                System.out.println("You are eligible to vote");
        }
        else if(age<=18){
                System.out.println("You are not eligible");
        }
        else{
                System.out.println("Invalid age! Enter valid age");
        }
        }
        
}
