public class FindMinAndMaxNumber {
    public static void main(String[] args) {
        int numbers[] = {23,43,4,5,65,40,3,41,22,39};
        //Find minimum value in the above array
        int min = Integer.MAX_VALUE;
        //System.out.println(min);
        for(int number:numbers){
            if(number<min){
                min = number;
            }
        }
        System.out.println("The minimum number is "+ min);

        //Max number in array
        int max = Integer.MIN_VALUE;
        for(int number:numbers){
            if(number > max){
                max = number;
            }
        }
        System.out.println("The maximum number is "+ max);
    }
}
