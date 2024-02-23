public class Main {
    public static void main(String[] args) {
       int myArray[]; // declaration
       myArray = new int[10]; // Allocation
       for(int i = 0;i<10;i++){
           myArray[i] = i+1;
           System.out.println(myArray[i]);
       }
        System.out.println(myArray[5]);
    }
}