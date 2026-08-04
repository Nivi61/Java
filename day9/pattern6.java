package day9;
// 12345
// 1234
// 123
// 12
// 1
public class pattern6 {
        public void pattern(int n){
                //Outer Loop (i = n; i >= 1; i--): 
                // This loop dictates how many numbers will be printed on the current line. It starts at 5 and decreases by 1 each time.
                for(int i = n; i>=1; i--){
                        //Inner Loop (j = 1; j <= i; j++):
                        //This loop handles the actual printing. No matter which row you are on, it always resets to 1 and prints consecutive numbers until it hits the limit set by i.
                        for(int j = 1; j<=i; j++){
                                System.out.print(j);
                        } 
                        System.out.println();     
                }
                
        }
        public static void main(String[]args){
                pattern6 obj = new pattern6();
                obj.pattern(5);
        }
      
}
        


