package day2;

class litrals{
        public static void main(String[]args){
                System.out.println("Min: "+ Float.MIN_VALUE);
                System.out.println("Max: "+ Float.MAX_VALUE);

                float phy_marks = 67.86f;
                float chem_marks = 79.4f;
                float maths_marks = 88.84f;
                
                //System.out.println(total_marks);

                float pract1_read = 45.84575875858f;
                float pract2_read = 47.7837237682f;
                float pract3_read = 45.8763874637f;
                float mean = (pract1_read+pract2_read+pract3_read)/3;
                System.out.println("mean"+mean);
        }
}