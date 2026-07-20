package day6;
import java.util.Scanner;
public class user_inputarray {
        public static void main(String[]args){
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a number of elements you want to enter: ");
                int num = input.nextInt();

                String foods[] = new String[num];
                
                input.nextLine();

                for(int i = 0; i<foods.length; i++ ){
                        System.out.print("Enter a element: ");
                        foods[i] = input.nextLine();
                }

                for(String food : foods){
                        System.out.println(food);
                }

        } 
}
