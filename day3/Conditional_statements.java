/* Conditional Statements:
1) If-else statement: Execute a block of code if a specified condition is true, otherwise execute another block of code.
2)Else-if statement: Execute a block of code if a specified condition is true, otherwise check another condition.
3) Switch statement: Execute one block of code among many options based on the value of a variable.

 */

package day3;

public class Conditional_statements {
        public static void main(String[]args){

                int a = 5;
                int b = 10;

                if(a==b){
                        System.out.println("a is equal to b");
                }
                else if(a>b){
                        System.out.println("a is greater than b");
                }
                else if(a<b){
                        System.out.println("a is less than b");
                }
                else{
                        System.out.println("Invalid!");

                }

        }
}
        

