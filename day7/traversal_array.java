package day7;
//travarsal means processing each element
class traversal_array{
        public static void main(String[]args){
                int [] arr = {12,23,56,78,90};
                
                for(int i = 0; i<arr.length; i++){
                        System.out.println("Element of index " + i + " is " + arr[i]);
                }

                for(int i : arr){
                        System.out.println(i);
                }

                int i = 0;
                while(i < arr.length){
                        System.out.println(i + ": " + arr[i]);
                        i++;
                }
        }
}

