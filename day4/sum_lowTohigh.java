package day4;
public class sum_lowTohigh {

        public int sumHightoLow(int high, int low){
                int sum = 0;
                for(int i=low; low<=high; low++){
                        
                        sum +=i;
                        
                }
        return sum;

        }
        public void main(String[]args){

                System.out.println(sumHightoLow(9,3));
                

        }
        
}
