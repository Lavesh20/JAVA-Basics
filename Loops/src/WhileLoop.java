import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int num = sc.nextInt();
        int i = 0;
        while(num<=10){
            System.out.println("Value of i is "+i);
            i++;
            num++;
        }

    }
}
