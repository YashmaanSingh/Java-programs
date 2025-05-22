    import java.util.Scanner;

    public class User_Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        System.out.print("Enter another number: ");
        int b = scanner.nextInt();

        int sum = a + b;

        System.out.println("The sum is: " + sum);
    }
}

