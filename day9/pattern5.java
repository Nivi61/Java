package day9;
// *****
// ****
// ***
// **
// *
public class pattern5 {
        public void pattern(int n){
                for(int i = n; i>=1; i--){
                        for(int j = i; j>=1; j--){
                                System.out.print("*");
                        }
                        System.out.println();
                        
                }

        }
        public void main(String[]args){
                pattern5 obj = new pattern5();
                obj.pattern(5);
        }
}
