import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age == 20){
            System.out.println("Perfect");
        }
        else if(age<20){
            System.out.println("Young");
        }
        else if (age > 20 && age<50) {
            System.out.println("Elder");
        }
        else{
            System.out.println("Old");
        }
    }
}