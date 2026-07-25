package day9;
// 12345
// 1234
// 123
// 12
// 1
public class pattern6 {
        public void pattern(int n){
                for(int i = n; i>=1; i--){
                        for(int j = 1; j<=i; j++){
                                System.out.print(j);
                        } 
                        System.out.println();     
                }
                
        }
        public void main(String[]args){
                pattern6 obj = new pattern6();
                obj.pattern(5);
        }
      
}
        


