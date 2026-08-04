package day13;

public class swapvar_withouttemp {
        public static void main(String[]args){
                int a = 3;
                int b = 2;
                System.out.println("Before: ");
                System.out.println("a: "+a);
                System.out.println("b: "+b);

                a = a+b; //5
                b = a-b; //3
                a = a-b; //2

                System.out.println("After: ");
                System.out.println("a: "+a);
                System.out.println("b: "+b);

        }
        
}
