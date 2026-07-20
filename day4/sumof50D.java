package day4;



public class sumof50D {
        public int sumof50d(int d){
        int sum = 0;
        int startNum = 1;
        int counter = 0;

        while(counter<50){
                if(startNum % 10 == d){
                        sum += startNum;
                        counter++;
                }
                startNum++;
        }
        return sum;
        }
        public void main (String[]args){
        double a = sumof50d(2);
        System.out.println(a);
        }

}
