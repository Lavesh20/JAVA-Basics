import java.util.Scanner;

public class LearnString {
    public static void main(String[] args) {
        System.out.println("Enter your first name:");
        Scanner sc = new Scanner(System.in);
        String FirstName = sc.nextLine();
        System.out.println("Enter your last name:");
        String LastName = sc.nextLine();
        String Name = FirstName + " " + LastName;
        System.out.println("Your name is: "+ Name);
    }
}
