package day2;
/*LOGICAL OPRATORS: && (and ), || (or), ! (not)
                    &&: works only if both conditions are true
                    ||: works if at least one condition is true
                    !: reverses the boolean value */
public class logical_oprator {
        public static void main(String[] args) {
                String branch = "CSE";
                int YOP = 2027;

                if(branch=="CSE" && YOP==2026){
                        System.out.println("You are eligible");
                }
                else if (branch=="CSE" || YOP ==2027 ){
                        System.out.println("You are still eligible");
                }
                else{
                        System.out.println("You are not");
                }
        }    

        
}
