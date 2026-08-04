package day11;
class string{
        public static void main(String[] args) {
                String a = "Hello"; // created String using string litrals " "
                // String which is created by String litral gets store in SEP(String Constant pool)
                a = "Hiii";
                System.out.println(a); 
                

                String b = new String ("Hello"); // created String using new() keyword
                // String which is created by new keyword gets stored in heap.
                System.out.println(b);

                System.out.println(a==b);

                // equals. campare litrals.
                System.out.println(a.equals(b)); 

        }
}