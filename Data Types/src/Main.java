import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(str);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.next();
        System.out.println("Good morning " + name);
        System.out.print("Enter Your Age ");
        int age = input.nextInt();
        System.out.println("My age is "+ age);

    }
}