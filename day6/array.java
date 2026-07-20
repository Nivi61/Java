package day6;
import java.util.Arrays;
/* ARRAY : Collection of values of same data type. 
           is the referenace data type.*/
public class array {
        public static void main(String[]arhs){
                String fruits [] = {"apple", "banana", "mango", "jackfruit"};
                System.out.println(Arrays.toString(fruits)); //also print array like this.
                //System.out.println(fruits); 
                //array is reference data type hence after sop we get an adress.
                //System.out.println(fruits[3]);
                //fruits[0] = "berry"; //To change the value of element.
                //System.out.println(fruits[0]);
                //System.out.println(fruits.length); // gives lenght of an array
                
                // To access all the elements of an array.
                /*for(int i = 0; i<fruits.length; i++){
                        System.out.println(fruits[i]);

                }*/

                //Inhance FOR LOOP
                /*for(String fruit : fruits){
                        System.out.println(fruit);
                }*/

                //To sort arrays
                Arrays.sort(fruits);
                System.out.println(Arrays.toString(fruits));

                //To fill array 
                Arrays.fill(fruits, "Pineapple");
                System.out.println(Arrays.toString(fruits));


        }
        
}
