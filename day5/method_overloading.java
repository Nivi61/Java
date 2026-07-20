package day5;
/* METHOD OVERLOADDING: means calling method multiple times 
                        method can have same name but parameters should be different. */
class method_overloading{
        public static void main(String[]args){
                String pizza1 = bakePizza("flat braed", "mozzerella");
                System.out.println(pizza1);
                String pizza2 = bakePizza("Garlic");
                System.out.println(pizza2);
                

        }

        static String bakePizza(String bread){
                return bread + " " + "Pizza";
        }
        static String bakePizza(String bread, String cheese){
                return bread + " " + cheese + " " + "Pizza";

        }
        static String bakePizza(String bread, String cheese, String topping){
                return bread + " " + cheese+ " " + topping + " " + "Pizza";
        }
}