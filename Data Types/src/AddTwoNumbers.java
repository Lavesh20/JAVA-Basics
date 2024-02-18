import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Two Numbers ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = num1 + num2;
        System.out.println("Addition Of Two Numbers : "+ num3);
    }
}
