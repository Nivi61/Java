package day9;
public class pattern4{
        // 1
        // 22
        // 333
        // 4444
        public void pattern(int n){
                for(int i = 1; i<=n; i++){
                        for(int j = 1; j<=i; j++ ){
                                System.out.print(i);
                        }
                        System.out.println();
                        
                }
        }
        public static void main(String[]args){
                pattern4 obj = new pattern4();
                obj.pattern(4);

        }
}