public class sumOfNumbers {
    public static void main(String[] args) {
        int myArray[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for(int i = 0;i<myArray.length;i++){
            sum = sum + myArray[i];
        }
        System.out.println("The sum of numbers is " + sum);
    }
}
