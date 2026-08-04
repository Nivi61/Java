package day9;
// 1
// 12
// 123
// 1234
public class pattern3 {
        public void pattern(int n){
                for(int i = 1; i<=n; i++){
                        for(int j = 1; j<=i; j++){
                                System.out.print(j);
                        }
                        System.out.println();
                }
        }
        public static void main(String[]args){
                pattern3 obj = new pattern3();
                obj.pattern(4);
        }
        
}
