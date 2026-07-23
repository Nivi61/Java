import java.util.Arrays;
import java.util.Scannar;
class reverse_array{ 

        public void reverseArray(int[] arrays){
                for (int i = arrays.length - 1; i >= 0; i--) {
                    System.out.print(arrays[i] + " ");


        }
        public static void main(String[]args){
                Scanner input = new Scanner (System.in);
                System.out.print("Enter num");
                int num = input.nextInt();
                int[] arrays = new int[num];

                for(int i=0; i<num; i++){
                        
                        arrays[i] = input.nextInt();
                }

                reverse_array obj = new reverse_array();
                obj.reverseArray(arrays);

                System.out.println("Reversed Arrays: " + Arrays.toString(arrays));

        }

}
}
        


        

