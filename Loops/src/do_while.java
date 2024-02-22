import java.util.Scanner;

public class do_while {
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = 0;
        int sum = 0;
        do{
            sum = sum + i;
            i++;
            System.out.println(sum);
        }while (i<=num);
    }
}
