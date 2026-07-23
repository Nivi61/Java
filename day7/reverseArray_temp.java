import java.util.Arrays;
import java.util.Scanner;
public class reverseArray_temp {
        public void Array(int[] arr){
                int left = 0;
                int right = arr.length-1;

                while(left<right){
                        int temp = arr[left];
                        arr[left] = arr[right];
                        arr[right] = temp;

                        left++;
                        right--;
                }
        }
        public void main(String[]args){
                Scanner input = new Scanner(System.in);
                System.out.println("Enter a n : ");
                int n = input.nextInt();
                int[] arr = new int[n];

                for(int i=0; i<arr.length; i++){
                        arr[i] = input.nextInt();
                        
                }

                reverseArray_temp obj = new reverseArray_temp();
                obj.Array(arr);
                System.out.println("Reversed Arrays: " + Arrays.toString(arr));
        }
                
        
        
}
