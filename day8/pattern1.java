package day8; 
// ****
// ****
// ****
// ****

public class pattern1{
        public void pattern1(int n){
                //outer loop for rows
                for(int i=1; i<=5; i++){
                        //inner loop for columns
                        for(int j=1;j<=n;j++){
                                System.out.print("*");

                        }
                        System.out.println();
                        
                }
        }
        public void main(String[]args){
                pattern1 obj = new pattern1();
                obj.pattern1(5);
                

        }
}
       
        

