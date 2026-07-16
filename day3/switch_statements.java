package day3;
import java.util.Scanner;
public class switch_statements {
        public static void main(String[]args){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a number between 1 to 7");
                int a = input.nextInt();

                switch(a){
                        case 1:
                                System.out.println("Its monday!");
                                break;
                        case 2:
                                System.out.println("Its tuesday!");
                                break;
                        case 3:
                                System.out.println("Its wednesday!");
                                break;
                        case 4:
                                System.out.println("Its thursday!");
                                break;
                        case 5:
                                System.out.println("Its friday!");
                                break;  
                        case 6:
                                System.out.println("Its saturday!");
                                break;
                        case 7:
                                System.out.println("Its sunday!");
                                break;
                        default:
                                System.out.println("Invalid day!");                          

                                
                }
        }
        
}
