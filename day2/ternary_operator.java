package day2;
import java.util.Scanner;
public class ternary_operator {
        public static void main(String[]args){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a charcter");
                char ch = input.next().charAt(0);
                
                //we have to check if the given character is in uppercase or lowaer case
                //we are gonna use ASCII value of that 
                //for capital letters - 65-90
                //for small letter - 97-122

                String result = (ch<=65 && ch>=90)? "The given character is in Uppercase":
                                                    "The given charcter is in Lowercase";

                
                System.out.println(result);                                    
        }
        
}
