package day13;

public class swap2andlast {
        public static void main(String[] args) {
                int num = 8765439;
                int div = 100000;
                int fd = num/100000; //12
                int ld = num%100; //67

                num = num+(ld-fd)*div;
                System.out.println(num);

                num = num-(ld-fd);
                System.out.println(num);

        }
        
}
