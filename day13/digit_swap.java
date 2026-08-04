package day13;

public class digit_swap {

        public static void main(String[]args){

        

        int a = 3;
        int b = 2;
        System.out.println("Before "+ "a: "+ a + " b: "+b );
        //To swap these digits make a=2 and b=3
        int temp = b;
        b = a;
        a = temp;
        System.out.println("After " + "a: "+a + " b: "+b);
        }
        
}
