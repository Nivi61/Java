/*aritmatic oprators are +(add), -(sub), *(multiplication), /(division), %(modulas)
 */
package day2;



public class arithmatic_opartor {
        public void main(String[]args){
                int a = 10;
                double b = 20;
                String c = "Sam";
                char d = 'C';
                boolean e = true;
                System.out.println(a+b); //adds numbers
                System.out.println(a-b); //subtracts numbers
                System.out.println(a*b); //mutiplied numbers
                System.out.println(a/b); //gives ans of division(quoshant) 
                System.out.println(a%b); //gives reminder of division
                System.out.println(a+c); //adds string and number which is CONCATINATION
                System.out.println(a+d); // C has ASCII value so c get convered into that ASCII and addition.
                System.out.println(c+d); //For string char dont get convert into ASCII 
                System.out.println(b+d); 
                //System.out.println(d+e); char and boolean cannot perform addition




                //OPERATOR OVERRIDIN : means one oprator doing multiple jobs 
                //for eg + oprator ADDITION numbers and also performs CONCATINATION.

        }
        
}
