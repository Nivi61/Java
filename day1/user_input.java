import java.util.Scanner;
public class user_input {
      public static void main(String[]args){
            Scanner input = new Scanner (System.in);

            System.out.println("print byte");
            byte a = input.nextByte(); //range from -128 to 127 (1byte-8bit)
            //byte a1 = 127;
            System.out.println(a);     //eg 

            System.out.println("Print short");
            short b = input.nextShort(); //(2byte-16bit)
            //short b1 = 211;
            System.out.println(b);

            System.out.println("print integer");
            int c = input.nextInt(); //(4byte-32bit)
            //int c1 = 23345;
            System.out.println(c);

            System.out.println("print long");
            long d = input.nextLong(); //(8byte-64bit)
            //long d1 = 24623723889;
            System.out.println(d);

            System.out.println("print float");
            float f = input.nextFloat(); //(4byte-32bit)
            //float f1 = 67.78;
            System.out.println(f);

            System.out.println("Printdouble");
            double g = input.nextDouble(); //(4byte-32bit)
            //double g1 = 5668.80;
            System.out.println(g);

            //char h = input.(); //(2byte-16bit) char has to declear in single quote 'C'
            //char h1 = 'C'
            //System.out.println(h);

            System.out.println("print boolean");
            boolean i = input.nextBoolean(); //(obyte-1bit) either true or false
            System.out.println(i);

            System.out.println("print string ");
            String name = input.nextLine();
            //String name1 = "Jack";
            System.out.println(name);








           
      }
      
}
