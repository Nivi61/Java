package day13;

public class swap1andlast {
        public static void main(String[] args) {
                int num = 1234;
                System.out.println(num);
                int div = 3000;
                // output 4231
                int ld = num%10; //4
                int fd = num/1000; //1
                num = num-(ld-fd)+div;
                System.out.println(num);
                

        }
        
}
