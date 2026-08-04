package day13;

public class swap2to2last {
        public static void main(String[] args) {
                int num = 1234567;
                // output : 1634527
                int ld = (num%100)/10; //6
                System.out.println(ld);
                int fd = (num/100000)%10; //2
                System.out.println(fd);

                num = num + (ld-fd)*100000;
                num = num + (fd-ld)*10;
                System.out.println(num);




        }
        
}
